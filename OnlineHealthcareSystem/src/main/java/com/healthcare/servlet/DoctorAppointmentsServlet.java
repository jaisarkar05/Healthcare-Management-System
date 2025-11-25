package com.healthcare.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.healthcare.dao.AppointmentDAO;
import com.healthcare.model.Appointment;
import com.healthcare.model.User;

@WebServlet("/viewDoctorAppointments")
public class DoctorAppointmentsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User doctor = (User) session.getAttribute("user");

        if (doctor == null || !"DOCTOR".equals(doctor.getRole())) {
            response.getWriter().println("Only doctors can view their appointments.");
            return;
        }

        AppointmentDAO dao = new AppointmentDAO();
        List<Appointment> list = dao.getAppointmentsForDoctor(doctor.getId());

        request.setAttribute("appointments", list);
        request.getRequestDispatcher("doctor-appointments.jsp").forward(request, response);
    }
}

