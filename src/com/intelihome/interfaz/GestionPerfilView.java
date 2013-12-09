package com.intelihome.interfaz;

import com.intelihome.R;
import com.intelihome.dispositivos.AdaptadorDispositivo;
import com.intelihome.dispositivos.DispositivoControl;
import com.intelihome.perfiles.AdaptadorPerfil;
import com.intelihome.perfiles.Perfil;
import com.intelihome.perfiles.PerfilControl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemClickListener;

public class GestionPerfilView extends Activity implements OnClickListener {

	private Button btnGuardar;
	private Button btnNuevo;
	private Button btnAsociar;
	private Spinner spnPerfiles;
	private EditText txtNombrePerfil;
	private EditText txtHoraInicio;
	private EditText txtHoraFin;
	private GridView grdDispositivos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihgestion_perfil);

		btnGuardar = (Button) findViewById(R.id.btnGPGuardar);
		btnNuevo = (Button) findViewById(R.id.btnGPNuevo);
		btnAsociar = (Button) findViewById(R.id.btnGPAsociar);

		txtNombrePerfil = (EditText) findViewById(R.id.txtNombrePerfil);
		txtHoraInicio = (EditText) findViewById(R.id.txtHoraInicio);
		txtHoraFin = (EditText) findViewById(R.id.txtHoraFin);

		grdDispositivos = (GridView) findViewById(R.id.gdDispositivosAsociados);
		spnPerfiles = (Spinner) findViewById(R.id.spnPerfiles);
		desplegarPerfilesEnLista();

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	public void desplegarPerfilesEnLista() {

		AdaptadorPerfil adapter = new AdaptadorPerfil(this,
				android.R.layout.simple_list_item_1,
				PerfilControl.consultarPerfilQuemado());
		spnPerfiles.setAdapter(adapter);
		spnPerfiles.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				view.setSelected(true);
				Perfil perfil = PerfilControl.consultarPerfilQuemado().get(
						position);
				desplegarListaDispositivosPerfil(perfil);

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		Perfil perfil = PerfilControl.consultarPerfilQuemado().get(0);
		desplegarListaDispositivosPerfil(perfil);

	}

	public void desplegarListaDispositivos() {

		AdaptadorDispositivo adapter = new AdaptadorDispositivo(this,
				android.R.layout.simple_list_item_1,
				DispositivoControl.generarDispositivos());
		grdDispositivos.setAdapter(adapter);
	}

	public void desplegarListaDispositivosPerfil(Perfil perfil) {

		AdaptadorDispositivo adapter = new AdaptadorDispositivo(this,
				android.R.layout.simple_list_item_1,
				perfil.getDispositivosAsociados());
		adapter.notifyDataSetChanged();
		grdDispositivos.setAdapter(adapter);
	}
}
