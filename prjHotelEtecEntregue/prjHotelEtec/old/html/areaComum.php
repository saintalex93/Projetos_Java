<?php include_once('include/superior.php');?>

<div class="clear"></div>
<div class="bannerOnda" >

</div>
<div id="titlePages">Área Comum</div>
<div class="margim">

  <section class="targ"></section>
  <section class="container">

    <main class="main">


      <section class="container">



        <div id="modal">
          <div id="box">
            <div class="close"><a href="#" onclick="closeIt()">X</a></div>
            <div class="rightArrow"><h1 onclick="next()">&raquo;</h1></div>
            <div class="leftArrow"><h1 onclick="prev()">&laquo;</h1></div>
          </div>
        </div>

      <div class="galeriaFoto">
        <a href="#"><img src="../img/areaComum1.JPG" alt="" onclick="onpenPhoto(this.src,0)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/areaComum2.JPG" alt="" onclick="onpenPhoto(this.src,1)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/areaComum3.JPG" alt="" onclick="onpenPhoto(this.src,2)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/areaComum4.JPG" alt="" onclick="onpenPhoto(this.src,3)"></a>
      </div>
     <!--  <div class="galeriaFoto">
        <a href="#"><img src="../img/externo5.JPG" alt="" onclick="onpenPhoto(this.src,4)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/externo6.JPG" alt="" onclick="onpenPhoto(this.src,5)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/externo7.JPG" alt="" onclick="onpenPhoto(this.src,6)"></a>
      </div>
      <div class="galeriaFoto">
        <a href="#"><img src="../img/externo8.JPG" alt="" onclick="onpenPhoto(this.src,7)"></a>
      </div> -->

      <div class="clear"></div>
    </section>
  </main>
</section>
</div>


<script>

var fotos = ["'../img/areaComum1.JPG'", "'../img/areaComum2.JPG'", "'../img/areaComum3.JPG'", "'../img/areaComum4.JPG'"],
  src,
  count;


function onpenPhoto(id,countPhoto)
{
  document.getElementById('modal').style.display = "block";
  document.getElementById('box').style.backgroundImage = "url("+fotos[countPhoto]+")";
  count = countPhoto;
}

function closeIt(){
  document.getElementById('modal').style.display = "none";
}



function next(){
  if(count ===3){
    count = -1;
  }
  
  count = count+1;
  
  var nextSrc = fotos[count];
  
  document.getElementById('box').style.backgroundImage = "url("+nextSrc+")";

  if(count ===3){
    count = -1;
  }

}

function prev(){
  if(count ===0){
    count = 4;
  }

  count = count-1;

  var prevSrc = fotos[count];
  
  document.getElementById('box').style.backgroundImage = "url("+prevSrc+")";

  if(count ===0){
    count = 4;
  }

}

</script>

<?php include_once('include/inferior.php');?>







