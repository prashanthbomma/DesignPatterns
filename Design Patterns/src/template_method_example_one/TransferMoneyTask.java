package template_method_example_one;

public class TransferMoneyTask extends Task {

	@Override
	protected void doExecute() {
		System.out.println("Transfering Money");
		
	}

}
