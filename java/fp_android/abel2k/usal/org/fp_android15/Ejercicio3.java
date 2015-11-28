package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by abelprieto on 28/11/15.
 */
public class Ejercicio3 extends AppCompatActivity {

    Fragment frag;
    FragmentManager FM;
    FragmentTransaction FT;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        frag = new NewFragment();
        FM = getSupportFragmentManager();
        FT = FM.beginTransaction();
        FT.add(R.id.contFragment, frag);
        FT.commit();
    }
}
