package az.metleb.androiddersleri;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PM_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
/**
 TUTORIALS POINT
 Simply Easy Learning
 fragment* Inflate the layout for this fragment
 */
        return inflater.inflate(
                R.layout.pm_fragment, container, false);
    }
}
