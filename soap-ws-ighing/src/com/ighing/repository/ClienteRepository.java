package com.ighing.repository;

import java.util.HashMap;
import java.util.Map;

import com.ighing.entity.Cliente;

public class ClienteRepository implements Repository<Integer, Cliente> {
	
	private Map<Integer, Cliente> map;
	
	public ClienteRepository(Map<Integer, Cliente> map) {
		this.map = map;
	}

	@Override
	public Map<Integer, Cliente> all() {
		return map;
	}

	@Override
	public void put(Cliente entity) {
		map.put(entity.getId(), entity);
	}
	
	public static void main(String... args) {
		
		Map<Integer, Cliente> map = new HashMap<Integer, Cliente>();
		
		ClienteRepository repository = new ClienteRepository(map);
		
		repository.put(new Cliente(1, "Juan","Lima cercado", "932547"));
		
		System.out.println(repository.all().get(1));

	}

}
