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

public class Pos_NoSearchAction extends Action {
	public String execute(
		HttpServletRequest req,HttpServletResponse resp
		){
			HttpSession session = req.getSession();
			String url="search-list.jsp";
			int error=0;

			List<ShainBean> list = null;
			try {
			int pos_no=Integer.parseInt(req.getParameter("pos_no"));

			ShainDAO dao = new ShainDAO();
			list = dao.pos_noSearch(pos_no);
				if(list.size()==0){
					error=3;
				}


			} catch (SQLException | NamingException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}catch(NumberFormatException e){//文字列が入ったときは
				error = 4;



			}
			req.setAttribute("error", error);
			session.setAttribute("list", list);

			return url;

	}


}