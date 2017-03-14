package fourdays;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import fourdays.R;


/**
 * Created by Administrator on 2016/11/24.
 */
public class A extends AppCompatActivity {
    Button a_bu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        a_bu = (Button) findViewById(R.id.fourdays_a_bu);
        Log.i("msg","创建1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("msg","创建2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("msg","创建3");
        a_bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A.this,B.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("msg","创建4");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("msg","创建5");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("msg","创建6");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("msg","创建0");
    }
}
