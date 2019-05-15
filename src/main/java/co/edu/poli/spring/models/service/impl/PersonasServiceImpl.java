package co.edu.poli.spring.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.spring.models.dao.IPersonasDao;
import co.edu.poli.spring.models.entities.Personas;
import co.edu.poli.spring.models.service.IPersonasService;

/**
 * Implementación de la interfaz de los métodos crud para personas
 * @author jlrodriguez
 *
 */
@Service
public class PersonasServiceImpl implements IPersonasService {
	
	@Autowired
	private IPersonasDao personaDao;
	
	@Override
	public List<Personas> findAll() {		
		return (List<Personas>)personaDao.findAll();
	}

}
