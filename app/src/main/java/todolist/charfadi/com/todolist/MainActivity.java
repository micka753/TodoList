package todolist.charfadi.com.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

//https://code.tutsplus.com/tutorials/android-from-scratch-understanding-adapters-and-adapter-views--cms-26646

public class MainActivity extends Activity {
    ArrayList<Task> tasks;
    ListView l;
    TaskAdapter a;

    public void AddTask(View v){
        EditText newTask = (EditText) findViewById(R.id.saisieUtilisateur);
        a.insert(new Task(false, newTask.getText().toString(), Calendar.getInstance().getTime()),0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView) this.findViewById(R.id.maListe);
        tasks = new ArrayList<>();
        tasks.add(new Task(true, "Test1", Calendar.getInstance().getTime()));
        /*tasks.add(new Task(true, "fsefsef", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tesefsefsest1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tessfseft1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "sfefsef", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Test1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "fsefsef", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tesefsefsest1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tessfseft1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "sfefsef", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Test1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "fsefsef", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tesefsefsest1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "Tessfseft1", Calendar.getInstance().getTime()));
        tasks.add(new Task(true, "sfefsef", Calendar.getInstance().getTime()));*/
        a = new TaskAdapter(this, R.layout.customlayout_task, tasks);
        l.setAdapter(a);
    }
}
