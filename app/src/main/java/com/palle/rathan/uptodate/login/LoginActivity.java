package com.palle.rathan.uptodate.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.palle.rathan.uptodate.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fragmentManager= getSupportFragmentManager();

        LoginFragment loginFragment= new LoginFragment();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.login_container, loginFragment).commit();



    }



    public void registerButtonClicked(){

        FragmentManager fragmentManager= getSupportFragmentManager();

        RegisterFragment registerFragment= new RegisterFragment();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.login_container, registerFragment);
        fragmentTransaction.addToBackStack(null).commit();


    }

    public void gobackButtonClicked(){

        FragmentManager fragmentManager= getSupportFragmentManager();

        // LoginFragment loginFragment= new LoginFragment();
       // RegisterFragment registerFragment= (RegisterFragment) fragmentManager.findFragmentById(R.id.login_container);
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        RegisterFragment registerFragment= (RegisterFragment) fragmentManager.findFragmentById(R.id.login_container);
        if(registerFragment instanceof RegisterFragment){
            registerFragment.onBackPressed();
        } else {
            super.onBackPressed();
        }


    }


}
