
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    public static String url = "jdbc:mysql://localhost:3306/bd_inventario";
    public static String usuario = "root";
    public static String clave = "";
    public static String clase = "com.mysql.jdbc.Driver";
    
    PreparedStatement ps = null;
    
    public static Connection conectar(){
        Connection conexion = null;
        try{
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion Establecida");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return conexion;
    }
    public ResultSet ejecutarConsultar(String sql) throws SQLException{
        Statement st =null;
        st = conectar().createStatement();
        ResultSet rs =st.executeQuery(sql);
        return rs;
    }
    public int ejecutarActualizacionP(String sql,Object[] params)throws SQLException{
        ps=conectar().prepareStatement(sql);
        for(int i=0; i<params.length;i++){
            ps.setObject(i+ 1, params[i]);
        }
        int r = ps.executeUpdate();
        return r;
    }
    public void desconectar() throws SQLException{
        conectar().close();
    }
    
}
