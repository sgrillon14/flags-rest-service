$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/flags"
    }).then(function(data, status, jqxhr) {
       $('.flags-id').append(data.id);
       $('.flags-content').append(data.content);
       console.log(jqxhr);
    });
});
