package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Students;
import service.StuService;
@WebServlet("/Index")
public class StuServlet extends HttpServlet {
	private StuService stu=new StuService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 处理编码格式
		req.setCharacterEncoding("UTF-8");
		List<Students> info=stu.showInfo();
		//将这个实体保存到作用域中
		HttpSession session=req.getSession();
		session.setAttribute("info", info);
		resp.sendRedirect("index.jsp");
	}

}
