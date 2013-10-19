/* 
 * Test of onlineUserList
 */

// Possible test with curl first 
asyncTest("OnlineUserList.getOnlineUsers", function() {
    var deferred = chat.getOnlineUsers();
    deferred.done(function(users) {
        ok(users.lenght === 1, "Test passed");
        //ok(true, "Test passed");
        start();
    });
    deferred.fail(function() {
        ok(false, "Test failed (is Server up??)");
        start();
    });
});


