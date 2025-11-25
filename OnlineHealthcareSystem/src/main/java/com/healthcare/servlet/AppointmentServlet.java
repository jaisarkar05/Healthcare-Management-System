package com.healthcare.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.healthcare.dao.AppointmentDAO;
import com.healthcare.model.Appointment;
import com.healthcare.model.User;

@WebServlet("/bookAppointment")
public class AppointmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain");

        // Get user from session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        // Only patients can book appointments
        if (user == null || !"PATIENT".equals(user.getRole())) {
            response.getWriter().println("Only patients can book appointments.");
            return;
        }

        // Read form data
        int patientId = user.getId();
        int doctorId = Integer.parseInt(request.getParameter("doctorId"));
        String datetime = request.getParameter("datetime");
        String reason = request.getParameter("reason");

        // Create appointment model
        Appointment appt = new Appointment(patientId, doctorId, datetime, reason);

        // Insert data using DAO
        AppointmentDAO dao = new AppointmentDAO();
        boolean success = dao.bookAppointment(appt);

        // Output result
        if (success) {
            response.getWriter().println("Appointment Booked Successfully!");
        } else {
            response.getWriter().println("Failed to Book Appointment!");
        }
    }
}
