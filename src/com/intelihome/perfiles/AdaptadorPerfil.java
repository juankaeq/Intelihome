package com.intelihome.perfiles;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public class AdaptadorPerfil extends ArrayAdapter<Perfil>{
	
	 HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

	    public AdaptadorPerfil(Context context, int textViewResourceId,
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
