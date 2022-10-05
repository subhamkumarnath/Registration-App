<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Register - 2</title>
</head>
<body>
    <div class="main">
        <h1>Register Your Self - 2</h1>
        <form action="register2" method="post">
            <input type="hidden" name="email" value="<%= session.getAttribute("email") %>">
            <div class="form-content">
                <label for="HSCInstitutionName">HSC Institution Name</label>
                <input type="text" name="HSCInstitutionName" id="HSCInstitutionName" required>
            </div>
            <div class="form-content">
                <label for="HSCBoardName">HSC Board Name</label>
                <input type="HSCBoardName" name="HSCBoardName" id="HSCBoardName" required>
            </div>
            <div class="form-content">
                <label for="HSCScore">HSC Score</label>
                <input type="text" name="HSCScore" id="HSCScore" required>
            </div>
            <div class="form-content">
                <label for="SSCInstitutionName">SSC Institution Name</label>
                <input type="text" name="SSCInstitutionName" id="SSCInstitutionName" required>
            </div>
            <div class="form-content">
                <label for="text">SSC Board Name</label>
                <input type="SSCBoardName" name="SSCBoardName" id="SSCBoardName" required>
            </div>
            <div class="form-content">
                <label for="SSCScore">SSC Score</label>
                <input type="text" name="SSCScore" id="SSCScore" required>
            </div>
            <div class="form-content">
                <label for="currentlyPursuing">Currently Pursuing</label>
                <input type="text" name="currentlyPursuing" id="currentlyPursuing" required>
            </div>
            <div class="form-content">
                <label for="currentEducationInstitutionName">Current Education Institution Name</label>
                <input type="text" name="currentEducationInstitutionName" id="currentEducationInstitutionName" required>
            </div>
            <div class="form-content">
                <label for="overallPercentage">Overral Percentage</label>
                <input type="text" name="overallPercentage" id="overallPercentage" required>
            </div>
            <div class="form-content">
                <label for="currentBackLogs">Current BackLogs</label>
                <input type="text" name="currentBackLogs" id="currentBackLogs" required>
            </div>
            <div>
                <input type="submit" class="btn" value="Save and Next">
            </div>
        </form>
    </div>
</body>
</html>