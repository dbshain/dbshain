package shachiku;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ShainBean;
import dao.DepDAO;
import dao.PosDAO;
import dao.ShainDAO;
import tool.Action;

public class InsertAction extends Action {
	public String execute(
		HttpServletRequest req,HttpServletResponse resp
		){
		//	HttpSession session = req.getSession();
			String url="insert-list.jsp";


			String name = req.getParameter("name");
			String address = req.getParameter("address");
			String pos_name = req.getParameter("pos_name");
			String dep_name = req.getParameter("dep_name");

			int error=0;

			if(name.length()==0 || address.length()==0 || pos_name.length()==0 || dep_name.length()==0){
				error=2;//未入力パターン　エラーコード2

			}else{
				ShainDAO dao = new ShainDAO();
				PosDAO pDao=new PosDAO();
				DepDAO dDao=new DepDAO();

				try {

					int pos_no = pDao.getPos_No(pos_name);
					int dep_no = dDao.getDep_No(dep_name);

		//			System.out.println(" "+pos_no);

					ShainBean s = new ShainBean();

					s.setName(name);
					s.setAddress(address);
					s.setDep_no(dep_no);
					s.setPos_no(pos_no);


					int line = dao.insert(s);
					System.out.println(s.getNo());
						if(0==line){//追加失敗したパターン　エラーコード1
							error = 1;
						}else if(line==-1){//番号に重複がある場合はラインに-1が帰って来る　エラーコード３
							error = 3;
						}

						System.out.println("あ");
						int num=dao.getLastNo();
						System.out.println("あaaa");
					List<ShainBean> list = dao.noSearch(num);
					System.out.println(list.size());
					req.setAttribute("list", list);
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} catch (NamingException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} catch(NumberFormatException e){//文字列入力　エラーコード4
					error = 4;
				}
			}
			req.setAttribute("error", error);
			return url;

	}
}