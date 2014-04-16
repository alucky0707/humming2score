/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SN.PhD;

import java.awt.Component;
import javax.swing.JFileChooser;

/**
 *
 * @author guonunu
 */
public class FileChooser extends javax.swing.JFileChooser{
    //Create a file chooser
final JFileChooser fc = new JFileChooser();
//In response to a button click:
int returnVal;
    private Component aComponent;

    public FileChooser() {
        this.returnVal = fc.showOpenDialog(aComponent);
    }
}
