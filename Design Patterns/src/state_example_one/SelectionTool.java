package state_example_one;

public class SelectionTool implements Tool{

	@Override
	public void mouseUp() {
	 System.out.println("Selection Tool");
		
	}

	@Override
	public void mouseDown() {
	 System.out.println("Draw a rectangle");
		
	}

}
