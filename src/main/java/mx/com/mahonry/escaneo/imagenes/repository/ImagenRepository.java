package mx.com.mahonry.escaneo.imagenes.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import mx.com.mahonry.escaneo.imagenes.dao.Imagen;

public interface ImagenRepository extends CrudRepository<Imagen, Integer> {	
	 List<Imagen> findByNombre(String nombre);
	 Optional<Imagen> findById(long id);

}
