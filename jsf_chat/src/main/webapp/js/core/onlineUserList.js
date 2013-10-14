/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var func = function() {
    return{
        getOnlineUsers: function() {
            return $.ajax({
                url: "http://localhost:8080/jsf_chat/webresources/onlineUsers/users", type: "GET", dataType: "json"
            });
        }
    };
}();