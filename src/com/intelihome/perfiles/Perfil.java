package com.intelihome.perfiles;

import java.util.ArrayList;

import com.intelihome.dispositivos.Dispositivo;

public class Perfil {

	private String nombre;
	private String horaInicio;
	private String horaFin;
	
	private ArrayList<Dispositivo> dispositivosAsociados = new ArrayList<Dispositivo>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public ArrayList<Dispositivo> getDispositivosAsociados() {
		return dispositivosAsociados;
	}

	public void setDispositivosAsociados(
			ArrayList<Dispositivo> dispositivosAsociados) {
		this.dispositivosAsociados = dispositivosAsociados;
	}
	
	
}
