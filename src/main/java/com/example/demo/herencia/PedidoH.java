package com.example.demo.herencia;

import java.time.LocalDateTime;

public class PedidoH {
	private String numero;
	private LocalDateTime fechaPedido;
	private VendedorH vendedor;
	private ProductoH producto;
	
	public void pedir(String numero, LocalDateTime fechaCita, VendedorH vH, ProductoH pH) {
		
		
		this.numero=numero;
		this.fechaPedido = LocalDateTime.now();
		
		Integer valorDescuento = pH.tipo();
		System.out.println("Valor: " + valorDescuento);
		
		this.vendedor = vH;
		this.guardarCita(this);
	
	}

	private void guardarCita(PedidoH pedido) {
	
	System.out.println("Se creo un Pedido");
	System.out.println(pedido);
	}

	
	
	
	
	@Override
	public String toString() {
		return "PedidoH [numero=" + numero + ", fechaPedido=" + fechaPedido + ", vendedor=" + vendedor + ", producto="
				+ producto + "]";
	}

	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDateTime fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public VendedorH getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorH vendedor) {
		this.vendedor = vendedor;
	}

	public ProductoH getProducto() {
		return producto;
	}

	public void setProducto(ProductoH producto) {
		this.producto = producto;
	}
}
