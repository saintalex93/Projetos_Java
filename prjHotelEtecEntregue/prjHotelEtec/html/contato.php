<?php include_once('include/superior.php');?>
      <div class="clear"></div>
    <div class="bannerOnda" >
        
    </div>
    <div id="titlePages">Contato</div>
    <div class="margim">
    
    <section class="targ"></section>
    <section class="container">
    
    	<main class="main">
	
			

			<div id="bg"></div>
	
			<div class="box">
				<img src="../img/logoHotel.png" alt="">


				<a href="" id="close">X</a>

					<div class="RetornoForm">
					<p id="titleModal">Contato enviado com sucesso!</p><br>
					<p>Logo enviaremos email para: <br><label id="formEmail"></label></p><br>
					<p id="pVlrPackage">Valor do pacote: <label id="totalModal"></label></p><br>
					<p id="pQuantDays">Quantidade de Diárias: <label id="diariasModal"></label></p>
					
				</div>
			</div>	
			<div class="tituloContato">
		    
				
					
				<div id="radios">
					<button value="Reserva" onclick="showDivForm(this.value)" id="btnReserva" class = "botao">Reserva</button>
					<button value="Contato" onclick="showDivForm(this.value)" id="btnContato" class = "botao">Contato</button>
				</div>

			</div>

			<div class="reserva" id="divReserva">
				
				<div id="contatoForm">
					
					<form action="">
						<div class="contatoCaixa">
							<label for="nome">Nome: </label>
							<input type="text" id="bookingName" placeholder="Digite o seu nome">
						</div>
						
						<div class="contatoCaixa">
							<label for="telefone">Telefone: </label>
							<input type="text" id="bookingPhone" onkeypress ="phoneMask(this)" placeholder="Telefone" maxlength="14">
						</div>

						<div class="contatoCaixa">
							<label for="telefone">Celular: </label>
							<input type="text" id="bookingCel" onkeypress ="celMask(this)" placeholder="Celular" maxlength="15">
						</div>
						
						<div class="contatoCaixa">
							<label for="email">Email: </label>
							<input type="email" id="bookingMail" placeholder="seuemail@email.com">
						</div>

						<div class="contatoCaixa">
							<label for="checkin">Check In</label>
							<input type="date" id="checkin">
						</div>
						<div class="contatoCaixa">
							<label for="checkout">Check Out</label>
							<input type="date" id="checkout">
						</div>

						<div class="contatoCaixa">
							<label for="categoria">Categoria do apartamento</label>
							<select name="" id="category" onchange="getApartamentCategory()">
								<option value="empty">Selecione a categoria...</option>
								<option value="standard">Suíte Standard</option>
								<option value="withMinibar">Suíte com Frigobar</option>
								<option value="especial">Suíte Especial</option>
							</select>
						</div>
						<div class="contatoCaixa">
							<label for="" id="lblAdults">Adultos</label>
							<select name="" id="adultPax" onchange="createEventRemoveChild()">
								<option value="selecione">Selecione...</option>

							</select>
						</div>

						<div class="contatoCaixa">
							<label for="" id="lblChild">Crianças (6 a 10 Anos)</label>
							<select name="" id="childPax">
								<option value="">Selecione...</option>
								<option value="">1</option>
								<option value="">2</option>
								<option value="">3</option>
								<option value="">4</option>
								<option value="">5</option>
							</select>
						</div>

						<div class="contatoCaixa">
							<label for="" id="lblLittleChild">Crianças (0 a 5 Anos)</label>
							<select name="" id="littleChildPax">
								<option value="">Selecione...</option>
								<option value="">1</option>
								<option value="">2</option>
							</select>
						</div>



					</form>	

							<div class="alinharBotao">
							<!-- <input type="submit" value="Enviar" class="botao" onclick = "bookingModal()"> -->
							<button class="botao" onclick="bookingModal()">Cotar</button>

						</div>	
					
						
				</div>

			</div>



			

	
    <!-- Contato  ////////////////////////////////////////////////////////////////////// -->

			<div class="contato" id="divContato">
				<div id="contatoForm">
					
					<form action="">
						<div class="contatoCaixa">
							<label for="nome">Nome: </label>
							<input type="text" id="nameContact" placeholder="Digite o seu nome">
						</div>
						
						<div class="contatoCaixa">
							<label for="telefone">Telefone: </label>
							<input type="text" id="phoneContact"  onkeypress ="phoneMask(this)" placeholder="Telefone" maxlength="14">
						</div>

						<div class="contatoCaixa">
							<label for="telefone">Celular: </label>
							<input type="text" id="celContact" placeholder="Celular" onkeypress="celMask(this)" maxlength="15">
						</div>
						
						<div class="contatoCaixa">
							<label for="email">Email: </label>
							<input type="email" id="emailContact" placeholder="seuemail@email.com" required>
						</div>


						<div class="contatoCaixa">
							<label for="mensagem">Mensagem: </label>
							<textarea name="mensagem" id="messageContact" cols="30" rows="10" placeholder="Digite sua mensagem"></textarea>
						</div>



					</form>
					<div class="alinharBotao">
						<button class="botao" onclick = "contact()">Enviar</button>
					</div>
					
				</div>

			</div>
	
			<div id="contatoDados">
				<div class="informacoesContato">
				<h1 class="titulo">Dados para contato</h1>
				<i class="fa fa-map-marker" aria-hidden="true"></i>  Rua Sapetuba, 6135<br>
				<i class="fa fa-map-marker" aria-hidden="true"></i>  Rua Paris, 117<br>

				Jardim Suarão, Itanhaém - SP <br>CEP: 11740-000<br>
				<i class="fa fa-phone" aria-hidden="true"></i> (13) 3424-3398 <br>
				<i class="fa fa-whatsapp" aria-hidden="true"></i> (11) 94721-2257<br>
				<i class="fa fa-envelope-open" aria-hidden="true"></i>  contato@hotelclubeazuldomar.com.br <br>
				<i class="fa fa-globe" aria-hidden="true"></i>  www.hotelclubeazuldomar.com.br
				</div>
				
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3640.122681684075!2d-46.76068158573558!3d-24.167429884385456!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94d1d5f7483608c5%3A0x59c0c1ce98fbdf1!2sTv.+Sapetuba+-+Nova+Itanha%C3%A9m+-+Praia%2C+Itanha%C3%A9m+-+SP%2C+11740-000!5e0!3m2!1spt-BR!2sbr!4v1497332296124" width="100%" height="234" frameborder="0" style="border:0" allowfullscreen></iframe>
		
		
		
		
			</div>
			<div class="clear"></div>
	</main>
</section>
</div>

<script src = "../js/booking.js"></script>
<script src = "../js/mask.js"></script>
<script src = "../js/hideForm.js"></script>    
    
<?php include_once('include/inferior.php');?>
    

    
    
    
    

