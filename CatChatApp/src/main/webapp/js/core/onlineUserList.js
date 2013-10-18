/* 
 * returns deferred object containing all online users
 */
var user_model = {
    getOnlineUsers: function() {
        return $.ajax(
                {
                    type: 'GET',
                    url: 'http://localhost:8080/jsf_chat/webresources/onlineUsers/users',
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