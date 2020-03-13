package com.ighing.repository;

import java.util.Map;

public interface Repository<ID, E> {

	Map<ID, E> all();

	void put(E entity);
}
