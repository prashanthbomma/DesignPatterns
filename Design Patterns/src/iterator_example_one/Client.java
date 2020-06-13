package iterator_example_one;

public class Client {

	public static void main(String[] args) {
		BrowserHistory browserHistory = new BrowserHistory();
		browserHistory.push("a");
		browserHistory.push("c");
		browserHistory.push("b");
		
		Iterator iterator = browserHistory.createIterator();
		while(iterator.hasNext()) {
			String urlString = iterator.current();
			System.out.println(urlString);
			iterator.next();
		}
	}

}
