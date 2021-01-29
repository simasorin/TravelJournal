package com.example.traveljournal.DrawerJournal.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.traveljournal.DrawerJournal.EditActivity;
import com.example.traveljournal.MainActivity;
import com.example.traveljournal.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private static FragmentManager fragmentManager;

    public HomeFragment() {
    }

    TextView myText;
    TextView myText1;
    FloatingActionButton fab;

    EditText tripName ;
    EditText tripDestination ;


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

        //Get Argument that passed from activity in "data" key value
        //String getArgument = getArguments().getString("tripNameEdit");
       // String getArgument1 = getArguments().getString("tripDestinationEdit");

       //myText.setText(getArgument);//set string over textview
       // myText.setText(getArgument1);//set string over textview

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

}



