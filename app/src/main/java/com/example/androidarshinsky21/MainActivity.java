package com.example.androidarshinsky21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonOk = (Button) findViewById(R.id.buttonOk);
        final TextView textResult = (TextView) findViewById(R.id.textViewResult);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editName = (EditText) findViewById(R.id.editName);
                EditText editEmail = (EditText) findViewById(R.id.editEmail);
                String res = getString(R.string.errorEmptyFields);
                if (!(("".equals(editName.getText().toString())) || ("".equals(editEmail.getText().toString())))) {

                    res = getString(R.string.resultText1) + " " + editName.getText().toString() + " " + getString(R.string.resultText2) + " " + editEmail.getText();
                }
                textResult.setText(res);
            }
        });

        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText) findViewById(R.id.editName)).setText("");
                ((EditText) findViewById(R.id.editEmail)).setText("");
                ((TextView) findViewById(R.id.textViewResult)).setText("");
            }
        });
    }


}
