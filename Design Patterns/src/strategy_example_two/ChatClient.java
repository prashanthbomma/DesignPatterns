package strategy_example_two;

import sun.management.counter.Variability;

public class ChatClient {
	EncryptionAlgorithm encryptionAlgorithm;
	public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
	}
	
	public void send(String text) {
		String encryptedTextString = encryptionAlgorithm.encrypt(text);
		
	}
}
