/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-26 14:27:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/Views/common/sidebar.jsp", Long.valueOf(1506426896089L));
    _jspx_dependants.put("/WEB-INF/Views/common/header.jsp", Long.valueOf(1506431835386L));
    _jspx_dependants.put("/WEB-INF/Views/common/footer.jsp", Long.valueOf(1506426896088L));
    _jspx_dependants.put("/WEB-INF/Views/common/scripts.jsp", Long.valueOf(1506426896089L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" \tintegrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom Main.css -->\r\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mainCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rel=\"stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <header>\r\n");
      out.write("  \t<div class=\"banner_area\">\r\n");
      out.write("  \t\t<a id=\"banner_1\"><img class=\"banner\" id=\"banner\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"\"></a>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<nav class=\"navbar navbar-fixed\">\r\n");
      out.write("\t  <div class=\"container-fluid\">\r\n");
      out.write("\t    <div class=\"navbar-header\">\r\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"#\">QA Cinemas</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t\t    <ul class=\"nav navbar-left\">\r\n");
      out.write("\t\t      <li class=\"nav-item\"><a href=\"/home\">Home</a></li>\r\n");
      out.write("\t\t      <li class=\"nav-item\"><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t      <li class=\"nav-item\"><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t      <li class=\"nav-item\"><a href=\"/cart\">Shopping Cart</a></li>\r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <hr/>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<main class=\"container-fluid\"> ");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div id=\"mySidenav\" class=\"sidebar\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("  <a href=\"#\">About</a>\r\n");
      out.write("  <a href=\"#\">Services</a>\r\n");
      out.write("  <a href=\"#\">Clients</a>\r\n");
      out.write("  <a href=\"#\">Contact</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776 &nbsp Menu</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t<div id=\"main_area\">\r\n");
      out.write("\t\t<!-- Slider ------------------------------------------------->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\" id=\"slider-thumbs\">\r\n");
      out.write("\t\t\t\t<!-- Bottom switcher of slider -->\r\n");
      out.write("\t\t\t\t<ul class=\"hide-bullets\">\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-0\"> <img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=zero\">\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-1\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=1\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-2\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=2\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-3\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=3\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-4\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=4\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-5\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=5\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-6\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=6\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-7\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=7\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-8\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=8\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-9\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=9\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-10\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=10\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-11\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=11\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-12\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=12\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-13\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=13\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-14\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=14\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"col-sm-3\"><a class=\"thumbnail\"\r\n");
      out.write("\t\t\t\t\t\tid=\"carousel-selector-15\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://placehold.it/150x150&text=15\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\" id=\"slider\">\r\n");
      out.write("\t\t\t\t\t<!-- Top part of the slider -->\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-12\" id=\"carousel-bounding-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel slide\" id=\"myCarousel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Carousel items -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"active item\" data-slide-number=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"11\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=11\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"14\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=14\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"item\" data-slide-number=\"15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"http://placehold.it/470x480&text=15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Carousel nav ---------------------------------------------->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"container-fluid\" id=\"carousel-text\"></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/Slider----------------------->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</main>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!-- Optional JavaScript -->\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \tintegrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" \tintegrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" \tintegrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mainJS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\tQA Cinemas &copy; 2017\r\n");
      out.write("\t</footer>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/Views/common/header.jsp(14,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/public-resources/css/main.css");
    // /WEB-INF/Views/common/header.jsp(14,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("mainCSS");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/Views/common/header.jsp(17,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/public-resources/imgs/logo.png");
    // /WEB-INF/Views/common/header.jsp(17,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("logo");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/Views/home.jsp(164,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/Views/home.jsp(164,5) '${products}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${products}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/Views/home.jsp(164,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("product");
    // /WEB-INF/Views/home.jsp(164,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("inner");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div id=\"slide-content\" style=\"display: none;\">\r\n");
          out.write("\t\t\t\t\t\t<div id=\"slide-content-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inner.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t<h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("\t\t\t\t\t\t\t<p><h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getDescription()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2></p>\r\n");
          out.write("\t\t\t\t\t\t\t<p class=\"sub-text\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<h3><strong>£");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</strong></h3>\r\n");
          out.write("\t\t\t\t\t\t\t</p>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/Views/common/scripts.jsp(17,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/resources/public-resources/js/main.js");
    // /WEB-INF/Views/common/scripts.jsp(17,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("mainJS");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }
}
