package state_example_one;

public class Client {

	public static void main(String[] args) {
		
		Canvas canvas = new Canvas();
		canvas.setTool(new SelectionTool());
		canvas.setTool(new BrushTool());
		canvas.mouseUp();
		canvas.mouseDown();

	}

}
