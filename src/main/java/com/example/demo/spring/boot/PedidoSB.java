package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class PedidoSB {
	private String numero;
	private LocalDateTime fechaPedido;
	private VendedorSB vendedor;
	private ProductoSB producto;
	
	public void pedir(String numero, LocalDateTime fechaCita, VendedorSB vH, ProductoSB pH) {
		
		
		this.numero=numero;
		this.fechaPedido = LocalDateTime.now();
		
		Integer valorDescuento = pH.tipo();
		System.out.println("Valor: " + valorDescuento);
		
		this.vendedor = vH;
		this.guardarCita(this);
	
	}

	private void guardarCita(PedidoSB pedido) {
	
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

	public VendedorSB getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorSB vendedor) {
		this.vendedor = vendedor;
	}

	public ProductoSB getProducto() {
		return producto;
	}

	public void setProducto(ProductoSB producto) {
		this.producto = producto;
	}
}
