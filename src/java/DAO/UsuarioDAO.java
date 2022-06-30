
package DAO;
import Controller.Usuario;
import Model.UsuarioM;
import java.util.ArrayList;

public interface UsuarioDAO {
    public ArrayList<UsuarioM> startSesion(String usuario, String clave);
     public boolean guardarUsu(UsuarioM usuario);

    public void guardarUsu(Usuario usuario);
}
