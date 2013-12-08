package com.intelihome.interfaz;

import com.intelihome.R;
import com.intelihome.login.LoginControl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginView extends Activity implements OnClickListener {

	private Button buttonLogin;
	private EditText txtUser;
	private EditText txtPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihlogin);

		buttonLogin = (Button) findViewById(R.id.btnLogin);
		buttonLogin.setOnClickListener(this);

		txtUser = (EditText) findViewById(R.id.editText1);
		txtPassword = (EditText) findViewById(R.id.editText2);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int loginResult = LoginControl.hacerLogin(txtUser.getText().toString(),
				txtPassword.getText().toString());
		switch (loginResult) {
		case 0:
			
			break;
		case 1:

			break;
		case 2:

			break;

		default:
			break;
		}
	}

}
