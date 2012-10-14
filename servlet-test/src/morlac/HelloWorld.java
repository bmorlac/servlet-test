package morlac;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {

  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public HelloWorld () {
    super ();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String foo = getInitParameter ("foo");
    System.out.println ("foo = " + foo);

    // ServletOutputStream out = response.getOutputStream();
    // out.println("Hello World!");
    // out.close();

    // PrintWriter out = response.getWriter();
    // out.append("Hello World!");
    // out.flush();
    // out.close();

    request.getRequestDispatcher ("/WEB-INF/login.jsp").forward (request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Map<String, String> errors = new HashMap<String, String> ();
    request.setAttribute ("errors", errors);

    String username = request.getParameter ("username");
    if (username == null || username.trim ().isEmpty ()) {
      errors.put ("username", "Bitte geben Sie Ihren Benutzernamen ein");
    }

    String password = request.getParameter ("password");
    if (password == null || password.trim ().isEmpty ()) {
      errors.put ("password", "Bitte geben Sie Ihr Passwort ein");
    }

    request.getRequestDispatcher ("/WEB-INF/login.jsp").forward (request, response);
  }

}
