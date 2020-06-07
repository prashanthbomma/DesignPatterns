package memento_example_one;

public class EditorState {
	
	private String content;

	public EditorState(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
