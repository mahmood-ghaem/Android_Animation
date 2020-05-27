package nl.mahmood.animationmotionlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;

public class MainActivity4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        coordinateMotion();
    }
    public void buttonNextClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void buttonPreviousClick(View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void coordinateMotion()
    {
        AppBarLayout appBarLayout = findViewById(R.id.appbar_layout);
        final MotionLayout motionLayout = findViewById(R.id.motion_layout);
        AppBarLayout.OnOffsetChangedListener listener = new AppBarLayout.OnOffsetChangedListener()
        {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset)
            {
                float seekPosition = -verticalOffset/ (float)appBarLayout.getTotalScrollRange();
                motionLayout.setProgress(seekPosition);
            }
        };
        appBarLayout.addOnOffsetChangedListener(listener);
    }
    @Override
    public void finish()
    {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}