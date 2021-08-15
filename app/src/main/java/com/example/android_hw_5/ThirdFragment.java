package com.example.android_hw_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public
class ThirdFragment extends Fragment {


private
    Button button;

    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_third, container, false );
    }


    @Override
    public
    void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );
        button = view.findViewById( R.id.btn3 );




        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                Bundle bundle = getArguments();
                FourFragment fragment3 = new FourFragment();
                bundle.putString("aaa2", String.valueOf( bundle ) );
                fragment3.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fr_container, fragment3).commit();
            }
        } );
    }
}