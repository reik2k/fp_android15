package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by abelprieto on 27/11/15.
 */
public class NewFragment extends Fragment
{
    TextView txt;
    Integer i;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstancesState){

        View rootView = inflater.inflate(R.layout.fragment_ejemplo,container,false);

        txt=(TextView) rootView.findViewById(R.id.txtFragment2Change);

        i = getArguments().getInt("cont",0);

        txt.setText(txt.getText() + i.toString());


        return rootView;
    }
}
