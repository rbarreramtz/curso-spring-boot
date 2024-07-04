package mx.com.thesor.app;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.com.thesor.app.models.Categoria;
import mx.com.thesor.app.repositories.CategoriaRepository;

@SpringBootApplication
public class CursospApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(CursospApplication.class);
	
	@Autowired
	private CategoriaRepository categoriaRepository; 

	public static void main(String[] args) {
		SpringApplication.run(CursospApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info("Initializating: Carga inicial de Categorias");
		
		Categoria categoria = new Categoria(null, "Equipiño de Computo"); 
		Categoria categoria2 = new Categoria(null, "Equipo de Inmobiliario");
		
		categoriaRepository.saveAll( Arrays.asList(categoria, categoria2)); 
		
		log.info("Completed: Carga inicial de Categorias");
	}

}
