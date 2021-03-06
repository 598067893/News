package cn.bdqn.bean;

import java.util.Date;

/**
 * 新闻详情的实体类
 * @author 小豆腐
 *
 */
public class News_Detail {
	private Integer id; // 新闻编号
	private Integer categoryId; // 新闻类别id
	private String title; // 新闻标题
	private String summary; // 新闻摘要
	private String content; // 新闻内容
	private String picPath; // 新闻图片路径
	private String author; // 新闻发表者
	private Date createDate; // 创建时间
	private Date modifyDate; // 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public News_Detail(Integer id, Integer categoryId, String title,
			String summary, String content, String picPath, String author,
			Date createDate, Date modifyDate) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picPath = picPath;
		this.author = author;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}

	public News_Detail() {
		super();
	}

	@Override
	public String toString() {
		return "News_Detail [id=" + id + ", categoryId=" + categoryId
				+ ", title=" + title + ", summary=" + summary + ", content="
				+ content + ", picPath=" + picPath + ", author=" + author
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ "]";
	}

}
