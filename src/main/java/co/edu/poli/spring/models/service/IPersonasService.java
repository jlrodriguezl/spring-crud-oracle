package co.edu.poli.spring.models.service;

import java.util.List;

import co.edu.poli.spring.models.entities.Personas;

/**
 * Interfaz de los servicios que contienen las operaciones crud
 * @author jlrodriguez
 *
 */
public interface IPersonasService {
	/**
	 * Método que consulta datos de la tabla personas
	 * @return List<Personas> Listado de personas
	 */
	public List<Personas> findAll();
}
