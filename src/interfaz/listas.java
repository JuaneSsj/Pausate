
package interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejo
 */
public class listas {
    ArrayList ventana;
    int i;
    
    listas()
    {
        ArrayList<String> ventana = new ArrayList<>();
    }

    public void llenar(String a)
    {
        ventana.add(a);
    }
    
    public void mostrar(int item)
    {
        for (i=0;i<5;i++)
        {
            if (i==item)
                JOptionPane.showMessageDialog(null,ventana.get(i) );
        }
    }
    
}
