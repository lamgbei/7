package com.example.dz.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(onClick);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                // Get the layout inflater
                LayoutInflater inflater = getLayoutInflater();
                view = inflater.inflate(R.layout.login_dialog,null);
                final EditText editText1 =(EditText)view.findViewById(R.id.editTextUserId);
                final EditText editText2 =(EditText)view.findViewById(R.id.editTextPwd);
                Button bt3 = (Button) findViewById(R.id.button1);
                builder.setView(view)
                        .setTitle("Login");
                builder.setNegativeButton("Login", new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialog, int which) {
                        if(editText2.getText().toString().equals("123")&&editText1.getText().toString().equals("abc"))
                        {
                            Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.show();

            }
        });

    }
    private View.OnClickListener onClick=new View.OnClickListener(){
        @Override
        public void onClick(View v){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("1")
                    .setMessage("1")
                    .setPositiveButton("ok",null)
                    .show();
        }
    };

}


