package com.alcoba.rodrigo.services;

import com.alcoba.rodrigo.Beans.EstadoBean;
import com.alcoba.rodrigo.Beans.IBeanEstado;
import com.alcoba.rodrigo.entidades.Estado;
import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/estados")
public class EstadoRestService {

    @EJB
    private IBeanEstado estadoBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estado> getEstados() {

        return estadoBean.listaEstados();
    }
}
