package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class CongeladoAguaSB extends ProductoSB{
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
