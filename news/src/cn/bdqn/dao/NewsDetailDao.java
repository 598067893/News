package cn.bdqn.dao;

import java.io.Serializable;
import java.util.List;

import cn.bdqn.bean.News_Detail;

public interface NewsDetailDao {
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
	 * @param id  ��ѯָ��id����������
	 * @return
	 */
	News_Detail findById(Serializable id);

	/**
	 * 
	 * @param id  ����id �޸�ָ�����ŵ�����
	 * @return  �Ƿ��޸ĳɹ�
	 */
	int updateById(News_Detail detail);

}
