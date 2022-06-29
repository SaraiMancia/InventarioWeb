
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Categoria;
import Model.Producto;
import java.util.List;


public class Prueba {
       public static void main(String[] args) {
        Prueba evaluar = new Prueba();
       evaluar.editarProd();
       evaluar.guardarProducto();
        evaluar.listarProducto();
        evaluar.eliminarCategoria();
       evaluar.listarProducto();
        
    }
    
    
    public void listarProducto(){
        ProductoDAO pro = new ProductoDAOImplementar();        
        //Prueba Listar
        
        List<Producto> listar = pro.Listar();
        System.out.println("Listado de categorias");
        for(Producto prodListar: listar){
            System.out.println(" ID: " + prodListar.getId_producto() +
                    " Nombre: " + prodListar.getNom_producto() +
                    " Stock: " + prodListar.getStock() +
                    " Precio: " + prodListar.getPrecio() +
                    " Unidad de medida: " + prodListar.getUnidad_de_medida() +
                    " Estado: " + prodListar.getEstado_producto()+
                    " categoria: " + prodListar.getCategoria());
        }
    }
     public void editarProd(){
         ProductoDAO p = new ProductoDAOImplementar();
         Producto p_edit =p.editarProd(3);
         System.out.println("CATEGORIA A MODIFICAR");
         System.out.println("ID: " + p_edit.getId_producto() + "\n" +
                    " Nombre: " + p_edit.getNom_producto() + "\n" +
                    " Estado: " + p_edit.getStock() + "\n" +
                    " Precio: " + p_edit.getPrecio() + "\n" +
                    " Unidad: " + p_edit.getUnidad_de_medida() + "\n" +
                    " estado: " + p_edit.getEstado_producto() + "\n" +
                    " categoria: " + p_edit.getCategoria());
    }
      
         
   public void guardarProducto(){
        ProductoDAO p = new ProductoDAOImplementar();
        Producto guardar_prod = new Producto();
        //guardar_prod.setId_producto(1);
        guardar_prod.setNom_producto("manzana");
        guardar_prod.setStock(4);
         guardar_prod.setPrecio((float) 0.35);
          guardar_prod.setUnidad_de_medida("2 lb"); 
           guardar_prod.setEstado_producto(2);
           guardar_prod.setCategoria(1);
        p.guardarProd(guardar_prod);
       
    }
    public void eliminarCategoria(){
        ProductoDAO categoria = new ProductoDAOImplementar();
        categoria.borrarProd(5);
    }
}
    

