package com.example.demo.factura.repository;

import com.example.demo.factura.modelo.Factura;

public interface IFacturaRepository {
	//
	public Factura bucarPorNumero(String numeroCuenta);
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	//CRUD
	public Factura buscar(Integer id);
	//
	public void actualizar(Factura cuentaBancaria);
	public void insertar(Factura cuentaBancaria);
	public void borrar(Integer id);
}
