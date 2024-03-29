<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
	<head>
		<title>User Information and Form</title>

		<!--JQUERY-->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script
			src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"></script>

		<!-- Los iconos tipo Solid de Fontawesome-->
		<link rel="stylesheet"
			href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
		<script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
		<!-- Nuestro css-->
		<link rel="stylesheet" type="text/css" href="static/css/user-form.css"
			th:href="@{/css/user-form.css}">
		<!-- DATA TABLE -->
		<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
		<script
			src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
		<link rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css">
		<link rel="stylesheet"
			href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
		<script type="text/javascript">
	    $(document).ready(function() {
	        //Asegurate que el id que le diste a la tabla sea igual al texto despues del simbolo #
	        $('#userList').DataTable();
	    } );
	</script>
	</head>
	<body>
		<section id="forms" class="contact">
			<div class="container" data-aos="fade-up">

				<div class="section-title contact-info">
					<h2>Comencemos </h2>
				</div>

				<div class="row">

					<div class="col-lg-12 mt-5 mt-lg-0 d-flex align-items-stretch">
						<div class="container">
							<div class="mx-auto col-sm-8 main-section" id="myTab" role="tablist">
								<ul class="nav nav-tabs justify-content-end">
									<li class="nav-item">
										<a class="nav-link active" id="list-tab" data-toggle="tab"
											href="#list" role="tab" aria-controls="list" aria-selected="false">Lista</a>
									</li>
									<li class="nav-item">
										<a class="nav-link" id="form-tab" data-toggle="tab" href="#form"
											role="tab" aria-controls="form" aria-selected="true">Formulario</a>
									</li>
								</ul>
								<div class="tab-content" id="myTabContent">
									<div class="tab-pane fade show active" id="list" role="tabpanel"
										aria-labelledby="list-tab">
										<div class="card">
											<div class="card-header bg-success">
												<h4>Lista de Usuarios</h4>
											</div>
											<div class="card-body">
												<div class="table-responsive">
													<table id="userList" class="table table-bordered table-hover
														table-striped">
														<thead class="thead-light">
															<tr>
																<th scope="col">#</th>
																<th scope="col">Nombre</th>
																<th scope="col">Apellido</th>
																<th scope="col">usuario</th>
																<th scope="col">correo</th>
																<th></th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<th scope="row">1</th>
																<td>Marlon</td>
																<td>Ruiz</td>
																<td>c.r.username</td>
																<td>c.r.username@blog.com</td>
																<td>
																	<a href="#"><i class="fas fa-edit"></i></a> | <a href="#"><i
																			class="fas fa-user-times"></i></a>
																</td>
															</tr>
															<tr>
																<th scope="row">1</th>
																<td>kakaroto</td>
																<td>Ruiz</td>
																<td>c.r.username</td>
																<td>c.r.username@blog.com</td>
																<td>
																	<a href="#"><i class="fas fa-edit"></i></a> | <a href="#"><i
																			class="fas fa-user-times"></i></a>
																</td>
															</tr>
															<tr>
																<th scope="row">1</th>
																<td>Gohan</td>
																<td>Ruiz</td>
																<td>c.r.username</td>
																<td>c.r.username@blog.com</td>
																<td>
																	<a href="#"><i class="fas fa-edit"></i></a> | <a href="#"><i
																			class="fas fa-user-times"></i></a>
																</td>
															</tr>
														</tbody>
													</table>
												</div>

											</div>
										</div>
									</div>
									<div class="tab-pane fade" id="form" role="tabpanel"
										aria-labelledby="form-tab">
										<div class="card">
											<div class="card-header">
												<h4>Añadir usuario</h4>
											</div>
											<div class="card-body">
												<form class="form" role="form" autocomplete="off">
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Nombre
														</label>
														<div class="col-lg-9">
															<input class="form-control" type="text">
														</div>
													</div>
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Apellido</label>
														<div class="col-lg-9">
															<input class="form-control" type="text">
														</div>
													</div>
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Correo</label>
														<div class="col-lg-9">
															<input class="form-control" type="email">
														</div>
													</div>
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Usuario</label>
														<div class="col-lg-9">
															<input class="form-control" type="text">
														</div>
													</div>
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Contraseña</label>
														<div class="col-lg-9">
															<input class="form-control" type="password">
														</div>
													</div>
													<div class="form-group row">
														<label class="col-lg-3 col-form-label form-control-label">Confirmar</label>
														<div class="col-lg-9">
															<input class="form-control" type="password">
														</div>
													</div>
													<div class="form-group row">
														<div class="col-lg-12 text-center">
															<input type="reset" class="btn btn-secondary" value="Cancel">
															<input type="button" class="btn btn-primary"
																value="Save Changes">
														</div>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>


				</div>

			</div>
		</section><!-- End Section -->
	</body>
</html>