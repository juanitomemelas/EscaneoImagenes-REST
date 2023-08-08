package mx.com.mahonry.escaneo.imagenes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.com.mahonry.escaneo.imagenes.dao.Imagen;
import mx.com.mahonry.escaneo.imagenes.repository.ImagenRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/imagen") // This means URL's start with /demo (after Application path)
public class MainController {

	@Autowired // This means to get the bean called userRepository
	private ImagenRepository imagenRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Imagen> getAllUsers() {
// This returns a JSON or XML with the users
		return imagenRepository.findAll();
	}

}
