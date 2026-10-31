package umg.cristian.proyecto2026.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7778115642397628167L;

	@Id
    @Column(name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idPelicula;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "sinopsis")
    private String sinopsis;

    @Column(name = "duracion_minutos")
    private int duracionMinutos;

    @Column(name = "id_genero")
    private int idGenero;

    @Column(name = "id_clasificacion")
    private int idClasificacion;

    @Column(name = "imagen_promocional")
    private String imagenPromocional;

	

    public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getImagenPromocional() {
		return imagenPromocional;
	}

	public void setImagenPromocional(String imagenPromocional) {
		this.imagenPromocional = imagenPromocional;
	}

	
}