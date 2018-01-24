package mz.co.malambe.meunegocio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnMainPageOnClick(View v) {
        Intent mainPageIntent = new Intent(Login.this, MainPage.class);
        startActivity(mainPageIntent);
    }
}
