

package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import Model.usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class registroDAOImplementar implements registroDAO {
    
    ConexionBD conn;

    public registroDAOImplementar() {
        //Definir a la base de datos que se conectara por defecto.
        //this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
    }

    @Override
    public ArrayList<usuarios> starSesion(String user, String clave) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * fROM tb_usuario WHERE BINARY correo = '").append(user);
        miSQL.append("' and clave = md5('").append(clave);
        miSQL.append("');");
        System.out.println(miSQL);
        
        ArrayList<usuarios> lista = new ArrayList<usuarios>();
        try{
            //Se crea el objeto ResultSet implementando el metodo (consultaSQL) creado para la consulta
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                usuarios usuario = new usuarios();
                //Asignar cada campo consultado al atributo en la clase 
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setUsuario(resultadoSQL.getString("usuario"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setPregunta(resultadoSQL.getString("pregunta"));
                usuario.setRespuesta(resultadoSQL.getString("respuesta"));
                usuario.setFecha(resultadoSQL.getString("fecha_registro"));
                lista.add(usuario);
            }
        }catch(Exception ex){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return lista;
    }
    
    //Metodo para probar de inmediato el metodo starSession
    public static void main(String[] args) {
        
        //UsuarioDAO p = new UsuarioD
       registroDAO p = new registroDAOImplementar();
        ArrayList<usuarios> user = new ArrayList();
        user = p.starSesion("saraimancia@gmail.com", "yaya2002");
        //Para obtener el tamaño de un Array esta dado en base a la cantidad
        //de filas o registros existentes en la BD
        int size = user.size();
        
        for(int i =0; i< user.size(); i++){
            System.out.println(user.get(i).getUsuario()+ "\t" + user.get(i).getClave()+"\t"+ user.get(i).getCorreo()+"\t"+ user.get(0).getNombre()+"\t"+
                    user.get(0).getTipo());
            System.out.println("El valor maximo de i es: " + i);
        }
    }
}
