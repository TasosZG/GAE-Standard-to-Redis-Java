import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import redis.clients.jedis.Jedis;

@WebServlet(
    name = "Redis",
    description = "Redis: Connect to Redis",
    urlPatterns = "/redis"
)
public class RedisServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	String s;
	try{
    		Jedis jedis = new Jedis("10.0.0.3");
    		jedis.set("myKey", "It's alive");
    		s = "Life test: "+ jedis.get("myKey");
	}catch(Exception e){s = "Couldn't connect "; e.printStackTrace();}
	
       resp.getWriter().write(s);	
  }
}
