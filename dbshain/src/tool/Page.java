package tool;

import java.io.PrintWriter;

public class Page{
	public static void header(PrintWriter out){

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div align='center'>");
	}
	public static void footer(PrintWriter out){
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");

	}
}