<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Complete Computer Science Hall of Fame</title>
<!-- Link the bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
<!-- Or in this case, a variation theme... -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/slate/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<!-- With boostrap, pages should generally be surrounded with a container element. -->
	<main class="container">
		<h1 class="page-header mt-4 mb-4 ml-2">Computer Science Hall Of Fame</h1>
		<div class="card">
			<img style="height: 100px;" class="card-img-top" src="https://www.carthage.edu/live/image/gid/46/3711_computerscience-banner-final.rev.1399991027.jpg" alt="Card image cap">
  			<div class="card-header">
    			Complete List
  			</div>
  			<div class="card-body">
    			<table class="table">
					<thead>
						<tr>
							<th style="width: 20%">Name</th><th style="width: 70%">Innovation</th><th style="width: 10%">Year</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="coolPerson" items="${hof}">
							<tr>
								<td>${coolPerson.firstName} ${coolPerson.lastName}</td><td>${coolPerson.innovation}</td><td>${coolPerson.year}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
    			<a href="/" class="btn btn-primary">See Abbreviated List</a>
  			</div>
		</div>

	</main>
</body>
</html>