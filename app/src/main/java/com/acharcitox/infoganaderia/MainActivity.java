package com.acharcitox.infoganaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irIniciar(View view){
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistro(View view){
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }

    public void irNoticias(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/category/noticias-sobre-ganaderia/"));
        startActivity(i);
    }

    public void irConsejos(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://ganaderia.win/category/consejos/"));
        startActivity(i);
    }

    public void irRazas(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/razas/"));
        startActivity(i);
    }

    public void irGanaderia(View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://todosobreganado.com/tipos-de-ganaderia/"));
        startActivity(i);
    }

}