package br.com.viacep.proxy;

import br.com.viacep.dto.ConsultaDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "viacep-api")
public interface ConsultaProxy {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{cep}/json/")
    public ConsultaDTO getAddress(@PathParam("cep") String cep);

}