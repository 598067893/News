package cn.bdqn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;

/**
 * �ڽ���main.jsp֮ǰ �����ȡ��  ����������Ϣ
 * 
 */
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ����service���ȡ���������б�ķ���
		NewsDetailService s = new NewsDetailServiceImpl();
		List<News_Detail> details = s.findAllNewsDetail();
		// ����Ҫ�Ѽ��ϷŽ� �������� ����ǰ̨��ȡ
		request.setAttribute("details", details);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
