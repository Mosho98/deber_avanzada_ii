package com.example.demo.spring.boot;

public class ProductoSB {
	private String nombre;
	private String tipo;
	
	protected Integer tipo() {
		System.out.println("Sin refrigerar");
		return 0;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
