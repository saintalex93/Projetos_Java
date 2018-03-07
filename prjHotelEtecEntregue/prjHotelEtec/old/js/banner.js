function troca(param){
    if (param ===1){
        
        
        document.getElementById('bannerHome').style.backgroundImage="url('../img/bannerQuarto.jpeg')";
    }
    
      else{
        
        
        document.getElementById('bannerHome').style.backgroundImage="url('../img/bannerHome2.png')";
    }
}

var speed =0, interval;
function start(){

interval=setInterval(timelt,30);


}
 function timelt(){
     
     
     if(speed ===100){
         troca(1);
     }
     
     else if(speed ===200){
         
         troca(2);
         speed=0;
     }
     speed++;
 }