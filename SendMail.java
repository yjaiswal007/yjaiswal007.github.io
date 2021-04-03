import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendMail extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	if (request.getParameter("btn_send") != null ) {
		String to = "yjaiswal007@gmail.com";
		String name = request.getParameter("contact_nom");
		String from = request.getParameter("contact_email");
		String subject = request.getParameter("contact_sujet");
		String message = request.getParameter("contact_message");
		Mailer.send(to, from, name, subject, message);
		out.print("message has been sent successfully");
		out.close();
		}
	}
}