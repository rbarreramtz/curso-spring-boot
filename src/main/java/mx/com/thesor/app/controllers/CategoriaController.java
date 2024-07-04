package mx.com.thesor.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.thesor.app.models.Categoria;
import mx.com.thesor.app.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	private static Logger log = LoggerFactory.getLogger( CategoriaController.class );
	
	@Autowired
	private CategoriaService categoriaService;  
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> listar(@PathVariable Integer id) {
		
		try {
			
			Categoria categoria = categoriaService.buscar(id); 
			
			return ResponseEntity.ok().body(categoria); 
			
		}catch(Exception e) {
			log.error( e.toString());
			return ResponseEntity.internalServerError().build();
		}
		
	}

}
