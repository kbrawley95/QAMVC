<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="common/header.jsp"%>

<body>
<main class="container-fluid">

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

    <div id="login-overlay" class="modal-dialog">
      <div class="modal-content">
          <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">�</span><span class="sr-only">Close</span></button>
              <h4 class="modal-title" id="myModalLabel">Login to QA Cinemas</h4>
          </div>
          <div class="modal-body">
              <div class="row">
                  <div class="col-xs-6">
                      <div class="well">
                          <form>
                              <div class="form-group">
                                  <label for="username" class="control-label">Username</label>
                                  <input type="email" class="form-control" id="username" name="username" value="" required title="Please enter you username" placeholder="example@gmail.com">
                                  <span class="help-block"></span>
                              </div>
                              <div class="form-group">
                                  <label for="password" class="control-label">Password</label>
                                  <input type="password" class="form-control" id="password" name="password" value="" required title="Please enter your password">
                                  <span class="help-block"></span>
                              </div>
                     
                              <div class="checkbox">
                                  <label>
                                      <input type="checkbox" name="remember" id="remember"> Remember login
                                  </label>
                                  <p class="help-block">(if this is a private computer)</p>
                              </div>
                              <input type="submit" class="btn btn-success btn-block" value="Login">
                              <a href="/forgot/" class="btn btn-default btn-block">Help to login</a>
                          </form>
                      </div>
                  </div>
                  <div class="col-xs-6">
                      <p class="lead">Register now for <span class="text-success">FREE</span></p>
                      <ul class="list-unstyled" style="line-height: 2">
                          <li><span class="fa fa-check text-success"></span> See all your orders</li>
                          <li><span class="fa fa-check text-success"></span> 1 day delivery</li>
                          <li><span class="fa fa-check text-success"></span> Easy checkout</li>
                          <li><span class="fa fa-check text-success"></span> 100% authentic merchandise</li>
                          <li><a href="/read-more/"><u>Read more</u></a></li>
                          <br>
                      </ul>
                      <p><a href="/new-customer/" class="btn btn-info btn-block">Yes please, register now!</a></p>
                  </div>
              </div>
          </div>
      </div>
  </div>
  
  </main>
	<%@ include file="common/scripts.jsp"%>
  </body>
<%@ include file="common/footer.jsp"%>