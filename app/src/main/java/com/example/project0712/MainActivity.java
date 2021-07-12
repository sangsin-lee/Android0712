package com.example.project0712;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.project0712.R.id.RQ;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text1, text2;
    Switch swAgree;
    RadioGroup rGroup1;
    RadioButton roreao, rpi, rq;
    Button btnf,btnc;
    ImageView imPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        swAgree = findViewById(R.id.swkAgree);
        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        roreao = findViewById(R.id.Roreo);
        rpi = findViewById(R.id.Rpi);
        rq = findViewById(RQ);
        btnf = findViewById(R.id.Btnf);
        findViewById(R.id.Roreo).setOnClickListener(this);
        findViewById(R.id.Rpi).setOnClickListener(this);
        findViewById(R.id.RQ).setOnClickListener(this);
        findViewById(R.id.Btnf).setOnClickListener(this);
        btnc = findViewById(R.id.Btnc);
        findViewById(R.id.Btnc).setOnClickListener(this);
        imPet = findViewById(R.id.ImPet);
        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (swAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnf.setVisibility(View.VISIBLE);
                    btnc.setVisibility(View.VISIBLE);
                    imPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnf.setVisibility(View.INVISIBLE);
                    btnc.setVisibility(View.INVISIBLE);
                    imPet.setVisibility(View.INVISIBLE);
                }
            }
        });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Roreo:
                imPet.setImageResource(R.drawable.oreo);
                break;
            case R.id.Rpi:
                imPet.setImageResource(R.drawable.pie);
                break;
            case R.id.RQ:
                imPet.setImageResource(R.drawable.q10);
                break;
            case R.id.Btnf:
                finish();
                break;
            case R.id.Btnc:
                swAgree.setChecked(false);
                rGroup1.clearCheck();
                imPet.setImageResource(0);
                break;
            default:
                Toast.makeText(MainActivity.this, "동물 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
        }
    }
}