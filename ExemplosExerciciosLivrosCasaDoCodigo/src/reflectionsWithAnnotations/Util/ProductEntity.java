package reflectionsWithAnnotations.Util;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity Class that's used in some examples.
 * 
 * @author EdneyRoldao
 *
 */
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -6872157235041077827L;

	private int id;

	private String name;

	private double value;

	private Date date;

	public ProductEntity() {

	}

	public ProductEntity(int id, String name, double value, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
