package nl.mahmood.makescenetransitionanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Page2 extends AppCompatActivity
{
    private RelativeLayout relativeLayoutCard;
    private TextView textViewTitle;
    private TextView textViewAuthor;
    private TextView textViewDescription;
    private TextView textViewSubtitle;
    private ImageView imageViewCircle;
    private ImageView imageViewRectangle;
    private View viewLine;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        viewLine = findViewById(R.id.viewLine);
        imageViewCircle = findViewById(R.id.imageViewCircle);
        imageViewRectangle = findViewById(R.id.imageViewRectangle);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewAuthor = findViewById(R.id.textViewAuthor);
        textViewSubtitle = findViewById(R.id.textViewSubtitle);
        textViewDescription = findViewById(R.id.textViewDescription);
        relativeLayoutCard = findViewById(R.id.relativeLayoutCard);
        relativeLayoutCard.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Page2.this, Page1.class);
                Pair[] pairs = new Pair[8];
                pairs[0] = new Pair<View, String>(viewLine, "viewLine_tr");
                pairs[1] = new Pair<View, String>(imageViewCircle, "imageViewCircle_tr");
                pairs[2] = new Pair<View, String>(imageViewRectangle, "imageViewRectangle_tr");
                pairs[3] = new Pair<View, String>(textViewTitle, "textViewTitle_tr");
                pairs[4] = new Pair<View, String>(textViewAuthor, "textViewAuthor_tr");
                pairs[5] = new Pair<View, String>(textViewSubtitle, "textViewSubtitle_tr");
                pairs[6] = new Pair<View, String>(textViewDescription, "textViewDescription_tr");
                pairs[7] = new Pair<View, String>(relativeLayoutCard, "relativeLayoutCard_tr");
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(Page2.this, pairs);
                startActivity(intent, activityOptions.toBundle());
            }
        });
    }
}