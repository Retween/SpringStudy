import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import somePackage.Cart;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();

    String user = (String) session.getAttribute("current_user");
    if (user == null) {
      //authorisation
      //session.setAttribute("current_user",ID);
    } else {

    }

//    String name = request.getParameter("name");
//    int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//    Cart cart = (Cart) session.getAttribute("cart");
//
//    if (cart == null) {
//      cart = new Cart();
//
//      cart.setName(name);
//      cart.setQuantity(quantity);
//    }
//    session.setAttribute("cart", cart);
//
//    getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
//    PrintWriter pw = response.getWriter();

//    pw.println("<html>");
//    pw.println("<h1>Your count is: " + "</h1>");
//    pw.println("</html>");

//    RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//    dispatcher.forward(request, response);
  }
}
