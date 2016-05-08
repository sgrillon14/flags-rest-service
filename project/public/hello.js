$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8084/flags/FR"
    }).then(function(data, status, jqxhr) {
       $('.flags-id').append(data.num);
       $('.flags-content').append(data.alpha2);
       console.log(jqxhr);
    });
});
