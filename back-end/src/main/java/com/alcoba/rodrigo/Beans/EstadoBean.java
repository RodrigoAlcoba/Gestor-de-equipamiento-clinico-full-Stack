package com.alcoba.rodrigo.Beans;


import com.alcoba.rodrigo.Daos.DaoGenerico;
import com.alcoba.rodrigo.Daos.EstadoDao;
import com.alcoba.rodrigo.entidades.Estado;
import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class EstadoBean implements IBeanEstado{

    @Inject
    private DaoGenerico<Estado> dao;

    @Override
    public List<Estado> listaEstados() {
        return dao.listarTodos();
    }
}
