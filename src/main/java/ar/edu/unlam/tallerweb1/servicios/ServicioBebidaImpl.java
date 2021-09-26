package ar.edu.unlam.tallerweb1.servicios;


import ar.edu.unlam.tallerweb1.modelo.Bebida;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioBebida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("servicioBebida")
@Transactional
public class ServicioBebidaImpl implements ServicioBebida {

    private RepositorioBebida repositorioBebida;

    @Autowired
    public ServicioBebidaImpl(RepositorioBebida repositorioBebida) {
        this.repositorioBebida = repositorioBebida;
    }

    @Override
    public List<Bebida> listarBebidas() {
        return repositorioBebida.listadoBebidas();
    }

    @Override
    public List<Bebida> buscarBebida(String nombre) {
        return repositorioBebida.filtradoBebida(nombre);
    }


}
