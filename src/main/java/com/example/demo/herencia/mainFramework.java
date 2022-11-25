package com.example.demo.herencia;

import java.time.LocalDateTime;

public class mainFramework {

	
	public static void main(String[] args) {
		CongeladoHidrogenoH hidro = new CongeladoHidrogenoH();
	hidro.setCantidadH(20);
	hidro.setNombre("Gseosa");
	hidro.setTipo("Bebida");
	
	VendedorH vendedor = new VendedorH();
	vendedor.setCedula("16486465");
	vendedor.setNombre("Bryan");

	PedidoH pedido = new PedidoH();
	
	pedido.pedir("12345", LocalDateTime.of(2022, 12, 2, 8, 30), vendedor, hidro);
	}
}
