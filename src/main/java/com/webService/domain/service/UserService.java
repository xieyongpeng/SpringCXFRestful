package com.webService.domain.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webService.domain.bean.User;
import com.webService.domain.response.Response;

@WebService
@Path(value="/users")
public interface UserService {
	
	@GET
	@Path("/") //http://ip:port/users
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	List<User> getUsers();

	@DELETE
	@Path("{id}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	Response delete(@PathParam("id") int id);
	
	@GET
	@Path("{id}")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	User getUser(@PathParam("id") int id);
	
	@POST
	@Path("/add")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	Response add(User user);
	
	@PUT
	@Path("/update")
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	Response update(User user);
}
