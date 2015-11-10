package com.example.chedui2;

import java.io.Serializable;

import android.R.integer;

public class CheduiBeans implements Serializable {

	/**
	 * 车队,一个图片和一个车队名字
	 */
	private static final long serialVersionUID = 1L;
	private int id;//车队id
	private String image;
	private String name;
	public CheduiBeans(String image, String name) {
		super();
		this.image = image;
		this.name = name;
	}
	public CheduiBeans() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CheduiBeans [id=" + id + ", image=" + image + ", name=" + name
				+ "]";
	}

}
