package com.douglasviegas.projetoServlet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douglasviegas.projetoServlet.entity.User;
import com.douglasviegas.projetoServlet.repository.LoginRepository;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet(name = "LoginServlet", value="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	LoginRepository loginRepository = new LoginRepository();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginRepository.setup();
		
		User user = loginRepository.findByUsernameAndPassword(username, password);
		
		if (user ==null) {
			response.getWriter().append("Usuário ou senha inválidos.");
			return;
		} else {
			response.getWriter().append("Bem vindo: " + user.getUsername());
			return;
		}
	}

}
