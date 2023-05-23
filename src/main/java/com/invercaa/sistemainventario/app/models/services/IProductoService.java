package com.invercaa.sistemainventario.app.models.services;

import java.util.List;

import com.invercaa.sistemainventario.app.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAllProductos();
}
