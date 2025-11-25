package com.healthcare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.healthcare.model.User;
import com.healthcare.util.DBUtil;

public class UserDAO {

    // ----------------------
    // LOGIN FUNCTION
    // ----------------------
    public User login(String email, String password) {
        User user = null;

        String sql = "SELECT * FROM users WHERE email = ? AND password_hash = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password_hash"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    // ----------------------
    // FIND USER BY EMAIL
    // ----------------------
    public User getUserByEmail(String email) {
        User user = null;
        String sql = "SELECT * FROM users WHERE email = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password_hash"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    // ----------------------
    // REGISTER / ADD USER
    // ----------------------
    public boolean register(User user) {
        boolean inserted = false;

        String sql = "INSERT INTO users(name, email, password_hash, role) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());  
            stmt.setString(4, user.getRole());

            int rows = stmt.executeUpdate();

            inserted = rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return inserted;
    }

    // ----------------------
    // FIND USER BY ID
    // ----------------------
    public User getUserById(int id) {
        User user = null;
        String sql = "SELECT * FROM users WHERE id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password_hash"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
