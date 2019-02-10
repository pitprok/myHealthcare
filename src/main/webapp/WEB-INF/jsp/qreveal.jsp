<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>CareMe</title>
  <link rel="icon" type="image/png" href="favicon.ico" />

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
    <!--<link rel="stylesheet" type="text/css" media="screen" href="main.css" />-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/main.css">
</head>

<body>
    <div class="slider">
        <div class="load">
        </div>
        <div class="content">
            <div class="principal">
                <!-- NAVIGATION BAR -->
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <a class="navbar-brand" href="logo.png"><img src="logo.png"  height="70" alt=""></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav mr-auto">

                        </ul>
                        <div class="navbar-nav">
                            <a class="nav-link" href="#">About <span class="sr-only">(current)</span></a>
                        </div>
                        <div class="navbar-nav">
                            <a class="nav-item nav-link" id="logout" href="index.html">Logout</a>
                        </div>
                    </div>
                </nav>


                <main class="container">




                    <table class="table table-bordered table-definition mb-5 pt-4">
                        <thead class="table-warning ">
                            <tr>
                                <th>Title</th>
                                <th>Substance</th>
                                <th>Manifestation</th>
                                <th>Criticality</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${allergy}" var="item">
                                <tr>

                                    <td>Allergy</td>
                                    <td>${item.getSubstance()}</td>
                                    <td>${item.getManifestation()}</td>
                                    <td>${item.getCriticality()}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                       
                    </table>
                </main>

                <!-- Footer -->
                <footer class="page-footer font-small bg-dark text-muted footeri">

          <!-- Copyright -->
          <div class="footer-copyright text-center py-3">© 2019 Copyright by: <strong>CareMe</strong>
          </div>
          <!-- Copyright -->

        </footer>
                <!-- Footer -->

            </div>
        </div>
    </div>

 
  <!-- BOOTSTRAP POPPER -->
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
    crossorigin="anonymous"></script>
  <!-- BOOTSTRAP JS -->
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
    crossorigin="anonymous"></script>
  <!-- MY JS -->


  <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>



  <script src="main.js"></script>

</body>

</html>