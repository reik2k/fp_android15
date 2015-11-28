package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by abelprieto on 27/11/15.
 */
public class NewFragment2 extends Fragment
{
    Button btnFragment;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstancesState){

        View rootView = inflater.inflate(R.layout.fragment_ejemplo2,container,false);

        btnFragment= (Button) rootView.findViewById(R.id.btnFragment);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) getActivity().findViewById(R.id.txtTitleFragment);

                tv.setText("Texto Cambiado");

                Toast.makeText(getActivity(),"Hemos cambiado el texto",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
