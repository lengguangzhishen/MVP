package com.example.mvpdemo;

import bean.UserBean;
import presenter.UserPresenter;
import view.IUserView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements IUserView{

	private UserPresenter userPresenter;
	private EditText name;
	private EditText pwd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		name = (EditText) findViewById(R.id.et_name);
		pwd = (EditText) findViewById(R.id.et_pwd);
	}
	
	public void click(View view) {
		userPresenter.login(getUserName(), getPwd());
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPwd(String pwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserName() {
		return name.getText().toString();
	}

	@Override
	public String getPwd() {
		return pwd.getText().toString();
	}



}
