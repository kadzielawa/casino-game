var NetJackEntGame = (function() {

    var playNormalRound = function(e,callback) {
        e.preventDefault();
        NetEntEvents.request('/game/netjackent/start', callback);
    }




return {
    playNormalRound: playNormalRound
};

})();
