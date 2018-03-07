	var single = 150.00,
		duplo = 180.00,
		triplo = 250.00,
		quadruplo = 320.00,
		quintuplo = 390.00,
		sextuplo = 460.00,
		crianca = 45.00,
		especial = 230.00,
		frigobar = 50.00,
		diarias = 0,
		total = 0.00,
		adultPax = 0,
		childPax = 0,
		littleChildPax = 0,
		category = "",
		checkin,
		checkout;

	var indexAdults = document.getElementById('adultPax'),
		indexChild = document.getElementById('childPax'),
		indexLittleChild = document.getElementById('littleChildPax');	

		hideElements();



	function getDay(){

			checkin = document.getElementById('checkin').value;
			checkout = document.getElementById('checkout').value;

			if(checkin === ""){
				return false;
			}

			if( checkout === ""){
				return false;

			}

			else{
				checkin = new Date (checkin),
				checkout = new Date (checkout),
			 	diferenca = Math.abs(checkin - checkout),
			 	dia = 1000*60*60*24;

				diarias = Math.round(diferenca / dia);

				if(diarias === 0){
					diarias = 1;
				}

				return diarias;
			}

	}		


	function getNumberGuests(){

		

		if (indexAdults.selectedIndex != 0){
			adultPax = indexAdults.selectedIndex;
		}
		else{
			adultPax = 0;
		} 	


		if (indexChild != 0){
			childPax = indexChild.selectedIndex;
		}
		else{
			childPax = 0;
		} 			 	

		if (indexLittleChild != 0){
			littleChildPax = indexLittleChild.selectedIndex;
		}
		else{
			littleChildPax = 0;
		} 			 			

		console.log("Adulto " + adultPax);
		console.log("Criança " + childPax);
		console.log("Criancinha " + littleChildPax);

	}

	function getApartamentCategory(){

		var indexCategory = document.getElementById('category').selectedIndex;


		if (indexCategory === 0){

			hideElements();

		}

		else if (indexCategory ===1){

			category = "Suite Standard";
			showElements();


			removeAdultOptions();
			createAdultOptions(6);
			

		}

		else if (indexCategory ===2){
			category = "Suite com Frigobar";
			showElements();

			removeAdultOptions();
			createAdultOptions(6);
		}

		else if (indexCategory ===3) {
			category = "Suite Especial";
			indexAdults.style.display = "block";
			indexChild.style.display = "none";
			indexLittleChild.style.display = "none";
			document.getElementById('lblAdults').style.display = "block";
			document.getElementById('lblChild').style.display = "none";
			document.getElementById('lblLittleChild').style.display = "none";

			removeAdultOptions();
			createAdultOptions(2);

		}

		return category;

	}




	function locate(){
		if (getDay() != false){
		
			getNumberGuests();

			if(getApartamentCategory() === "Suite Especial"){

			total = especial * diarias;
			

			}
			else if(getApartamentCategory() === "Suite Standard"){

				if(adultPax === 1){
					total = (single + (childPax * crianca)) * diarias;
					
				}

				else if(adultPax === 2){
					total = (duplo + (childPax * crianca)) * diarias;
					
				}
				else if(adultPax === 3){
					total = (triplo + (childPax * crianca))* diarias;
					
				}

				else if(adultPax === 4){
					total = (quadruplo + (childPax * crianca)) * diarias;
					
				}

				else if(adultPax === 5){
					total = (quintuplo + (childPax * crianca)) * diarias;
					
				}

				else if(adultPax === 6){
					total = (sextuplo + (childPax * crianca)) * diarias;
					
				}												

			}

			else if(getApartamentCategory() === "Suite com Frigobar"){
				
				if(adultPax === 1){
					total = (single + (childPax * crianca)) * diarias;
					total = total + frigobar;
					
				}

				else if(adultPax === 2){
					total = (duplo + (childPax * crianca)) * diarias;
					total = total + frigobar;
					
				}
				else if(adultPax === 3){
					total = (triplo + (childPax * crianca))* diarias;
					total = total + frigobar;
					
				}

				else if(adultPax === 4){
					total = (quadruplo + (childPax * crianca)) * diarias;
					total = total + frigobar;
					
				}

				else if(adultPax === 5){
					total = (quintuplo + (childPax * crianca)) * diarias;
					total = total + frigobar;
					
				}

				else if(adultPax === 6){
					total = (sextuplo + (childPax * crianca)) * diarias;
					total = total + frigobar;
					
				}				

			}

		}
		window.scrollTo(0,0);
		return total;

	}


	function hideElements(){


		indexAdults.style.display = "none";
		indexChild.style.display = "none";
		indexLittleChild.style.display = "none";
		document.getElementById('lblAdults').style.display = "none";
		document.getElementById('lblChild').style.display = "none";
		document.getElementById('lblLittleChild').style.display = "none";
	}


	function showElements(){


	indexAdults.style.display = "block";
	indexChild.style.display = "block";
	indexLittleChild.style.display = "block";
	document.getElementById('lblAdults').style.display = "block";
	document.getElementById('lblChild').style.display = "block";
	document.getElementById('lblLittleChild').style.display = "block";
}


	function clearVariables(){

		diarias = 0,
		total = 0.00,
		adultPax = 0,
		childPax = 0,
		littleChildPax = 0,
		category = "";
	}




	function createAdultOptions(amountItens)
	{

		var x = document.getElementById("adultPax");
		    var option = document.createElement("option");
		    option.text = "Selecione...";
		    x.add(option);

			for (var i = 1; i<=amountItens; i++){
				var x = document.getElementById("adultPax");
			    var option = document.createElement("option");
			    option.text = i;
			    x.add(option);
		    }
	}

	function removeAdultOptions(){

		for (i = 6; i > -1; i--) {
	    	document.getElementById("adultPax").remove(i);
		}
	}


	function loadChild(maxChild){

		maxChild = 6 - (parseInt(maxChild));
		console.log(maxChild);

		for (i = 6; i > -1; i--) {
	    	document.getElementById("childPax").remove(i);
		}

		var x = document.getElementById("childPax");
	    var option = document.createElement("option");
	    option.text = "Selecione...";
	    x.add(option);

		for (var i = 1; i<=maxChild; i++){
			var x = document.getElementById("childPax");
		    var option = document.createElement("option");
		    option.text = i;
		    x.add(option);
	    }

	    if(document.getElementById('adultPax').selectedIndex === 6){
	    	childPax = 0;
	    	littleChildPax = 0;
	    	indexChild.style.display = "none";
			indexLittleChild.style.display = "none";
	    	document.getElementById('lblChild').style.display = "none";
			document.getElementById('lblLittleChild').style.display = "none";

	    }

	    else{
	    	indexChild.style.display = "block";
			indexLittleChild.style.display = "block";
	    	document.getElementById('lblChild').style.display = "block";
			document.getElementById('lblLittleChild').style.display = "block";

	    }


	}


	function createEventRemoveChild(){

		if(document.getElementById('category').selectedIndex === 3){
			
		}

		else{

			var ObjAdult = document.getElementById('adultPax').selectedIndex;
			loadChild(ObjAdult);

		}
	}




	function bookingModal(){

		if(validateBooking() === true){
			locate();

			var email = document.getElementById('bookingMail').value,
				emailModal = document.getElementById('formEmail'),
				totalModal = document.getElementById('totalModal'),
				diariasModal = document.getElementById('diariasModal');

			emailModal.innerHTML = email;
			totalModal.innerHTML = "R$ " + total.toFixed(2);
			diariasModal.innerHTML = diarias;

			document.location.href = "contato.php#bg";
			

	
	}

			

	}

	function contact(){
		if(validateContact()===true){
		document.getElementById("pVlrPackage").style.display = "none";
		document.getElementById("pQuantDays").style.display = "none";
		var email = document.getElementById('emailContact').value;
		document.getElementById('formEmail').innerHTML = email;

		document.location.href = "contato.php#bg";
		window.scrollTo(0,0);
		

		}
	}



	function validateContact(){

		if(document.getElementById('nameContact').value === ""){
			alert('Preencha o nome');
			document.getElementById('nameContact').focus();
			return false;
		}

		if(document.getElementById('celContact').value === ""){
			alert('Preencha o Celular');
			document.getElementById('celContact').focus();
			return false;
		}

		if(document.getElementById('emailContact').value === ""){
			alert('Preencha o Email');
			document.getElementById('emailContact').focus();
			return false;
		}

		if(document.getElementById('messageContact').value === ""){
			alert('Digite a Mensagem');
			document.getElementById('messageContact').focus();
			return false;
		}						


		else {

			return true;
		}

	}


function validateBooking(){

		if(document.getElementById('bookingName').value === ""){
			alert('Preencha o nome');
			document.getElementById('bookingName').focus();
			return false;
		}

		if(document.getElementById('bookingCel').value === ""){
			alert('Preencha o Celular');
			document.getElementById('bookingCel').focus();
			return false;
		}

		if(document.getElementById('checkin').value === ""){
			alert('Preencha o CheckIn');
			document.getElementById('checkin').focus();
			return false;
		}	

		if(document.getElementById('checkout').value === ""){
			alert('Preencha o CheckOut');
			document.getElementById('checkout').focus();
			return false;
		}	

		if(document.getElementById('category').selectedIndex === 0){
			alert('Selecione a categoria');
			document.getElementById('category').focus();
			return false;
		}	

		if(document.getElementById('adultPax').selectedIndex === 0){
			alert('Selecione a quantidade de Adultos');
			document.getElementById('adultPax').focus();
			return false;
		}	
												

		else {

			return true;
		}

	}
