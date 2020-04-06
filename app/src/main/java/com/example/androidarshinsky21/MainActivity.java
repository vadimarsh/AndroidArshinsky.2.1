package com.example.androidarshinsky21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonOk = (Button) findViewById(R.id.buttonOk);
        final Button buttonClear = (Button) findViewById(R.id.buttonClear);
        final TextView textResult = (TextView) findViewById(R.id.textViewResult);
        final EditText editName = (EditText) findViewById(R.id.editName);
        final EditText editEmail = (EditText) findViewById(R.id.editEmail);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = getString(R.string.errorEmptyFields);
                if (!((editName.getText().toString().isEmpty()) || (editEmail.getText().toString().isEmpty()))) {
                    res = getString(R.string.resultText1) + " " + editName.getText().toString() + " " + getString(R.string.resultText2) + " " + editEmail.getText();
                }
                textResult.setText(res);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.setText("");
                editEmail.setText("");
                textResult.setText("");
                Toast.makeText(MainActivity.this,"Поля очищены",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
