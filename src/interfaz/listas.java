
package interfaz;

import java.util.ArrayList;

public class listas {
    private ArrayList<String> lista;

    public listas() {
        lista = new ArrayList<>();
    }

    public void llenar(String item) {
        lista.add(item);
    }

    public ArrayList<String> obtenerLista() {
        return lista;
    }
}