package xyz.intellij.bkop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model);

        Bundle bundle=getIntent().getExtras();
        int id=bundle.getInt("photo");
        String message=bundle.getString("message");
        ImageView Iv=(ImageView) findViewById(R.id.Iv);
        Iv.setImageResource(id);
        TextView tv=(TextView) findViewById(R.id.tv_message);
        tv.setText(message);
        Button mybacker = (Button)findViewById(R.id.b_back);
        mybacker.setOnClickListener(mGoBack);

    }
    public View.OnClickListener mGoBack = new View.OnClickListener() {
        public void onClick(View v) {
            finish();
        }
    };
    public void setFullscreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
