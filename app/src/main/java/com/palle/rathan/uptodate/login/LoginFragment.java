package com.palle.rathan.uptodate.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.palle.rathan.uptodate.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private EditText editTextUserName, editTextPassword;
    private Button buttonLogin;
    private TextView textViewRegister;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_login, container,false);


        editTextUserName = (EditText) v.findViewById(R.id.editText_username);
        editTextPassword = (EditText) v.findViewById(R.id.editText_password);
        buttonLogin = (Button) v.findViewById(R.id.button_login);
        textViewRegister = (TextView) v.findViewById(R.id.text_register);


        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            LoginActivity loginActivity= (LoginActivity) getActivity();
                loginActivity.registerButtonClicked();
            }
        });

        // Inflate the layout for this fragment
        return v;


    }



}
