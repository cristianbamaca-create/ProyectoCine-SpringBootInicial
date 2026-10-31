package umg.cristian.proyecto2026.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "examen")
public class Examen implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 5254046624558391170L;


	@Id
    @Column(name = "id_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idExamen;
    
    
	@Column(name = "fecha_examen")
    private Date fechaExamen;

    @Column(name = "nota")
    private String nota;

    @Column(name = "carnet")
    private String carnet;

    public int getIdExamen() {
		return idExamen;
	}

	public Date getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

}