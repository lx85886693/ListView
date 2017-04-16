package mytest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter extends AppCompatActivity {
    private android.widget.SimpleAdapter simAdapt;
    private ListView listView;
    private List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
    private String[] imageview = { "cat", "dog", "elephant", "lion","monkey","tiger" };
    private int[] imageids = { R.drawable.cat, R.drawable.dog,
            R.drawable.elephant, R.drawable.lion,R.drawable.monkey,R.drawable.tiger };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        listView = (ListView) findViewById(R.id.listview1);
        for (int i = 0; i < 6; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("imageview",imageids[i]);
            item.put("textView", imageview[i]);
            dataList.add(item);
        }
        simAdapt = new android.widget.SimpleAdapter(this, dataList,
                R.layout.item, new String[] { "imageview", "textView",},
                new int[] {R.id.imageView,R.id.textView});
        listView.setAdapter(simAdapt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                HashMap<String,Object> map =(HashMap<String,Object>)listView.getItemAtPosition(i);
                String text=map.get("textView").toString();
                Toast.makeText(SimpleAdapter.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
