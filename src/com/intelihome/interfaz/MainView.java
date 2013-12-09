package com.intelihome.interfaz;

import java.util.HashMap;
import java.util.List;

import com.intelihome.R;
import com.intelihome.perfiles.Perfil;
import com.intelihome.perfiles.PerfilControl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainView extends Activity implements OnClickListener{

	private ListView lstPerfilesActivos;
	private GridView grdDispositivosActivos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ihmain);
		
		
		lstPerfilesActivos = (ListView)findViewById(R.id.lstPerfilesActivos);
		grdDispositivosActivos = (GridView)findViewById(R.id.grdDispositivosActivos);
		desplegarPerfilesEnLista();
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	
	public void desplegarPerfilesEnLista(){
		
		StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, PerfilControl.consultarPerfilQuemado());
		lstPerfilesActivos.setAdapter(adapter);
		
	}
	
	  private class StableArrayAdapter extends ArrayAdapter<Perfil> {

		    HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

		    public StableArrayAdapter(Context context, int textViewResourceId,
		        List<Perfil> objects) {
		      super(context, textViewResourceId, objects);
		      for (int i = 0; i < objects.size(); ++i) {
		        mIdMap.put(objects.get(i).getNombre(), i);
		      }
		    }

		    @Override
		    public long getItemId(int position) {
		      Perfil item = getItem(position);
		      return mIdMap.get(item);
		    }

		    @Override
		    public boolean hasStableIds() {
		      return true;
		    }

		  }
}
