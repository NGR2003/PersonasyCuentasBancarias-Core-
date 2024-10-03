package com.nicolasgarcia.clases;

public class Personas {
	// atributos
	private String nombre;
	private int edad;
	
	// constructor
	public Personas(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// metodo
	public void infoPersona() {
		System.out.println("Informacion de la persona");
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
