package shachiku;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;


public class LoginAction extends Action {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		HttpSession session = req.getSession();
		int error=0;
		// ログイン情報の受取
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		UserDAO dao = new UserDAO();
		//
		UserBean user=null;
		try {
			user = dao.search(login, password);
		} catch (NamingException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		if (user != null) {
			req.setAttribute("error", error);
			session.setAttribute("user", user);
			return "login-ok.jsp";
		}

		req.setAttribute("error", error);

		return "login-error.jsp";

	}

}
