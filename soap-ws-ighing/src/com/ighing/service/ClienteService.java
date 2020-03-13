package com.ighing.service;

import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ighing.entity.Cliente;

@WebService  
public class ClienteService {

	@WebMethod
	public String crearCliente() {
		return null;
	}
	
	@WebMethod
	public Map<Integer, Cliente> consultarCliente(){
		return null;
	}
}
