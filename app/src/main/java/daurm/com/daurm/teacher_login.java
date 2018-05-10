package daurm.com.daurm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher_login extends AppCompatActivity {

    Button signup,tlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);



        signup  =  (Button)findViewById(R.id.t_newsignup);
        tlogin  =  (Button)findViewById(R.id.tlogin);

        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(teacher_login.this, teacher_panel.class);
                startActivity(i);
            }
        });
    }
}
