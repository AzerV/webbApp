/*
 * All js for the products.html page 
 * 
 * NOTE: Last in file a comment to enable debugging
 * because this is dynamically loaded (doesn't work by default to debug
 * dynamic scripts in Chrome at least...)
 * 
 */
// Run after DOM constructed (same as $(document).ready())
$(function() {

    var nav = new Navigator(shop.getProductCatalogue());
    /*************************************
     * 
     * Components (from JQueryUI) and eventhandling
     */
    $("#next-button")       //TODO: Skall ej vara en knapp, skall ske automatiskt när sidan öppnas
            .button()
            .click(function() {
        (createOnlineUsersList, fail);
        function fail() {
            alert("Cannot show online users");
        }
    });

    /**********************************************
     *   
     *   Functions for redering tables, dialogs and helper functions
     */
    function createOnlineUsersList(users) {
        // Use JQuery and HTML
    }
});