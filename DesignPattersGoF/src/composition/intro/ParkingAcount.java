package composition.intro;
/**
 * First example of composition
 * 
 * @author Edney Roldao
 *
 */
public abstract class ParkingAcount {

	private CalculateValue calculateValue;
	
	private Car car;

	private Long init;

	private Long end;

	
	// Here we have a composition
	public Double calculateValue() {
		return calculateValue.calculate(end, end, car);
	}
	
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getInit() {
		return init;
	}

	public void setInit(Long init) {
		this.init = init;
	}

	public Long getEnd() {
		return end;
	}

	public void setEnd(Long end) {
		this.end = end;
	}

}
