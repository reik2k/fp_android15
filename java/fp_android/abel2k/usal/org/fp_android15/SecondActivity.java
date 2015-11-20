package fp_android.abel2k.usal.org.fp_android15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abelprieto on 20/11/15.
 */
public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Button btn2 = (Button) findViewById(R.id.boton2);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,MainActivity.class);

                i.putExtra("data1","Hello I am second Activity.");
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });
    }
}
