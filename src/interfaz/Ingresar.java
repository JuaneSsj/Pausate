
package interfaz;

import java.io.*;
import javax.swing.JOptionPane;

public class Ingresar 
{    
    
    File archivo;
    BufferedReader lector ;
    public boolean ingresar(String usuario,String contraseña)
    {
        try {
            archivo = new File("datos.txt");
            lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                
                String[] datos = linea.split("\t");
                if (datos.length == 5) { 
                    String usuarioArchivo = datos[3].trim();
                    String contraseñaArchivo = datos[4].trim();
                    if (usuario.equals(usuarioArchivo) && contraseña.equals(contraseñaArchivo)) {
                        lector.close();
                        return true; // Usuario y contraseña correctos
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return false; // Usuario y/o contraseña incorrectos o archivo no encontrado
    }
    
}
