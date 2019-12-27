package com.example.mauriciogodinez.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ninjas[] ninjas_datos = new Ninjas[]{
                new Ninjas(R.drawable.ic_star_black_18dp, R.drawable.ic_star_border_black_18dp, "mau"),
                new Ninjas(R.drawable.ic_star_border_black_18dp, R.drawable.ic_star_black_18dp, "mario"),
                new Ninjas(R.drawable.ic_star_black_18dp, R.drawable.ic_star_border_black_18dp, "merino"),
                new Ninjas(R.drawable.ic_star_border_black_18dp, R.drawable.ic_star_black_18dp, "miguel"),
                new Ninjas(R.drawable.ic_star_black_18dp, R.drawable.ic_star_border_black_18dp, "miranda"),
                new Ninjas(R.drawable.ic_star_border_black_18dp, R.drawable.ic_star_black_18dp, "micasa"),
                new Ninjas(R.drawable.ic_star_black_18dp, R.drawable.ic_star_border_black_18dp, "morales"),
                new Ninjas(R.drawable.ic_star_border_black_18dp, R.drawable.ic_star_black_18dp, "mora"),
                new Ninjas(R.drawable.ic_star_black_18dp, R.drawable.ic_star_border_black_18dp, "muros"),
                new Ninjas(R.drawable.ic_star_border_black_18dp, R.drawable.ic_star_black_18dp, "mulato"),
        };

        NinjasAdapter adapter = new NinjasAdapter(this, R.layout.renglon, ninjas_datos);

        ls = findViewById(R.id.listView);

        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                TextView v = arg1.findViewById(R.id.tv_1);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_close) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
