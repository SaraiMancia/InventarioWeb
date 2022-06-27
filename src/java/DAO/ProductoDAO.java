package DAO;


import Model.Producto;
import java.util.List;

public interface ProductoDAO {
    //public int dato1 = 10;
    
    public List<Producto> Listar();
    public List<Producto> Listar2();
    public Producto editarProd(int id_prod_edit);
    public boolean guardarProd(Producto producto);
    public boolean borrarProd(int id_prod_borrar);
    
    //public boolean metodo1();
}



