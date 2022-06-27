
package DAO;


import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import Model.Categoria;
import Model.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



     public class ProductoDAOImplementar implements ProductoDAO {
    
     ConexionBD conn;

    public ProductoDAOImplementar() {
    
    }

    @Override
    public List<Producto> Listar() {
      this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("select * from tb_producto;");
        List<Producto> lista = new ArrayList<Producto>();
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                Producto prodc = new Producto();
                prodc.setId_producto(resultadoSQL.getInt("id_producto"));
                prodc.setNom_producto(resultadoSQL.getString("nom_producto"));
                prodc.setCategoria_id(resultadoSQL.getInt("categoria_id"));
                lista.add(prodc);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            this.conn.cerrarConexion();
        }
        
        return lista;
    
    }

    @Override
    public List<Producto> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto editarProd(int id_prod_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarProd(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarProd(int id_prod_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     }
        