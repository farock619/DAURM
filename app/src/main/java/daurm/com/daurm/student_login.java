package daurm.com.daurm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student_login extends AppCompatActivity {

    Button s_sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        s_sign  =  (Button)findViewById(R.id.s_newsignup);

        s_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s_new = new Intent(student_login.this, student_signup.class);
                startActivity(s_new);
            }
        });

    }


}
