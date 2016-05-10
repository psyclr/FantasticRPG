package by.homemadeapps.fantasticrpg;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fManager = getFragmentManager();
        Fragment fragmentMain = fManager.findFragmentById(R.id.fragment_container);
        if (fragmentMain == null) {
            fragmentMain = new StartFragment();
            fManager.beginTransaction().add(R.id.fragment_container, fragmentMain)
                    .commit();

        }




    }


}
