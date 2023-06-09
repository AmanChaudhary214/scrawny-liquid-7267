package com.masai.dto;

public class CategoryImpl implements Category {

	private String categoryId;
	private String categoryName;
	
	public CategoryImpl(String categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryImpl [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
}
