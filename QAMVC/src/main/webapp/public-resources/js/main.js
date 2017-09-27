/**
 * 
 */
  jQuery(document).ready(function($) {
 
        $('#myCarousel').carousel({
                interval: 1000
        });
 
        //Handles the carousel thumbnails
        $('[id^=carousel-selector-]').click(function () {
        var id_selector = $(this).attr("id");
        try {
            var id = /-(\d+)$/.exec(id_selector)[1];
            console.log(id_selector, id);
            jQuery('#myCarousel').carousel(parseInt(id));
           
        } catch (e) {
            console.log('Regex failed!', e);
        }
    });
        // When the carousel slides, auto update the text
        $('#myCarousel').on('slid.bs.carousel', function (e) {
                 var id = $('.item.active').data('slide-number');
                $('#carousel-text').html($('#slide-content-'+id).html());
        });
        
        
        $('#carousel-text').html($('#slide-content-0').html());
});
  
  // javascript for the confirmation page
  jQuery(document).ready(function($) {
	    jQuery('.modal').modal('show').on('hide.bs.modal', function(e){
	      e.preventDefault();
	    });
	    jQuery('.modal').modal('hide')
	});
  
  
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0px";
}

