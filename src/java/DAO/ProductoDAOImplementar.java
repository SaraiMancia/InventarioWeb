
package DAO;

import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import Model.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAOImplementar implements ProductoDAO{
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
                prodc.setStock(resultadoSQL.getFloat("stock"));
                prodc.setPrecio(resultadoSQL.getFloat("precio"));
                prodc.setUnidad_de_medida(resultadoSQL.getString("unidad_de_medida"));
                prodc.setEstado_producto(resultadoSQL.getInt("estado_producto"));
                prodc.setCategoria(resultadoSQL.getInt("categoria"));
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
                prodc.setStock(resultadoSQL.getFloat("stock"));
                prodc.setPrecio(resultadoSQL.getFloat("precio"));
                prodc.setUnidad_de_medida(resultadoSQL.getString("unidad_de_medida"));
                prodc.setEstado_producto(resultadoSQL.getInt("estado_producto"));
                prodc.setCategoria(resultadoSQL.getInt("categoria"));
               
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
                miSQL.append("INSERT INTO tb_producto(nom_producto, stock, precio, unidad_de_medida, estado_producto) VALUES('");
            miSQL.append(producto.getNom_producto() + "', '").append(producto.getStock() + "', '").append(producto.getPrecio() + "', '").append(producto.getUnidad_de_medida() + "', '").append(producto.getEstado_producto()).append("\'");
            miSQL.append(");");
            this.conn.ejecutarSQL(miSQL.toString());
        }else if(producto.getId_producto() > 0){
             StringBuilder miSQL = new StringBuilder();
             miSQL.append("UPDATE tb_producto SET id_producto = ").append(producto.getId_producto());
             miSQL.append(",nom_producto = '").append(producto.getNom_producto());
             miSQL.append("',stock = '").append(producto.getStock());
             miSQL.append("',precio ='").append(producto.getPrecio());
             miSQL.append("',unidad_de_medida = '").append(producto.getUnidad_de_medida());
             miSQL.append("',estado_producto = '").append(producto.getEstado_producto());
             
             miSQL.append("WHERE id = ").append(producto.getId_producto()).append(";");
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

}

