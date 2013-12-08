package com.intelihome.interfaz;

import com.intelihome.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class GestionDispositivoView extends Activity implements OnClickListener{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihgestion_dispositivos);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
