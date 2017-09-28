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
									<div class="col-sm-2 hidden-xs"><img src="${imagesDir}${product.getName()}.jpg" class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">${product.getName()}</h4>
										<p>${product.getDescription()}
										</p>
									</div>
								</div>
							</td>
							<td data-th="Price">£${product.getPrice()}</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value="1">
							</td>
							<td data-th="Subtotal" class="text-center">£${product.getPrice()}</td>
							<td class="actions" data-th="">
								<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Sub-Total: ${product.getPrice()}</strong></td>
						</tr>
						<tr>
							<td><a href="/home" class=" btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Sub-Total: £${product.getPrice()}</strong></td>
							
							<form action="/checkout" action="post" >
								<td><button class="btn btn-success btn-block" value="${product.getId()}" name="checkoutButton"class="angle-right">Checkout</button></td>
							</form>
						</tr>
					</tfoot>
				</table>
</div>
</main>
	<%@ include file="common/scripts.jsp"%>
  </body>
<%@ include file="common/footer.jsp"%>