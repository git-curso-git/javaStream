package eci.seguros.webs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiniestroController {

	private static final Logger logger = LoggerFactory.getLogger(SiniestroController.class);
	
    @RequestMapping("/list")
    public String listSiniestro() {
    	logger.trace("Endpoint listSiniestro");
		String strResult = "Hola, soy el endpoint listSiniestro desde la url 'list'!";
        return strResult;
    }

}
