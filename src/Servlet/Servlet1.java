package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//計算記号を格納する配列を宣言→初期化
		String[] culc = new String[4];
		culc[0]="+";
		culc[1]="-";
		culc[2]="*";
		culc[3]="/";

		//requestオブジェクトに上記配列をセットする
		request.setAttribute("Culc", culc);

		//jsp1にフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Calc1.jsp");
		dispatcher.forward(request, response);

	}

}
