package dao;

import model.UserData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDataDao {

    private final Connection connection = ConnectionProvider.getConnection();
    private final static String SAVE_USER_FORM_1 = "INSERT INTO userdata (name, dob, email, fatherName, motherName, gender, nationality, streetAddress, city, country, telephoneHome, telephoneMobile) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    private final static String SAVE_USER_FORM_2 = "UPDATE userdata set HSCInstitutionName=?, HSCBoardName=?,HSCScore=?, SSCInstitutionName=?, SSCBoardName=?, SSCScore=?, currentlyPursuing=?, currentEducationalInstitutionName=?, overallPercentage = ? , currentBacklogs =? where email=?";

    private final static String SAVE_USER_FORM_3_FILES = "UPDATE userdata set passportPhotoPath =?, HSCMarkSheetPath=?, SSCMarkSheetPath=?, allSemesterMarkSheetsPath=? where email=?";

    public void registerUserForm1(UserData userData) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER_FORM_1);
            preparedStatement.setString(1, userData.getName());
            preparedStatement.setString(2, userData.getDob().toString());
            preparedStatement.setString(3, userData.getEmail());
            preparedStatement.setString(4, userData.getFatherName());
            preparedStatement.setString(5, userData.getMotherName());
            preparedStatement.setString(6, userData.getGender());
            preparedStatement.setString(7, userData.getNationality());
            preparedStatement.setString(8, userData.getStreetAddress());
            preparedStatement.setString(9, userData.getCity());
            preparedStatement.setString(10, userData.getCountry());
            preparedStatement.setString(11, userData.getTelephoneHome());
            preparedStatement.setString(12, userData.getTelephoneMobile());
            int i = preparedStatement.executeUpdate();
            System.out.println("In Register form 1 method result : " + i + " , data uploaded is : " + userData);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void registerUserForm2(UserData userData) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER_FORM_2);
            preparedStatement.setString(1, userData.getHSCInstitutionName());
            preparedStatement.setString(2, userData.getHSCBoardName());
            preparedStatement.setString(3, userData.getHSCScore());
            preparedStatement.setString(4, userData.getSSCInstitutionName());
            preparedStatement.setString(5, userData.getSSCBoardName());
            preparedStatement.setString(6, userData.getSSCScore());
            preparedStatement.setString(7, userData.getCurrentlyPursuing());
            preparedStatement.setString(8, userData.getCurrentEducationalInstitutionName());
            preparedStatement.setString(9, userData.getOverallPercentage());
            preparedStatement.setString(10, userData.getCurrentBacklogs());

            preparedStatement.setString(11, userData.getEmail());
            int i = preparedStatement.executeUpdate();
            System.out.println("In Register form 2 method result : " + i + " , data uploaded is : " + userData);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //    Files Handler Saves File Path to Database
    public void registerUserForm3(List<String> fileNames, String email) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionProvider.getConnection().prepareStatement(SAVE_USER_FORM_3_FILES);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i<= fileNames.size();i++){
            System.out.println(fileNames.get(i-1));
            try {
                preparedStatement.setString(i, fileNames.get(i-1));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            preparedStatement.setString(5, email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
