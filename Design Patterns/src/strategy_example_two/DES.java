package strategy_example_two;

public class DES implements EncryptionAlgorithm {

	@Override
	public String encrypt(String text) {
		
		System.out.println("Encrypting text using DES");
		
		return "Encrpted text";
	}

}
