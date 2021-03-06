package pe.upc.edu.alquiler.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="evaluacion")
public class Evaluacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="idEvaluacion")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEvaluacion;
	
	@Column(name="codEvaluacion")
	private String codEvaluacion;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSolicitud")
	private Solicitud solicitud;
	
	@ManyToOne
    @JoinColumn(name = "idEvaluador")
	private Evaluador evaluador;
	
	@Column(name="fechaProp")
	@Type(type="date")
	private Date fechaProp;
	
	@Column(name="observacion")
	private String observacion;
	
	@Column(name="estado")
	private String estado;

	@Column(name="fechaCreacion")
	@Type(type="date")
	private Date fechaCreacion;
	
	@Column(name="usuarioCreacion")
	private String usuarioCreacion;
	
	@Column(name="fechaModif")
	@Type(type="date")
	private Date fechaModif;
	
	@Column(name="usuarioModif")
	private String usuarioModif;

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "evaluacion", cascade = CascadeType.ALL)
	//private InfEstEmp infEstEmp;
	//private EvaluacionEmpresarial evaEmpresarial;
	
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "evaluacion", cascade = CascadeType.ALL)
	//private InfSanciones infSanciones;
	
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "evaluacion", cascade = CascadeType.ALL)
	//private InfRedSoc infEvalMerc;

	public Long getIdEvaluacion() {
		return idEvaluacion;
	}

	public void setIdEvaluacion(Long idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	public String getCodEvaluacion() {
		return codEvaluacion;
	}

	public void setCodEvaluacion(String codEvaluacion) {
		this.codEvaluacion = codEvaluacion;
	}

	public Date getFechaProp() {
		return fechaProp;
	}

	public void setFechaProp(Date fechaProp) {
		this.fechaProp = fechaProp;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModif() {
		return usuarioModif;
	}

	public void setUsuarioModif(String usuarioModif) {
		this.usuarioModif = usuarioModif;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModif() {
		return fechaModif;
	}

	public void setFechaModif(Date fechaModif) {
		this.fechaModif = fechaModif;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public Evaluador getEvaluador() {
		return evaluador;
	}

	public void setEvaluador(Evaluador evaluador) {
		this.evaluador = evaluador;
	}
	
}
