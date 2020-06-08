package state_example_one;

public class BrushTool implements Tool {

	@Override
	public void mouseUp() {
	 System.out.println("Brush Tool");
		
	}

	@Override
	public void mouseDown() {
		System.out.println("Draw a line");
	}

}
