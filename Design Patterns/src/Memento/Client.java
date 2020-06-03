package Memento;

import javax.lang.model.element.VariableElement;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Editor editor = new Editor();
		History history = new History();
		editor.setContent("a");
		history.push(editor.createState());
		editor.setContent("b");
		history.push(editor.createState());
		editor.setContent("c");
		
		editor.restoreState(history.pop());
		System.out.println(editor.getContent());

	}

}
