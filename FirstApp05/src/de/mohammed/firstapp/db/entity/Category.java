package de.mohammed.firstapp.db.entity;

/**
 * Entity, POJO (class with getters and setters, constructor)
 * @author mohammed
 * History: 2026
 */
public class Category {
	
	private Integer id;
	private String name;
	private String description;

	public Category() {
		// empty Constructor
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
