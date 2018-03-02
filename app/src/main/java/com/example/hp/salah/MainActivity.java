package com.example.hp.salah;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.list);
        String []item=getResources().getStringArray(R.array.index);
        arrayAdapter=new ArrayAdapter<String>(this,R.layout.row_item,R.id.text,item);
        l.setAdapter(arrayAdapter);

    }
}
