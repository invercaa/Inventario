package com.invercaa.sistemainventario.app.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the clt_clientes database table.
 * 
 */
@Entity
@Table(schema = "dbo", name="prd_productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prd_id")
	private Long prdId;
	
	@Column(name="prd_descripcion")
	private String prdDescripcion;

	@Column(name="prd_precio")
	private String prdPrecio;

	@Column(name="prd_fecha_ingreso")
	private Timestamp prdFechaIngreso;

	public Producto() {
	}

	public Long getPrdId() {
		return prdId;
	}

	public void setPrdId(Long prdId) {
		this.prdId = prdId;
	}

	public String getPrdDescripcion() {
		return prdDescripcion;
	}

	public void setPrdDescripcion(String prdDescripcion) {
		this.prdDescripcion = prdDescripcion;
	}

	public String getPrdPrecio() {
		return prdPrecio;
	}

	public void setPrdPrecio(String prdPrecio) {
		this.prdPrecio = prdPrecio;
	}

	public Timestamp getPrdFechaIngreso() {
		return prdFechaIngreso;
	}

	public void setPrdFechaIngreso(Timestamp prdFechaIngreso) {
		this.prdFechaIngreso = prdFechaIngreso;
	}
}