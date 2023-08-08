package mx.com.mahonry.escaneo.imagenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EscaneoImagenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscaneoImagenesApplication.class, args);
	}

}
