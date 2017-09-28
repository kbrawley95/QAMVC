<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="common/header.jsp"%>

<body>
<main class="container-fluid">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td data-th="Product">
								<div class="row">
								<spring:url value="/resources/public-resources/imgs/"
						var="imagesDir" />
									<div class="col-sm-2 hidden-xs"><img src="${imagesDir}batmantshirt.jpg" class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">Batman T-Shirt (Signed By Ben Affleck)</h4>
										<p>Show your love for the Caped Crusader in this Batman Distressed Logo Men's T-Shirt. It is made with comfortable cotton fabric and features the superhero's iconic symbol on the front. This Batman T-shirt is an ideal choice for the gym and everyday casual wear.
										</p>
									</div>
								</div>
							</td>
							<td data-th="Price">£30.50</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">£30.50</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total 10.99</strong></td>
						</tr>
						<tr>
							<td><a href="/home" class=" btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total £10.99</strong></td>
							<td><a href="/checkout" class="btn btn-success btn-block">Checkout <i class="angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
</div>
</main>
	<%@ include file="common/scripts.jsp"%>
  </body>
<%@ include file="common/footer.jsp"%>