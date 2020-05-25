package nl.mahmood.animationsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public void clickButton(View view) {
        switch (view.getTag().toString()) {
            case "1":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                break;
            case "2":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                break;
            case "3":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadein);
                break;
            case "4":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fadeout);
                break;
            case "5":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.lefttoright);
                break;
            case "6":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mixed_anim);
                break;
            case "7":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.righttoleft);
                break;
            case "8":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                break;
            case "9":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sample_anim);
                break;
            case "10":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomin);
                break;
            case "11":
                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomout);
                break;
        }
        imageView.startAnimation(animation);
    }
}
