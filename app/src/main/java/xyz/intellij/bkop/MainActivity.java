package xyz.intellij.bkop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private ListView Lv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        setFullscreen();
//        setTheme(R.style.SplashTheme);
//
//        delay(5000);
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lv = (ListView) findViewById(R.id.Lv);
        Resources res = getResources();
        final String[] name = res.getStringArray(R.array.mask_name);
        final String[] message = res.getStringArray(R.array.details);
        final TypedArray ta = getResources().obtainTypedArray(R.array.photo);
        final int[] photo = new int[] { R.drawable.andianbao, R.drawable.baise, R.drawable.chaigui, R.drawable.heise, R.drawable.hongse, R.drawable.huangse, R.drawable.lanse, R.drawable.lvse, R.drawable.shiqian, R.drawable.zise};
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        String name1;
        int pic;
        String content;
        for (int i=0;i<name.length;i++){

            Map<String, Object> map1 = new HashMap<String, Object>();
            map1.put("photo",ta.getResourceId(i,0));
            map1.put("name", name[i]);
            data.add(map1);
        }
//        Map<String, Object> map1 = new HashMap<String, Object>();
//        map1.put("photo", R.drawable.andianbao);
//        map1.put("name", name[0]);
//        data.add(map1);
//
//        Map<String, Object> map2 = new HashMap<String, Object>();
//        map2.put("photo", R.drawable.baise);
//        map2.put("name", name[1]);
//        data.add(map2);
//
//        Map<String, Object> map3 = new HashMap<String, Object>();
//        map3.put("photo", R.drawable.chaigui);
//        map3.put("name", name[2]);
//        data.add(map3);

        Lv.setAdapter(new SimpleAdapter(this, data, R.layout.item,new String[] { "photo", "name" }, new int[] { R.id.iv,R.id.tv_name }));
        Lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                Bundle bundle = new Bundle();
                bundle.putInt("photo", ta.getResourceId(arg2,0));
                bundle.putString("message", message[arg2]);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(MainActivity.this, DetailsActivity.class);
                Log.i("message", message[arg2]);
                startActivity(intent);
            }
        });

    }
    private void delay(int ms){
        try {
            Thread.currentThread();
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setFullscreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
