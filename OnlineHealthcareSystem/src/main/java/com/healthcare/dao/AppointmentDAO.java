package com.healthcare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.healthcare.model.Appointment;
import com.healthcare.util.DBUtil;

public class AppointmentDAO {

    // ------------------------------------------------------
    // BOOK APPOINTMENT
    // ------------------------------------------------------
    public boolean bookAppointment(Appointment appt) {

        String sql = "INSERT INTO appointments(patient_id, doctor_id, appointment_datetime, status, reason, created_at) "
                   + "VALUES(?, ?, ?, ?, ?, NOW())";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, appt.getPatientId());
            stmt.setInt(2, appt.getDoctorId());
            stmt.setString(3, appt.getAppointmentDateTime());
            stmt.setString(4, appt.getStatus());
            stmt.setString(5, appt.getReason());

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }


    // ------------------------------------------------------
    // GET APPOINTMENTS FOR DOCTOR
    // ------------------------------------------------------
    public List<Appointment> getAppointmentsForDoctor(int doctorId) {

        List<Appointment> list = new ArrayList<>();

        String sql = "SELECT * FROM appointments WHERE doctor_id = ? ORDER BY appointment_datetime ASC";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, doctorId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Appointment appt = new Appointment();
                appt.setId(rs.getInt("id"));
                appt.setPatientId(rs.getInt("patient_id"));
                appt.setDoctorId(rs.getInt("doctor_id"));
                appt.setAppointmentDateTime(rs.getString("appointment_datetime"));

                appt.setStatus(rs.getString("status"));
                appt.setReason(rs.getString("reason"));

                list.add(appt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }


    // ------------------------------------------------------
    // GET APPOINTMENTS FOR PATIENT
    // ------------------------------------------------------
    public List<Appointment> getAppointmentsForPatient(int patientId) {

        List<Appointment> list = new ArrayList<>();

        String sql = "SELECT * FROM appointments WHERE patient_id = ? ORDER BY appointment_datetime ASC";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, patientId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Appointment appt = new Appointment();
                appt.setId(rs.getInt("id"));
                appt.setPatientId(rs.getInt("patient_id"));
                appt.setDoctorId(rs.getInt("doctor_id"));
                appt.setAppointmentDateTime(rs.getString("appointment_datetime"));
                appt.setStatus(rs.getString("status"));
                appt.setReason(rs.getString("reason"));

                list.add(appt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}


    