package state_example_two;

public class Transit implements TravelMode {

	@Override
	public Object getETA() {
		System.out.println("Calculating ETA for Transit ");
		return 1;
	}

	@Override
	public Object getDirections() {
		System.out.println("Calculating Directions for Transit");
		return 2;
		
	}

}
