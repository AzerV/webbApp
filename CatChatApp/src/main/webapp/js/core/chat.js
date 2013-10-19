/* 
 * The chat as a Singleton
 */
// Global
var chat = (function(){
    
    //var users = new OnlineUsers("http://localhost:8080/catchat/webresources/onlineUsers/users");  
    //console.log(users);
    return {
        getOnlineUsers : function(){
    //        return users.getOnlineUsers();
        }
    };    
})();

