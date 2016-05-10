package by.homemadeapps.fantasticrpg;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class FragmentAction extends android.app.Fragment {


    private ImageButton goForwardButton;
    private ImageButton attackButton;

    public FragmentAction() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_blank, container, false);
/**
 *Создание кнопки движения
 */
        goForwardButton = (ImageButton) v.findViewById(R.id.forwardButton);
        goForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Движение вперёд, возможно тут же рандомное появление моба итд





            }
        });
/**
 *Создание кнопки атаки
 */
        attackButton = (ImageButton) v.findViewById(R.id.attackButton);
        attackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return;
                //TODO ATACK!!
            }
        });

        return v;


    }


    @Override
    public void onAttach(Context act) {
        super.onAttach(act);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
