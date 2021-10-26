package myservlet.control;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = -8386760035679702956L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
 	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String username = req.getParameter("username");
		String password = req.getParameter("password");		
		System.out.println("用户名为：" + username);
		System.out.println("密码为：" + password);		
		String forward = "";		
		if(username.equals("hin") && password.equals("123456")) {
			//resp.sendRedirect(req.getContextPath() + "/01/success.jsp");			
			forward = "/ch10/success.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
		} else {
			//resp.sendRedirect(req.getContextPath() + "/01/error.jsp");			
			forward = "/ch10/error.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
		}
	}
}

