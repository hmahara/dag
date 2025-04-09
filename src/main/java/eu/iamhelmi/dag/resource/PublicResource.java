package eu.iamhelmi.dag.resource;


import org.eclipse.microprofile.config.inject.ConfigProperty;

import eu.iamhelmi.dag.util.SystemUtility;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("/api/public")
public class PublicResource {

	@Path ("/test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public String get() {
		
        return "{\"test\":\"test\"}}";
        		
    }
}
