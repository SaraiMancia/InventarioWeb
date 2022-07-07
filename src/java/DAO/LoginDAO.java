
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import BD.Conexion;
import Model.usuarios;
import java.sql.ResultSet;

/**
 *
 * @author j0rg3
 */
public class LoginDAO {
    int rspta=0;
    String sql="";
    ResultSet rs=null;
    Conexion cn=new Conexion();

    public int validarLogin(usuarios tm) throws Exception{
        sql="SELECT COUNT(id) AS cantidad FROM `tb_usuario` WHERE usuario='"+tm.getUsuario()+"' AND clave='"+tm.getClave()+"'";
        rs=cn.ejecutarConsulta(sql);
        while(rs.next()){
            rspta=rs.getInt("cantidad");
        }
     return rspta;      
    }

    
}