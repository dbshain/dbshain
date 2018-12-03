package shachiku;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ShainBean;
import dao.ShainDAO;
import tool.Action;

public class NameSearchAction extends Action {
	public String execute(
		HttpServletRequest req,HttpServletResponse resp
		){
			HttpSession session = req.getSession();
			String url="search-list.jsp";
			int error=0;


			List<ShainBean> list = null;
			try {
			String name=req.getParameter("name");

			ShainDAO dao = new ShainDAO();
			list = dao.nameSearch(name);
				if(list.size()==0){//何も見つからなかった場合エラー3
					error=3;
				}


			} catch (SQLException | NamingException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

			session.setAttribute("list", list);
			req.setAttribute("error", error);

			return url;

	}


}
