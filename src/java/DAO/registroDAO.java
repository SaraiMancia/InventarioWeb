
package DAO;


import java.util.ArrayList;
import Model.usuarios;

public interface registroDAO {
    
    public ArrayList<usuarios> startSesion(String user, String clave);
    public boolean RegistrarUsuario(usuarios usuario);
    public String recuperarCorreo(long telefono);
    public String recuperarContraseña (String correo);
    public String pregunta(String correo);
    public String respuesta(String correo, String pregunta);
    public String verificarCorreo(String correo);
    
}
