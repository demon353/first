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
		// ��������ʽ
		req.setCharacterEncoding("UTF-8");
		List<Students> info=stu.showInfo();
		//�����ʵ�屣�浽��������
		HttpSession session=req.getSession();
		session.setAttribute("info", info);
		resp.sendRedirect("index.jsp");
	}

}
