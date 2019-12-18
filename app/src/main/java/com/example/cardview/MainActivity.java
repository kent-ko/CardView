package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Meaterian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Fooderian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Actarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Whiterian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Actuarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));

        lstBook.add(new Book("The Vegitarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Meaterian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Fooderian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Actarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Whiterian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));
        lstBook.add(new Book("The Actuarian", "Categorie Book", "Description book", R.drawable.ic_launcher_background));

        RecyclerView myvr = findViewById(R.id.recycle);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myvr.setLayoutManager(new GridLayoutManager(this, 1));
        myvr.setAdapter(myAdapter);
    }

}
