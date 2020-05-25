package nl.mahmood.animationdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
    }

    public void startAnimation(View view) {
        animationDrawable.start();
    }
}
