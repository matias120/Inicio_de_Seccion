package com.example.iniciodesecion;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final  long DURATION_TRANSITION=1000;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Slide slideBottom = new Slide();
        slideBottom.setDuration(DURATION_TRANSITION);
        slideBottom.setInterpolator(new DecelerateInterpolator());
        getWindow().setReenterTransition(slideBottom);
        getWindow().setAllowEnterTransitionOverlap(false);
        setContentView(R.layout.activity_main);


    }
    private Transition transition;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onSlideClicked(View view){
        transition = new Slide(Gravity.START);
        Registrar();
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Registrar(){
        transition.setDuration(DURATION_TRANSITION);
        transition.setInterpolator(new DecelerateInterpolator());
        getWindow().setExitTransition(transition);

        Intent sigiente = new Intent(this,NuevoUsuario.class);
        startActivity(sigiente, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());

    }
}
