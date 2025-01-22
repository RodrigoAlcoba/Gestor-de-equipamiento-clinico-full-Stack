package com.alcoba.rodrigo.Daos;


import com.alcoba.rodrigo.entidades.Estado;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@RequestScoped
public class EstadoDao implements DaoGenerico<Estado>{


    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Estado> listarTodos() {
        return em.createQuery("SELECT e FROM Estado e", Estado.class).getResultList();
    }
}
