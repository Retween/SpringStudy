import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookiesServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    PrintWriter pr = response.getWriter();

    pr.println("<html>");
    for (Cookie x : cookies) {
      pr.println("<h1>" + x.getName() + ": " + x.getValue() + "</h1>");
    }
    pr.println("</html>");
  }
}
