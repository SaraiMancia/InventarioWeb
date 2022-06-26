
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;


public class Prueba {
       public static void main(String[] args) {
        Prueba evaluar = new Prueba();
       //evaluar.editarCategoria();
       evaluar.guardarCatgoria();
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
      
         
    public void guardarCatgoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria guardar_cat = new Categoria();
        //Lo nuevo es seteo del id
        guardar_cat.setNom_categoria("Bebidas");
        //guardar_cat.setId_categoria();
        guardar_cat.setEstado_categoria(4);
        categoria.guardarCat(guardar_cat);
        
    }
    public void eliminarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(8);
    }
    
}
