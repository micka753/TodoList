package todolist.charfadi.com.todolist;

import java.util.Date;

/**
 * Created by mcharfad on 29/11/17.
 */

public class Task {
    Boolean isDone;
    String label;
    Date date;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Task(Boolean isDone, String label, Date date) {
        this.isDone = isDone;
        this.label = label;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDone() {

        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }


}
