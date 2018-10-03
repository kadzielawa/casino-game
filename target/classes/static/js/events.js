var NetEntEvents = (function() {

    var playButton = document.querySelector('button#play_normal_round');

    playButton.addEventListener("click", NetJackEntGame.playNormalRound);

    var getRequest = function(url,callback) {

        var request = new XMLHttpRequest();

        request.open('GET', url, true);

        request.onload = function() {
          if (request.status >= 200 && request.status < 400) {
            // Success!
            callback(request.responseText);
          } else {
            // We reached our target server, but it returned an error

          }
        };

        request.onerror = function() {
          // There was a connection error of some sort
        };

        request.send();


        }

    return {

        request:getRequest
    }

})();