package state_example_two;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectionService service = new DirectionService(new Driving());
		service.getEta();
		service.getDirection();
		
	}

}
