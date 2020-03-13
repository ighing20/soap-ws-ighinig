package com.ighing.service;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ighing.entity.Cliente;
import com.ighing.repository.ClienteRepository;

@WebService  
public class ClienteService {
	
	ClienteRepository repository = new ClienteRepository(new HashMap<>());

	@WebMethod
	public String crearCliente() {
		return null;
	}
	
	@WebMethod
	public Map<Integer, Cliente> consultarCliente(){
		return null;
	}
}
