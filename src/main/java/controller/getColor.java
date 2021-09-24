package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.colorInfo;

/**
 * Servlet implementation class getColor
 */
@WebServlet("/getColor")
public class getColor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getColor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userColor = request.getParameter("userColor");
		colorInfo userColorInfo = new colorInfo(userColor);
		
		request.setAttribute("userColor", userColorInfo);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userColorInfo.toString());
		writer.close();
	}

}
