package mz.co.malambe.meunegocio;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Relatorio extends AppCompatActivity {
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarLayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RelatorioFragment(), "Relatorio");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
