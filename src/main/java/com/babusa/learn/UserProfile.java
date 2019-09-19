package com.babusa.learn;

import domain.Profile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserProfile extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        Profile profile = (Profile) req.getAttribute("profile");
        StringBuffer html = new StringBuffer();

        html.append("<html>");

        html.append("<head>");
        html.append("<title>");
        html.append("User Profile Prompt");
        html.append("</title>");
        html.append("</head>");

        html.append("<body>");
        html.append("<p>" + String.format("%s likes %s", profile.getUserName(), profile.getUserHobbiesList()) + "</p>");
        html.append("<a href=\"/app-01/userprofileprompt\">User Profile Prompt</a>");
        html.append("</body>");

        html.append("</html>");

        out.append(html.toString());
    }
}
