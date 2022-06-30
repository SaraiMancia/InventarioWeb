
package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import Model.UsuarioM;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Inicio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        UsuarioDAO usu = new UsuarioDAOImplementar();
        UsuarioM usuario = new UsuarioM();
        //Creación de arraylist para cargar datos del método que consulta a la base de datos.
        ArrayList<UsuarioM> users = new ArrayList();
        HttpSession var_Session = request.getSession(true);
        usuario.setCorreo(request.getParameter("txtCorreoU"));
        usuario.setClave(request.getParameter("txtContra"));
        
        users = usu.startSesion(usuario.getCorreo(), usuario.getClave());
        
        
        if(users.size()>0){
            
            String name_full = users.get(0).getNombre() + " " + users.get(0).getApellido();
            int tipo_user = users.get(0).getTipo();
            String name_user = users.get(0).getUsuario();
            String email_user = users.get(0).getCorreo();
            
           
            var_Session.setAttribute("sessionNombres", name_full);
            var_Session.setAttribute("sessionTipo", String.valueOf(tipo_user));
            var_Session.setAttribute("sessionUsuario", name_user);
            var_Session.setAttribute("sessionEmail", email_user);
            
            //Seteo en la variable de sesión lista, el contenido del arrayList. Los datos contenidos
            //en el arrayList los obtengo de la consulta realizada a la base de datos.
            var_Session.setAttribute("lista", users); //lista es el nombre de la variable de sesión.
           
            //request.getRequestDispatcher("mostrarusuario.jsp").forward(request, response);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/principal.jsp");
            dispatcher.forward(request, response);
            //response.sendRedirect("principal.jsp");
        }else{
            //System.out.println("No se encontrarón resultados para la busqueda especificada.");
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            //Apunto al servlet que le llame Login pero lo llamo por el parametro url-pattern.
            //Eso se puede verificar en: WEB-INF/web.xml.
            String url = "sesion";   
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + usuario + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='"+ url + "';"
                        + "}"
                        + "</script>");
                }
            }
         
        
        
        
        
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
