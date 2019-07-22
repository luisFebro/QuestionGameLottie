package me.mehdi.questiongame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSuccess(View view) {
        LottieAnimationView la = findViewById(R.id.lottieView);
        la.setAnimation(R.raw.success);
        la.playAnimation();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.success_sound);
        mp.start();
    }

    public void showFailure(View view) {
        LottieAnimationView la = findViewById(R.id.lottieView);
        la.setAnimation(R.raw.failure);
        la.playAnimation();
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wrong_sound);
        mp.start();
    }

    public void showAbout(View view) {
        new AlertDialog.Builder(this).setMessage(R.string.about_text)
                .setTitle(R.string.about)

                .show();
    }
}
