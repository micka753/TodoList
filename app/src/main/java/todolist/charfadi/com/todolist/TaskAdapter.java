package todolist.charfadi.com.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mcharfad on 29/11/17.
 */

public class TaskAdapter extends ArrayAdapter<Task> {
    List<Task> taskList;
    public TaskAdapter(Context context, int resource, List<Task> data) {
        super(context, resource, data);
        taskList =data;
    }

    //The getCount() function returns the total number of items to be displayed in a list.
   /* @Override
    public int getCount() {
        return super.getCount();
    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            //LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //v = inflater.inflate(R.layout.customlayout_task, null);
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customlayout_task,parent,false);
        }
        TextView textView_Label = (TextView) convertView.findViewById(R.id.textView_Label );
        TextView textView_Date = (TextView) convertView.findViewById(R.id.textView_Date);
        CheckBox checkBox_isDone = (CheckBox) convertView.findViewById(R.id.checkBox_isDone);
        textView_Label.setText(taskList.get(position).getLabel());
        textView_Date.setText(taskList.get(position).getDate().toString());
        checkBox_isDone.setChecked(taskList.get(position).getDone());
        return convertView;
    }
}
