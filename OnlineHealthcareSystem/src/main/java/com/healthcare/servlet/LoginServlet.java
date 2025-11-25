package com.healthcare.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.healthcare.dao.UserDAO;
import com.healthcare.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO userDAO = new UserDAO();
        User user = userDAO.login(email, password);

        if (user == null) {
            response.getWriter().println("Invalid Email or Password!");
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        switch (user.getRole()) {
            case "ADMIN":
                response.sendRedirect("admin-dashboard.jsp");
                break;
            case "DOCTOR":
                response.sendRedirect("doctor-dashboard.jsp");
                break;
            case "PATIENT":
                response.sendRedirect("patient-dashboard.jsp");
                break;
            default:
                response.getWriter().println("Unknown role!");
        }
    }
}
