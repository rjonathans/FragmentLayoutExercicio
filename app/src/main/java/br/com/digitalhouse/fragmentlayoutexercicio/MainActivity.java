package br.com.digitalhouse.fragmentlayoutexercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPraia1;
    private Button btnPraia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


        btnPraia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new BlankFragment());
            }
        });

        btnPraia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new OutroFragment());
            }
        });

    }

    public void initViews(){
        btnPraia1 = findViewById(R.id.button);
        btnPraia2 = findViewById(R.id.button2);


    }

    public void recarregaFragment(Fragment fragement){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragement);
        transaction.commit();

    }
}


