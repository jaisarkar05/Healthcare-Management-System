package com.healthcare.servlet;

import java.io.IOException;

import com.healthcare.dao.UserDAO;
import com.healthcare.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain");

        // Get parameters from form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        // Create User object
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        // DAO Operation
        UserDAO dao = new UserDAO();
        boolean success = dao.register(user);

        if (success) {
            response.getWriter().println("User Added Successfully!");
        } else {
            response.getWriter().println("Failed to Add User!");
        }
    }
}
