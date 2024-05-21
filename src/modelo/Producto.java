/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yo
 */
public class Producto {
    
    private int idProducto;
    private String categoriaProducto;
    private String nombreProducto;
    private int precioProducto;
    private int cantidadProducto;
    private byte [] imagenProducto;

    //Contructor para modificar un producto
    public Producto(int idProducto, String categoriaProducto, String nombreProducto, int precioProducto, int cantidadProducto, byte[] imagenProducto) {
        this.idProducto = idProducto;
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.imagenProducto = imagenProducto;
    }

    //Contructor para agregar un producto
    public Producto(String categoriaProducto, String nombreProducto, int precioProducto, int cantidadProducto, byte[] imagenProducto) {
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.imagenProducto = imagenProducto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public byte[] getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(byte[] imagenProducto) {
        this.imagenProducto = imagenProducto;
    }
    
    
}
