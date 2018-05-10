package daurm.com.daurm;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class teacher_login extends AppCompatActivity {


    private EditText tlemail,tlpassword;
    private Button tlogin;
    private  FirebaseAuth mAuth;
    private  FirebaseAuth.AuthStateListener mAuthListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        mAuth=FirebaseAuth.getInstance();

        tlemail=(EditText)findViewById(R.id.tlemail);
        tlpassword=(EditText)findViewById(R.id.tlpassword);
        tlogin=(Button)findViewById(R.id.tlogin);

        mAuthListner=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if (firebaseAuth.getCurrentUser()!=null){
                    Intent i= new Intent(teacher_login.this,teacher_login.class);
                    startActivity(i);

                }

            }
        };

        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin();

            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        mAuth.addAuthStateListener(mAuthListner);
    }

    private void signin(){

        String email=tlemail.getText().toString();
        String password=tlpassword.getText().toString();
        if (TextUtils.isEmpty(email)|| TextUtils.isEmpty(password)) {
            Toast.makeText(teacher_login.this,"Field are empty", Toast.LENGTH_LONG). show();

        } else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()){
                        Toast.makeText(teacher_login.this,"Sign in Problem", Toast.LENGTH_LONG). show();

                    }

                }
            });
        }
    }
}






