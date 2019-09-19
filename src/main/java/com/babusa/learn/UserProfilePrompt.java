package com.babusa.learn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserProfilePrompt extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();

        StringBuffer html = new StringBuffer();

        html.append("<html>");

        html.append("<head>");
            html.append("<title>");
                html.append("User Profile Prompt");
            html.append("</title>");
        html.append("</head>");

        html.append("<body>");
            html.append("<form action='/app-01/userprofilehandler' method='POST'>");
                html.append("<input type='text' name='user-name' placeholder='enter your name' /> <br /><br />");
                html.append("<input type='text' name='user-hobbies' placeholder='enter your hobbies' /> <br /> <br />");
                html.append("<input type='submit' />");
            html.append("</form>");
        html.append("</body>");

        html.append("</html>");

        out.append(html.toString());
    }
}
