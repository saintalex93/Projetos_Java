	
start();
var speed =0,
    interval;


function troca(param){

    if(param === 1){

        document.getElementById('imgFrigobar').style.content= "url('../img/carFrigo1.JPG')";
        document.getElementById("imgFrigobar").style.transition = "all 0.5s";
        document.getElementById("imgFrigobar").style.backgroundSize = "cover";

    }

    else if(param === 2){

        document.getElementById('imgFrigobar').style.content= "url('../img/carFrigo2.JPG')";
        document.getElementById("imgFrigobar").style.transition = "all 0.5s";
        document.getElementById("imgFrigobar").style.backgroundSize = "cover";

    }

    else if(param === 3){

        document.getElementById('imgFrigobar').style.content= "url('../img/carFrigo3.JPG')";
        document.getElementById("imgFrigobar").style.transition = "all 0.5s";
        document.getElementById("imgFrigobar").style.backgroundSize = "cover";

    }

    else{
        document.getElementById('imgFrigobar').style.content= "url('../img/carFrigo.JPG')";
        document.getElementById("imgFrigobar").style.transition = "all 0.5s";
        document.getElementById("imgFrigobar").style.backgroundSize = "cover";

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
