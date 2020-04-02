package com.ighing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ighing.entity.Cliente;
import com.ighing.repository.ClienteRepository;

@WebService(serviceName = "ClienteService")
public class ClienteService {

	ClienteRepository repository = new ClienteRepository(new HashMap<>());

	@WebMethod
	@WebResult(name = "resultado")
	public String crearCliente(@WebParam(name = "cliente") Cliente cliente) {
		repository.put(cliente);
		String mensaje = "Ya se ingreso al cliente " + cliente.getNombre() + " con su numero " + cliente.getTelefono()
				+ " y direccion " + cliente.getDireccion() + ".";
		return mensaje;
	}

	@WebMethod
	@WebResult(name = "cliente")
	public List<Cliente> consultarCliente() {
		return new ArrayList<>(repository.all().values());
	}
}
