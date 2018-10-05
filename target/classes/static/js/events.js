var NetEntEvents = (function() {


    var c = document.getElementById("game_title"),
    ctx = c.getContext("2d");
    ctx.font = "30px Arial";
    ctx.strokeText("NetJackEnt",10,50);

    document.querySelector("#click").addEventListener("click",function (e) {
        NetJackEntGame.playNormalRound(e,parseResults);
    });

    var parseResults = function(jsonRawData) {
        var result = JSON.parse(jsonRawData);

        document.querySelector("#win_games").innerHTML = result.win_games;
        document.querySelector("#lost_games").innerHTML = result.lost_games;
        document.querySelector("#free_rounds").innerHTML = result.free_rounds;
        document.querySelector("#account_balance").innerHTML = result.player_balance;

        var winNumber = 0;
        if(result.is_win === true){
            NetJackEntGame.winRound();
            winNumber = Math.floor((Math.random() * 10) + 1);
         }
         else {
            NetJackEntGame.lostRound();
         }

        elements = document.querySelectorAll(".flag_bg");
                elements.forEach(function(a,b){
                   slideDown(a,winNumber);
                });
    }

   var slideDown = function(element,winNumber) {
        var s = element.style, y = 0,random = winNumber || Math.floor((Math.random() * 10) + 1),
                finalheight = random * 100,
                interval = 10,
                totalframes = 1000/interval,
                heightincrement = finalheight/totalframes;

        var slide = function () {
            y += heightincrement;
            s.backgroundPositionY = y+'px';

            if (y<finalheight) {
                setTimeout(slide,interval);
            }
        }
        slide();
    }

})();