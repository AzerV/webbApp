/* 
 * The shop as a Singleton
 */
// Global
var chat = (function(){
    
    var users = "http://localhost:8080/catchat/webresources/onlineUsers/users";  
    
    return {
        getOnlineUsers : function(){
            return users;
        }
    };    
})();

