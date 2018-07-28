package app.model;

import java.util.Date;

public class Comment {

	private Integer idComment;
	private String text;
	private Date date;
	
	public Comment () {
		
	}
	
	public Integer getIdComment() {
		return idComment;
	}
	
	public void setIdComment(Integer id) {
		this.idComment = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
