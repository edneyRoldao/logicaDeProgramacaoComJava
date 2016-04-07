package reflectionsWithAnnotations.Example01;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	//Attributes
	private String name;
	private String category;
	private Double price;
	private String description;

	//Constructors
	public Produto(String name, String category, Double price, String description) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
	}

	public Produto() {

	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
