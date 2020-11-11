<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="el">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <title>Λεπτομέρειες προϊοντος</title>
</head>
<body>

	<div class="container-sm">
		<div class="row">
			<div class="col-4" style="margin:auto;text-align:center;">
				<h2>Barcode: <%out.print(request.getParameter("barcode"));%><br></h2>
				<h2>Όνομα: <%out.print(request.getParameter("name"));%><br></h2>
				<h2>Χρώμα: <%out.print(request.getParameter("color"));%><br></h2>
				<h2>Περιγραφή: <%out.print(request.getParameter("description"));%><br></h2>
			</div>
		</div>
	</div>
	
	
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>