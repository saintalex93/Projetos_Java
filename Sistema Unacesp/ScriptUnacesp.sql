Drop database Unacesp;

Create database Unacesp;

Use Unacesp;

Create Table Empresa
(
CodEmp int primary key Auto_Increment,
NomeEmp Varchar (50) Not null,
EndEmp Varchar (50),
BairroEmp Varchar (50),
CidadeEmp Varchar (50),
NumEmp Smallint,
UfEmp Varchar (2),
CepEmp Varchar (8)
);


Create Table EndAss
(
CodEndAss int primary key Auto_Increment,
EndAss Varchar (50),
NumResAss smallint,
BairroRes Varchar (50),
CidadeRes Varchar (50),
UfRes Varchar (2),
CepRes Varchar (8)
);


Create Table Associado
(
CodAss int primary key,
NomeAss Varchar (50) not null,
CpfAss Varchar (11) not null unique,
RgAss Varchar (15) not null,
NascAss Date,
EstCivilAss Varchar (20),
DepAss Varchar (20),
FuncAss varchar (20),
TelRes Varchar (12),
TelCom Varchar (11),
CelAss Varchar (12),
CodBanco SmallInt not null,
NomeBanco Varchar (15) not null,
Agencia varchar (15) not null,
Conta varchar (20) not null,
Operacao varchar (10),
CodEndAss int,
CodEmp int,

FOREIGN KEY (CodEndAss) REFERENCES EndAss(CodEndAss),
FOREIGN KEY (CodEmp) REFERENCES Empresa(CodEmp)

);

Create Table Corretor 
(
CodCorretor smallint Primary Key not null unique,
NomeCorretor varchar (20)
);

Create table DpAss
(
CodDp int,
NomeDp Varchar (50),
NascDp Date,
PrtcDp Varchar (15),
CodAss int,
Foreign Key (CodAss) References Associado (CodAss)
);


Create Table Contrato 
(
CodAss int,
CodCorretor smallint,
VlrContrato float,
VlrAdesao float,
DtContrato date,
DtCobranca date,
Situacao Varchar (10),

Foreign Key (CodAss) References Associado (codAss),
Foreign Key (CodCorretor) References Corretor (codCorretor)

);


Create Table mensalidade
(
CodAss int,
CodMensalidade int primary key,
VlrMensalidade float,
DtMensalidade date,

Foreign Key (CodAss) References Associado (CodAss)
);


Insert into Empresa Values (1,'Emef Antonio Fenolio', 'Rua Jurandi', 'Vila Carmelina', 'Taboão', 150, 'SP', '01850080');

Insert into EndAss Values (1, 'Rua osasco', 81 ,'Jd Nayara','Embu das Artes','SP','06816620');

Insert into Associado Values (1, 'Tania Maria Bezerra', '12727845847', '193465012', '1968/09/16','Divorciada', 'Educação', 'PEB 1', '11972266174', '1138599965', '11963609237',033, 'Santander', '3726', '027454-3', '01', 1, 1);

Insert into Corretor values (302, 'Antônio');

Insert into DpAss values (1, 'Andrei da Cruz Bezerra da Silva', '1985/05/21', 'Filho', 1);

insert into contrato values (1, 302, 35.00, 0.00, '2016/09/02', '2016/09/01', 'Inativo');

Insert into mensalidade values (1, 1, 35.00, '2016/09/05');


Select * from Associado as Ass inner join Mensalidade as Men inner join Corretor inner join DpAss Inner join Empresa Inner join EndAss inner join contrato on men.CodMensalidade = 1 and Ass.codass = 1