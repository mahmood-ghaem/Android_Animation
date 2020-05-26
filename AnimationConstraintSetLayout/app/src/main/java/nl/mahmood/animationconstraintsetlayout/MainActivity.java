package nl.mahmood.animationconstraintsetlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    ConstraintSet constraintSet;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintSet = new ConstraintSet();
        constraintLayout = findViewById(R.id.constraintLayout);
        constraintSet.clone(this, R.layout.page1);
    }

    public void buttonClick(View view)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
        {
            TransitionManager.beginDelayedTransition(constraintLayout);
        }
        constraintSet.applyTo(constraintLayout);
    }
}
