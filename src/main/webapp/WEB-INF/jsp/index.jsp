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
          <a class="navbar-brand" href="#"><img src="images/logo.png" width="100" height="70" alt=""></a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
            aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">

            </ul>
            <div class="navbar-nav">
              <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </div>

            <div class="navbar-nav">
              <a class="nav-item nav-link" data-toggle="modal" data-target="#loginModal" href="#">Login</a>
            </div>
            <div class="navbar-nav">
              <a class="nav-item nav-link" data-toggle="modal" data-target="#registerModal" href="#">Register</a>
            </div>

            <div class="navbar-nav">
              <a class="nav-link" href="#">About <span class="sr-only">(current)</span></a>
            </div>
          </div>
        </nav>



        <!-- Login Modal -->
        <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
          aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Login</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form action="${pageContext.request.contextPath}/patient">
                  <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd">
                  </div>
                  <button type="submit" class="btn btn-primary">Submit</button>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>

              </div>
            </div>
          </div>
        </div>


        <!-- Register Modal -->
        <div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
          aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Register</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form>
                  <div class="form-group">
                    <label for="email2">Email address:</label>
                    <input type="email" class="form-control" id="email2">
                  </div>
                  <div class="form-group">
                    <label for="pwd2">Password:</label>
                    <input type="password" class="form-control" id="pwd2">
                  </div>
                  <div class="form-group">
                    <label for="cpwd">Confirm Password:</label>
                    <input type="password" class="form-control" id="cpwd">
                  </div>
                  <button type="submit" class="btn btn-primary">Submit</button>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
              </div>
            </div>
          </div>
        </div>



        <!-- Main -->
        <div class="hero-wrap main-section">
          <div class="overlay">
            <div class="container pt-4 ">
              <div class="album py-5 bg-light no-background">
                <div class="container">
                  <div class="row">
                    <div class="col-4">
                      <img src="https://via.placeholder.com/100" class="rounded-circle" alt="Responsive image" style="width: 55%">
                    </div>
                    <div class="col">
                      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Inventore maxime vitae sed neque
                        nihil,
                        amet veniam, nam placeat voluptatem impedit molestiae corporis? Quae dolorum porro autem
                        tempora
                        ducimus deserunt consequatur.</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="container pt-4 pb-4">
              <div class="album py-5 bg-light no-background">
                <div class="container ">
                  <div class="row">
                    <div class="pt-4 col">
                      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti numquam unde non, ratione
                        odio
                        nostrum iste quaerat delectus, quidem error ullam perspiciatis tempora laboriosam cupiditate
                        dolorum
                        consectetur quas quia ea!</p>
                    </div>
                    <div class="col-4 pb-4">
                      <img src="https://via.placeholder.com/100" class="rounded-circle" alt="Responsive image" style="width: 55%">
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>












        <!-- Footer -->
        <footer class="page-footer font-small bg-dark text-muted">

          <!-- Copyright -->
          <div class="footer-copyright text-center py-3">© 2019 Copyright by: <strong>EmergencyQ</strong>
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