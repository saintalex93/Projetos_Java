DROP DATABASE IF EXISTS hotel;
CREATE DATABASE hotel;
USE hotel;

CREATE TABLE Setor (
CodSetor int unsigned PRIMARY KEY auto_increment,
NomeSetor varchar(30) not null
);

CREATE TABLE Produto (
Cod_Produto int unsigned PRIMARY KEY auto_increment,
Nome_Produto varchar(40) not null,
Valor_Produto decimal (10,2) not null,
Situacao char not null,
CodSetor int unsigned not null,
Foreign key (CodSetor) References Setor (CodSetor)
);


CREATE TABLE Categoria (
CodCategoria int unsigned PRIMARY KEY auto_increment,
CategoriaApto varchar(30) not null,
MaxPax int unsigned not null,
ValorDiaria decimal (10,2) not null
);

CREATE TABLE Apartamento (
Cod_AP int unsigned PRIMARY KEY auto_increment,
Descricao varchar(50) not null,
Status_Ap char not null,
Cod_Categoria int unsigned not null,
Foreign key (Cod_Categoria) References Categoria (CodCategoria)
); 

CREATE TABLE Usuario (
CodUsuario int unsigned PRIMARY KEY auto_increment,
NomeUsuario varchar(70) not null,
Login varchar(15) not null unique,
Senha varchar(15) not null,
Permissao varchar(15) not null
);


CREATE TABLE Cliente (
Cpf_Cliente varchar(14) PRIMARY KEY,
Nome_Clien varchar(70) not null,
Nasc_Clien date not null,
Celular varchar(16) not null,
TelefoneResidencial varchar(16) not null,
Rua varchar(70),
N_Resid int unsigned not null,
Complemento varchar (100),
Cep_Clien varchar(10) not null,
Bairro varchar(70),
Cidade varchar(70),
UF varchar(2),
Email varchar(100) unique,
Senha varchar(15)
);

CREATE TABLE Reserva (
Cod_Reserva int unsigned PRIMARY KEY auto_increment,
CheckIn date not null,
CheckOut date not null,
Total decimal (10,2) not null,
Cpf_Cliente varchar(14) not null,
Cod_Apto int unsigned not null,
CodUsuario int unsigned not null,

Foreign key (Cpf_Cliente) References Cliente (Cpf_Cliente),
Foreign key (Cod_Apto) References Apartamento (Cod_AP),
Foreign key (CodUsuario) References Usuario (CodUsuario)

);


CREATE TABLE Acompanhantes (
Cod_Acmp int unsigned Primary Key auto_increment,
Cpf_Acmp varchar(14) unique not null,
Nome_Acmp varchar(70) not null,
Nasc_Acmp date not null,
CodReserva int unsigned,
Foreign key (CodReserva) References Reserva (Cod_Reserva)
);



CREATE TABLE Comanda (
Cod_Comanda int unsigned PRIMARY KEY auto_increment,
DT_Comanda date not null,
Total_Comanda decimal (10,2) not null,
Cod_Reserva int unsigned ,
FOREIGN KEY(Cod_Reserva) REFERENCES Reserva (Cod_Reserva)
);


CREATE TABLE Despesas(
CodDespesa int unsigned primary key auto_increment,
NomeDespesa varchar (50) not null,
ValorDespesa decimal (10,2) not null,
DataDespesa date not null

);

CREATE TABLE DespCaixa(
CodMovim int unsigned primary key auto_increment,
CodDep int unsigned,

Foreign key (CodDep) References Despesas (CodDespesa)
);


CREATE TABLE ReceCaixa(
CodMovim int unsigned primary key auto_increment,
CodReserva int unsigned,
CodComanda int unsigned,

Foreign key (CodReserva) References Reserva (Cod_Reserva),
Foreign key (CodComanda) References Comanda (Cod_Comanda)
);

CREATE TABLE Caixa(
CodCaixa int unsigned primary key auto_increment,
CodDespesa int unsigned,
CodReceita int unsigned,

Foreign key (CodDespesa) References DespCaixa (CodMovim),
Foreign key (CodReceita) References ReceCaixa (CodMovim)	
);

CREATE TABLE Comanda_Produto (
Cod_Item int unsigned PRIMARY KEY auto_increment,
Cod_Comanda int unsigned not null,
Cod_Produto int unsigned not null,
Cod_Usuario int unsigned not null,


FOREIGN KEY(Cod_Comanda) REFERENCES Comanda (Cod_Comanda),
FOREIGN KEY(Cod_Produto) REFERENCES Produto (Cod_Produto),
FOREIGN KEY(Cod_Usuario) REFERENCES Usuario (CodUsuario)

);


