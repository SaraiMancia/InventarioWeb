
package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class modificarProducto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        //String estado = request.getParameter("opcion");
         String id_cat = request.getParameter("id");
         String nombre_cat = request.getParameter("nombre");
         String estado_cat = request.getParameter("estado");
       
         ProductoDAO producto = new ProductoDAOImplementar();
         Producto prod = new Producto();
         prod.setId_producto(Integer.parseInt(id_producto));
         prod.setNom_categoria(nombre_cat);
         cat.setEstado_categoria(Integer.parseInt(estado_cat));
         if(categoria.guardarCat(cat)){
             //System.out.println("Registro Actualizado.");
              RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/editarCategoria.jsp?aviso=ok");
              dispatcher.forward(request, response);
         }else{
             System.out.println("Error. El registro no se pudo actualizar.");
         }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
