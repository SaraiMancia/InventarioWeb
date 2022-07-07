package Controller;

import DAO.registroDAO;
import DAO.registroDAOImplementar;
import Model.usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class registroUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws Servlet…
[1:33 a. m., 7/7/2022] Sari♡: + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='" + url + "';"
                        + "}"
                        + "</script>");
                       }
                }
                
                break;
        }
    }
    


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void registrarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/Vista-sesion/registro.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void verMenu(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/Vista-sesion/menuprincipal.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void cargarIndex(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/index.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void recuperarCuenta(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/Vista-sesion/RecuperarCuenta.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
    public void recuperarContraseña(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
            
        response.setContentType("text/html;charset=utf-8");
        String pagina = "/Vista-sesion/RecuperarContraseña.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
    }
    
 
}