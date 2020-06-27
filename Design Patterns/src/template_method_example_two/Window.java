package template_method_example_two;

public class Window {
	
	public void close() {
		onClosing();
		System.out.println("Removing the window from the screen");
		onClose();
	}
	
	protected void onClosing() {
		
	}
	
	protected void onClose() {
		
	}
}
