package com.ighing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ighing.entity.Cliente;
import com.ighing.repository.ClienteRepository;

@WebService(serviceName = "ClienteService")
public class ClienteService {

	ClienteRepository repository = new ClienteRepository(new HashMap<>());

	@WebMethod
	public String crearCliente(Cliente cliente) {
		repository.put(cliente);
		String mensaje = "Ya se ingreso al cliente " + cliente.getNombre() + "con su numero " + cliente.getTelefono()
				+ " y direccion " + cliente.getDireccion() + ".";
		return mensaje;
	}

	@WebMethod
	public List<Cliente> consultarCliente() {
		return new ArrayList<>(repository.all().values());
	}
}
