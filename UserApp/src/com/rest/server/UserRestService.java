package com.rest.server;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;


@Path("/users")
public class UserRestService {

	private static final Logger logger = Logger.getLogger(UserRestService.class);

	@GET
	@Path("/getData")
    @Produces(MediaType.TEXT_PLAIN)
	public String getSomething(@QueryParam("request") String request ,
			 @DefaultValue("1") @QueryParam("version") int version) {		 
		System.out.println("The getData text output");
		String response = "This is response for you from space";    
        
         
        return response;	
	}
	
	@GET
	@Path("/getUser")
    @Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@QueryParam("userid") int id) {	 
        System.out.println("The getUser json output");
         User obj = new User();
         obj.setNum(id);
         obj.setAddrerss("Pune");
         obj.setName("UserCurrent "+"Ashok");
        return Response.ok().entity(obj).build();
	}

	@POST
	@Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String postNewUser(User obj) {
		System.out.println("The postNewUser json input");
        return "user is added with name = "+obj.getName();	
	}

	@PUT
	@Path("/updateUser/{id}")
    @Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateUser(@PathParam("id") int id, User user) { 

		System.out.println("The updateUser json input");
        return "user is updated with new name "+user.getName();	
	}

	@DELETE
	@Path("/removeUser/{userid}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteUser(@PathParam("userid") int id){
		
		System.out.println("The deleteUser  input "+id);
        return "user is removed with id = "+id;	
	}
}
