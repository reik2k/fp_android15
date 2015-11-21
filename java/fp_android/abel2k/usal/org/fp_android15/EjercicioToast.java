package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by abelprieto on 21/11/15.
 */
public class EjercicioToast extends AppCompatActivity
{
    Button botonToast;
    Toast alert;
    EditText editTextTo;
    EditText editTextType;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ejercicio_one);

        botonToast = (Button) findViewById(R.id.btnToast);

        botonToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editTextTo = (EditText) findViewById(R.id.edtxtTo);
                editTextType = (EditText) findViewById(R.id.edtxtTypeMessage);

                alert.makeText(EjercicioToast.this, "To: "
                        + editTextTo.getText().toString() + " \n"
                        + "Your Message: " + editTextType.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //Ejercicio3

        spn=(Spinner) findViewById(R.id.spin);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.strArrayElementos,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);
        
        /*spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener{
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elementSelected = (String) parent.getItemAtPosition(position);

                Toast.makeText(EjercicioToast.this, elementSelected + " has been selected 4 u", Toast.LENGTH_SHORT);
            }
        });*/
    }
}
