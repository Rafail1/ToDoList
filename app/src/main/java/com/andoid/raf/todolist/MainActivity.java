package com.andoid.raf.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity implements NewItemFragment.OnNewItemAddedListener{

    private ToDoItemAdapter aa;
    private ArrayList<ToDoItem> todoItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();
        ToDoListFragment toDoListFragment = (ToDoListFragment)fm.findFragmentById(R.id.ToDoListFragment);
        todoItems = new ArrayList<ToDoItem>();
        int resId = R.layout.todolist_item;
        aa = new ToDoItemAdapter(this, resId, todoItems);
        toDoListFragment.setListAdapter(aa);
    }

    @Override
    public void onNewItemAdded(String newItem) {
        ToDoItem newTodoItem = new ToDoItem(newItem);
        todoItems.add(0, newTodoItem);
        aa.notifyDataSetChanged();
    }
}
