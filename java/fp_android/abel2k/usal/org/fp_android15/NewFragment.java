package fp_android.abel2k.usal.org.fp_android15;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by abelprieto on 27/11/15.
 */
public class NewFragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstancesState){

        View rootView = inflater.inflate(R.layout.fragment_ejemplo,container,false);


        return rootView;
    }
}
