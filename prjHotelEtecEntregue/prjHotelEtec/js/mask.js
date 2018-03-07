function celMask(celphone){


	if(celphone.value.length == 0){
		celphone.value = "(" + celphone.value;
	}

	 if(celphone.value.length == 3){
		celphone.value = celphone.value +") ";
	}

	if(celphone.value.length == 10){
		celphone.value = celphone.value + "-";
	}

}


function phoneMask(phone){


	if(phone.value.length == 0){
		phone.value = "(" + phone.value;
	}

	 if(phone.value.length == 3){
		phone.value = phone.value +") ";
	}

	if(phone.value.length == 9){
		phone.value = phone.value + "-";
	}

}