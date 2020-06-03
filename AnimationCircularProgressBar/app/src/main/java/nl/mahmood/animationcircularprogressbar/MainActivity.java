package nl.mahmood.animationcircularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import nl.mahmood.animationcircularprogressbar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.constraintLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startAnimationCounter(0, 100);
            }
        });

    }

    public void startAnimationCounter(int startNumber, int endNumber)
    {
        final ValueAnimator valueAnimator = ValueAnimator.ofInt(startNumber, endNumber);
        valueAnimator.setDuration(5000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
            @Override
            public void onAnimationUpdate(ValueAnimator animation)
            {
                binding.textViewCounter.setText(valueAnimator.getAnimatedValue().toString());
                binding.progressBar.setProgress(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
            }
        });
        valueAnimator.start();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        binding = null;
    }
}