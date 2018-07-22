package ru.geekbrains.sword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextN1)
    EditText number1;

    @BindView(R.id.editTextN2)
    EditText number2;

    @BindView(R.id.editTextR1)
    EditText result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void onButtonClick(){
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r1 = n1+n2;
        result1.setText(Integer.toString(r1));
    }
}
