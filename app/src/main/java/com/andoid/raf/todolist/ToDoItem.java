package com.andoid.raf.todolist;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by raf on 6.1.17.
 */

public class ToDoItem {
    String task;
    Date created;

    public ToDoItem(String _task, Date _created) {
        task = _task;
        created = _created;
    }

    public ToDoItem(String _task) {
        this(_task, new Date(java.lang.System.currentTimeMillis()));
    }

    public String getTask() {
        return task;
    }

    public Date getCreated() {
        return created;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String dateString = sdf.format(created);
        return "(" + dateString + ") " + task;
    }
}
