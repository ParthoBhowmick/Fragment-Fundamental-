package com.example.fragmenttech.Activites;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.example.fragmenttech.Fragments.MainFragment;
import com.example.fragmenttech.Fragments.PickPowerFragment;
import com.example.fragmenttech.R;

public class MainActivity extends AppCompatActivity implements MainFragment.OnMainFragmentInteractionListener, PickPowerFragment.OnPickFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }

    public void loadPower() {
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer,pickPowerFragment).addToBackStack(null).commit();
    }

    public void addFragment() {
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.frameContainer);

        if (fragment==null) {
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.frameContainer,fragment).commit();
        }
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickFragmentInteraction(Uri uri) {

    }
}
