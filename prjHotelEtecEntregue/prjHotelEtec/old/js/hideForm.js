function showDivForm(div){

	
	if (div === "Contato"){
		
		document.getElementById("divContato").style.display = "block";
		document.getElementById("divReserva").style.display = "none";
		document.getElementById("btnReserva").disabled = false;
		document.getElementById("btnContato").disabled = true;
		document.getElementById("btnReserva").style.background = "#384762";
		document.getElementById("btnContato").style.background = "orange";



	}

	else{
		
		document.getElementById("btnReserva").disabled = true;
		document.getElementById("btnContato").disabled = false;
		document.getElementById("divContato").style.display = "none";
		document.getElementById("divReserva").style.display = "block";
		document.getElementById("btnReserva").style.background = "orange";
		document.getElementById("btnContato").style.background = "#384762";

	

	}	


}