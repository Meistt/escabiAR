package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Bebida;

import java.util.List;

public interface RepositorioBebida {
    List<Bebida> listadoBebidas();

    List<Bebida> filtradoBebida(String nombre);
}
