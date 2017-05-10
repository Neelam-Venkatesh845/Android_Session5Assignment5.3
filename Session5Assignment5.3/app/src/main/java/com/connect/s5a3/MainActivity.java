package com.connect.s5a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.connect.s5a3.adapters.StudentAdapter;
import com.connect.s5a3.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String Phone;
    ListView lv;
    String name1, name2, name3, name4, name5, name6, name7,
            phone1, phone2, phone3, phone4, phone5, phone6, phone7;

    ArrayList<Student> mArrayList;
    StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) findViewById(R.id.listview);

        mArrayList = new ArrayList<>();

        mArrayList.add(new Student("Asha", "9778987987"));
        mArrayList.add(new Student("Nisha", "9778987987"));
        mArrayList.add(new Student("Disha", "9778987987"));
        mArrayList.add(new Student("Misha", "9778987987"));
        mArrayList.add(new Student("Trisha", "9778987987"));
        mArrayList.add(new Student("Mina", "9778987987"));
        mArrayList.add(new Student("Giga", "9778987987"));

        mStudentAdapter = new StudentAdapter(this, mArrayList);
        lv.setAdapter(mStudentAdapter);
        lv.setOnItemClickListener(this);

        registerForContextMenu(lv);


//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//                String name = ((TextView) view.findViewById(R.id.name)).getText().toString();
//                Toast.makeText(getApplicationContext(), "name: " + name, Toast.LENGTH_SHORT).show();
//
//
//                Phone = ((TextView) view.findViewById(R.id.phone)).getText().toString();
//                Toast.makeText(getApplicationContext(), "Phone: " + Phone, Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(getApplicationContext(), "CALL " , Toast.LENGTH_SHORT).show();

                return true;
            case R.id.sms:
                Toast.makeText(getApplicationContext(), "SMS " , Toast.LENGTH_SHORT).show();

                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}




