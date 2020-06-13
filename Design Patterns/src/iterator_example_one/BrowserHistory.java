package iterator_example_one;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	
	private List<String> urlList = new ArrayList<String>();
	
	
	public void push(String item) {
		urlList.add(item);
	}
	
	public String pop() {
		int lastIndex = urlList.size()-1;
		String lastElement = urlList.get(lastIndex);
		urlList.remove(lastIndex);
		return lastElement;
		
	}
	
	public List<String> getUrList(){
		return urlList;
	}
	
	public ListIterator createIterator() {
		return new ListIterator(this);
	}
	public class ListIterator implements Iterator{
		
		private BrowserHistory browserHistory;
		private int index;
		
		public ListIterator(BrowserHistory browserHistory) {
			this.browserHistory = browserHistory;
		}

		@Override
		public boolean hasNext() {
			return (index < browserHistory.getUrList().size());
		}

		@Override
		public String current() {
			return browserHistory.getUrList().get(index);
		}

		@Override
		public void next() {
			index++;
			
		}
		
	}
	

}
