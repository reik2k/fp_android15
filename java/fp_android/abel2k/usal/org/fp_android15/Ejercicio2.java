package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by abelprieto on 21/11/15.
 */
public class Ejercicio2 extends AppCompatActivity {

    Spinner spn;
    Button btn;
    CheckBox cbx;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //GENERAR EL ACTIVITY
        setContentView(R.layout.activity_ejercicio2);

        //CARGAMOS ELEMENTOS
        spn=(Spinner)findViewById(R.id.spinEjer2);
        txt = (TextView) findViewById(R.id.txtTonoResult);
        cbx = (CheckBox) findViewById(R.id.cbxTono);
        btn = (Button)findViewById(R.id.btnAlarm);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.arrEjercicio2,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elmSelected = (String) parent.getItemAtPosition(position);

                Log.i("INFO EJER2", " The element is " + elmSelected);
                txt.setText(elmSelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbx.isChecked()) {
                    Toast.makeText(Ejercicio2.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
