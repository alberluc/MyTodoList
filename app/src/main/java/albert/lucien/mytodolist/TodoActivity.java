package albert.lucien.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alberluc on 16/01/2017.
 */
public class TodoActivity extends Activity implements View.OnClickListener{

    private Button btnVideListe;
    private Button btnValide;
    private TextView Activities;
    private EditText txtActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        Activities = (TextView) findViewById(R.id.Activities);
        txtActivity = (EditText) findViewById(R.id.txtActivity);


        btnVideListe = (Button)findViewById(R.id.btnVideListe);
        btnVideListe.setOnClickListener(this);

        btnValide = (Button)findViewById(R.id.btnValide);
        btnValide.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btnValide){

            String newActivity = txtActivity.getText().toString();
            String myActivities = Activities.getText().toString();

            Activities.setText(myActivities + "\n - " + newActivity);

        }
        if(v.getId()==R.id.btnVideListe){

            Activities.setText("");

        }

    }
}
