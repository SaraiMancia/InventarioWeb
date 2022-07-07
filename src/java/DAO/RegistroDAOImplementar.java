
package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.usuarios;


public class registroDAOImplementar implements registroDAO{

    ConexionBD conn;

    @Override
    public ArrayList<usuarios> startSesion(String user, String clave) {
           this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario WHERE correo = '").append(user);
        miSQL.append("' and clave = '").append(clave);
        miSQL.append("';");  
        System.out.println(miSQL);
        //ArrayList<Usuario> user = new ArrayList(); // crear el array de almacenamiento en cada fial los registros encontrados
        ArrayList<usuarios> lista = new ArrayList<usuarios>();
        try{
        //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                usuarios usuario = new usuarios();
                //Asignar cada campo consultado al atributo en la clase.
                usuario.setId(resultadoSQL.getInt("id"));
                usuario.setNombre(resultadoSQL.getString("nombre"));
                usuario.setApellido(resultadoSQL.getString("apellido"));
                usuario.setCorreo(resultadoSQL.getString("correo"));
                usuario.setUsuario(resultadoSQL.getString("usuario"));
                usuario.setClave(resultadoSQL.getString("clave"));
                usuario.setTelefono(resultadoSQL.getInt("telefono"));
                usuario.setTipo(resultadoSQL.getInt("tipo"));
                usuario.setEstado(resultadoSQL.getInt("estado"));
                usuario.setPregunta(resultadoSQL.getString("pregunta"));
                usuario.setRespuesta(resultadoSQL.getString("respuesta"));
                usuario.setFecha(resultadoSQL.getString("fecha_registro"));
                lista.add(usuario); //Agregar al array cada registro encontrado.
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally{
            this.conn.cerrarConexion();
        }
        return lista;
    }

    @Override
    public boolean RegistrarUsuario(usuarios usuario) {
      this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        Boolean registrar = false;
        try
        {
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("insert into tb_usuario (nombre, apellido, correo, usuario, clave, telefono,  estado, tipo, pregunta, respuesta) ");
        miSQL.append("values ('");
        miSQL.append(usuario.getNombre());
        miSQL.append("', '");
        miSQL.append(usuario.getApellido());
        miSQL.append("', '");
        miSQL.append(usuario.getCorreo());
        miSQL.append("', '");
        miSQL.append(usuario.getUsuario());
        miSQL.append("', '");
        miSQL.append(usuario.getClave());
        miSQL.append("', ");
        miSQL.append(usuario.getTelefono());
        miSQL.append(", ");
        miSQL.append(usuario.getEstado());
        miSQL.append(", ");
        miSQL.append(usuario.getTipo());
        miSQL.append(", '");
        miSQL.append(usuario.getPregunta());
        miSQL.append("', '");
        miSQL.append(usuario.getRespuesta());
        miSQL.append("');");
        this.conn.ejecutarSQL(miSQL.toString());
        
        registrar = true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return registrar;
    }

    @Override
    public String recuperarCorreo(long telefono) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        String correo = "";
        usuarios usu = new usuarios();
        StringBuilder miSQL = new StringBuilder();
            miSQL.append("Select correo from tb_usuario where telefono = ");
            miSQL.append(telefono);
            
        try
        {
            
            ResultSet rs = this.conn.consultaSQL(miSQL.toString());
            while(rs.next())
            {
                    usu.setCorreo(rs.getString("correo"));
            }
            
            correo = usu.getCorreo();
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return correo;
    }

    @Override
    public String recuperarContraseña(String correo) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        String contraseña = "";
        usuarios usu = new usuarios();
        StringBuilder miSQL = new StringBuilder();
            miSQL.append("Select clave from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("';");
            
        try
        {
            
            ResultSet rs = this.conn.consultaSQL(miSQL.toString());
            while(rs.next())
            {
                    usu.setClave(rs.getString("clave"));
            }
            
            contraseña = usu.getClave();
        }
        
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        return contraseña;
    }

    @Override
    public String pregunta(String correo) {
         this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        String pregunta = "";
        usuarios usu = new usuarios();
        try
        {
            ResultSet rs = null;
            miSQL.append("Select pregunta from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("'; ");
            
            rs = this.conn.consultaSQL(miSQL.toString());
            
while(rs.next())
            {
                usu.setPregunta(rs.getString("pregunta"));
                pregunta = usu.getPregunta();
                return pregunta;
            }
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
        
        return pregunta;
    }

    @Override
    public String respuesta(String correo, String pregunta) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
       StringBuilder miSQL = new StringBuilder();
       String respuesta = "";
       
       try
       {
           miSQL.append("Select respuesta from tb_usuario where correo = '");
           miSQL.append(correo);
           miSQL.append("' and pregunta = '");
           miSQL.append(pregunta);
           miSQL.append("'; ");
           
           ResultSet rs = this.conn.consultaSQL(miSQL.toString());
           while(rs.next())
           {
               respuesta = rs.getString("respuesta");
               return respuesta;
           }
       }
       catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
       
       return respuesta;
    }

    @Override
    public String verificarCorreo(String correo) {
               this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        String Correo = "";
        try
        {
            miSQL.append("Select correo from tb_usuario where correo = '");
            miSQL.append(correo);
            miSQL.append("';");
            
            ResultSet rs = null;
            rs = this.conn.consultaSQL(miSQL.toString());
            while(rs.next())
            {
                Correo = rs.getString("correo");
                return Correo;
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            this.conn.cerrarConexion();
        }
       return Correo;
    }
}