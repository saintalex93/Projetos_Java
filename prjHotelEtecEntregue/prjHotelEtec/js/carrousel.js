    start();
    var speed =0,
        interval;


    function troca(param){

        if(param === 1){

            document.getElementById('bannerHome').style.backgroundImage = "url('../img/externo4.JPG')";
            document.getElementById("bannerHome").style.transition = "all 0.5s";
            document.getElementById("bannerHome").style.backgroundSize = "cover";

        }

        else if(param === 2){
            document.getElementById("bannerHome").style.transition = "all 0.5s";
            document.getElementById('bannerHome').style.backgroundImage = "url('../img/bannerHome1.jpg')";
            document.getElementById("bannerHome").style.backgroundSize = "cover";
        }

        else if(param === 3){
            document.getElementById("bannerHome").style.transition = "all 0.5s";
            document.getElementById('bannerHome').style.backgroundImage = "url('../img/bannerHome2.jpg')";
            document.getElementById("bannerHome").style.backgroundSize = "cover";
        }

        else if(param === 4){
            document.getElementById("bannerHome").style.transition = "all 0.5s";
            document.getElementById('bannerHome').style.backgroundImage = "url('../img/bannerHome3.jpg')";
            document.getElementById("bannerHome").style.backgroundSize = "cover";
        }

        else {
            document.getElementById("bannerHome").style.transition = "all 0.5s";
            document.getElementById('bannerHome').style.backgroundImage = "url('../img/bannerHome.jpg')";
            document.getElementById("bannerHome").style.backgroundSize = "cover";
        }                        
    }
    
    function start(){
        
        interval = setInterval(timeIt, 20);

    }

    function timeIt(){

        if (speed === 100){
            troca(1);
        }

        else if (speed === 200){
            troca(2);
        
        }

        else if (speed === 300){
            troca(3);

        }

        else if (speed === 400){
            troca(4);

        }
        else if (speed === 500){
            troca(5);
            speed = 0;
        }                        
        speed++;

    }
