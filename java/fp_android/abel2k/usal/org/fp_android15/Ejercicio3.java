package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by abelprieto on 28/11/15.
 */
public class Ejercicio3 extends AppCompatActivity {

    Fragment frag;
    FragmentManager FM;
    FragmentTransaction FT;
    Bundle bnd;
    Button btnAddFrags;
    Integer cont=0;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        btnAddFrags=(Button)findViewById(R.id.btnAddFragments);

        btnAddFrags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new NewFragment();
                bnd = new Bundle();

                bnd.putInt("cont", cont++);
                frag.setArguments(bnd);

                FM = getSupportFragmentManager();
                FT = FM.beginTransaction();

                FT.replace(R.id.contFragment, frag, "tag");
                FT.addToBackStack("tag");
                FT.commit();
            }
        });
    }
}
