package mz.co.malambe.meunegocio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout eleven, twelve;
    Button btnsub, btnsub1;
    Animation uptodown, downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsub = (Button) findViewById(R.id.buttonsub);
        btnsub1 = (Button) findViewById(R.id.buttonsub1);
        eleven = (LinearLayout) findViewById(R.id.eleven);
        twelve = (LinearLayout) findViewById(R.id.twelve);

        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        eleven.setAnimation(uptodown);
        twelve.setAnimation(downtoup);

    }

    public void btnEntrarOnClick(View v) {
        Intent loginIntent = new Intent(MainActivity.this, Login.class);
        startActivity(loginIntent);
    }
}
