package cn.edu.gdmec.android.boxuegu.activity;

/**
 * Created by Administrator on 2018/3/27 0027.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import cn.edu.gdmec.android.boxuegu.R;

public class MainActivity extends AppCompatActivity {
    private TextView tv_user_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_user_name = (TextView) findViewById(R.id.tv_user_name);
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data!=null){
            //从注册页面传递过来的用户名
            String userName = data.getStringExtra("userName");
            tv_user_name.setText(userName + "登录成功！");
        }
    }
}
