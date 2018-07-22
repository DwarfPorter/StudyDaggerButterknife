package ru.geekbrains.sword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    ICalc calc;

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

        ((CalcApplication) getApplication())
                .getCalcComponent()
                .inject(MainActivity.this);
    }

    @OnClick(R.id.button)
    void onButtonClick(){
        calc.setArg1(Integer.parseInt(number1.getText().toString()));
        calc.setArg2(Integer.parseInt(number2.getText().toString()));
        result1.setText(Integer.toString(calc.calcResult()));
    }
}
