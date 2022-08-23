package br.edu.infnet.app;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "CadastrarContatoServlet", urlPatterns = {"/CadastrarContatoServlet"})
public class CadastrarContatoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String fone = request.getParameter("fone");
        ArrayList<String> erros = new ArrayList<>();
        if(StringUtils.isBlank(nome)) {
            erros.add("O campo NOME é obrigatório");
        }
        if(StringUtils.isBlank(email)) {
            erros.add("O campo EMAIL é obrigatório");
        }
        if(StringUtils.isBlank(fone)) {
            erros.add("O campo TELEFONE é obrigatório");
        }
        if(erros.isEmpty()) {
            request.setAttribute("Sucesso", "O contato foi cadastrado com sucesso");
        } else {
            request.setAttribute("erros", erros);
        }
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
