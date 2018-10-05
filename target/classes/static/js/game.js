var NetJackEntGame = (function() {

    var spin_audio;
    var win_audio;
    var lost_audio;


    var init = function() {
        spin_audio = new Audio('/sounds/spin.wav');
        win_audio = new Audio('/sounds/win.wav');
        lost_audio = new Audio('/sounds/lost.wav');
    }

    var playNormalRound = function(e,callback) {
        e.preventDefault();
        spin_audio.play();
        NetEntRequest.request('/game/netjackent/start', callback);
    }

    var winRound = function(){
        win_audio.play();
    }

    var lostRound = function(){
        lost_audio.play();
    }

return {
    playNormalRound: playNormalRound,
    winRound: winRound,
    lostRound: lostRound,
    init: init
};

})();


NetJackEntGame.init();