-- ------------------------------------------------USER STORORED PROCEDURES -----------------------------------------------------------------------------------


-- ------------------------------------------------CLIENTES-----------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_CadastrarCliente(

P_Cpf_Cliente varchar(14),
P_Nome_Clien varchar(70),
P_Nasc_Clien date,
P_Celular varchar(16),
P_TelefoneResidencial varchar(16),
P_Rua varchar(70),
P_N_Resid int,
P_Complemento varchar (100),
P_Cep_Clien varchar(10),
P_Bairro varchar(70),
P_Cidade varchar(70),
P_UF varchar(2),
P_Email varchar(100),
P_Senha varchar(15)
)


begin

insert into Cliente (Cpf_Cliente, Nome_Clien, Nasc_Clien, Celular, TelefoneResidencial, Rua, N_Resid, Complemento, Cep_Clien,
Bairro, Cidade, UF, Email, Senha )
Values (P_Cpf_Cliente, P_Nome_Clien, P_Nasc_Clien, P_Celular, P_TelefoneResidencial, P_Rua, P_N_Resid, P_Complemento, P_Cep_Clien,
P_Bairro, P_Cidade, P_UF, P_Email, P_Senha);

END$$
DELIMITER ;

-- ------------------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_AlteraCliente(


P_Cpf_Cliente varchar(14),
P_Nome_Clien varchar(70),
P_Nasc_Clien date,
P_Celular varchar(16),
P_TelefoneResidencial varchar(16),
P_Rua varchar(70),
P_N_Resid int,
P_Complemento varchar (100),
P_Cep_Clien varchar(10),
P_Bairro varchar(70),
P_Cidade varchar(70),
P_UF varchar(2),
P_Email varchar(100),
P_Senha varchar(15),
p_Cpf_ClienRecebido varchar(14)
)

begin

update Cliente set Cpf_Cliente = P_Cpf_Cliente, Nome_Clien = P_Nome_Clien, Nasc_Clien = P_Nasc_Clien, Celular = P_Celular,
TelefoneResidencial = P_TelefoneResidencial, Rua = P_Rua, N_Resid = P_N_Resid, Complemento = P_Complemento, Cep_Clien = P_Cep_Clien,
Bairro = P_Bairro, Cidade = P_Cidade, UF = P_UF, Email = P_Email, Senha = P_Senha where Cpf_Cliente = p_Cpf_ClienRecebido;

END$$
DELIMITER ;
   
-- ------------------------------------------------Categoria -----------------------------------------------------------------------------------  

DELIMITER $$
create procedure JAVA_USP_InsereCategoria(
  
P_CategoriaApto varchar(30) ,
P_MaxPax int unsigned,
P_ValorDiaria decimal (10,2)
)
   
begin
   
Insert into Categoria (CategoriaApto, MaxPax, ValorDiaria ) values (P_CategoriaApto, P_MaxPax, P_ValorDiaria);
   
END$$
DELIMITER ;

-- ------------------------------------------------------------------------------------------

Delimiter $$
create procedure JAVA_USP_AlteraCategoria(

P_CodCategoria int unsigned,
P_CategoriaApto varchar(30),
P_MaxPax int unsigned,
P_ValorDiaria decimal (10,2)

)

begin

update Categoria set CategoriaApto = P_CategoriaApto, MaxPax = P_MaxPax, ValorDiaria = P_ValorDiaria where CodCategoria = P_CodCategoria;

END$$
Delimiter;

   
 -- ------------------------------------------------APARTAMENTO -----------------------------------------------------------------------------------  
   

   
DELIMITER $$
create procedure JAVA_USP_InsereApartamento(

P_Descricao varchar(50),
P_Status char,
P_CodCategoria int
)

begin
   
Insert into apartamento (Descricao, Status_Ap, Cod_Categoria ) values ( P_Descricao, P_Status,P_CodCategoria);
   
END$$
DELIMITER ;

-- ------------------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_AlteraApartamento(
  
P_Cod_AP int,
P_Descricao varchar(50),
P_Status char,
P_CodCategoria int
)
   
begin
   
update apartamento set Descricao = Descricao, Status_Ap = P_Status where Cod_AP = P_Cod_AP ;
   
