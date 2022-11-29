package com.example.demo.factura.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.factura.modelo.Factura;

@Repository
public class FacturaRepositoryImpl implements IFacturaRepository{
	
	private static List <Factura> baseCuentas=new ArrayList<>();

	@Override
	public Factura bucarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO= numeroCuenta
		Factura cuenta=new Factura();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTitular("Alex Andrango");
		return cuenta;
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Factura cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Factura cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
