import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static void send(String to, String from, String name, String subject, String msg) {
		final String user="ankit.rai11072000@gmail.com";
		final String pass="654123+*/";
		Properties props = new Properties();
		props.put("mail.smtp.host", "mail.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(props,new javax.mail.Authenticator()
        	{
            		protected PasswordAuthentication getPasswordAuthentication(user, pass)
            		{
  	 	         	return new PasswordAuthentication(user,pass); 
           		 }
        	});
   		try {  
 			MimeMessage message = new MimeMessage(session);  
 			message.setFrom(new InternetAddress(from));  
 			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
  			
 			message.setSubject(subject);  
 			message.setText(msg);  
			Transport.send(message);  
 			System.out.println("Done");  
		} catch (MessagingException e) {throw new RuntimeException(e);}  
	}
}