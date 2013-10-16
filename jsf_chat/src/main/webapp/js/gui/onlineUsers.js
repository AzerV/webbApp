function createOnlineUsersList() {
    // Use JQuery and HTML
    $("#users tbody").empty();

    var users = user_model.getOnlineUsers()['responseJSON'];
    for (var i = 0; i < users.length; i++) {
        $("#users tbody").append("<tr><td>" + users[i] + "</td></tr>");
    }
}

$(document).ready(function() {
    $("#update-button").on('click', function() {
        createOnlineUsersList();
    }); 
    createOnlineUsersList();
});
        