package br.com.viacep.service;

import br.com.viacep.proxy.ConsultaProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/consulta")
public class ConsultaService {
    @Inject
    @RestClient
    ConsultaProxy consultaProxy;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{cep}")
    public String getConsulta(@PathParam("cep") String cep) {
        return consultaProxy.getAddress(cep).ToString();
    }
}
