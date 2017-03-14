package twoday;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import fourdays.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Administrator on 2016/11/22.
 */
public class TwoDayActivity extends Activity {
    ListView listview;
    ArrayList<Student> str;
    TwoDayListviewAdapter wdla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inidata();
        setContentView(R.layout.activity_twoday);
        listview = (ListView) findViewById(R.id.twoday_listview);
        wdla = new TwoDayListviewAdapter(this);
        Collections.sort(str);
        wdla.setStr(str);
        listview.setAdapter(wdla);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TwoDayActivity.this,"短按",Toast.LENGTH_SHORT).show();
                str.add(position,new Student("123","1",13,"2"));
                wdla.setStr(str);
                wdla.notifyDataSetChanged();
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TwoDayActivity.this,"长按",Toast.LENGTH_SHORT).show();
                str.remove(position);
                wdla.setStr(str);
                wdla.notifyDataSetChanged();
                return true;
            }
        });
    }
    void inidata(){
        str = new ArrayList<Student>();
        for (int i=1;i<51;i++){
            Random ra = new Random();
            int cla = ra.nextInt(4)+1;
            Random ra1 = new Random();
            int age = ra1.nextInt(5)+10;
            str.add(new Student("学生"+i,cla+"班",age,cla+"年级"));
        }
    }
}
