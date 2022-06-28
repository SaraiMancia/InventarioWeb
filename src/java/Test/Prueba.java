
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
        evaluar.listarcategorias();
        //evaluar.eliminarCategoria();
        evaluar.listarcategorias();
        
    }
    
    
    public void listarcategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();        
        //Prueba Listar
        
        List<Categoria> listar = categoria.Listar();
        System.out.println("Listado de categorias");
        for(Categoria categoriaListar: listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                    "Nombre: " + categoriaListar.getNom_categoria() +
                    "Estado: " + categoriaListar.getEstado_categoria());
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
        p.guardarProd(guardar_prod);
       
    }
    public void eliminarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(8);
    }
    
}
