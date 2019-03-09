package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//入力値num1~num3と計算記号を取得Getする
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		String strNum3 = request.getParameter("num3");

		String strSet1 = request.getParameter("s1");
		String strSet2 = request.getParameter("s2");


		//String -> intへキャストする
		Integer Num1 = Integer.parseInt(strNum1);
		Integer Num2 = Integer.parseInt(strNum2);
		Integer Num3 = Integer.parseInt(strNum3);


		//計算記号から種類ごとの演算をする

		int ans1 = 0;
		int ans2 = 0;
		//まず最初の２数を計算
		if(strSet1.equals("+")){
			ans1 = Num1 + Num2;
		}else if(strSet1.equals("-")){
			ans1 = Num1 - Num2;
		}else if(strSet1.equals("*")){
			ans1 = Num1 * Num2;
		}else if(strSet1.equals("/")){
			ans1 = Num1 / Num2;
		}
		//次に全体を計算
		if(strSet2.equals("+")){
			ans2 = ans1 + Num3;
		}else if(strSet2.equals("-")){
			ans2 = ans1 - Num3;
		}else if(strSet2.equals("*")){
			ans2 = ans1 * Num3;
		}else if(strSet2.equals("/")){
			ans2 = ans1 / Num3;
		}

		//requestオブジェクトに結果をsetする
		request.setAttribute("ans", ans2);

		//jsp２にフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Calc2.jsp");
		dispatcher.forward(request, response);



	}
}
