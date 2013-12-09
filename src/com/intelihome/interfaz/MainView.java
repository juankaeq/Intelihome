package com.intelihome.interfaz;

import com.intelihome.R;
import com.intelihome.dispositivos.AdaptadorDispositivo;
import com.intelihome.dispositivos.DispositivoControl;
import com.intelihome.perfiles.AdaptadorPerfil;
import com.intelihome.perfiles.Perfil;
import com.intelihome.perfiles.PerfilControl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainView extends Activity implements OnClickListener {

	private ListView lstPerfilesActivos;
	private GridView grdDispositivosActivos;
	private ImageButton imgbtnPerfiles;
	private ImageButton imgbtnDispositivo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihmain);

		lstPerfilesActivos = (ListView) findViewById(R.id.lstPerfilesActivos);
		grdDispositivosActivos = (GridView) findViewById(R.id.grdDispositivosActivos);
		imgbtnDispositivo = (ImageButton) findViewById(R.id.imgBtnDispositivos);
		imgbtnPerfiles = (ImageButton) findViewById(R.id.imgBtnPerfiles);

		desplegarPerfilesEnLista();
		desplegarListaDispositivos();
		eventosImageButtonsMenu();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	public void desplegarPerfilesEnLista() {

		AdaptadorPerfil adapter = new AdaptadorPerfil(this,
				android.R.layout.simple_list_item_1,
				PerfilControl.consultarPerfilQuemado());
		lstPerfilesActivos.setAdapter(adapter);
		lstPerfilesActivos.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				view.setSelected(true);
				Perfil perfil = PerfilControl.consultarPerfilQuemado().get(
						position);
				desplegarListaDispositivosPerfil(perfil);

			}
		});

	}

	public void desplegarListaDispositivos() {

		AdaptadorDispositivo adapter = new AdaptadorDispositivo(this,
				android.R.layout.simple_list_item_1,
				DispositivoControl.generarDispositivos());
		grdDispositivosActivos.setAdapter(adapter);
	}

	public void desplegarListaDispositivosPerfil(Perfil perfil) {

		AdaptadorDispositivo adapter = new AdaptadorDispositivo(this,
				android.R.layout.simple_list_item_1,
				perfil.getDispositivosAsociados());
		adapter.notifyDataSetChanged();
		grdDispositivosActivos.setAdapter(adapter);
	}

	public void eventosImageButtonsMenu() {

		final Context context = this;
		imgbtnDispositivo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(context, GestionDispositivoView.class);
				startActivity(i);
			}
		});

		imgbtnPerfiles.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(context, GestionPerfilView.class);
				startActivity(i);
			}
		});
	}

}
