package cn.bdqn.service;

import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDetailService {
	/**
	 * @return   ���е�������Ϣ
	 */
	List<News_Detail> findAllNewsDetail();

	/**
	 * 
	 * @param id  ��Ҫɾ����������Ϣ���
	 * @return   �Ƿ�ɹ�
	 */
	int DelByNewsDetailId(int id);
}
