import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("allo")
public class Hello {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "allo, there";
  }

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String dog() {
    return "You're getting a doge, dude!";
  }
}
