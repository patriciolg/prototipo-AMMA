package net.atos.mira.prototip.restplo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import net.atos.mira.prototip.modelo.entities.User;

import javax.ws.rs.POST;

@Path("/raiz")
@Api(value = "pet", authorizations = {@Authorization(value="sampleoauth", scopes = {})})
public class JerseyService
{
    @GET
    @Path("/message")
    @ApiOperation(value = "Devuelve el mensaje Hola Mundo",
    notes = "Esto son unas anotaciones sobre el comportamiento")
    public String getMsg()
    {
         return "Hola Mundo !! - Jersey 2";
    }
    
    @GET
    @Path("/employees")
    @ApiOperation(value = "Devuelve el mensaje Hola Mundo",
    notes = "Esto son unas anotaciones sobre el comportamiento")
	public String getAllEmployees() {
		User us1 = new User();
		us1.setApellido("Lopez");
		us1.setId(39L);
		us1.setUsername("username1");
		return us1.toString();
	}
    
    @GET
    @Path("/employeeId/{id}")
    @ApiOperation(value = "Devuelve el mensaje Hola Mundo",
    notes = "Esto son unas anotaciones sobre el comportamiento")
	public String getAllEmployeeId(@PathParam("id") Integer id) {
		User us1 = new User();
		us1.setApellido("Lopez");
		us1.setId((long)id);
		us1.setUsername("username1");
		return us1.toString();
	}


    
}
