package mz.co.malambe.meunegocio;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Sell extends AppCompatActivity {
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarLayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RetalhoFragment(), "Retalho");
        adapter.addFragment(new GrossoFragment(), "Grosso");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void btnVenderOnClick(View v) {
        double venda = 0.0;
        for(int i = 0; i < OurData.nomeProduto.length; i++) {
            if(OurData.quantCompra[i] > 0) {
                int quant = Integer.parseInt(OurData.qtdProduto[i]);
                quant -= OurData.quantCompra[i];
                OurData.qtdProduto[i] = quant+"";
                venda += (OurData.quantCompra[i] * OurData.precoProdutoRetalho[i]);
            }
            OurData.entrada[0] = venda;
        }
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RetalhoFragment(), "Retalho");
        adapter.addFragment(new GrossoFragment(), "Grosso");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
