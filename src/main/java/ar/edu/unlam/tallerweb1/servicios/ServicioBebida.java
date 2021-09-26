package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Bebida;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ServicioBebida {
    List<Bebida> listarBebidas();

    List<Bebida> buscarBebida(String nombre);
}
