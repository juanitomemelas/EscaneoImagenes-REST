package mx.com.mahonry.escaneo.imagenes.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "tbl_imagenes")
public class Imagen {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	  @Column(name = "imagenes_nombre")
	  private String nombre;
	  @Column(name = "imagenes_texto")
	  private String texto;
	  @Column(name = "imagenes_ruta")
	  private String ruta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public Imagen orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	  
	

}
