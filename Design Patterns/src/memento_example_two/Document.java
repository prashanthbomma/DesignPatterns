package memento_example_two;

public class Document {
	private String content;
	private String fontName;
	private int fontSize;
	
    public DocumentState createState() {
		return new DocumentState(content, fontName, fontSize);
	}
    
    public void restoreState(DocumentState documentState) {
    	this.content = documentState.getContent();
    	this.fontName = documentState.getFontName();
    	this.fontSize = documentState.getFontSize();
    }
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFontName() {
		return fontName;
	}
	public void setFontName(String fontName) {
		this.fontName = fontName;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	

}
