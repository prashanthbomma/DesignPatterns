package template_method_example_two;

public class ChatWindow extends Window {

	@Override
	protected void onClosing() {
		System.out.println("Disconnecting from the server...");
	}

}
