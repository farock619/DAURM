package daurm.com.daurm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher_panel extends AppCompatActivity {

    Button control_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_panel);
        control_btn=(Button)findViewById(R.id.control_btn);

        control_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lock = new Intent(teacher_panel.this, lock_control.class);
                startActivity(lock);

            }
        });




    }
}
