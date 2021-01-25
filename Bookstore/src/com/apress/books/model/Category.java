package com.apress.books.model;

public class Category {
	private Long id;
	private String categoryDescription;
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Category - Id: " + id + ", Category Description: "
		+ categoryDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}
