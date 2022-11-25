package com.example.demo.herencia;

public class CongeladoHidrogenoH extends ProductoH{
private float cantidadH;

public Integer tipo() {
	System.out.println("Producto congelado con Hidrogeno");
	return 10;

}

public float getCantidadH() {
	return cantidadH;
}

public void setCantidadH(float cantidadH) {
	this.cantidadH = cantidadH;
}
}
