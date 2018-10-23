package in.datasciencetech.cameracaptureapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rbStud,rbStaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        radioGroup=(RadioGroup)findViewById(R.id.rgType);
        rbStaff=(RadioButton)findViewById(R.id.radioButtonFaculty);
        rbStud=(RadioButton)findViewById(R.id.radioButtonStudent);

    }

    public void OnSubmitClick(View view) {

        if(radioGroup.getCheckedRadioButtonId()==R.id.radioButtonStudent){
            Toast.makeText(this, "Student Selected", Toast.LENGTH_LONG).show();

        }
        if(radioGroup.getCheckedRadioButtonId()==R.id.radioButtonFaculty){

            Toast.makeText(this, "Staff Member selected", Toast.LENGTH_LONG).show();

        }




    }
}
