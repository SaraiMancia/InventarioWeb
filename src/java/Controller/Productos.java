
package Controller;


import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Productos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        
    }
protected void listaProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductoDAO prod = new ProductoDAOImplementar();
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", prod.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/listarProductos.jsp");
        dispatcher.forward(request, response);
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 String estado = request.getParameter("opcion");
         String id_pro = request.getParameter("id");
         String nombre_pro= request.getParameter("nombre");
         String categoria_pro = request.getParameter("categoria");
         String stock_pro = request.getParameter("stk");
         String precio_pro= request.getParameter("precio");
         String unidad_pro = request.getParameter("unidadM");
         String estado_pro = request.getParameter("est");
         String cate_pro= request.getProductos("categ");
   
         /*
         System.out.println("La opcion es: " + estado);
         System.out.println("El ID es: " + id_cat);
         System.out.println("El nombre es: " + nombre_cat);
         System.out.println("El estado es. " + estado_cat);
         */
    
         if(estado.equals("Listar")){
             this.listaProducto(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Editando categorias....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/editarProductos.jsp?id="+id_pro+"&&nombre="+nombre_pro+"&&categoria="+categoria_pro+
                     "&&stk"+stock_pro+"&&precio"+precio_pro+"&&unidadM"+unidad_pro+"&&est"+estado_pro+"&&categ"+cate_pro);
             dispatcher.forward(request, response);
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de producto...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/eliminarProductos.jsp?id="+id_pro+"&&nombre="+nombre_pro+"&&categoria="+categoria_pro+
                     "&&stk"+stock_pro+"&&precio"+precio_pro+"&&unidadM"+unidad_pro+"&&est"+estado_pro+"&&categ"+cate_pro);
             dispatcher.forward(request, response);
             dispatcher.forward(request, response);
         }else if(estado.equals("crear")){
             System.out.println("Crear producto...");
             String pagina = "/Vistas-Producto/crearProductos.jsp";
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
        producto.setNom_producto(request.getParameter("txtNomCategoria"));
        producto.setCategoria_id(Integer.parseInt(request.getParameter("txtEstadoCategoria")));
        producto.setStock(Integer.parseFloat(request.getParameter("txtEstadoCategoria")));

        ProductoDAO guardarCategoria = new ProductoDAOImplementar();
        guardarProducto.guardarPro(producto);
        this.listaProducto(request, response);
        
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
