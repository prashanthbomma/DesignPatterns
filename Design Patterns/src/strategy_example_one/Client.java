package strategy_example_one;

public class Client {

	public static void main(String[] args) {
	
		ImageStorage imageStorage = new ImageStorage();
		imageStorage.store("sample", new JPEGCompressor(), new HighContrastFilter());
		
		imageStorage.store("sample", new PNGCompressor(), new BlackAndWhiteFilter());
		
	}

}
