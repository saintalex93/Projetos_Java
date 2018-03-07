var fotos = ["'../img/galeriaLazer1.JPG'", "'../img/galeriaLazer2.JPG'", "'../img/galeriaLazer3.JPG'", "'../img/galeriaLazer4.jpg'"],
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
	if(count == fotos.length){
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
