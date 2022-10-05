<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
      <title>Title</title>
      <link rel="stylesheet" href="style3.css">
    </head>

    <body>
      <div class="main">
        <h1>Upload Documents</h1>
        <form action="register3" method="post" enctype="multipart/form-data">
          <input type="hidden" name="email" value="<%= session.getAttribute("email") %>">
          <div class="form-content">
            <label for="passportPhotoPath">Passport Photo</label>
            <input class="f" type="file" name="passportPhotoPath" id="passportPhotoPath" required>
          </div>
          <div class="form-content">
            <label for="HSCMarkSheetPath">HSC Mark Sheet</label>
            <input class="f" type="file" name="HSCMarkSheetPath" id="HSCMarkSheetPath" required>
          </div>
          <div class="form-content">
            <label for="SSCMarkSheetPath">SSC Mark Sheet</label>
            <input class="f" type="file" name="SSCMarkSheetPath" id="SSCMarkSheetPath" required>
          </div>
          <div class="form-content">
            <label for="allSemesterMarkSheetsPath">All Semester Mark Sheets</label>
            <input class="f" type="file" name="allSemesterMarkSheetsPath" id="allSemesterMarkSheetsPath" required>
          </div>
          <div>
            <input type="submit" class="btn" value="Save">
        </div>
        </form>
      </div>
    </body>

    </html>