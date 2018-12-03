/*package shachiku;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;

public class UpdateAction extends Action {
		public String execute(
		HttpServletRequest req,HttpServletResponse resp
		){
			HttpSession session = req.getSession();

			String url="update-result.jsp";
			int error=0;
			String name = req.getParameter("name");

			String kana = req.getParameter("kana");

			String address = req.getParameter("address");
			String strSchoolYear = req.getParameter("schoolYear");


			if(!kana.matches("[あ-ん\\s　ー]+")){
				error=6;}



			else if( name.length()==0 || address.length()==0|| strSchoolYear.length()==0 || kana.length()==0){
				error=2;//未入力項目がある場合　エラーコード2

			}//else if (!(kanaTemp.matches("^[\\u3040-\\u309F]+$")))  {//カタカナで読みを入力されたらエラー
			   // error=6;

		//	}
			else{

				GakuseiDAO dao = new GakuseiDAO();

				try {
					int id = Integer.parseInt(req.getParameter("id"));
					int schoolYear = Integer.parseInt(strSchoolYear);



					GakuseiBean g = new GakuseiBean();
					g.setId(id);
					g.setName(name);
					g.setKana(kana);
					g.setAddress(address);
					g.setSchoolYear(schoolYear);


					int line = dao.update(g);

						if(0 ==line){//実行に失敗したときエラーコード1
							error = 1;
						}
					List<GakuseiBean> list = dao.search(id);

					req.setAttribute("list", list);
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} catch (NamingException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} catch(NumberFormatException e){//文字列入力
					e.printStackTrace();
				}
			}
			req.setAttribute("error", error);
			return url;

	}
}*/