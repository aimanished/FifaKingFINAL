package com.example.user.fifaking;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference dbr1,dbr2,dbr3,dbr4,dbr5;
    TextView tv,tv3,tv2,tv4;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tv);
        tv4 = findViewById(R.id.tv4);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        iv=findViewById(R.id.imageView);

        firebaseDatabase = FirebaseDatabase.getInstance();
        dbr1 = firebaseDatabase.getReference();
        dbr2 = firebaseDatabase.getReference();
        dbr3 = firebaseDatabase.getReference();
        dbr4 = firebaseDatabase.getReference();
        dbr5 = firebaseDatabase.getReference();

        dbr1.child("Settings1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                tv.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dbr2.child("Settings2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                tv2.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dbr3.child("Settings3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                tv3.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        dbr4.child("Settings4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                tv4.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        String imageURL = "http://square.github.io/picasso/static/sample.png";
        Picasso.with(this).load(imageURL).into(iv);

    }
}
