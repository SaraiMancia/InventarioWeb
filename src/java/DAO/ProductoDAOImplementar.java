
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
                prodc.setStock(resultadoSQL.getFloat("stock"));
                prodc.setPrecio(resultadoSQL.getFloat("precio"));
                prodc.setUnidadMedida(resultadoSQL.getString("unidadMedida"));
                prodc.setEstado(resultadoSQL.getInt("estado"));
                prodc.setCategoria(resultadoSQL.getCategoria("categoria"));
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
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
      Producto prodc = new Producto();
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("select * from tb_producto where id_producto = ").append(id_prod_edit);
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                prodc.setId_producto(resultadoSQL.getInt("id_producto"));
                prodc.setNom_producto(resultadoSQL.getString("nom_producto"));
                prodc.setCategoria_id(resultadoSQL.getInt("categoria_id"));
                prodc.setStock(resultadoSQL.getFloat("stock"));
                prodc.setPrecio(resultadoSQL.getFloat("precio"));
                prodc.setUnidadMedida(resultadoSQL.getString("unidadMedida"));
                prodc.setEstado(resultadoSQL.getInt("estado"));
                prodc.setCategoria(resultadoSQL.getCategoria("categoria"));
               
            }
            
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return prodc;
    }
    
        @Override
    public boolean guardarProd(Producto producto) {
           this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guarda = false;
        
        try{
            if(producto.getId_producto() == 0){
                System.out.println("Guardar");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("INSERT INTO tb_producto(nom_producto, categoria_id, stock, precio, unidadMedida, estado, categoria) VALUES('");
                miSQL.append(producto.getNom_producto() + "', ").append(producto.getCategoria_id()+ "', ").append(producto.getStock()+ "', ").append(producto.getPrecio()
                + "', ").append(producto.getUnidadMedida()+ "', ").append(producto.getEstado()+ "', ").append(producto.getCategoria());
                miSQL.append(");");
                this.conn.ejecutarSQL(miSQL.toString());
            }else if(producto.getId_producto() > 0){
                
               System.out.println("Update");
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("UPDATE tb_categoria SET id_categoria = ").append(producto.getId_producto());
                miSQL.append(", nom_categoria = '").append(producto.getNom_producto());
                miSQL.append(", categoria_id = ").append(producto.getCategoria_id());
                miSQL.append(", stock = ").append(producto.getStock());
                miSQL.append(", precio = ").append(producto.getPrecio());
                miSQL.append(", unidadMedida = ").append(producto.getUnidadMedida());
                miSQL.append(", estado = ").append(producto.getEstado());
                 miSQL.append("', categoria = ").append(producto.getCategoria());
                
                miSQL.append(" WHERE id_categoria = ").append(producto.getId_producto()).append(";");
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
    public boolean borrarProd(int id_prod_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
     
        