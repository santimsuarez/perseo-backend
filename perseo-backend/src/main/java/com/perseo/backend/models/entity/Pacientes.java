package com.perseo.backend.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@PrimaryKeyJoinColumn(name="usuarios_dni")
public class Pacientes extends Usuarios{

	private static final long serialVersionUID = 1L;
	
	//FK
	private HistoriasClinicas historiaClinica;
	
	@Column(nullable = false)
	@NotNull(message = "no puede estar vacío.")
	private Long idOS1;
	
	//FK
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn//(name="region_id")//si se omite se genera igual el nombre(nombre atributo + _ + nombre de paramentro)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@NotNull(message = "no puede estar vacío.")
	private PlanesOS planOS1;
	
	private Long idOS2;
	
	//FK
	private PlanesOS planOS2;
	
	@Column(nullable = false)
	@NotNull(message = "no puede estar vacío.")
	@Temporal(TemporalType.DATE)
	private Date fechaInternacion;
	
	@Column(nullable = false)
	@NotNull(message = "no puede estar vacío.")
	private String estado;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacío.")
	private String nombreContacto;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacío.")
	private String apellidoContacto;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacío.")
	private String parentezcoContacto;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacío.")
	private Long telefonoContacto;

	public HistoriasClinicas getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriasClinicas historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public PlanesOS getPlanOS1() {
		return planOS1;
	}

	public void setPlanOS1(PlanesOS planOS1) {
		this.planOS1 = planOS1;
	}

	public PlanesOS getPlanOS2() {
		return planOS2;
	}

	public void setPlanOS2(PlanesOS planOS2) {
		this.planOS2 = planOS2;
	}

	public Date getFechaInternacion() {
		return fechaInternacion;
	}

	public void setFechaInternacion(Date fechaInternacion) {
		this.fechaInternacion = fechaInternacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdOS1() {
		return idOS1;
	}

	public void setIdOS1(Long idOS1) {
		this.idOS1 = idOS1;
	}

	public Long getIdOS2() {
		return idOS2;
	}

	public void setIdOS2(Long idOS2) {
		this.idOS2 = idOS2;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getParentezcoContacto() {
		return parentezcoContacto;
	}

	public void setParentezcoContacto(String parentezcoContacto) {
		this.parentezcoContacto = parentezcoContacto;
	}

	public Long getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(Long telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

}
