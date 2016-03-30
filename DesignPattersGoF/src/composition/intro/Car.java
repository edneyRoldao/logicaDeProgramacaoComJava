package composition.intro;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	private String name;
	
	private String typo;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypo() {
		return typo;
	}

	public void setTypo(String typo) {
		this.typo = typo;
	}
	
	

}
