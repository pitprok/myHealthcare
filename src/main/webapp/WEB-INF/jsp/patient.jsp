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
                <div class="container pt-5">
                    <div class="row justify-content-center">
                        <div class="col-4">


                            <form action="${pageContext.request.contextPath}/results">
                                <div class="form-group row">
                                    <label for="ips_id" class="col-sm-3 col-form-label">IPS id:</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="ips_id">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="tel" class="col-sm-3 col-form-label">Phone Number:</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" id="tel">
                                    </div>
                                </div>
                                </fieldset>
                                <div class="form-group row">

                                    <div class="col-sm-12">
                                        <div class="form-check">
                                            <input class="form-check-input" type="checkbox" id="check" required>
                                            <label class="form-check-label" for="gridCheck1">
                                                I agree to have access to my IPS data
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-10">
                                        <button type="submit" class="btn btn-primary">Search</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

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