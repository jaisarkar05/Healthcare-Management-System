package com.healthcare.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.healthcare.util.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testdb")
public class TestDBServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        try (Connection conn = DBUtil.getConnection()) {

            if (conn != null) {
                out.println("SUCCESS → Database Connected Successfully!");
            } else {
                out.println("FAILED → Could not connect to database.");
            }

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
