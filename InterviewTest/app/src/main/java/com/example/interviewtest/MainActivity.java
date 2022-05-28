package com.example.interviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    private ArrayAdapter<String> adapterM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        final  String[] names = new String[]{"Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай",
                "Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай",
                "Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай","Илья","Пётр","Николай"};
        adapterM = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, names);
        setListAdapter(adapterM);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(), "Вы выбрали: "+ l.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
    }
}