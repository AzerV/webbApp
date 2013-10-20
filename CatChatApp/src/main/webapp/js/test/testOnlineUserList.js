/* 
 * Test of onlineUserList
 */

// OBS! Possible if database contains 2 online users
asyncTest("OnlineUserList.getOnlineUsers", function() {
    var deferred = chat.getOnlineUsersFromChat();
    deferred.done(function(users) {
        ok(users.length === 2, "Test passed");
        start();
    });
    deferred.fail(function() {
        ok(false, "Test failed (is Server up??)");
        start();
    });
});


