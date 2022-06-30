
package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;

import Model.UsuarioM;


public class RegistroDAOImplementar implements RegistroDAO{
    ConexionBD conn;

    public RegistroDAOImplementar() {
    }
    
    @Override
    public boolean guardarUsu(UsuarioM usuario) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guardar = false;
        try{
            if(usuario.getId()== 0){
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("INSERT INTO tb_usuario(nombre, apellido, correo, usuario, clave, tipo, pregunta, estado, respuesta, fecha) VALUES('");
            miSQL.append(usuario + "', ").append(usuario.getEstado());
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
}
