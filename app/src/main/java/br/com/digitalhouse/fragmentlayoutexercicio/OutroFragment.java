package br.com.digitalhouse.fragmentlayoutexercicio;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutroFragment extends Fragment {

    private Button btnCuriosidade2;


    public OutroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);

        btnCuriosidade2 = view.findViewById(R.id.btnCuriosidadePraiaDois);

        btnCuriosidade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view ,"Essa praia é mais ou menos!!",Snackbar.LENGTH_LONG).show();
            }
        });
        return view;


    }

}
