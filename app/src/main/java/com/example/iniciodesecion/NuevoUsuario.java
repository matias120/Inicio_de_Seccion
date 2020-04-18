package com.example.iniciodesecion;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class NuevoUsuario extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario);
        Fade fadeln = new Fade(Fade.IN);
        fadeln.setDuration(MainActivity.DURATION_TRANSITION);
        fadeln.setInterpolator(new DecelerateInterpolator());

        Slide slideTop=new Slide(Gravity.TOP);
        slideTop.setDuration(MainActivity.DURATION_TRANSITION);
        slideTop.setInterpolator(new DecelerateInterpolator());
        getWindow().setEnterTransition(fadeln);
        getWindow().setReturnTransition(slideTop);
        getWindow().setAllowEnterTransitionOverlap(false);
        setContentView(R.layout.activity_nuevo_usuario);

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void regresar(View view){
        finishAfterTransition();
    }

}
