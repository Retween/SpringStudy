import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LibraryServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    PrintWriter pw = response.getWriter();

    try {
      Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try {
      Connection connection = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/java_ee_db",
              "erni", "1488");

      Statement statement = connection.createStatement();
      ResultSet rs = statement.executeQuery("SELECT  title FROM books");

      while (rs.next()) {
        pw.println(rs.getString("title"));
      }

      statement.close();
    } catch (SQLException sqlexception) {
      sqlexception.printStackTrace();
    }
  }
}
