package structural.composite;

import java.util.List;

public class Project implements ToDoList {

	List<ToDoList> todos;
	
	public Project(List<ToDoList> todos) {
		this.todos = todos;
	}

	@Override
	public String getHtml() {
		StringBuilder html = new StringBuilder(); 
		todos.stream().forEach(t -> html.append(t.getHtml()));
		return html.toString();
	}

}
