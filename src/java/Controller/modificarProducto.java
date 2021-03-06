
package Controller;

import Controller.ProductosS;
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
        ProductosS p = new ProductosS();
         String id_producto = request.getParameter("id");
         String nom_producto = request.getParameter("nombre");
         String stock = request.getParameter("stock");
         String precio = request.getParameter("precio");
         String unidadMedida = request.getParameter("unidaddemedida");
         String estado_p = request.getParameter("estadoproducto");
         String cat = request.getParameter("categoria");
    
         ProductoDAO producto = new ProductoDAOImplementar();
         Producto prod = new Producto();
         prod.setId_producto(Integer.parseInt(id_producto));
         prod.setNom_producto(nom_producto);
         prod.setStock(Float.parseFloat(stock));
         prod.setPrecio(Float.parseFloat(precio));
         prod.setUnidad_de_medida(unidadMedida);
         prod.setEstado_producto(Integer.parseInt(estado_p));
         prod.setCategoria(Integer.parseInt(cat));
         
         if(producto.guardarProd(prod)==true){
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/editarProducto.jsp?aviso=Ok");
         dispatcher.forward(request,response);
              
              p.listaProducto(request, response);
              
         }else{
             System.out.println("Error. El registro no se pudo actualizar.");
         }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
