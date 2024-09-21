package com.example.kayitolsayfasi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editad,editsoyad, editsehir,edityas;
    private CheckBox checkBox1,checkBox2,checkBox3;
    private RadioButton radiobtnE, radiobtnK;


    private String editAd,editSoyad,editSehir,editYas;
    private  String checktext1, checktext2,checktex3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edittexler :
        editad=findViewById(R.id.editad);
        editsoyad=findViewById(R.id.editsoyad);
        editsehir=findViewById(R.id.editsehir);
        edityas=findViewById(R.id.edityas);

        //checkbox :
        checkBox1=findViewById(R.id.checkBoxhobi1);
        checkBox2=findViewById(R.id.checkBoxhobi2);
        checkBox3=findViewById(R.id.checkBoxhobi3);

        //radiobtnler
        radiobtnE=findViewById(R.id.radioBtnE);
        radiobtnK=findViewById(R.id.radioBtnK);

    }
    public void btnkayitol(View v){

        editAd=editad.getText().toString();
        editSoyad=editsoyad.getText().toString();
        editSehir=editsehir.getText().toString();
        editYas=edityas.getText().toString();

        if (!TextUtils.isEmpty(editAd)&& !TextUtils.isEmpty(editSoyad) && !TextUtils.isEmpty(editSehir)&& ! TextUtils.isEmpty(editYas)){

            System.out.println("----bilgileriniz----");
            System.out.println("adınız:" + editAd);
            System.out.println("soyadınız:" + editSoyad);
            System.out.println("şehriniz : " + editSehir);
            System.out.println("yaşınız : "+ editYas);



            System.out.println("-----Hobileriniz");
            if(checkBox1.isChecked())
                System.out.println(checkBox1.getText().toString());
            if (checkBox2.isChecked())
                System.out.println(checkBox2.getText().toString());
            if(checkBox3.isChecked())
                System.out.println(checkBox3.getText().toString());


            if (radiobtnE.isChecked())
                System.out.println(  "cinsiyetiniz : " +  radiobtnE.getText().toString());

            else
                System.out.println("cinsiyetiniz : " + radiobtnK.getText().toString());

        }
        else
            System.out.println("edittext değerleri boş olamaz ");
    }
}