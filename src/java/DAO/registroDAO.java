
package DAO;

import Model.usuarios;
import java.util.ArrayList;

public interface registroDAO {
    //Definir los metodos, como la clase de interface. Los metodos no se implementan
    //aqui, los metodos son de tipo abstracto
    public ArrayList<usuarios> starSesion(String user, String clave);
}
