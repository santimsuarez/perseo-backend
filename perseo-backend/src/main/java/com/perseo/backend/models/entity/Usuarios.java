package com.perseo.backend.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usuarios")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuarios implements Serializable {

	
	@Id
	@Column(unique = true, nullable = false)
	private Long dni;
	
	private Long cuil;
	
	@Column(name="fecha_creacion")
	@Temporal(TemporalType.TIME)
	private Date fechaCreacion;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String nombre;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String apellido;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String sexo;
	
	@Column(name="telefono_fijo")
	private Long telefonoFijo;
	
	@Column(name="telefono_cel", nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private Long telefonoCel;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	@Email(message = "no es un formato de Email válido.")
	private String email;
	
	@NotNull(message = "no puede estar vacío.")
	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name="calle_domicilio", nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String calleDomicilio;
	
	@Column(name="altura_domicilio",nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private Long alturaDomicilio;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String localidad;
	
	@Column(nullable = false)
	@NotEmpty(message = "No puede estar vacío")
	private String provincia;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Roles> roles;

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getCuil() {
		return cuil;
	}

	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}

	/*public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
		
	}*/
	
	@PrePersist
	public void prePersist() {
			fechaCreacion = new Date();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCalleDomicilio() {
		return calleDomicilio;
	}

	public void setCalleDomicilio(String calleDomicilio) {
		this.calleDomicilio = calleDomicilio;
	}

	public Long getAlturaDomicilio() {
		return alturaDomicilio;
	}

	public void setAlturaDomicilio(Long alturaDomicilio) {
		this.alturaDomicilio = alturaDomicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public Long getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(Long telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public Long getTelefonoCel() {
		return telefonoCel;
	}

	public void setTelefonoCel(Long telefonoCel) {
		this.telefonoCel = telefonoCel;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
