/* 
 *  Test basic AJAX call using JQuery
 */
    
asyncTest( "Ajax.get", function() {
    var uri = "http://localhost:8080/catchat/webresources/onlineUsers/users";
    var deferred = $.get(uri);
    deferred.done(function(xml){
        ok(true, "Test passed");
        start();
    }); 
    deferred.fail(function(){
        ok(false, "Test failed (is Server up??)");
        start();    
    });
});



