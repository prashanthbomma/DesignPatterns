package state_example_two;

public class DirectionService {
	
	private TravelMode travelMode;
	
	public DirectionService(TravelMode travelMode) {
		// TODO Auto-generated constructor stub
		this.travelMode = travelMode;
	}
	
	 public Object getEta() {
	      return travelMode.getETA();
	  }

	 public Object getDirection() {
	      return travelMode.getDirections();
	  }
}
