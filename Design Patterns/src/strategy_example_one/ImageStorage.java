package strategy_example_one;

public class ImageStorage {
	public void store(String fileName,Compressor compressor, Filter filter) {
		compressor.compress(fileName);
		filter.apply(fileName);
	}

}
