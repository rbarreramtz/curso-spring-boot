package mx.com.thesor.app.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.thesor.app.models.Categoria;
import mx.com.thesor.app.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	private static Logger log = LoggerFactory.getLogger(CategoriaService.class); 
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		 
	     try {
	    	 
	    	 Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
		 
	    	 return categoriaOptional.orElse(null);
	    	 
	     }catch( Exception e ) {
	    	 log.error( e.toString() );
	    	 throw e; 
	     }
	}
	

}
