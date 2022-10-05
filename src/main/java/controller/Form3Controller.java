package controller;


import dao.UserDataDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@WebServlet("/register3")
public class Form3Controller extends HttpServlet {
    private final UserDataDao userDataDao = new UserDataDao();

//    Files Controller
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        Collection<Part> parts = request.getParts();
        String imagePath = "C:\\files";
        File fileDir = new File(imagePath);
        List<String> fileNames = new ArrayList<>();
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }

        String imageName = null;
        String fileExt = null;
        String imageNameFinal =  null;
        String finalImagePath = null;

//        File 1
        Part part1 = request.getPart("passportPhotoPath");
        imageName = part1.getSubmittedFileName();
        System.out.println(imageName);
        fileExt = imageName.substring(imageName.length() - 3);
        imageNameFinal = new Date().getTime() + "1" + "." + fileExt;
        finalImagePath = imagePath + "\\" + imageNameFinal;
        System.out.println(finalImagePath);
        fileNames.add(finalImagePath);
        try {
            part1.write(imagePath + "\\" + imageNameFinal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        File 2
        Part part2 = request.getPart("HSCMarkSheetPath");
        imageName = part2.getSubmittedFileName();
        System.out.println(imageName);
        fileExt = imageName.substring(imageName.length() - 3);
        imageNameFinal = new Date().getTime() + "1" + "." + fileExt;
        finalImagePath = imagePath + "\\" + imageNameFinal;
        System.out.println(finalImagePath);
        fileNames.add(finalImagePath);
        try {
            part2.write(imagePath + "\\" + imageNameFinal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        File 3
        Part part3 = request.getPart("SSCMarkSheetPath");
        imageName = part3.getSubmittedFileName();
        System.out.println(imageName);
        fileExt = imageName.substring(imageName.length() - 3);
        imageNameFinal = new Date().getTime() + "1" + "." + fileExt;
        finalImagePath = imagePath + "\\" + imageNameFinal;
        System.out.println(finalImagePath);
        fileNames.add(finalImagePath);
        try {
            part3.write(imagePath + "\\" + imageNameFinal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


//        File 4
        Part part4 = request.getPart("allSemesterMarkSheetsPath");
        imageName = part4.getSubmittedFileName();
        System.out.println(imageName);
        fileExt = imageName.substring(imageName.length() - 3);
        imageNameFinal = new Date().getTime() + "1" + "." + fileExt;
        finalImagePath = imagePath + "\\" + imageNameFinal;
        System.out.println(finalImagePath);
        fileNames.add(finalImagePath);
        try {
            part4.write(imagePath + "\\" + imageNameFinal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        userDataDao.registerUserForm3(fileNames, email);
        response.getWriter().print("<h1>Registration Success !!!</h1>");
    }
}
