package com.intelihome.dispositivos;

import com.intelihome.perfiles.Perfil;

public class Dispositivo {

	private int codigo;
	private String nombre;
	private String serial;
	private String rutaImagen;
	
	
	
	public Dispositivo(int codigo) {
		super();
		this.codigo = codigo;
	}
	public Dispositivo(int codigo, String nombre, String serial,
			String rutaImagen) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.serial = serial;
		this.rutaImagen = rutaImagen;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getRutaImagen() {
		return rutaImagen;
	}
	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return serial;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return ((Dispositivo)o).serial.equals(serial);
	}
}
