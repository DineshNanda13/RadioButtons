package com.meterstoinches.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                switch (radioButton.getId()){
                    case R.id.yes_ID:{
                        Log.d("RD","Yes");
                        Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                    }
                    break;
                    case R.id.mayBe_ID:{
                        Log.d("RD","Maybe");
                        Toast.makeText(getApplicationContext(),"Maybe is clicked",Toast.LENGTH_LONG).show();
                    }
                    break;
                    case R.id.no_ID:{
                        Log.d("RD","No");
                        Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                    }
                    break;
                }
            }
        });
    }
}
