package com.example.newrun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/18.
 */

public class LoginActivity extends BaseActivity {

    private EditText accountEdit;

    private EditText passwordEdit;

    private Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);

        accountEdit = (EditText)findViewById(R.id.username_edit);
        passwordEdit = (EditText)findViewById(R.id.password_edit);
        login = (Button)findViewById(R.id.signin_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();

                if(account .equals("201611111901191")&&password.equals("911911")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"账号密码不正确",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
