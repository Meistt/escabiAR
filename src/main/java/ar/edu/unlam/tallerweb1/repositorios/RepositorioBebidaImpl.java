package ar.edu.unlam.tallerweb1.repositorios;


import ar.edu.unlam.tallerweb1.modelo.Bebida;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorioBebida")
public class RepositorioBebidaImpl implements RepositorioBebida {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioBebidaImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Bebida> listadoBebidas() {
        final Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Bebida.class).list();
    }

    @Override
    public List<Bebida> filtradoBebida(String nombre) {
        final Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Bebida.class)
                .add(Restrictions.like("nombre","%"+nombre+"%")).list();
    }
}
