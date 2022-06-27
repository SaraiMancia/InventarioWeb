package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioDaoImplementar;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
     
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
        //response.sendRedirect("/index.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String dato_user_form = request.getParameter("txtEmail");
        String dato_pass_form = request.getParameter("txtPassword");
        
  
        UsuarioDAO usuario = new UsuarioDaoImplementar();    
        ArrayList<Usuario> users = new ArrayList(); 
        HttpSession var_Session= request.getSession(true);
        
        users = usuario.startSesion(dato_user_form, dato_pass_form);
        if(users.size()>0){

            String name_full = users.get(0).getNombre() + " " + users.get(0).getApellido();
            
            int tipo_user = users.get(0).getTipo();
            String name_user = users.get(0).getUsuario();
            String email_user = users.get(0).getCorreo();
            var_Session.setAttribute("sessionNombres", name_full);
            var_Session.setAttribute("sessionTipo", String.valueOf(tipo_user));
            var_Session.setAttribute("sessionUsuario", name_user);
            var_Session.setAttribute("sessionEmail", email_user);
            var_Session.setAttribute("lista", users);
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/principal.jsp");
            dispatcher.forward(request, response);
        }else{
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            String url = "sesion";   
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + dato_user_form + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
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
