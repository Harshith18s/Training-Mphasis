package com.test;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/hello")
public class HelloService {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String simpleHelloPlainTextResponse() {
		return "This Is Rest API Simple Plain Text Response";
	}

	@GET
	@Path("/{db}")
	@Produces(MediaType.TEXT_HTML)
	public String simpleHTMLResponse(@PathParam("db") String num) {
		return "<html><body><h2>:: Simple HTML Data Response :: " + num + "</h2></body></html>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@QueryParam("msg") String msg) {

		return msg;
	}
	
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item1> listDataResponse() {
		
		return List.of(new Item1(1, "Book"), new Item1(2, "pen"), new Item1(3, "color"), new Item1(4, "Art"), new Item1(5, "Draw"));
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createItemsData(Item1 item) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode json = mapper.createObjectNode();
		
		json.put("result", "Jersey JSON Example using Jackson 3.x");
		
		json.put("success", "ok");
		
		return Response.status(Response.Status.CREATED).entity(json).build();
	}

}



/*
 * GET : READ POST : CREATE PUT : UPDATE DELETE : DELETE
 */
