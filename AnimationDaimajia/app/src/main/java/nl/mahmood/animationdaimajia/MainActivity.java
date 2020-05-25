package nl.mahmood.animationdaimajia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    public void clickButton(View view)
    {
        int random = new Random().nextInt(62);
        switch(random)
        {
            case 0:
                YoYo.with(Techniques.RubberBand).duration(700).repeat(1).playOn(textView);
                break;
            case 1:
                YoYo.with(Techniques.Bounce).duration(700).repeat(1).playOn(textView);
                break;
            case 2:
                YoYo.with(Techniques.BounceIn).duration(700).repeat(1).playOn(textView);
                break;
            case 3:
                YoYo.with(Techniques.BounceInDown).duration(700).repeat(1).playOn(textView);
                break;
            case 4:
                YoYo.with(Techniques.BounceInLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 5:
                YoYo.with(Techniques.BounceInRight).duration(700).repeat(1).playOn(textView);
                break;
            case 6:
                YoYo.with(Techniques.BounceInUp).duration(700).repeat(1).playOn(textView);
                break;
            case 7:
                YoYo.with(Techniques.DropOut).duration(700).repeat(1).playOn(textView);
                break;
            case 8:
                YoYo.with(Techniques.FadeIn).duration(700).repeat(1).playOn(textView);
                break;
            case 9:
                YoYo.with(Techniques.FadeInDown).duration(700).repeat(1).playOn(textView);
                break;
            case 10:
                YoYo.with(Techniques.FadeInLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 11:
                YoYo.with(Techniques.FadeInRight).duration(700).repeat(1).playOn(textView);
                break;
            case 12:
                YoYo.with(Techniques.FadeInUp).duration(700).repeat(1).playOn(textView);
                break;
            case 13:
                YoYo.with(Techniques.FadeOut).duration(700).repeat(1).playOn(textView);
                break;
            case 14:
                YoYo.with(Techniques.FadeOutDown).duration(700).repeat(1).playOn(textView);
                break;
            case 15:
                YoYo.with(Techniques.FadeOutLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 16:
                YoYo.with(Techniques.FadeOutRight).duration(700).repeat(1).playOn(textView);
                break;
            case 17:
                YoYo.with(Techniques.FadeOutUp).duration(700).repeat(1).playOn(textView);
                break;
            case 18:
                YoYo.with(Techniques.Flash).duration(700).repeat(1).playOn(textView);
                break;
            case 19:
                YoYo.with(Techniques.FlipInX).duration(700).repeat(1).playOn(textView);
                break;
            case 20:
                YoYo.with(Techniques.FlipInY).duration(700).repeat(1).playOn(textView);
                break;
            case 21:
                YoYo.with(Techniques.FlipOutX).duration(700).repeat(1).playOn(textView);
                break;
            case 22:
                YoYo.with(Techniques.FlipOutY).duration(700).repeat(1).playOn(textView);
                break;
            case 23:
                YoYo.with(Techniques.Hinge).duration(700).repeat(1).playOn(textView);
                break;
            case 24:
                YoYo.with(Techniques.Landing).duration(700).repeat(1).playOn(textView);
                break;
            case 25:
                YoYo.with(Techniques.Pulse).duration(700).repeat(1).playOn(textView);
                break;
            case 26:
                YoYo.with(Techniques.RollIn).duration(700).repeat(1).playOn(textView);
                break;
            case 27:
                YoYo.with(Techniques.RollOut).duration(700).repeat(1).playOn(textView);
                break;
            case 28:
                YoYo.with(Techniques.RotateIn).duration(700).repeat(1).playOn(textView);
                break;
            case 29:
                YoYo.with(Techniques.RotateInDownLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 30:
                YoYo.with(Techniques.RotateInDownRight).duration(700).repeat(1).playOn(textView);
                break;
            case 31:
                YoYo.with(Techniques.RotateInUpLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 32:
                YoYo.with(Techniques.RotateInUpRight).duration(700).repeat(1).playOn(textView);
                break;
            case 33:
                YoYo.with(Techniques.RotateOut).duration(700).repeat(1).playOn(textView);
                break;
            case 34:
                YoYo.with(Techniques.RotateOutDownLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 35:
                YoYo.with(Techniques.RotateOutDownRight).duration(700).repeat(1).playOn(textView);
                break;
            case 36:
                YoYo.with(Techniques.RotateOutUpLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 37:
                YoYo.with(Techniques.RotateOutUpRight).duration(700).repeat(1).playOn(textView);
                break;
            case 38:
                YoYo.with(Techniques.Shake).duration(700).repeat(1).playOn(textView);
                break;
            case 39:
                YoYo.with(Techniques.SlideInDown).duration(700).repeat(1).playOn(textView);
                break;
            case 40:
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 41:
                YoYo.with(Techniques.SlideInRight).duration(700).repeat(1).playOn(textView);
                break;
            case 42:
                YoYo.with(Techniques.SlideInUp).duration(700).repeat(1).playOn(textView);
                break;
            case 43:
                YoYo.with(Techniques.SlideOutDown).duration(700).repeat(1).playOn(textView);
                break;
            case 44:
                YoYo.with(Techniques.SlideOutLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 45:
                YoYo.with(Techniques.SlideOutRight).duration(700).repeat(1).playOn(textView);
                break;
            case 46:
                YoYo.with(Techniques.SlideOutUp).duration(700).repeat(1).playOn(textView);
                break;
            case 47:
                YoYo.with(Techniques.StandUp).duration(700).repeat(1).playOn(textView);
                break;
            case 48:
                YoYo.with(Techniques.Swing).duration(700).repeat(1).playOn(textView);
                break;
            case 49:
                YoYo.with(Techniques.Tada).duration(700).repeat(1).playOn(textView);
                break;
            case 50:
                YoYo.with(Techniques.TakingOff).duration(700).repeat(1).playOn(textView);
                break;
            case 51:
                YoYo.with(Techniques.Wave).duration(700).repeat(1).playOn(textView);
                break;
            case 52:
                YoYo.with(Techniques.Wobble).duration(700).repeat(1).playOn(textView);
                break;
            case 53:
                YoYo.with(Techniques.ZoomIn).duration(700).repeat(1).playOn(textView);
                break;
            case 54:
                YoYo.with(Techniques.ZoomInDown).duration(700).repeat(1).playOn(textView);
                break;
            case 55:
                YoYo.with(Techniques.ZoomInLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 56:
                YoYo.with(Techniques.ZoomInRight).duration(700).repeat(1).playOn(textView);
                break;
            case 57:
                YoYo.with(Techniques.ZoomInUp).duration(700).repeat(1).playOn(textView);
                break;
            case 58:
                YoYo.with(Techniques.ZoomOut).duration(700).repeat(1).playOn(textView);
                break;
            case 59:
                YoYo.with(Techniques.ZoomOutDown).duration(700).repeat(1).playOn(textView);
                break;
            case 60:
                YoYo.with(Techniques.ZoomOutLeft).duration(700).repeat(1).playOn(textView);
                break;
            case 61:
                YoYo.with(Techniques.ZoomOutRight).duration(700).repeat(1).playOn(textView);
                break;
            case 62:
                YoYo.with(Techniques.ZoomOutUp).duration(700).repeat(1).playOn(textView);
                break;
        }
    }
}
