package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by abelprieto on 28/11/15.
 */
public class Ejercicio3 extends AppCompatActivity {

    Fragment frag;
    FragmentManager FM;
    FragmentTransaction FT;
    Bundle bnd;
    Button btnAddFrags;
    Button btnRemoveFrags;
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

                FT.replace(R.id.contFragment, frag, "tag" + cont.toString());
                FT.addToBackStack("tag" + cont.toString());

                FT.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                FT.commit();
            }
        });

        btnRemoveFrags=(Button)findViewById(R.id.btnRemoveFragments);

        btnRemoveFrags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new NewFragment();
                bnd  = new Bundle();

                frag.setArguments(bnd);
                frag = getSupportFragmentManager().findFragmentByTag("tag" + FM.getBackStackEntryCount());

                if(frag != null){
                    FT = FM.beginTransaction();
                    FT.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);

                    FT.remove(frag);
                    FT.commit();

                }else
                {
                    Toast.makeText(Ejercicio3.this,"The Fragment is null" + frag.getTag(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
