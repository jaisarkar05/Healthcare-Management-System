package com.healthcare.servlet;

import java.io.IOException;
import java.util.List;

import com.healthcare.dao.AppointmentDAO;
import com.healthcare.model.Appointment;
import com.healthcare.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewPatientAppointments")
public class PatientAppointmentsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User patient = (User) session.getAttribute("user");

        // sirf patient hi access kar sakta hai
        if (patient == null || !"PATIENT".equals(patient.getRole())) {
            response.getWriter().println("Only patients can view their appointments.");
            return;
        }

        AppointmentDAO dao = new AppointmentDAO();
        List<Appointment> list = dao.getAppointmentsForPatient(patient.getId());

        // data JSP ko bhejna
        request.setAttribute("appointments", list);
        request.getRequestDispatcher("patient-appointments.jsp").forward(request, response);
    }
}

