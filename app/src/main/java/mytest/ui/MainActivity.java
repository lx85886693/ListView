package mytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_simpleAdapter=(Button)findViewById(R.id.simpleadapter);
        btn_simpleAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mytest.ui.SimpleAdapter.class);
                startActivity(intent);
            }
        });

        Button btn_alert=(Button)findViewById(R.id.alertdialog);
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,mytest.ui.alert.class);
                startActivity(intent);
            }
        });

        Button btn_xmldefinemenu=(Button)findViewById(R.id.xmldefinemenu);
        btn_xmldefinemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, XMLmenutest.class);
                startActivity(intent);
            }
        });
    }
}
