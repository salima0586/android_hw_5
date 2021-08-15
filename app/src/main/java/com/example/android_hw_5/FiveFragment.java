package com.example.android_hw_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public
class FiveFragment extends Fragment {


    private TextView textView;
    private Button btnFive;



    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_five, container, false );
    }

    @Override
    public
    void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

        textView = view.findViewById(R.id.txtFr5);
        btnFive = view.findViewById(R.id.btn5);

        Bundle bundle = getArguments();

        btnFive.setOnClickListener(view1 -> {
            String txt = bundle.getString("aaa3");
            textView.setText(txt);
        });
    }
}