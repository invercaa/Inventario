package com.invercaa.sistemainventario.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.invercaa.sistemainventario.app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
}