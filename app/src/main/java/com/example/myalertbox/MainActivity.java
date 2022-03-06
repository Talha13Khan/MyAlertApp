package com.example.myalertbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText=findViewById(R.id.emailtxt);
        final Button button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if(text.isEmpty()){
                    alert("Enter your Mail");

                }
                else {
                    alert(text);
                }
            }
        });
    }
    private void alert(String message){
        final AlertDialog dlg= new AlertDialog.Builder(MainActivity.this)
                .setTitle("You Enter Nothing")
                .setMessage(message)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create();
        dlg.show();

    }
}