END$$
DELIMITER ;

-- ------------------------------------------------SETOR ---------------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_InsereSetor(
  
P_NomeSetor varchar(30)

)
   
begin
   
Insert into Setor (NomeSetor) values (P_NomeSetor);
   
END$$
DELIMITER ;

-- ------------------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_AlteraSetor(
P_CodSetor int unsigned,  
P_NomeSetor varchar(30)

)
   
begin
   
update Setor set NomeSetor = P_NomeSetor where CodSetor = P_CodSetor ;
   
END$$
DELIMITER ;

-- ------------------------------------------------PRODUTOS-----------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_InsereProduto(
P_Nome_Produto varchar(40),
P_Valor_Produto decimal (10,2) ,
P_Situacao char,
P_CodSetor int unsigned

)
begin

Insert into Produto (Nome_Produto, Valor_Produto, Situacao, CodSetor) Values (P_Nome_Produto, P_Valor_Produto, P_Situacao, P_CodSetor);

END$$

DELIMITER ;

-- ------------------------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_AlteraProduto(
P_Cod_Produto int unsigned ,
P_Nome_Produto varchar(40),
P_Valor_Produto decimal (10,2) ,
P_Situacao char,
P_CodSetor int unsigned

)
begin

update Produto set Nome_Produto = P_Nome_Produto, Valor_Produto = P_Valor_Produto, Situacao = P_Situacao, CodSetor = P_CodSetor
where Cod_Produto = P_Cod_Produto;

END$$

DELIMITER ;

-- ------------------------------------------------RESERVAS e Abre COMANDAS--------------------------------------------------------------------------

DELIMITER $$
create procedure JAVA_USP_INSERERESERVACOMANDA(
P_CheckIn date ,
P_CheckOut date ,
P_Total decimal (10,2) ,
P_Cpf_Cliente varchar(14) ,
P_Cod_Apto int unsigned ,
P_CodUsuario int unsigned ,

Total_Comanda decimal (10,2)
)
begin
	START TRANSACTION;

        insert into Reserva (CheckIn, CheckOut, Total, Cpf_Cliente, Cod_Apto, CodUsuario) 
        values (P_CheckIn, P_CheckOut, P_Total, P_Cpf_Cliente, P_Cod_Apto, P_CodUsuario);
        insert into comanda (DT_Comanda, Total_Comanda, Cod_Reserva ) 
        values (P_CheckIn, Total_Comanda, LAST_INSERT_ID());
      
    COMMIT;
END$$

DELIMITER ;   

-- ------------------------------------------------ACOMPANHANTES-----------------------------------------------------------------------------------

DELIMITER $$
create procedure USP_JAVA_INSEREACOMPANHANTE(
P_Cpf_Acmp varchar(14),
P_Nome_Acmp varchar(70) ,
P_Nasc_Acmp date,
P_CodReserva int unsigned 
)
begin
insert into Acompanhantes (Cpf_Acmp, Nome_Acmp, Nasc_Acmp, CodReserva) Values (P_Cpf_Acmp, P_Nome_Acmp, P_Nasc_Acmp, P_CodReserva);
END $$

DELIMITER ;   


-- ------------------------------------------------------------------------------------------

DELIMITER $$
create procedure USP_JAVA_ALTERAACOMPANHANTE(
P_Cpf_Acmp varchar(14),
P_Nome_Acmp varchar(70) ,
P_Nasc_Acmp date ,
P_Cod_Acmp int,
P_CodReserva int unsigned 
)
begin
update Acompanhantes set Cpf_Acmp = P_Cpf_Acmp, Nome_Acmp = P_Nome_Acmp, Nasc_Acmp = P_Nasc_Acmp, CodReserva = P_CodReserva where Cod_Acmp = P_Cod_Acmp ;
END $$

DELIMITER ; 
   
   
   
 -- ------------------------------------------------USUARIO-------------------------------------------------------------------------------------
   
DELIMITER $$

Create Procedure USP_JAVA_InsereUsuario(
P_NomeUsuario varchar(70),
P_Login varchar(15),
P_Senha varchar(15),
P_Permissao varchar(15)
)
begin
insert into Usuario (NomeUsuario, Login, Senha, Permissao ) Values (P_NomeUsuario, P_Login, P_Senha, P_Permissao);
end$$
DELIMITER ; 

-- ------------------------------------------------------------------------------------------ 

