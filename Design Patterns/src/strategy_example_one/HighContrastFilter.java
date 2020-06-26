package strategy_example_one;

public class HighContrastFilter implements Filter {

	@Override
	public void apply(String fileName) {
		System.out.println("Applying High Contrast filter");
	}

}
