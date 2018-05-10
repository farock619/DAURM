package daurm.com.daurm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button teacher, student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teacher  =  (Button)findViewById(R.id.tbutton);
        student  =  (Button)findViewById(R.id.sbutton);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent teacherIntent = new Intent(MainActivity.this, teacher_login.class);
                startActivity(teacherIntent);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent studentIntent  =  new Intent(MainActivity.this, student_login.class);
                startActivity(studentIntent);
            }
        });


    }
}
