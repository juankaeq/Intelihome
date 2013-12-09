package com.intelihome.dispositivos;

import java.util.ArrayList;


public class DispositivoControl {

	public static ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	
	
	public static void generarDispositivos(){
		
		dispositivos = new ArrayList<Dispositivo>();
		for (int i = 0; i < 10; i++) {
			
			Dispositivo d = new Dispositivo(i);
			d.setNombre("Dispositivo: "+i);
			d.setSerial(Integer.toHexString(i));
			d.setRutaImagen("/Img/"+i+".jpg");
			
		}
		
		
	}
}
