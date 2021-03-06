package com.nataliebrammerjensen.bikesharemlk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.nataliebrammerjensen.bikesharemlk.database.RidesDB;

/**
 * Created by nataliebrammerjensen on 04/04/2018.
 */

public class BikeShareActivityRidesBrowser extends FragmentActivity {

    private static RidesDB sharedRides;

    private FragmentManager fm= getSupportFragmentManager();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_share_rb);
        sharedRides = RidesDB.get(this);

        Fragment fragment= fm.findFragmentById(R.id.fragment_list_container);
        if (fragment == null) {
            fm.beginTransaction().add(R.id.fragment_list_container, new ListFragment()).commit();
        }
    }
}
