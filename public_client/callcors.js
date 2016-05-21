$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8084/flags/api/countries"
    }).then(function(data, status, jqxhr) {
        for (var i = 0; i < 5; i++) {
        	$('.flags-' + i + '-num').append(data[i].num);
            $('.flags-' + i + '-alpha2').append(data[i].alpha2);
    	}
    });
});
