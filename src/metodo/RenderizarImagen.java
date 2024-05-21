/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Yo
 */
public class RenderizarImagen extends DefaultTableCellRenderer{
    
    private int ancho;
    private int alto;

    public RenderizarImagen(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof ImageIcon) {
            ImageIcon imagenOriginal = (ImageIcon) value;
            Image imagenTamaño = imagenOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(imagenTamaño));
        } else {
            setText((value == null) ? "" : value.toString());
        }
    }
}
