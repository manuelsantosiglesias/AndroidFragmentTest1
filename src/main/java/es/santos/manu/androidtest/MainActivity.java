package es.santos.manu.androidtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metodo para crear los fragments
    public void selecFrag(View view) {

        // Según el boton creamos un fragmento u otro
        Fragment frag;
        if(view == findViewById(R.id.btn1)){
            frag = new Fragment1();
        }else{
            frag = new Fragment2();
        }

        // Añadimos el gestor de framentos
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();

        trans.replace(R.id.fragment, frag);
        trans.commit();
    }


}
