package shachiku;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;

public class LogoutAction extends Action{
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		HttpSession session = req.getSession();
		int error=0;
		if (session.getAttribute("user") != null) {
			session.removeAttribute("user");
			return "logout-ok.jsp";
		}
		req.setAttribute("error", error);
		return "logout-error.jsp";


	}
}
