package com.tugas6.auliaravi.auliaravi_1202150037_m3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    ImageView battery;
    int container = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = findViewById(R.id.titleDetail);
        //untuk memasukan detail apa saja yang bakal di masukan
        ImageView imageView = findViewById(R.id.header);
        //untuk memasukan image apa saja yang bakal di masukan
        TextView lorem = findViewById(R.id.detail);
        textView.setText(getIntent().getStringExtra("title"));
        //mengatur set get nama merk
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
        lorem.setText(getIntent().getStringExtra("detail"));
        //mengatur set get detail merk
        battery = findViewById(R.id.imageView3);
        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        //memasukan battery yang 20persen kedalam detail activity

    }

    public void decrease(View view) {
        if (between(container--, 1, 3))
            level(container);
    }
    public void increase(View view) {
        if (between(container++, 1, 3))
            level(container);
    }
    public boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        if (i >= minValueInclusive && i <= maxValueInclusive)
            return true;
        else
            return false;
    }
    //untuk penambahan dan pengurangan battery

    public void level(int lvl) {
        switch (lvl) {
            case 1:
                battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                Toast.makeText(this, "AIR SEDIKIT 20%", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                Toast.makeText(this, "AIR BERISI 50%", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                Toast.makeText(this, "AIR BERISI PENUH 100%", Toast.LENGTH_SHORT).show();
                break;
            default:
                if (lvl > 3) {
                    container = 3;
                } else if(lvl < 1) {
                    container = 1;
                }
                //untuk penambahan dan pengurangan battery
        }
    }

}
