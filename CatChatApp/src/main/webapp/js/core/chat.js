/* 
 * Gets and returns a deferred object of online users
 */
var chat = (function(){
    
    var users = OnlineUsers.prototype().getOnlineUsers();

    return {
        getOnlineUsersFromChat : function(){
            return users;
        }
    };    
})();

