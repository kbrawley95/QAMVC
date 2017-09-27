<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="common/header.jsp"%>

<body>
	<div id="main_area">
	<link href="https://fonts.googleapis.com/css?family=Oswald:700|Patua+One|Roboto+Condensed:700" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<section id="contact" class="content-section text-center">
        <div class="contact-section">
            <div class="container">
              <h2>Contact Us</h2>
              <p>If you have any questions in relation to our services, please feel free to contact us on 0333 122 5952.</p>
              <p> However, if instead you would simply rather provide us with feedback, please fill out the form below.</p>
              <div class="row">
                <div class="col-md-8 col-md-offset-2">
                  <form class="form-horizontal">
                    <div class="form-group">
                      <label for="exampleInputName2">Name</label>
                      <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
                    </div>
                    <div class="form-group">
            "src/main/java/com/qa/controller/HomeController.java"          <label for="exampleInputEmail2">Email</label>
                      <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
                    </div>
                    <div class="form-group ">
                      <label for="exampleInputText">Your Message</label>
                     <textarea  class="form-control" placeholder="Description"></textarea> 
                    </div>
                    <button type="submit" class="btn btn-default">Send Message</button>
                  </form>
                  
                  <br/>
                   <h3>Opening Hours</h3>
                   <p>Monday 8.30am - 11pm</p>
                   <p>Tuesday 8.30am - 11pm</p>
                   <p>Wednesday 8.30am - 11pm</p>
                   <p>Thursday 8.30am - 11pm</p>
                   <p>Friday 8.30am - 11pm</p>
                   <p>Saturday 8.30am - 12am</p>
                   <p>Sunday 8.30am - 11pm</p>
                   
                   <br/>
                   <h3>Our Location</h3>
                   <p>Portland House</p>
                   <p>17 Renfield Street</p>
                   <p>Glasgow</p>
                   <p>Glasgow Metropolitan Area</p>
                   <p>G2 5AH</p>
                   </div>
            </div>
              
                  <h3>Our Social Sites</h3>
                  <ul class="list-inline banner-social-buttons">
                    <li><a href="www.qa.com" class="btn btn-default btn-lg"><i class="fa fa-twitter"> <span class="network-name">Twitter</span></i></a></li>
                    <li><a href="www.qa.com" class="btn btn-default btn-lg"><i class="fa fa-facebook"> <span class="network-name">Facebook</span></i></a></li>
                    <li><a href="www.qa.com" class="btn btn-default btn-lg"><i class="fa fa-youtube-play"> <span class="network-name">Youtube</span></i></a></li>
                  </ul>
        </div>
      </section>
	
	</main>

	<%@ include file="common/scripts.jsp"%>
</body>
<%@ include file="common/footer.jsp"%>