package com.example.android_hw_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public
class FirstFragment extends Fragment {


    private EditText editText;
    private Button button;

    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_first, container, false );
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText = view.findViewById(R.id.first_et);
        button = view.findViewById(R.id.first_btn);

        button.setOnClickListener(view1 -> {
            SecondFragment fragment2 = new SecondFragment();
            Bundle bundle = new Bundle();
            bundle.putString("aaa", editText.getText().toString());
            fragment2.setArguments(bundle);
            getFragmentManager().beginTransaction().replace(R.id.fr_container, fragment2).commit();
        });
    }
}