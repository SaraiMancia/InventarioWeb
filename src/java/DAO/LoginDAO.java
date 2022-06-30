
package DAO;

import Factory.ConexionBD;
import Factory.Conexion;
import Model.UsuarioM;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    int respt = 0;
    String sql = "";
    Conexion cn = new Conexion() ;
    ResultSet rs=null;
    public int validarLogin(UsuarioM usu) throws SQLException{
        
        sql = "SELECT COUNT(id)AS cantidad FROM `tb_usuario` WHERE correo='" + usu.getCorreo() + "' AND clave='" + usu.getClave()+"'";
        rs=cn.ejecutarConsultar(sql);
        while(rs.next()){
            respt=rs.getInt("cantidad");
        }
        return respt;
    }
}
