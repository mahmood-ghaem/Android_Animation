package nl.mahmood.animationbigpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView imageView = findViewById(R.id.imageView);
//
//        Glide.with(this).load("https://i.ibb.co/vDHs0Lx/picture.jpg").into(imageView);
    }
}