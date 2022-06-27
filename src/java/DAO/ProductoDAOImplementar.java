
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
<<<<<<< Updated upstream
    public Producto editarProd(int id_prod_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
    public Producto editarCat(int id_prod_edit) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        Producto producto = new Producto();
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("select * from tb_producto where id_producto = ").append(id_prod_edit);
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
               producto.setId_producto(resultadoSQL.getInt("id_producto"));
                producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                producto.setCategoria_id(resultadoSQL.getInt("categoria_id"));
                producto.setStock(resultadoSQL.getFloat("stock"));
                producto.setPrecio(resultadoSQL.getFloat("precio"));
                producto.setUnidadMedida(resultadoSQL.getString("unidadMedida"));
                producto.setEstado(resultadoSQL.getInt("estado_p"));
                producto.setCategoria(resultadoSQL.getCategoria("categoria"));
            }
            
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return producto;
>>>>>>> Stashed changes
    }

    @Override
    public boolean guardarProd(Producto producto) {
<<<<<<< Updated upstream
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarProd(int id_prod_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
           this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guarda = false;
        
        try{
            if(producto.getId_producto() == 0){
                System.out.println("Guardar");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("INSERT INTO tb_producto(nom_producto, estado_producto) VALUES('");
                miSQL.append(producto.getNom_producto() + "', ").append(producto.getEstado_producto());
                miSQL.append(");");
                this.conn.ejecutarSQL(miSQL.toString());
            }else if(producto.getId_producto() > 0){
                
               System.out.println("Update");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("UPDATE tb_producto SET id_producto = ").append(producto.getId_producto());
                miSQL.append(", nom_producto = '").append(producto.getNom_producto());
                  miSQL.append("', estado_producto = ").append(producto.getEstado_producto());
                miSQL.append(" WHERE id_producto = ").append(producto.getId_producto()).append(";");
                this.conn.ejecutarSQL(miSQL.toString());
            }
           guarda = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return guarda;
    }

    @Override
    public boolean borrarCat(int id_prod_borrar) {
           this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean borra = false;
        try{
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("Delete from tb_producto where id_producto = ").append(id_prod_borrar);
            this.conn.ejecutarSQL(miSQL.toString());
            borra = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return borra;
    }

    @Override
    public Producto editarProd(int id_prod_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarProd(int id_prod_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> Stashed changes
    }
     }
        