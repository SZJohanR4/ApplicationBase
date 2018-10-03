package com.example.bog_a209_e_025.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import usuario;

public class MainActivity extends AppCompatActivity {

    EditText usr, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr=(EditText) findViewById(R.id.txtUser);
        password=(EditText) findViewById(R.id.txtPass);

    }

    private void login(View view){
       if(usr.getText()!=null && password.getText()!=null ){
            usuario auth = new usuario();
           if(auth.getAuth(usr.getText(),password.getText())){
               Intent intent=new Intent(MainActivity.this,home.class);
               startActivity(intent);
            }else{
               Toast.makeText(getApplicationContext(),"Usuario invalido",Toast.LENGTH_LONG).show();
            }
       }else{
           Toast.makeText(getApplicationContext(),"Rellene el nombre y el usuario",Toast.LENGTH_LONG).show();
       }
    }
}
