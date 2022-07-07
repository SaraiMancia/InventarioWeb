package BD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manue
 */
public class Conexion {
     public static String url = "jdbc:mysql://localhost/bd_inventario";
    public static String usuario = "root";
    public static String clave = "";
    public static String clase = "com.mysql.jdbc.Driver";
    PreparedStatement ps=null;

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexion establecida..");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
    public ResultSet ejecutarConsulta(String sql) throws Exception{
    Statement st=null;
    st=conectar().createStatement();
    ResultSet rs=st.executeQuery(sql);
    return rs;
    }
    public int ejecutarActualizacionP(String sql,Object[] params)throws SQLException{
        ps=conectar().prepareStatement(sql);
        //definir los valores para los argumentos
        for(int i=0;i<params.length;i++){
                ps.setObject(i+1,params[i]);
                }
        int r=ps.executeUpdate(); //retorna la cantidad de registros actualizados    
        return r;   
    }
    public void desconectar() throws SQLException{
    conectar().close();
    }
    
}

