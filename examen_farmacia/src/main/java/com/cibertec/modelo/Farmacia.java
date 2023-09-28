package com.cibertec.modelo;


import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Medicamentos")
public class Farmacia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMedicamento;

    private String Nombre;
    private String Descripcion;
    private String Categoria;
    private int Stock;
    private String Proveedor;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Fecha_de_Vencimiento;
    private double Precio;
    
	public Farmacia(int idMedicamento, String nombre, String descripcion, String categoria, int stock, String proveedor,
			Date fecha_de_Vencimiento, double precio) {
		super();
		IdMedicamento = idMedicamento;
		Nombre = nombre;
		Descripcion = descripcion;
		Categoria = categoria;
		Stock = stock;
		Proveedor = proveedor;
		Fecha_de_Vencimiento = fecha_de_Vencimiento;
		Precio = precio;
	}
	
	public Farmacia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMedicamento() {
		return IdMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		IdMedicamento = idMedicamento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getProveedor() {
		return Proveedor;
	}

	public void setProveedor(String proveedor) {
		Proveedor = proveedor;
	}

	public Date getFecha_de_Vencimiento() {
		return Fecha_de_Vencimiento;
	}

	public void setFecha_de_Vencimiento(Date fecha_de_Vencimiento) {
		Fecha_de_Vencimiento = fecha_de_Vencimiento;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

}
