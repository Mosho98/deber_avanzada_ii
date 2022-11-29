package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//comntario de prueba

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.example.demo.spring.boot.CongeladoHidrogenoSB;
import com.example.demo.spring.boot.PedidoSB;
import com.example.demo.spring.boot.ProductoSB;
import com.example.demo.spring.boot.VendedorSB;

@SpringBootApplication
public class DeberU2Bm1Application implements CommandLineRunner{
  
	@Autowired
	private CongeladoHidrogenoSB producto;
	
	@Autowired
	private PedidoSB pedidoSB;
	
	@Autowired
	private VendedorSB vendedorDB;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberU2Bm1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		System.out.println("Productos");
		this.producto.setNombre("Gaseosa");
		this.producto.setNombre("Bryan");
		this.producto.setTipo(" ");
		
		
		System.out.println(producto);
		
		
		pedidoSB.pedir("1234", LocalDateTime.of(2022, 12, 2, 8, 30), vendedorDB, producto);
	}

}
