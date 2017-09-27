<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="common/header.jsp"%>

<body>
	<main class="container-fluid"> <%@ include
		file="common/sidebar.jsp"%>

	<div id="main_area">
		<!-- Slider ------------------------------------------------->
		<div class="row">
			<div class="col-sm-6" id="slider-thumbs">
				<!-- Bottom switcher of slider -->
				<ul class="hide-bullets">

					<spring:url value="/resources/public-resources/imgs/"
						var="imagesDir" />
					<c:forEach items="${products}" var="product" varStatus="inner">
						<li class="col-sm-3"><a class="thumbnail"
							id="carousel-selector-${inner.index+1}"> <img
								src="${imagesDir}${product.getName()}.jpg"
								style="width: 75px; height: 75px;"> £${product.getPrice()}
						</a></li>
					</c:forEach>
				</ul>
			</div>

			<div class="col-sm-6">
				<div class="col-xs-12" id="slider">
					<!-- Top part of the slider -->
					<div class="row">
						<div class="col-sm-12" id="carousel-bounding-box">
							<div class="carousel slide" id="myCarousel">
								<!-- Carousel items -->
								<div class="carousel-inner">
									<div class="active item" data-slide-number="0">
										<img src="http://placehold.it/300x300&text=WELCOME!">
										<div class="container-fluid" id="slide-content-0" style="display: none;">
										
										</div>
									</div>

									<c:forEach items="${products}" var="product" varStatus="inner">
										<div class="item" data-slide-number="${inner.index+1}">
										
											<img src="${imagesDir}${product.getName()}.jpg"
												style="width: 580px; height: 580px;">
											<div id="slide-content" style="display: none;">
												<div id="slide-content-${inner.index+1}">
													<h2>${product.getName()}</h2>
													<p>
													<h2>${product.getDescription()}</h2>
													<p class="sub-text">
													<h3>
														<strong>£${product.getPrice()}</strong>
													</h3>
												</div>
											</div>
										</div>
									</c:forEach>

									<div class="container-fluid" id="carousel-text" /></div>

									<!-- Carousel nav ---------------------------------------------->
									<a class="left carousel-control" href="#myCarousel"
										role="button" data-slide="prev"> <span
										class="glyphicon glyphicon-chevron-left"></span>
									</a> <a class="right carousel-control" href="#myCarousel"
										role="button" data-slide="next"> <span
										class="glyphicon glyphicon-chevron-right"></span>
									</a>
								</div>
							</div>
						</div >
					</div>
				</div>
				<!--/Slider----------------------->
			</div>

		</div>
	</main>

	<%@ include file="common/scripts.jsp"%>
</body>
<%@ include file="common/footer.jsp"%>