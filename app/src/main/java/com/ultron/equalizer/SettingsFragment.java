package com.ultron.equalizer;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    private static final String TAG = "SettingsFragment";
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.pref);
    }
//    EqualizerViewModel equalizerViewModel;
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        equalizerViewModel = ViewModelProviders.of(getActivity()).get(EqualizerViewModel.class);
//        final CheckBoxPreference checkboxPref = (CheckBoxPreference) getPreferenceManager().findPreference("dark_theme");
//        checkboxPref.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
//            public boolean onPreferenceChange(Preference preference, Object newValue) {
//                Log.d(TAG, "onPreferenceChange: CALLED");
//
//                return true;
//            }
//        });
//    }

}
