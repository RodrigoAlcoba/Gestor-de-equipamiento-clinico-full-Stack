package com.alcoba.rodrigo.Beans;


import com.alcoba.rodrigo.entidades.Estado;
import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface IBeanEstado{

    List<Estado> listaEstados();
}
