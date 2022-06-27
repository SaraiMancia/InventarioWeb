
package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductosS extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   protected void listaProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductoDAO producto = new ProductoDAOImplementar();
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", Producto.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/listarProducto.jsp");
        dispatcher.forward(request, response);
    } 
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //this.listaCategorias(request, response);
      
         String estado = request.getParameter("opcion");
         String id_producto = request.getParameter("id");
         String nom_producto = request.getParameter("nombre");
         String categoria_id = request.getParameter("categoria");
         String stock = request.getParameter("stock");
         String precio = request.getParameter("precio");
         String unidadMedida = request.getParameter("unidad de medida");
         String estado_p = request.getParameter("estado producto");
    

    
    if(estado.equals("listar")){
             this.listaProducto(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Editando productos....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/editarProductos.jsp?id="+id_producto+"&&nombre="+nom_producto+"&&categoria="+categoria_id+
                     "&&stock="+stock+"&&precio="+precio+"&&unidad de medida"+unidadMedida+"&&estado producto"+estado);
             dispatcher.forward(request, response);
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de productos...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/eliminarProductos.jsp?id="+id_producto+"&&nombre="+nom_producto+"&&categoria="+categoria_id+
                     "&&stock="+stock+"&&precio="+precio+"&&unidad de medida"+unidadMedida+"&&estado producto"+estado);
             dispatcher.forward(request, response);
         }else if(estado.equals("crear")){
             System.out.println("Crear productos...");
             String pagina = "/Vistas-Producto/crearProducto.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
             dispatcher.forward(request, response);
         }else{
             
         }
         
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Producto producto = new Producto();
       
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNomProducto"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtEstadoProducto")));

        ProductoDAO guardarProducto = new ProductoDAOImplementar();
        guardarProducto.guardarProd(producto);
        this.listaProducto(request, response);
        
        
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
