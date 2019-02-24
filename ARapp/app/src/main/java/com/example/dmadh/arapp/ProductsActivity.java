package com.example.dmadh.arapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        initializeGallery();
    }

    private void initializeGallery() {
        LinearLayout gallery = findViewById(R.id.gallery_layout);

        ImageView andy = new ImageView(this);
        andy.setImageResource(R.drawable.droid_thumb);
        andy.setContentDescription("andy");
        andy.setOnClickListener(view -> {
            sendUri(Uri.parse("andy.sfb"));
        });
        gallery.addView(andy);

        ImageView cabin = new ImageView(this);
        cabin.setImageResource(R.drawable.cabin_thumb);
        cabin.setContentDescription("cabin");
        cabin.setOnClickListener(view -> {
            sendUri(Uri.parse("Cabin.sfb"));
        });
        gallery.addView(cabin);

        ImageView house = new ImageView(this);
        house.setImageResource(R.drawable.house_thumb);
        house.setContentDescription("house");
        house.setOnClickListener(view -> {
            sendUri(Uri.parse("House.sfb"));
        });
        gallery.addView(house);

        ImageView igloo = new ImageView(this);
        igloo.setImageResource(R.drawable.igloo_thumb);
        igloo.setContentDescription("igloo");
        igloo.setOnClickListener(view -> {
            sendUri(Uri.parse("igloo.sfb"));
        });
        gallery.addView(igloo);

        ImageView chair = new ImageView(this);
        chair.setImageResource(R.drawable.chair_thumb);
        chair.setContentDescription("Chair");
        chair.setOnClickListener(view -> {
            sendUri(Uri.parse("CHAHIN_WOODEN_CHAIR.sfb"));
        });
        gallery.addView(chair);

        ImageView washing_machine = new ImageView(this);
        washing_machine.setImageResource(R.drawable.washingmachine_thumb);
        washing_machine.setContentDescription("Washing Machine");
        washing_machine.setOnClickListener(view -> {
            sendUri(Uri.parse("Clothes dryer.sfb"));
        });
        gallery.addView(washing_machine);

        ImageView laptop = new ImageView(this);
        laptop.setImageResource(R.drawable.laptop_thumb);
        laptop.setContentDescription("laptop");
        laptop.setOnClickListener(view -> {
            sendUri(Uri.parse("Laptop.sfb"));
        });
        gallery.addView(laptop);
    }

    private void sendUri(Uri uri) {
        Intent i = new Intent(ProductsActivity.this, MainActivity.class);
        i.putExtra("uri", uri.toString());
        startActivity(i);
    }

}
