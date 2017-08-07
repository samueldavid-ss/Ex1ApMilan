package com.example.samuelsanchez.ex1appacmilan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ContacActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contac2);

        final EditText edtEmail = (EditText) findViewById(R.id.edtName);
        final String email = edtEmail.getText().toString();
        final Button btnStar = (Button) findViewById(R.id.btnSave);
        final ImageView facebookIc = (ImageView) findViewById(R.id.facebookIc);
        ImageView twitterIc= (ImageView) findViewById(R.id.twitterIc);
        final EditText editName = (EditText) findViewById(R.id.edtEmail);
        final EditText lastName= (EditText) findViewById(R.id.edtAddres);
        final ImageView instagramIC = (ImageView) findViewById(R.id.instagramIc);
        final Button fanBtn = (Button) findViewById(R.id.fanBtn);
        facebookIc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/ACMilan/"));
                startActivity(facebookIntent);
            }
        });

        twitterIc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitterIntent = new Intent(Intent.ACTION_VIEW);
                twitterIntent.setData(Uri.parse("https://twitter.com/acmilan?lang=es"));
                startActivity(twitterIntent);
            }
        });
        instagramIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intagramIntent = new Intent(Intent.ACTION_VIEW);
                intagramIntent.setData(Uri.parse("https://www.instagram.com/acmilan/"));
                startActivity(intagramIntent);
            }
        });
        fanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fanBtn.setVisibility(view.GONE);
                btnStar.setVisibility(view.VISIBLE);
                edtEmail.setVisibility(view.VISIBLE);
                editName.setVisibility(view.VISIBLE);
                lastName.setVisibility(view.VISIBLE);
                }
        });
         btnStar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (email.contains("@") && email.contains(".")){
                     Toast toast1 = Toast.makeText(getApplicationContext(), "Felicidades eres fan del mejor equipo del mundo", Toast.LENGTH_SHORT);
                     toast1.show();
                     Intent mailIntent = new Intent(Intent.ACTION_VIEW);
                     mailIntent.setData(Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
                     startActivity(mailIntent);

                 }else{
                     Toast toast1 = Toast.makeText(getApplicationContext(), "Correo invalido", Toast.LENGTH_SHORT);
                     toast1.show();
                 }
             }
         });





}
}

