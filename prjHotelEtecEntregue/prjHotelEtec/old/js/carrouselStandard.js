
start();
var speed =0,
    interval;


function troca(param){

    if(param === 1){

        document.getElementById('imgStandard').style.content= "url('../img/carStd1.JPG')";
        document.getElementById("imgStandard").style.transition = "all 0.5s";
        document.getElementById("imgStandard").style.backgroundSize = "cover";

    }

    else if(param === 2){

        document.getElementById('imgStandard').style.content= "url('../img/carStd2.JPG')";
        document.getElementById("imgStandard").style.transition = "all 0.5s";
        document.getElementById("imgStandard").style.backgroundSize = "cover";

    }

    else if(param === 3){

        document.getElementById('imgStandard').style.content= "url('../img/carStd3.JPG')";
        document.getElementById("imgStandard").style.transition = "all 0.5s";
        document.getElementById("imgStandard").style.backgroundSize = "cover";

    }

    else{
        document.getElementById('imgStandard').style.content= "url('../img/carStd.JPG')";
        document.getElementById("imgStandard").style.transition = "all 0.5s";
        document.getElementById("imgStandard").style.backgroundSize = "cover";

    }
}

function start(){
    
    interval = setInterval(timeIt, 20);

}

function timeIt(){

    if (speed === 100){
        troca(1);
    }

    if (speed === 200){
        troca(2);
      
    }

    if (speed === 300){
        troca(3);
       
    }

    else if (speed === 400){
        troca(4);
        speed = 0;
    }
    speed++;

}