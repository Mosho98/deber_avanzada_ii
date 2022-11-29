package com.example.demo.factura.modelo;

import java.math.BigDecimal;

public class Factura {
	private String numero;
	private BigDecimal saldo;
	private String titular;
	
//Metodos SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	
	
	

}
