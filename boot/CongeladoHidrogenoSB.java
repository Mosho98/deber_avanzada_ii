package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class CongeladoHidrogenoSB extends ProductoSB{
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
