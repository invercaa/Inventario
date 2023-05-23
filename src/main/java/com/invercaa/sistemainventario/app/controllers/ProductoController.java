package com.invercaa.sistemainventario.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.invercaa.sistemainventario.app.models.entity.Producto;
import com.invercaa.sistemainventario.app.models.services.ProductoServiceImpl;

@Controller
@RequestMapping()
public class ProductoController {
	
	@Autowired
	private ProductoServiceImpl productoService;
	
	@GetMapping({"/productos"})
	public String vistaProductos(Model model) {
		model.addAttribute("titulo", "Lista Productos");
		return "producto/vistaProductos";
	}
	
	@GetMapping(value = "/listarProductos", produces = {"application/json"})
	public @ResponseBody List<Producto> listarProductos(){
		List<Producto> listaProductos = productoService.findAllProductos();
		return listaProductos;
	}
}
