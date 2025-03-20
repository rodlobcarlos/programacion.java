package web_compras_y_pagos_modelo;

import java.time.LocalDate;
import java.util.Arrays;

public class Tienda extends Pago {
	private LocalDate fecha_dia;
	private Tienda[] pagos;
	private int id;

	public LocalDate getFecha_dia() {
		return fecha_dia;
	}

	public void setFecha_dia(LocalDate fecha_dia) {
		this.fecha_dia = fecha_dia;
	}

	public Tienda[] getPagos() {
		return pagos;
	}

	public void setPagos(Tienda[] pagos) {
		this.pagos = pagos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tienda(TipoDevisa devisa, float cantidad, EstadoPago estado, LocalDate fecha_dia, Tienda[] pagos, int id) {
		super(devisa, cantidad, estado);
		this.fecha_dia = fecha_dia;
		this.pagos = pagos;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Tienda [fecha_dia=" + fecha_dia + ", pagos=" + Arrays.toString(pagos) + ", id=" + id + "]";
	}

	void imprimeResumenDia(LocalDate dia) {
		for (Tienda pago : pagos) {
			if (pago != null && pago.getFecha_dia().equals(dia)) {
				System.out.println("ID de pago: " + pago.getId());
				System.out.println("Tipo de divisa: " + pago.getDevisa());
				System.out.println("Cantidad: " + pago.getCantidad());
				System.out.println("Estado del pago: " + pago.getEstado());
				System.out.println("-------------------------");
			}
		}
	}
}
