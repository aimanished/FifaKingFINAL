package com.example.user.fifaking;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Chips extends android.support.v4.app.Fragment {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference dbr1,dbr2,dbr3,dbr4,dbr5;


    public Chips() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View vire = inflater.inflate(R.layout.fragment_chips, container, false);
        final TextView tv = vire.findViewById(R.id.tvChips1);

        firebaseDatabase = FirebaseDatabase.getInstance();
        dbr1 = firebaseDatabase.getReference();

        ImageView iv = vire.findViewById(R.id.iv);

        dbr1.child("Shooting1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                tv.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        return vire;
    }

}
