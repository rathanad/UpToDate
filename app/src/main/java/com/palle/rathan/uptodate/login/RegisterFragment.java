package com.palle.rathan.uptodate.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
public class RegisterFragment extends Fragment {

    private EditText editTextUserName, editTextPassword, editTextConfirmPassword;
    private Button buttonRegister;
    private TextView textViewGoBack;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_register, container,false);

        editTextUserName = (EditText) v.findViewById(R.id.edit_text_username);
        editTextPassword = (EditText) v.findViewById(R.id.edit_text_password);
        editTextConfirmPassword = (EditText) v.findViewById(R.id.edit_text_confirm_password);
        buttonRegister = (Button) v.findViewById(R.id.button_register);
        textViewGoBack = (TextView) v.findViewById(R.id.textView_goback);

        textViewGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity loginActivity= (LoginActivity) getActivity();
                loginActivity.gobackButtonClicked();

            }
        });
        return v;

    }

    public void onBackPressed(){

        FragmentManager fragmentManager= getFragmentManager();
        fragmentManager.popBackStack(fragmentManager.getBackStackEntryAt(0).getId(),FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

}
