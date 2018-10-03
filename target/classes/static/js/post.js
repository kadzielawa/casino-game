var NetJackEntGame = (function() {

    var playNormalRound = function(e) {
        e.preventDefault();
        NetEntEvents.request('/game/netjackent/start', parseResults);
    }

    var parseResults = function(jsonRawData) {
        var result = JSON.parse(jsonRawData);
        if(result.round_type === 'free') {
            freeRoundDiv = document.querySelector('#free_round')
            freeRoundDiv.innerHTML = "<button id='free_round_button'> Play free round! </button>";
        }
    }


return {
    playNormalRound: playNormalRound
};

})();
