package tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	String[] errorMessage={" ","実行に失敗しました","未入力項目があります","該当データがありません","学生番号は半角数字で入力してください",
	"学生番号が重複しています","読みがなは平仮名で入力してください"};//エラーコード[1]から[6]　[０]は成功パターン
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();

			String path = req.getServletPath().substring(1);//サーブレットのパスを一番目から取得（先頭のスラッシュは除外

			String name = path.replace(".a", "A").replace('/', '.');//もらったURLを変換して実行するクラスを作っている

			Action action = null;
			try {
				action = (Action)Class.forName(name).newInstance();
			} catch (InstantiationException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace(out);
			}catch(IllegalAccessException e){
				e.printStackTrace(out);
			}catch(ClassNotFoundException e){
				e.printStackTrace(out);
			}

			//サーチアクションインスタンスが動く
			String url = action.execute(req,resp);//フォワード先のアドレスをもらった
			System.out.println("koko");
			int error = (int)req.getAttribute("error");
			System.out.println("kokodayo");
			System.out.println(errorMessage[error]);
			req.setAttribute("errorMessage",errorMessage[error]);

			req.getRequestDispatcher(url).
				forward(req,resp);


	}



}
