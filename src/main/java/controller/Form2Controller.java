package controller;

import dao.UserDataDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.UserData;

import java.io.IOException;

@WebServlet("/register2")
public class Form2Controller extends HttpServlet {

    private final UserDataDao userDataDao = new UserDataDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserData userData = new UserData();
        userData.setHSCInstitutionName(request.getParameter("HSCInstitutionName"));
        userData.setHSCBoardName(request.getParameter("HSCBoardName"));
        userData.setHSCScore(request.getParameter("HSCScore"));
        userData.setSSCInstitutionName(request.getParameter("SSCInstitutionName"));
        userData.setSSCBoardName(request.getParameter("SSCBoardName"));
        userData.setSSCScore(request.getParameter("SSCScore"));
        userData.setCurrentlyPursuing(request.getParameter("currentlyPursuing"));
        userData.setCurrentEducationalInstitutionName(request.getParameter("currentEducationInstitutionName"));
        userData.setOverallPercentage(request.getParameter("overallPercentage"));
        userData.setCurrentBacklogs(request.getParameter("currentBackLogs"));
        userData.setEmail(request.getParameter("email"));


        System.out.println("Inside Form2 Controller with data " + userData);

        userDataDao.registerUserForm2(userData);
        request.getSession().setAttribute("email", userData.getEmail());
        response.sendRedirect("form3.jsp");

    }
}
