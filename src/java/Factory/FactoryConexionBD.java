
package Factory;

public class FactoryConexionBD {
    public static final int MySQL = 1;
    public static String[] configMySQL = {"bd_inventario", "root",""};
    
    public static ConexionBD open(int tipoDB){
        switch(tipoDB){
            case FactoryConexionBD.MySQL:
                return new MySQLConexionFactory(configMySQL);
            default:
                return null;
        }
    }
    
    
    public static void main(String[] args) {
        open(1);
    }
            
}