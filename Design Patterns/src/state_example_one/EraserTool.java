package state_example_one;

public class EraserTool implements Tool {

	@Override
	public void mouseUp() {
	 System.out.println("Erasar Tool");
		
	}

	@Override
	public void mouseDown() {
	  System.out.println("Erase a line");
	}

}
