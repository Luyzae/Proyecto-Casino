/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import metodo.RenderizarImagen;

/**
 *
 * @author Yo
 */
public class Registro {
    
    private Conexion conexion;
    
    public Registro() {
        
        this.conexion = new Conexion();
        
    }
    
    public boolean agregarProducto(Producto producto){
        
        try{
            
            String sql = "INSERT INTO productos(categoriaProducto, nombreProducto, precioProducto, cantidadProducto) VALUES(?,?,?,?)";
            
            PreparedStatement stmt = conexion.conexionToDB().prepareStatement(sql);
            
            stmt.setString(1, producto.getCategoriaProducto());
            stmt.setString(2, producto.getNombreProducto());
            stmt.setInt(3, producto.getPrecioProducto());
            stmt.setInt(4, producto.getCantidadProducto());

            
            stmt.executeUpdate();
            
            return true;
      
        }catch(SQLException ex){
            
            System.out.println("Error: "+ex);
        }  
        return false;
    }
    
    public boolean eliminarProducto(int idProducto){
        
        try{
            
            String verificarQuery = "SELECT idProducto FROM productos WHERE idProducto = ?";
            PreparedStatement verificarStmt = conexion.conexionToDB().prepareStatement(verificarQuery);
            verificarStmt.setInt(1, idProducto);

            ResultSet verificarRs = verificarStmt.executeQuery();
            
            if (verificarRs.next()) {
                String eliminarQuery = "DELETE FROM productos WHERE idProducto = ?";
                PreparedStatement eliminarStmt = conexion.conexionToDB().prepareStatement(eliminarQuery);
                eliminarStmt.setInt(1, idProducto);

                eliminarStmt.executeUpdate();
                return true;
            }

        }catch(SQLException ex){
            
            System.out.println("Error: "+ex);
        } 
        
        return false;
    }
    
    public boolean modificarProducto(Producto producto){
        try{
            String query = "UPDATE productos SET categoriaProducto=?, nombreProducto=?, precioProducto=?, cantidadProducto=?, imagenProducto=? WHERE idProducto=?";
            
            PreparedStatement stmt = conexion.conexionToDB().prepareStatement(query);

            stmt.setString(1, producto.getCategoriaProducto());
            stmt.setString(2, producto.getNombreProducto());
            stmt.setInt(3, producto.getPrecioProducto());
            stmt.setInt(4, producto.getCantidadProducto());
            stmt.setBytes(5, producto.getImagenProducto());
            stmt.setInt(6, producto.getIdProducto());

            stmt.executeUpdate();

            return true;

        } catch(SQLException ex){
            System.out.println("Error: " + ex);
        } 
        return false;
    }
    
    public Producto obtenerProductoPorID(int idProducto) {
        try {
            String sql = "SELECT * FROM productos WHERE idProducto = ?";
            PreparedStatement stmt = conexion.conexionToDB().prepareStatement(sql);
            stmt.setInt(1, idProducto);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setCategoriaProducto(rs.getString("categoriaProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setPrecioProducto(rs.getInt("precioProducto"));
                producto.setCantidadProducto(rs.getInt("cantidadProducto"));
                producto.setImagenProducto(rs.getBytes("imagenProducto"));

                return producto;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        return null;
    }
    
    public List<Producto> listarProductos(){
           
        List<Producto> productos = new ArrayList<>();
        
        if(productos.isEmpty()){
            try{
                String sql = "SELECT * FROM productos";

                try(PreparedStatement stmt = conexion.conexionToDB().prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();){

                    while (rs.next()){

                        Producto producto = new Producto();
                        producto.setIdProducto(rs.getInt("idProducto"));
                        producto.setCategoriaProducto(rs.getString("categoriaProducto"));
                        producto.setNombreProducto(rs.getString("nombreProducto"));
                        producto.setPrecioProducto(rs.getInt("precioProducto"));
                        producto.setCantidadProducto(rs.getInt("cantidadProducto"));
                        producto.setImagenProducto(rs.getBytes("imagenProducto"));
                        productos.add(producto);
                    }
                    rs.close();
                }
            }catch(SQLException ex){

                System.out.println("Error: "+ex);
            }
        }else{
            System.out.println("La lista esta vacia");
        } 
        return productos;  
    }
    
    public List<Producto> listarProductoCategoria(String categoria){
        
        List<Producto> productos = new ArrayList<>();
        
        if(productos.isEmpty()){
            try{
                String sql = "SELECT * FROM productos WHERE categoriaProducto = ?";
                PreparedStatement stmt = conexion.conexionToDB().prepareStatement(sql);
                stmt.setString(1, categoria);

                ResultSet rs = stmt.executeQuery();

                while(rs.next()){

                    Producto producto = new Producto();

                    producto.setIdProducto(rs.getInt("idProducto"));
                    producto.setCategoriaProducto(rs.getString("categoriaProducto"));
                    producto.setNombreProducto(rs.getString("nombreProducto"));
                    producto.setPrecioProducto(rs.getInt("precioProducto"));
                    producto.setCantidadProducto(rs.getInt("cantidadProducto"));
                    producto.setImagenProducto(rs.getBytes("imagenProducto"));
                    productos.add(producto);
                }
                rs.close();
            }catch(SQLException ex){

                System.out.println("Error: "+ex);
            }
            
        }else{
            System.out.println("Lista vacia");
        } 
        return productos;
    }
    
    public void actualizarTabla(List<Producto> productos, DefaultTableModel modelo, JTable tabla) {
        
        RenderizarImagen tamaño = new RenderizarImagen(50, 50);
        
        modelo.setRowCount(0);
        
        for (Producto producto : productos) {
            Object[] fila = {
                producto.getIdProducto(),
                producto.getCategoriaProducto(),
                producto.getNombreProducto(),
                producto.getPrecioProducto(),
                producto.getCantidadProducto(),
                new ImageIcon(producto.getImagenProducto())
            };
            modelo.addRow(fila);
        }
        tabla.getColumnModel().getColumn(5).setCellRenderer(tamaño);
    }
    
    
    public boolean iniciarSesion(String nombreUsuario, String contraseñaUsuario){

        try{
            String query = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contraseñaUsuario = ?";
            PreparedStatement stmt = conexion.conexionToDB().prepareStatement(query);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, contraseñaUsuario);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {    
                return true;
            } else {
                return false;
            }

        } catch(SQLException ex){
            System.out.println("Error: " + ex);
        } 

        return false;
    }
}
