package com.example.falling.clickclash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ClickClash extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        MyAdapter adapter = new MyAdapter();
        mListView = (ListView) findViewById(R.id.list);
        assert mListView != null;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("click");
                Toast.makeText(view.getContext(), "ListView's click", Toast.LENGTH_SHORT).show();
            }
        });
        mListView.setAdapter(adapter);

    }
}
