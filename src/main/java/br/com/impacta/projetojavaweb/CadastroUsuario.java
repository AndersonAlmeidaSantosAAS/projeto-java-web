package br.com.impacta.projetojavaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String confirmaSenha = request.getParameter("confirmaSenha");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro Usuario realizado com sucessi!!!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>Nome:</h4>" + nome );
        out.println("<h4>Login:</h4>" + login );
        out.println("<h4>Senha:</h4>" + senha );
        out.println("<h4>Confirme a Senha:</h4>" + confirmaSenha );

        out.println("</body>");
        out.println("</body></html>");
    }
}
