package tech.sobre.callnumberapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = findViewById(R.id.etNumber);



    }

    public void callNumber(View view) {
        String number = etNumber.getText().toString();

        if(number.isEmpty()){
            Toast.makeText(this,"Digite um numero", Toast.LENGTH_SHORT).show();
        }else {
            Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
            startActivity(i);
        }
    }


    public void chatZap(View view) {
        String number = etNumber.getText().toString();

        if(number.isEmpty()){
            Toast.makeText(this,"Digite um numero", Toast.LENGTH_SHORT).show();
        }else {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=+55" + number));
            startActivity(i);
        }
    }
}
