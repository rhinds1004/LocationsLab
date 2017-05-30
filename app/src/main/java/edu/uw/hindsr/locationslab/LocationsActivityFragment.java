package edu.uw.hindsr.locationslab;

import android.location.Location;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class LocationsActivityFragment extends Fragment {
    private TextView mLocationTextView;
    public LocationsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_locations, container, false);
        mLocationTextView = (TextView) v.findViewById(R.id.location_text);
        updateView();
        return v;
    }

    public void updateView() {
        Location location = ((LocationsActivity) getActivity()).getCurrentLocation();
        if (location != null)
            mLocationTextView.setText(location.toString());
    }
    @Override
    public void onStart() {
        super.onStart();
        updateView();
    }

}
