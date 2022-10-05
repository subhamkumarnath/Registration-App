package controller;

import dao.UserDataDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserData;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/register1")
public class Form1Controller extends HttpServlet {
    private final UserDataDao userDataDao = new UserDataDao();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserData userData = new UserData();

        userData.setName(req.getParameter("name"));
        userData.setDob(LocalDate.parse(req.getParameter("dob")));
        userData.setEmail(req.getParameter("email"));
        userData.setFatherName(req.getParameter("fatherName"));
        userData.setMotherName(req.getParameter("motherName"));
        userData.setGender(req.getParameter("gender"));
        userData.setNationality(req.getParameter("nationality"));
        userData.setStreetAddress(req.getParameter("streetAddress"));
        userData.setCity(req.getParameter("city"));
        userData.setCountry(req.getParameter("country"));
        userData.setTelephoneHome(req.getParameter("telephoneHome"));
        userData.setTelephoneMobile(req.getParameter("telephoneMobile"));

        System.out.println("Inside Form1 Controller with data " + userData);

        req.getSession().setAttribute("email", userData.getEmail());
        userDataDao.registerUserForm1(userData);
        resp.sendRedirect("form2.jsp");

    }
}
