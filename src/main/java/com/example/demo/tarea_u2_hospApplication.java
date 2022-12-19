package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Medico;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IMedicoService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class tarea_u2_hospApplication implements CommandLineRunner{
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Autowired
	private IMedicoService iMedicoService;
	
	@Autowired
	private IPacienteService iPacienteService;

	public static void main(String[] args) {
		SpringApplication.run(tarea_u2_hospApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Paciente pacienteTE=new Paciente();
		pacienteTE.setCedula("12345567890");
		pacienteTE.setNombre("Bryan");
		pacienteTE.setTipo("C");
		this.iPacienteService.agregar(pacienteTE);
	
		Medico medico=new Medico();
		medico.setCedula("567890");
		medico.setNombre("Fernando");
		this.iMedicoService.agregar(medico);
		
		System.out.println(pacienteTE);
		
		
		citaMedicaService.agendar(pacienteTE.getCedula(), LocalDateTime.now(), pacienteTE, medico);
		
		
		
		
	}

}
