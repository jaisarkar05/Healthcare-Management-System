<html>
<head>
    <title>Patient Appointment History</title>
</head>
<body>

<h2>Your Appointment History</h2>

<table border="1" cellpadding="8">
<tr>
    <th>ID</th>
    <th>Doctor ID</th>
    <th>Date &amp; Time</th>
    <th>Status</th>
    <th>Reason</th>
</tr>

<%
    java.util.List<com.healthcare.model.Appointment> list =
        (java.util.List<com.healthcare.model.Appointment>) request.getAttribute("appointments");

    if (list != null && !list.isEmpty()) {
        for (com.healthcare.model.Appointment a : list) {
%>
<tr>
    <td><%= a.getId() %></td>
    <td><%= a.getDoctorId() %></td>
    <td><%= a.getAppointmentDateTime() %></td>
    <td><%= a.getStatus() %></td>
    <td><%= a.getReason() %></td>
</tr>
<%
        }
    } else {
%>
<tr><td colspan="5">No Appointments Found</td></tr>
<%
    }
%>

</table>

</body>
</html>
