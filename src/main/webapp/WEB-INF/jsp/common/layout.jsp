<!DOCTYPE html>
<html lang="en">
    <head>
        <title>${param.title}</title>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Convenience web application for technical interviews">
        <meta name="author" content="Jorge Herrera">
        
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/bootstrap-responsive.css" rel="stylesheet">
    </head>
	<body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="${pageContext.request.contextPath}/">4th Interview</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
        </div>
        
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    ${param.content}
                </div>
            </div>
            
            <hr/>
            <footer>
                <p>&copy; Jorge Herrera 2012</p>
            </footer>
        </div>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.24/jquery-ui.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
        ${param.javascript}
    </body>
</html>