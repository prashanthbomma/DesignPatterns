package strategy_example_one;

public class JPEGCompressor implements Compressor {

	@Override
	public void compress(String fileName) {
		System.out.println("Compressing image using JPEG");	
	}

}
