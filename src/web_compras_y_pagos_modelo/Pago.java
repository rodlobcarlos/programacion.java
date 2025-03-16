package web_compras_y_pagos_modelo;

public abstract class Pago implements IPago{
	private TipoDevisa devisa;
	private float cantidad;
	private EstadoPago estado;
	
	public TipoDevisa getDevisa() {
		return devisa;
	}
	public void setDevisa(TipoDevisa devisa) {
		this.devisa = devisa;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public EstadoPago getEstado() {
		return estado;
	}
	public void setEstado(EstadoPago estado) {
		this.estado = EstadoPago.PENDIENTE;
	}
	
	public Pago(TipoDevisa devisa, float cantidad, EstadoPago estado) {
		super();
		this.devisa = devisa;
		this.cantidad = cantidad;
		this.estado = EstadoPago.PENDIENTE;
	}
	
	@Override
	public String toString() {
		return "Pago [devisa=" + devisa + ", cantidad=" + cantidad + "]";
	}

	@Override
	public boolean validarMetodoPago() {
		boolean valido = false;
		if(devisa.equals(TipoDevisa.EURO)) {
			valido = true;
		}else if(devisa.equals(TipoDevisa.DOLAR)) {
			valido = true;
		}
		return valido;
	}
	@Override
	public boolean realizarPago() {
		boolean realizado = false;
		if(realizado = true) {
			this.estado = EstadoPago.PAGADO;
		}else {
			this.estado = EstadoPago.ERROR;
		}
		return realizado;
	}
}
