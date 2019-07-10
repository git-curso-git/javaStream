package eci.seguros.webs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiniestroController {

    @RequestMapping("/list")
    public String listSiniestro() {
        return "Soy el endpoint listSiniestro desde la url 'list'!";
    }

}
