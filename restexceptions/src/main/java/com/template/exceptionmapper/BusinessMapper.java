package com.template.exceptionmapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.template.exception.SomeBusinessException;

@Provider
public class BusinessMapper implements ExceptionMapper<SomeBusinessException>{

	@Override
	public Response toResponse(SomeBusinessException ex) {
		StringBuilder response = new StringBuilder("<response>");
		response.append("<status>ERROR</status>");
		response.append("<message>"+ ex.getMessage() +"</message>");
		response.append("</response>");
		return Response.serverError().entity(response.toString())
				       .type(MediaType.APPLICATION_XML).build();
	}

}
