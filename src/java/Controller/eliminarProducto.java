
package Controller;

import DAO.ProductoDAOImplementar;
import DAO.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class eliminarProducto extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
     }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        processRequest(request, response);
        
         String respuesta = request.getParameter("respuesta");
         String id = request.getParameter("id");
         
         ProductoDAO producto = new ProductoDAOImplementar();
      
         if(producto.borrarProd(Integer.parseInt(id))){
             System.out.println("Registro eliminado correctamente.");
             this.listaProducto(request, response);
            
         }else{
             System.out.println("Error. No se pudo eliminar el registro.");
         }
    }

     protected void listaProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         ProductoDAO producto = new ProductoDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", producto.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/listarProducto.jsp");
         dispatcher.forward(request, response);
    }
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
