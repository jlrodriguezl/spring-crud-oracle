package co.edu.poli.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.poli.spring.models.entities.Personas;

/**
 * Interfaz de objeto de acceso a datos para entidad Persona
 * 
 * @author jlrodriguez
 *
 */
public interface IPersonasDao extends CrudRepository<Personas, Long> {
	
}
