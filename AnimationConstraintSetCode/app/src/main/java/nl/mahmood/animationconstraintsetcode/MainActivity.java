package nl.mahmood.animationconstraintsetcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.SurfaceControl;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ConstraintLayout constraintLayout;
    TextView textViewTitle;
    TextView textViewSubtitle;
    TextView textViewDescription;
    TextView textViewAuthor;
    View divider;
    Button button;
    ImageView imageView;
    ConstraintSet constraintSet;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewSubtitle = findViewById(R.id.textViewSubtitle);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewAuthor = findViewById(R.id.textViewAuthor);
        divider = findViewById(R.id.divider);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        button.setTag("fullContent");

    }


    public void buttonClick(View view)
    {
        if (button.getTag().toString() == "fullContent")
        {
            showFullContent();
            button.setText("GO BACK");
            button.setTag("lessContent");
        } else
        {
            showLessContent();
            button.setText("Details");
            button.setTag("fullContent");
        }
    }


    private void showFullContent()
    {
        Transition transition = new ChangeBounds();
        transition.setInterpolator(new AnticipateOvershootInterpolator(1.0f));

        TransitionManager.beginDelayedTransition(constraintLayout);
        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);


        constraintSet.clear(imageView.getId(), ConstraintSet.START);
        constraintSet.clear(imageView.getId(), ConstraintSet.BOTTOM);
        constraintSet.clear(imageView.getId(), ConstraintSet.TOP);
        constraintSet.connect(imageView.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP);
        constraintSet.constrainWidth(imageView.getId(),400);


        constraintSet.clear(textViewTitle.getId(), ConstraintSet.END);
        constraintSet.clear(textViewTitle.getId(), ConstraintSet.START);
        constraintSet.clear(textViewTitle.getId(), ConstraintSet.BOTTOM);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP);


        constraintSet.setVisibility(textViewSubtitle.getId(),ConstraintSet.VISIBLE);
        constraintSet.setVisibility(divider.getId(),ConstraintSet.VISIBLE);
        constraintSet.setVisibility(textViewDescription.getId(),ConstraintSet.VISIBLE);
        constraintSet.setVisibility(textViewAuthor.getId(),ConstraintSet.VISIBLE);




        constraintSet.applyTo(constraintLayout);
    }

    private void showLessContent()
    {
        Transition transition = new ChangeBounds();
        transition.setDuration(2000);
        //transition.setInterpolator(new BounceInterpolator());
        transition.setInterpolator(new AnticipateOvershootInterpolator(1.0f));
        TransitionManager.beginDelayedTransition(constraintLayout, transition);

        constraintSet.connect(imageView.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        constraintSet.connect(imageView.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
        constraintSet.constrainWidth(imageView.getId(),800);

        constraintSet.clear(textViewTitle.getId(), ConstraintSet.START);
        constraintSet.clear(textViewTitle.getId(), ConstraintSet.TOP);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.START, imageView.getId(), ConstraintSet.START);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.END, imageView.getId(), ConstraintSet.END);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.BOTTOM, imageView.getId(), ConstraintSet.TOP,20);


        constraintSet.setVisibility(textViewSubtitle.getId(),ConstraintSet.INVISIBLE);
        constraintSet.setVisibility(divider.getId(),ConstraintSet.INVISIBLE);
        constraintSet.setVisibility(textViewDescription.getId(),ConstraintSet.INVISIBLE);
        constraintSet.setVisibility(textViewAuthor.getId(),ConstraintSet.INVISIBLE);

        constraintSet.applyTo(constraintLayout);
    }
}

