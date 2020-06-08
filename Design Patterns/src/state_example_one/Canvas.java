package state_example_one;

public class Canvas {
	Tool tool;
	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public void mouseUp() {
		tool.mouseUp();
	}
	
	public void mouseDown() {
		tool.mouseDown();
	}
}
