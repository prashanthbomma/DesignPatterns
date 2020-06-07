package memento_example_two;

public class Client {
	public static  void main(String[] args) {
		 Document document = new Document();
		    History history = new History();

		    document.setContent("Hello");
		    history.push(document.createState());

		    document.setFontName("Font 1");
		    history.push(document.createState());

		    document.setFontSize(10);

		    System.out.println(document.getFontSize());

		    document.restoreState(history.pop());
		    System.out.println(document.getFontName());

		    document.restoreState(history.pop());
		    System.out.println(document);
	}

}
