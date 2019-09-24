package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

//        String[] divisionName = {"Dhaka","Chitagong","Rajshahi","Barisal","Barguna","Teqnaf",
//                "Tetulia","Sylhet","Vhola","Tangail","Rangpur","Kurigram","Natore",
//                "Feni","Jesore","Noakhali","Jaflong","Mijapur","Uttara","Dhanmondi"};

        ArrayList<String>divisionName = new ArrayList<>( Arrays.asList("Dhaka","Chitagong","Rajshahi","Barisal","Barguna","Teqnaf",
              "Tetulia","Sylhet","Vhola","Tangail","Rangpur","Kurigram","Natore",
                "Feni","Jesore","Noakhali","Jaflong","Mijapur","Uttara","Dhanmondi") );



        recyclerView = findViewById( R.id.recyclerViewId);
        recyclerView.setLayoutManager( new LinearLayoutManager(this) );
        ArrayAdapter adapter = new ArrayAdapter( this,divisionName);
        recyclerView.setAdapter( adapter );







    }
}
