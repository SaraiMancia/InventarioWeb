
package DAO;

import Controller.Usuario;
import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import Model.Categoria;
import Model.UsuarioM;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioDAOImplementar  implements UsuarioDAO{
    
    ConexionBD conn;
    
      public UsuarioDAOImplementar() {
        //Definir a la base de datos que se conectará por defecto.
        //this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
    }
    @Override
    public ArrayList<UsuarioM> startSesion(String usuario, String clave) {
         this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario WHERE BINARY correo = '").append(usuario);
        miSQL.append("' and clave = md5('").append(clave);
        miSQL.append("');");  
        System.out.println(miSQL);
        //ArrayList<Usuario> user = new ArrayList(); // crear el array de almacenamiento en cada fial los registros encontrados
        ArrayList<UsuarioM> lista = new ArrayList<UsuarioM>();
        try{
        //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                
                UsuarioM usuari = new UsuarioM();
                //Asignar cada campo consultado al atributo en la clase.
                usuari.setId(resultadoSQL.getInt("id"));
                usuari.setNombre(resultadoSQL.getString("nombre"));
                usuari.setApellido(resultadoSQL.getString("apellido"));
                usuari.setCorreo(resultadoSQL.getString("correo"));
                usuari.setUsuario(resultadoSQL.getString("usuario"));
                usuari.setClave(resultadoSQL.getString("clave"));
                usuari.setTipo(resultadoSQL.getInt("tipo"));
                usuari.setEstado(resultadoSQL.getInt("estado"));
                usuari.setPregunta(resultadoSQL.getString("pregunta"));
                usuari.setRespuesta(resultadoSQL.getString("respuesta"));
                usuari.setFecha(resultadoSQL.getString("fecha_registro"));
                lista.add(usuari); //Agregar al array cada registro encontrado.
                
                /*lista.add(new Usuario(usuario.setId(resultadoSQL.getInt("id")),
                        usuario.setNombre(resultadoSQL.getString("nombre")),
                        usuario.setApellido(resultadoSQL.getString("apellido")),
                        usuario.setCorreo(resultadoSQL.getString("correo")),
                        usuario.setUsuario(resultadoSQL.getString("usuario")),
                        usuario.setClave(resultadoSQL.getString("clave")),
                        usuario.setTipo(resultadoSQL.getInt("tipo")),
                        usuario.setEstado(resultadoSQL.getInt("estado")),
                        usuario.setPregunta(resultadoSQL.getString("pregunta")),
                        usuario.setRespuesta(resultadoSQL.getString("respuesta")),
                        usuario.setFecharegistro(resultadoSQL.getString("fecha_registro"))));*/       
            }
        }catch(Exception ex){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return lista;
    }

    @Override
    public boolean guardarUsu(UsuarioM usuario) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guardar = false;
        try{
            if(usuario.getId()== 0){
                System.out.println("Hola");
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("INSERT INTO tb_usuario(nombre, usuario, correo, clave, estado, tipo, pregunta, respuesta, apellido) VALUES('");
            miSQL.append(usuario.getNombre() + "', '").append(usuario.getUsuario() + "', '").append(usuario.getCorreo() + "', '").append(usuario.getClave() + "', '").append(usuario.getEstado() + "', '").append(usuario.getTipo() + "', '").append(usuario.getPregunta() + "', '").append(usuario.getRespuesta() + "', '").append(usuario.getApellido()).append("\'");
            miSQL.append(");");
            this.conn.ejecutarSQL(miSQL.toString());
        }else if(usuario.getId() > 0){
             StringBuilder miSQL = new StringBuilder();
             miSQL.append("UPDATE tb_usuario SET id = ").append(usuario.getId());
             miSQL.append(",nombre = '").append(usuario.getNombre());
             miSQL.append("',apellido = '").append(usuario.getApellido());
             miSQL.append("',correo ='").append(usuario.getCorreo());
             miSQL.append("',usuario = '").append(usuario.getUsuario());
             miSQL.append("',clave = '").append(usuario.getClave());
             miSQL.append("',tipo = '").append(usuario.getTipo());
             miSQL.append("', estado = '").append(usuario.getEstado());
             miSQL.append("',pregunta = '").append(usuario.getPregunta());
             miSQL.append("',respuesta = '").append(usuario.getRespuesta());
             miSQL.append("',fecha = '").append(usuario.getFecha());
             miSQL.append("WHERE id = ").append(usuario.getId()).append(";");
             this.conn.ejecutarSQL(miSQL.toString());
        }
           guardar = true;
        }catch (Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        return guardar;
    }

    @Override
    public void guardarUsu(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

