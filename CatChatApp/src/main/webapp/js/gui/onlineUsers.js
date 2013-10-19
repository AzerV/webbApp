/**
 * Writes online users in the online users-table
 */
function createOnlineUsersList() {
    $("#users tbody").empty();

    var users = OnlineUsers.getOnlineUsers()['responseJSON'];
    for (var i = 0; i < users.length; i++) {
        $("#users tbody").append("<tr><td>" + users[i] + "</td></tr>");
    }
}

/**
 * An update of the online user-table is done when the page is created/refreshed
 * also update once every second
 */
$(document).ready(function() {
    createOnlineUsersList();
    setInterval(function(){createOnlineUsersList();},1000);
});
        