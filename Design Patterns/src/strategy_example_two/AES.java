package strategy_example_two;

public class AES implements EncryptionAlgorithm {

	@Override
	public String encrypt(String text) {
		
		System.out.println("Encrypting text using AES algorithm");
		return "Encrypted text";
	}

}
