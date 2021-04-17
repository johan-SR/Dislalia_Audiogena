package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView res;
    private TextView prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.txtn1);
        n2=(EditText)findViewById(R.id.txtn2);
        res=(TextView)findViewById(R.id.txtrs);
        prueba=findViewById(R.id.txtvprueba);

        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprueba = new Intent(MainActivity. this, Registroprueba.class);
                MainActivity.this.startActivity(intentprueba);
            }
        });
    }

    //Este metodo realiza la suma.
    public void suma(View View){

        String v1=n1.getText().toString();
        String v2=n2.getText().toString();

        int suma = Integer.parseInt(v1)+Integer.parseInt(v2);

        String sum = String.valueOf(suma);
        res.setText(sum);

    }


}
