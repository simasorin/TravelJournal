package com.example.traveljournal.DrawerJournal.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.traveljournal.DrawerJournal.EditActivity;
import com.example.traveljournal.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private static FragmentManager fragmentManager;

    private static final String TAG = "TripDetail";

    public HomeFragment() {
    }

    TextView myText;
    TextView myText1;
    FloatingActionButton fab;

    EditText tripName;
    EditText tripDestination;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_home, container, false);
        myText = (TextView) myView.findViewById(R.id.tv_tripName);
        myText1 = (TextView) myView.findViewById(R.id.tv_destination);

        tripName = (EditText) myView.findViewById(R.id.tv_edit);
        tripDestination = (EditText) myView.findViewById(R.id.tv_edit1);

        //enter to EditActivity by clicking on TextView
        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to activity from Fragment
                Intent intent = new Intent(getActivity(), EditActivity.class);
                intent.putExtra("key", myText.getText().toString());
                intent.putExtra("key1", myText1.getText().toString());
                startActivity(intent);//send data to EditActivity;
            }
        });

        //enter to EditActivity by clicking on TextView
        myText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to activity from Fragment
                Intent intent = new Intent(getActivity(), EditActivity.class);
                intent.putExtra("key", myText.getText().toString());
                intent.putExtra("key1", myText1.getText().toString());
                startActivity(intent);//send data to EditActivity;
            }
        });

        //enter to EditActivity via FAB button
        fab = myView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditActivity.class);
                intent.putExtra("key", myText.getText().toString());
                intent.putExtra("key1", myText1.getText().toString());
                startActivity(intent);

            }
        });


        return myView;

        //return inflater.inflate(R.layout.fragment_home, container, false);

    }


    @Override
    public void onClick(View v) {
        //send data to activity from Fragment
        Intent intent = new Intent(getActivity(), EditActivity.class);
        intent.putExtra("key", myText.getText().toString());
        intent.putExtra("key1", myText1.getText().toString());

        startActivity(intent);//send data to EditActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            String tripNameEdit = getArguments().getString("tripNameEdit");
            String tripDestinationEdit = getArguments().getString("tripDestinationEdit");

            Log.d(TAG, "onCreate: tripNameEdit=" + tripNameEdit);
            Log.d(TAG, "onCreate: tripDestinationEdit=" + tripDestinationEdit);

            myText.setText(tripNameEdit);
            myText1.setText(tripDestinationEdit);
        }
    }
}



