package mz.co.malambe.meunegocio;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


    }

    public void btnVenderOnClick(View v) {
        Intent venderIntent = new Intent(MainPage.this, Sell.class);
        startActivity(venderIntent);
    }

    public void btnRelatorioOnClick(View v) {
        Intent relatorioIntent = new Intent(MainPage.this, Relatorio.class);
        startActivity(relatorioIntent);
    }
}
