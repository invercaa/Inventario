package com.invercaa.sistemainventario.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invercaa.sistemainventario.app.models.dao.IProductoDao;
import com.invercaa.sistemainventario.app.models.entity.Producto;

import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional
	public List<Producto> findAllProductos() {
		return (List<Producto>) productoDao.findAll();
	}
}
