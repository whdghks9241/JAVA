package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
		TodoListModel tdmodel = new TodoListModel("¾ÆÄ§¸Ô±â");
		TodoListView  tdView = new TodoListView();
		
//		tdView.displayTodoList();
		String item = tdmodel.getitem();
		tdView.displayTodoList(item);
	}
}
