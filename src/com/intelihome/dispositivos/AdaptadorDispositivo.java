package com.intelihome.dispositivos;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public class AdaptadorDispositivo extends ArrayAdapter<Dispositivo>{
	
	 HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

	    public AdaptadorDispositivo(Context context, int textViewResourceId,
	        List<Dispositivo> objects) {
	      super(context, textViewResourceId, objects);
	      for (int i = 0; i < objects.size(); ++i) {
	        mIdMap.put(objects.get(i).getSerial(), i);
	      }
	    }

	    @Override
	    public long getItemId(int position) {
	      Dispositivo item = getItem(position);
	      return mIdMap.get(item.getSerial());
	    }

	    @Override
	    public boolean hasStableIds() {
	      return true;
	    }

}

