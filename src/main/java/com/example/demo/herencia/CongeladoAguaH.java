package com.example.demo.herencia;

public class CongeladoAguaH extends ProductoH{
private float cantidadAgua;

public float getCantidadAgua() {
	return cantidadAgua;
}

public void setCantidadAgua(float cantidadAgua) {
	this.cantidadAgua = cantidadAgua;
}

public Integer tipo() {
	System.out.println("Producto congelado con agua");
	return 20;

}
}