DELIMITER $$

Create Procedure USP_JAVA_AlteraUsuario(
P_NomeUsuario varchar(70),
P_Login varchar(15),
P_Senha varchar(15),
P_Permissao varchar(15),
P_CodUsuario int
)
begin
update Usuario set NomeUsuario = P_NomeUsuario, Login = P_Login, Senha = P_Senha, Permissao = P_Permissao where CodUsuario = P_CodUsuario;
end$$
DELIMITER ;

-- ------------------------------------------------------------------------------------------

DELIMITER $$

Create Procedure USP_JAVA_DeletaAcomp(
P_Cod_Acmp int
)
begin
delete from Acompanhantes where P_Cod_Acmp = P_Cod_Acmp;
END $$

DELIMITER ;

 -- ------------------------------------------------Comanda_Produto--------------------------------------------------------------------------------
 
DELIMITER $$

Create Procedure USP_JAVA_InsereComanda_Produto(
P_Cod_Comanda int,
P_Cod_Produto int,
P_Cod_Usuario int

)
begin
SET SQL_SAFE_UPDATES=0;
insert into Comanda_Produto (Cod_Comanda, Cod_Produto, Cod_Usuario) VALUES (P_Cod_Comanda, P_Cod_Produto, P_Cod_Usuario);
update comanda set Total_Comanda = (select sum(Valor_Produto) from Comanda_Produto as CP join Produto as P on P.Cod_Produto = CP.Cod_Produto where Cod_Comanda = P_Cod_Comanda );
END $$

DELIMITER ;




-- ------------------------------------------------------------------------------------------

DELIMITER $$

Create Procedure USP_JAVA_DeletaComanda_Produto(
P_Cod_Item int
)
begin
delete from Comanda_Produto where Cod_Item = P_Cod_Item ;
END $$

DELIMITER ;
 
   -- ----------------------------------------INSERTS-------------------------------------------------------------------------------------------

-- call JAVA_USP_CadastrarCliente('399.305.868-22', 'Alex Santos', '1993-01-19', '(11) 96695-3355', '(11) 2258-2212','Marconi', 107, '',
-- '02.645-000', 'Centro', 'São Paulo', 'SP', 'alexsantosinformatica@gmail.com','senha123' );

call JAVA_USP_InsereCategoria ('Single', 1, 100.00);  
call JAVA_USP_InsereCategoria ('Duplo', 2, 200.00);  
call JAVA_USP_InsereCategoria ('Triplo', 3, 300.00);  
call JAVA_USP_InsereCategoria ('Quádruplo', 4, 400.00);  
call JAVA_USP_InsereCategoria ('Quíntuplo', 5, 500.00);  
call JAVA_USP_InsereCategoria ('Especial', 6, 600.00);  

call JAVA_USP_InsereApartamento ('Single com vista para o Mar', 'D', 1);
call JAVA_USP_InsereApartamento ('Duplo com vista para o Mar', 'D', 2);
call JAVA_USP_InsereApartamento ('Triplo com vista para o Mar', 'M', 3);  
call JAVA_USP_InsereApartamento ('Quádruplo com vista para o Mar', 'D', 4);
call JAVA_USP_InsereApartamento ('Quíntuplo com vista para o Mar', 'D', 5); 
call JAVA_USP_InsereApartamento ('Especial com vista para o Mar', 'D', 6);

call JAVA_USP_InsereSetor ('Bebidas');
call JAVA_USP_InsereSetor ('Cozinha');
call JAVA_USP_InsereSetor ('Mercadinho');
call JAVA_USP_InsereSetor ('Serviços');

call JAVA_USP_InsereProduto ('Coca Cola', 3.50, 'A', 1);
call JAVA_USP_InsereProduto('Prato Executivo', 14.00, 'A', 2);
call JAVA_USP_InsereProduto('Escova de Dente', 2.00, 'A', 3);
call JAVA_USP_InsereProduto('Massagem', 35.00, 'A', 4);

-- call JAVA_USP_INSERERESERVACOMANDA('2016-01-01','2016-01-02', 200.00, '399.305.868-22', 1, 1, 0.00);

-- call USP_JAVA_INSEREACOMPANHANTE ('350.007.518-50', 'Flávia Santos', '1986-04-18', 1);  
 
call USP_JAVA_InsereUsuario ('Alison Henrique', 'Alison', '123', 'Adm');



   -- ---------------------------------------------------------

