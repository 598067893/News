package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_Detail;
import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;

/**
 * �������޸Ĳ���
 */
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ���post��������
		request.setCharacterEncoding("utf-8");
		NewsDetailService service = new NewsDetailServiceImpl();

		// ��ȡa��ǩ���ݹ����� id
		String id = request.getParameter("id");
		// ����һ�����Ŷ���
		News_Detail detail = new News_Detail();
		// ��ȡ���� ��������Ϣ
		detail.setAuthor(request.getParameter("author"));
		detail.setTitle(request.getParameter("title"));
		detail.setContent(request.getParameter("content"));
		detail.setSummary(request.getParameter("summary"));
		detail.setId(Integer.parseInt(id));
		// ��ȡ�޸�ʱ��

		boolean flag = service.updateById(detail);
		if (flag) { // �޸ĳɹ�
			response.sendRedirect("listServlet");
		} else {
			response.sendRedirect("update.jsp");
		}

	}

}
