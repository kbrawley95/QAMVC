<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="common/header.jsp"%>

<body>
<main class="container-fluid">
<div class="container wrapper">
            <div class="row cart-head">
                <div class="container">
                <div class="row">
                    <p></p>
                </div>
                <div class="row">
                    <div style="display: table; margin: auto;">
                        <span class="step step_complete"> <a href="/cart" class="check-bc">Cart</a> <span class="step_line step_complete"> </span> <span class="step_line backline"> </span> </span>
                        <span class="step step_complete"> <a href="/checkout" class="check-bc">Checkout</a> <span class="step_line "> </span> <span class="step_line step_complete"> </span> </span>
                    </div>
                </div>
                <div class="row">
                    <p></p>
                </div>
                </div>
            </div>    
            <div class="row cart-body">
                <form class="form-horizontal" method="post" action="/confirmation">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6">
                    <!--REVIEW ORDER-->
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Review Order <div class="pull-right"></div>
                        </div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-sm-3 col-xs-3">
                                <spring:url value="/resources/public-resources/imgs/"
						var="imagesDir" />
                                    <img class="img-responsive" src="${imagesDir}${product.getName()}.jpg" />
                                </div>
                                <div class="col-sm-6 col-xs-6">
                                    <div class="col-xs-12">${product.getName()}</div>
                                    <div class="col-xs-12"><small>Quantity:<span>1</span></small></div>
                                </div>
                                <div class="col-sm-3 col-xs-3 text-right">
                                    <h6><span>£</span>${product.getPrice()}</h6>
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Subtotal</strong>
                                    <div class="pull-right"><span>£</span><span>${product.getPrice()}</span></div>
                                </div>
                                <div class="col-xs-12">
                                    <small>Shipping</small>
                                    <div class="pull-right"><span><c:out value="£3.00"/></span></div>
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Order Total</strong>
                                    <div class="pull-right"><span>£</span><span><fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${product.getPrice() + 3.00}"/></span></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--REVIEW ORDER END-->
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6">
                    <!--SHIPPING METHOD-->
                    <div class="panel panel-info">
                        <div class="panel-heading">Address</div>
                        <div class="panel-body">
                            <div class="form-group">
                                <div class="col-md-12">
                                    <h4>Shipping Address</h4>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-6 col-xs-12">
                                    <strong>First Name:</strong>
                                    <input type="text" name="first_name" class="form-control"  required/>
                                </div>
                                <div class="span1"></div>
                                <div class="col-md-6 col-xs-12">
                                    <strong>Surname:</strong>
                                    <input type="text" name="last_name" class="form-control"  required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Address:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="address" class="form-control"  required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>City:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="city" class="form-control"  required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Post Code:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="zip_code" class="form-control"  required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Phone Number:</strong></div>
                                <div class="col-md-12"><input type="text" name="phone_number" class="form-control"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Email Address:</strong></div>
                                <div class="col-md-12"><input type="text" name="email_address" class="form-control"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Billing Address:</strong></div>
                                <div class="col-md-12"><input type="text" name="email_address" class="form-control"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Billing Post Code:</strong></div>
                                <div class="col-md-12"><input type="text" name="email_address" class="form-control"  required/></div>
                            </div>
                            <div class="form-check">
  							<label class="form-check-label">
    							<input class="form-check-input" type="checkbox" >
    								Do you want your item gift wrapped?
  							</label>
</div>
                        </div>
                    </div>
                    <!--SHIPPING METHOD END-->
                    <!--CREDIT CART PAYMENT-->
                    <div class="panel panel-info">
                        <div class="panel-heading"><span><i class="glyphicon glyphicon-lock"></i></span> Secure Payment</div>
                        <div class="panel-body">
                     </div>
                          <div class="form-group">
                                <div class="col-md-12"><strong>Card Type:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_number"  required/></div>
                            </div>
                          <div class="form-group">
                                <div class="col-md-12"><strong>Card Name:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_number"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Card Number:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_number"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Card CVV:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_code"  required/></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <strong>Expiration Date</strong>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="form-group">
                                <div class="col-md-12"><strong>Month:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_code"  required/></div>
                            </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="form-group">
                                <div class="col-md-12"><strong>Year:</strong></div>
                                <div class="col-md-12"><input type="text" class="form-control" name="car_code"  required/></div>
                            </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <span>Pay secure using your credit card.</span>
                                </div>
                                <div class="col-md-12">
                                    <ul class="cards">
                                        <li class="visa hand">Visa</li>
                                        <li class="mastercard hand">MasterCard</li>
                                        <li class="amex hand">Amex</li>
                                    </ul>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <td><input type="submit"" class="btn btn-success btn-block" value="Place order"></td>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--CREDIT CART PAYMENT END-->
                </div>
                
                </form>
            </div>
            <div class="row cart-footer">
        
            </div>
    </div>
</main>
	<%@ include file="common/scripts.jsp"%>
  </body>
<%@ include file="common/footer.jsp"%>