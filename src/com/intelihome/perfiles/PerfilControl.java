package com.intelihome.perfiles;

import java.util.ArrayList;

public class PerfilControl {

	public static ArrayList<Perfil> perfilesTotales = new ArrayList<Perfil>();
	public static ArrayList<Perfil> perfilesActivos = new ArrayList<Perfil>();
	
	
	public static ArrayList<Perfil> consultarPerfilQuemado(){
	
		perfilesActivos = new ArrayList<Perfil>();
		for (int i = 0; i < 10; i++) {
			
			Perfil p = new Perfil();
			p.setNombre("Perfil"+(i+1));
			p.setHoraFin(""+(i+1));
			p.quemarDispositivos(i);
			perfilesActivos.add(p);
			
		}
		
		return perfilesActivos;
		
	}
	
}
