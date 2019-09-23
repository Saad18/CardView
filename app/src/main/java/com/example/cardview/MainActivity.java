package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        String[] phoneNumber = {"Number One","Number Two","Number Three","Number Four","Number Five","Number Six",
                "Number Seven","Number Eight","Number Nine","Number Ten","Number Eleven","Number Twelve","Number Thirteen",
                "Number Fourteen","Number Fifteen","Number Sixteen","Number Seventeen","Number Eighteen","Number Ninteen","Number Twenty"};
        recyclerView = findViewById( R.id.recyclerViewId);
        ArrayAdapter adapter = new ArrayAdapter( phoneNumber );
        recyclerView.setAdapter( adapter );

         recyclerView.setLayoutManager( new LinearLayoutManager(this) );


    }
}
