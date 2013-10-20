/* 
 * returns deferred object containing all online users
 */
var OnlineUsers = function(users) {
    this.users = users;
};
OnlineUsers.prototype = (function(){
    return {
        getOnlineUsers: function() {
        return $.ajax(
                {
                    type: 'GET',
                    url: 'http://localhost:8080/catchat/webresources/onlineUsers/users',
                    data: "{}",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    async: false,
                    success: function(data) {                  
                    },
                    error: function(xhr, status) {
                        //alert("hatada:" + xhr.responseXML);
                    },
                    onComplete: function(data) {
                    }
                });
        }
    };
    
});