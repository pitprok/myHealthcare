<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>EmergencyQ</title>
    <link rel="icon" type="image/png" href="images/favicon.png" />

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
</head>

<body>
    <div class="slider">
        <div class="load">
        </div>
        <div class="content">
            <div class="principal">
                <!-- NAVIGATION BAR -->
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <a class="navbar-brand" href="logo.png"><img src="logo.png" width="100" height="70" alt=""></a>
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
                    <!-- <form id="order-form" class="">
            <div id="before-order" class="container fixed-top d-flex justify-content-center">
                <button id="before-order-btn" type="submit" class="btn btn-outline-secondary">Place Order</button>
            </div>
            <c:forEach items="${products}" var="product">
                <div class="form-row align-items-center pt-3 pb-3">
                    <div class="form-group col-1">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox">
                        </div>
                    </div>
                    <p class="id d-none">${product.getId()}</p>
                    <p class="name col-3 mb-0">${product.getName()}</p>
                    <p class="descr col-4 mb-0">${product.getDescription()}</p>
                    <p class="price offset-1 col-2 mb-0">${product.getPrice()}&euro;</p>
                    <input class="col-1 form-control quantity" type="number" min="1">
                </div>

            </c:forEach>
        </form> -->



                    <table class="table table-bordered table-definition mb-5 pt-4">
                        <thead class="table-warning ">
                            <tr>
                                <th>Check</th>
                                <th>Title</th>
                                <th>Description</th>
                                <th>Criticality</th>
                                <th>Display</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${products}" var="product">
                                <tr>
                                    <td>
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                        </label>
                                    </td>
                                    <td>fdgdsfdsgfdsf</td>
                                    <td>September 14, 2013</td>
                                    <td>fdgdsfdsgfdsf</td>
                                    <td>September 14, 2013</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                       
                    </table>
                    <button class="btn btn-primary float-right">Go to QR code!</button>
                </main>

                <!-- Footer -->
                <footer class="page-footer font-small blue">

                    <!-- Copyright -->
                    <div class="footer-copyright text-center py-3 footeri">© 2018 Copyright:
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