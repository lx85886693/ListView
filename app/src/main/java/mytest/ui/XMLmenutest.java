package mytest.ui;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class XMLmenutest extends AppCompatActivity {

    private TextView AS_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlmenutest);
        AS_text=(TextView)findViewById(R.id.textView5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.font_small:
                AS_text.setTextSize(10);
                break;
            case R.id.font_middle:
                AS_text.setTextSize(16);
                break;
            case R.id.font_big:
                AS_text.setTextSize(20);
                break;
            case R.id.ptcdx:
                Toast.makeText(this,"普通菜单项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.font_red:
                AS_text.setTextColor(Color.RED);
                break;
            case R.id.font_black:
                AS_text.setTextColor(Color.BLACK);
                break;
            default:
        }
        return true;

    }
}
