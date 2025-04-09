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


@Path("/")
public class IndexResource {

	@Inject
    Template index; 
	
	@ConfigProperty(name = "greeting.message")
	String message;
	
	@ConfigProperty(name = "db.user")
	String dbUser;
	
	@ConfigProperty(name = "db.password")
	String dbPassword;
	
	@GET
	@Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
		
        return index.data("now", java.time.LocalDateTime.now())
        		.data("ip", SystemUtility.myIp())
        		.data("uptime", SystemUtility.getUptime())
        		.data("hello-message", message)
        		.data("db-user", dbUser)
        		.data("db-password", dbPassword)
        		//.data("software", "disabled")
        		;  
    }
}
