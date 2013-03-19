<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="css/flat-ui.css" rel="stylesheet">
    <link rel="shortcut icon" href="images/favicon.ico">

    <!-- Loading Reset -->
    <link href="css/reset.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
    <![endif]-->
  </head>
  <body>



    <div class="login-screen">
      <div class="login-icon">
        <img src="http://www.ufal.edu.br/unidadeacademica/ic/configuracao/ic.png" alt="Welcome to Resource Manager">
        <h4>Welcome to <small>Resource Manager App</small></h4>
      </div>
      <form class="login-form" action="" method="post">
        <div class="control-group">
          <input name="login" class="login-field" value="" placeholder="Enter your name" id="login-name" type="text">
          <label class="login-field-icon fui-man-16" for="login-name"></label>
        </div>

        <div class="control-group">
          <input name="password" class="login-field" value="" placeholder="Password" id="login-pass" type="password">
          <label class="login-field-icon fui-lock-16" for="login-pass"></label>
        </div>
        <button class="btn btn-primary btn-large btn-block" type="submit">Sign in</button>
        <a class="login-link" href="#">Lost your password?</a>    
      </form>
    </div>




    <!-- Load JS here for greater good =============================-->
    <script src="js/jquery-1.8.2.min.js"></script>
    <script src="js/jquery-ui-1.10.0.custom.min.js"></script>
    <script src="js/jquery.dropkick-1.0.0.js"></script>
    <script src="js/custom_checkbox_and_radio.js"></script>
    <script src="js/custom_radio.js"></script>
    <script src="js/jquery.tagsinput.js"></script>
    <script src="js/bootstrap-tooltip.js"></script>
    <script src="js/jquery.placeholder.js"></script>
    <script src="http://vjs.zencdn.net/c/video.js"></script>
    <script src="js/application.js"></script>
    <!--[if lt IE 8]>
      <script src="js/icon-font-ie7.js"></script>
      <script src="js/icon-font-ie7-24.js"></script>
    <![endif]-->
  </body>
</html>

