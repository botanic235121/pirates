package com.pirates.game.pirates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    private Button button;
    private TextView result;
    private EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button_search);
        result = findViewById(R.id.tv_result);
        search = findViewById(R.id.et_id);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = search.getText().toString();
                result.setText(text);
            }
        };
        button.setOnClickListener(onClickListener);
    }

}
