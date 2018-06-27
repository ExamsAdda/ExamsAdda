package in.co.examsadda;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import in.co.examsadda.R;
import in.co.examsadda.view.UserHomeActivity;
import in.co.examsadda.view.UserLoginActivity;

public class AppLaunchActivity2 extends AppCompatActivity implements View.OnClickListener {
    private TextView btn_skip;
    private static int TIME_DELAY=5000;
    private static String Token="kslklkjflksj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_app_launch2);

        btn_skip=(TextView)findViewById(R.id.btn_skip);
        btn_skip.setOnClickListener(this);

        Handler handler=new Handler();
        handler.postDelayed(runnable, TIME_DELAY);
    }

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            if(Token!=null){
                startActivity(new Intent(AppLaunchActivity2.this,UserHomeActivity.class));
            }
            else{
                startActivity(new Intent(AppLaunchActivity2.this,UserLoginActivity.class));
            }
            finish();
        }
    };

    @Override
    public void onClick(View v) {
        if(v==btn_skip){
            runnable.run();
        }
    }
}
