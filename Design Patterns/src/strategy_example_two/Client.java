package strategy_example_two;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatClient chatClient = new ChatClient(new AES());
		chatClient.send("Demo");

	}

}
