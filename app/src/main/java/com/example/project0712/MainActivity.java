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
import android.widget.TextView;
import android.widget.Toast;

import static com.example.project0712.R.id.RdoRabbit;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    ImageView imPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = findViewById(R.id.Text1);
        chkAgree = findViewById(R.id.ChkAgree);
        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        rdoDog = findViewById(R.id.RdoDog);
        rdoCat = findViewById(R.id.RdoCat);
        rdoRabbit = findViewById(RdoRabbit);
        btnOK = findViewById(R.id.BtnOK);
        imPet = findViewById(R.id.ImPet);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                        break;
                    case R.id.RdoCat:
                        imPet.setImageResource(R.drawable.cat);
                        break;
                    case RdoRabbit:
                        imPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "동물 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}