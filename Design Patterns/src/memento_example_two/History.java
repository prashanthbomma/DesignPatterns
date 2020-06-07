package memento_example_two;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class History {
	
	private Deque<DocumentState> states = new ArrayDeque();
	
	public void push(DocumentState documentState) {
		states.push(documentState);
	}
	
	public DocumentState pop() {
		return states.pop();
	}

}
