
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
       //evaluar.editarCategoria();
       evaluar.guardarProducto();
        evaluar.listarProducto();
        //evaluar.eliminarCategoria();
        evaluar.listarProducto();
        
    }
    
    
    public void listarProducto(){
        ProductoDAO pro = new ProductoDAOImplementar();        
        //Prueba Listar
        
        List<Producto> listar = pro.Listar();
        System.out.println("Listado de categorias");
        for(Producto prodListar: listar){
            System.out.println("ID: " + prodListar.getId_producto() +
                    "Nombre: " + prodListar.getNom_producto() +
                    "Stock: " + prodListar.getStock() +
                    "Precio: " + prodListar.getPrecio() +
                    "Unidad de medida: " + prodListar.getUnidad_de_medida() +
                    "Estado: " + prodListar.getEstado_producto()+
                    "categoria: " + prodListar.getCategoria());
        }
    }
      public void editarCategoria(){
         CategoriaDAO categoria = new CategoriaDAOImplementar();
         Categoria cat_edit = categoria.editarCat(1);
         System.out.println("CATEGORIA A MODIFICAR");
         System.out.println("ID: " + cat_edit.getId_categoria() + "\n" +
                    "Nombre: " + cat_edit.getNom_categoria() + "\n" +
                    "Estado: " + cat_edit.getEstado_categoria());
    }
      
         
    public void guardarProducto(){
        ProductoDAO p = new ProductoDAOImplementar();
        Producto guardar_prod = new Producto();
        //Lo nuevo es seteo del id
        guardar_prod.setNom_producto("Bebidas");
        //guardar_cat.setId_categoria();
        guardar_prod.setStock(4);
         guardar_prod.setPrecio((float) 0.35);
          guardar_prod.setUnidad_de_medida("2 lb"); 
           guardar_prod.setEstado_producto(2);
        p.guardarProd(guardar_prod);
       
    }
    public void eliminarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(8);
    }
    
}
