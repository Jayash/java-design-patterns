package structural.composite;

public class ToDo implements ToDoList {
	
	String text;
	
	public ToDo(String text) {
		this.text = text;
	}
	
	@Override
	public String getHtml() {
		return text;
	}
	
}
