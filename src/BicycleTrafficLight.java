
public class BicycleTrafficLight extends TrafficLight{
	

	private static final long serialVersionUID = 1L;

	public BicycleTrafficLight(int id, int type, String street, int streetNumber, String color, boolean sign, boolean crosswalk) {
		super(id, type, street, streetNumber, color, sign, crosswalk);
	}
	
	public void PrintMyType() {
		System.out.println("This is a Bicycle Traffic Light");
	}


}
