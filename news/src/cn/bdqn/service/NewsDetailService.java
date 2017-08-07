package cn.bdqn.service;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Category;
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

	/**
	 * 
	 * @param id  ��ѯ�����id
	 * @return    һ����������
	 */
	News_Detail findById(Serializable id);

	/**
	 * 
	 * @param id  ����id �޸�ָ�����ŵ�����
	 * @return  �Ƿ��޸ĳɹ�
	 */

	boolean updateById(News_Detail detail);

	/**
	 * @return ������������
	 */
	List<News_Category> findCategorys();

	/**
	 *   ��������
	 * @param detail 
	 * @return
	 */
	int add(News_Detail detail);

}
