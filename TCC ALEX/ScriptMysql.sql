
DROP DATABASE IF EXISTS Pizzaria;
create database Pizzaria;
 

use Pizzaria;
 
-- ---------------------------------------
create table Cliente
(
Cod_Cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Nome_Cliente VARCHAR(40),
CPF_Cliente VARCHAR(15),
Endereco_Cliente VARCHAR(40),
Numero_Residencia int,
Numero_Apartamento int,
Bairro_Cliente Varchar(30),
CEP_Cliente VARCHAR(9),
Estado_Cliente VARCHAR(2),
Cidade_Cliente VARCHAR(20),
Complemento_Cliente VARCHAR(40),
Telefone_Cliente VARCHAR(14),
Celular_Cliente VarChar (15),
Login_Cliente VARCHAR(40),
Senha_Cliente Varchar (15),
DataNascimento DATE,
DataCadastro DATE
);
-- ---------------------------------------
create table TipoDespesa
(
codTipoDespesa INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
NomeDespesa VARCHAR(50) unique,
SituacaoDespesa varchar(10)
);
-- ---------------------------------------
create table Despesa
(
codDespesa INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
ValorDespesa Decimal (6,2),
DataPagamento Date,
DataVencimento Date,
TipoDespesa INT,
Foreign key (TipoDespesa) References TipoDespesa (codTipoDespesa)
)
;
-- ---------------------------------------
create table Permissao
(
Cod_Permissao int AUTO_INCREMENT  Primary Key,
Cargo Varchar (20)
);
-- ---------------------------------------
create table Funcionario
(
Cod_Funcionario INT AUTO_INCREMENT PRIMARY KEY,
Nome_Func VARCHAR(40),
CPF_Funcionario VARCHAR(15),
Endereco_Funcionario VARCHAR(40),
Complemento_Funcionario VARCHAR(40),
Numero_Residencia VARCHAR(6),
CEP_Funcionario VARCHAR(10),
Estado_Funcionario CHAR(2),
Cidade_Funcionario VARCHAR(20),
Bairro_Funcionario VarChar (30),
Email_Funcionario VARCHAR(40),
Celular_Funcionario VarChar (15),
Telefone_Funcionario VarChar (14),
Data_Nasc Date,
Salario decimal(6,2),
Login_Funcionario VARCHAR(30) unique,
Senha_Funcionario VARCHAR(20),
Cod_Permissao INT,
Foreign key (Cod_Permissao) References Permissao (Cod_Permissao)
)
;
-- ---------------------------------------
create table Categoria
(
CodCategoria int auto_increment  Primary Key,
NomeCategoria VarChar (40)
);
-- ---------------------------------------
create table Insumo
(
Cod_Insumo INT AUTO_INCREMENT PRIMARY KEY,
Nome_Insumo VARCHAR(40),
ValorDeCompra DECIMAL (6,2),
QtdeRecomendavel decimal (6,3),
QtdeEmEstoque decimal(6,3),
Fabricacao DATE,
Validade VarChar(10),
Medida VARCHAR(10)
);
-- ---------------------------------------
create table Produto
(
Cod_Produto INT AUTO_INCREMENT PRIMARY KEY,
Nome_Produto VARCHAR(40),
Valor_Venda DECIMAL(6,2),
Sobe_Site INT
);
-- ---------------------------------------
create table Pedido
(
Cod_Pedido INT AUTO_INCREMENT PRIMARY KEY,
Data date,
Hora VarChar(5),
Valor numeric (5,2),
Cod_Funcionario INT,
Cod_Cliente INT,
Observacao VarChar (140),
Origem VarChar (10),
Estado VarChar(12),
EnderecoAlt VarChar(140),
NumeroResidencialAlt VarChar(5),
NumeroApartamentoAlt VarChar(5),
BairroAlt varchar(20),
FormaDePagamento varchar(10),
ValorPago dec (6,2),
Foreign key (Cod_Funcionario) References Funcionario (Cod_Funcionario),
Foreign key (Cod_Cliente) References Cliente (Cod_Cliente)
)

;
-- ---------------------------------------
create table Fornecedor
(
Cod_Fornecedor INT AUTO_INCREMENT PRIMARY KEY,
CNPJ_CPF varchar(18),
Razao_Social VARCHAR(50),
Nome_Fantasia VARCHAR(50),
Nome_Banco VARCHAR(30),
Agencia VARCHAR(15),
Conta_Corrente VARCHAR(20),
Responsavel VARCHAR(30),
Celular_Responsavel VARCHAR(15),
Email_Responsavel VARCHAR(50),
Telefone_Comercial VARCHAR(40),
Endereco_Fornecedor VarChar (40),
Numero_Residencia VarChar (5),
CEP_Fornecedor VarChar (10),
Estado_Fornecedor VarChar (2),
Cidade_Fornecedor VarChar (20),
Bairro_Fornecedor VarChar (30),
Complemento VarChar (40)
);
-- ---------------------------------------
create table Insumo_Fornecedor
(
Cod_InsumoFornecedor int auto_increment  Primary Key,
Cod_Insumo INT,
Cod_Fornecedor INT,
Foreign key (Cod_Insumo) References Insumo(Cod_Insumo),
Foreign key (Cod_Fornecedor) References Fornecedor(Cod_Fornecedor)
)
;
-- ---------------------------------------
create table ProdutoCategoria
(
CodProdutoCategoria int auto_increment  Primary Key,
CodProduto INT,
CodCategoria INT,
Foreign key (CodCategoria) References Categoria(CodCategoria),
Foreign key (CodProduto) References Produto(Cod_Produto)
)
;
-- ---------------------------------------
create table InsumoCategoria
(
CodInsumoCategoria int auto_increment  Primary Key,
CodInsumo INT,
CodCategoria INT,

Foreign key (CodInsumo) References Insumo(Cod_Insumo),
Foreign key (CodCategoria) References Categoria(CodCategoria)
)
;
-- ---------------------------------------
create table Consumo
(
CodConsumo int auto_increment  Primary Key,
CodInsumo INT,
CodProduto INT,
Quantidade DECIMAL (6,3),
Foreign key (CodInsumo) References Insumo(Cod_Insumo),
Foreign key (CodProduto) References Produto(Cod_Produto)
)
;
-- ---------------------------------------
create table Promocao
(
Cod_Promocao INT AUTO_INCREMENT PRIMARY KEY,
Nome_Promocao VARCHAR(40),
Descricao VARCHAR(150),
PorcentagemDesconto int,
Vigencia Date,
sobe_promocao INT,
AcessivelATodos INT
);
-- ---------------------------------------
create table ProdutoPromocao
(
codPromocaoProduto INT AUTO_INCREMENT PRIMARY KEY,
Cod_Produto INT,
Cod_Promocao INT,
Foreign key (Cod_Produto) References Produto(Cod_Produto),
Foreign key (Cod_Promocao) References Promocao(Cod_Promocao)
)
;
-- ---------------------------------------
create table CompraFornecedor
(
Cod_Compra INT AUTO_INCREMENT PRIMARY KEY,
Valor_Compra DECIMAL(10,2),
Data_Venda DATE,
Cod_Fornecedor INT,
Cod_Funcionario INT,

Foreign key (Cod_Fornecedor) References Fornecedor(Cod_Fornecedor),
Foreign key (Cod_Funcionario) References Funcionario(Cod_Funcionario)
)
;
-- ---------------------------------------
create table Detalhe_Pedido
(
Cod_Detalhe INT AUTO_INCREMENT PRIMARY KEY,
Cod_Produto INT,
Cod_Produto2 INT,
Cod_Pedido INT,

Foreign key (Cod_Produto) References Produto(Cod_Produto),
Foreign key (Cod_Produto2) References Produto(Cod_Produto),
Foreign key (Cod_Pedido) References Pedido(Cod_Pedido)
)
;
-- ---------------------------------------
create table Pagamento
(
Cod_Pagamento INT AUTO_INCREMENT PRIMARY KEY,
ValorPagamento DECIMAL (6,2),
DataExpedido DATE,
TipoPagamento VARCHAR(20),
Cod_Funcionario INT,
Foreign key (Cod_Funcionario) References Funcionario(Cod_Funcionario)
)
;
-- ---------------------------------------
create table DetalheCompra
(
codcomprainsumo int auto_increment  primary key,
cod_compra int,
cod_fornecedor int,
cod_insumo int,
valor_insumo decimal (6,2),
qdt_comprada decimal (6,2),
Foreign key (cod_compra) References comprafornecedor (cod_compra),
Foreign key (cod_fornecedor) References Fornecedor (cod_fornecedor),
Foreign key (cod_insumo) References insumo (cod_insumo)
)
;
-- ---------------------------------------
create table Lembretes
(
codLembrete int auto_increment  primary key,
codFuncionario int,
Assunto varchar (100),
Mensagem varchar (1000),
DataCriacao date,
DataAviso date, 
Aviso int,
Foreign key (codFuncionario) References Funcionario (Cod_Funcionario)

)
;
-- ---------------------------------------
create table Mensagens
(
CodMensagem int auto_increment  primary key,
CodRemetente int,
CodDestinatario int ,
Assunto varchar (100),
Mensagem varchar (1000),
DataCriacao date,
HoraCriacao time,
Aviso int,
Foreign key (CodRemetente) References Funcionario (Cod_Funcionario),
Foreign key (CodDestinatario) References Funcionario (Cod_Funcionario)
)
;
	-- ------------------------------------------------------------ 
	-- ------------------------------------------------------------ 
	-- ------------------ *** INSERT'S *** ------------------------ 
	-- ------------------------------------------------------------ 
	-- ------------------------------------------------------------ 

insert into Cliente
(
Nome_Cliente,
CPF_Cliente,
Endereco_Cliente,
Numero_Residencia,
Numero_Apartamento,
Bairro_Cliente,
CEP_Cliente,
Estado_Cliente,
Cidade_Cliente,
Complemento_Cliente,
Telefone_Cliente,
Celular_Cliente,
Login_Cliente,
Senha_Cliente,
DataNascimento,
DataCadastro
)
values
('Avulso','111.111.111-11','',1,null,'a','1','aa','aaa','aaa','1',null,'a','a','19/03/1908','19/07/1907'),

('João da Cunha','123.456.789-14','Rua das Caviunas',49,32,'Alphaville','78061-302','SP','Barueri','Edifício Pelicano','(11) 4972-1976',null,'joao.cunha@gmail.com','joaocunha123','27/07/1981','11/07/1980'),

('Maria Joaquina','814.198.872-68','Rua Canjeranas',574,null,'Jabaquara','04349-020','SP','São Paulo',null,'(11)3697-4567','(11)9-7419-9715','carrossel@sbt.com.br','cirilo123','04/10/1994','02/11/1998'),

('Sandra Costa da Silva','496.527.352-98','Rua dos Bobos',9,727,'Jardins','18949-850','SP','São Paulo',null,'(11)5789-1240','(11)9-8752-6714','sandra@gmail.com','costa123','16/12/1977','18/05/1975'),

('Gabriel Andrade Yamotsu','155.157.758-61','Rua das Laranjeiras',1785,null,'Capão Redondo','54189-206','SP','São Paulo','Em frente ao Habibs','(11)4972-1546',null,'andrade@yahoo.com','andrade123','12/05/1985','18/11/1982');

 
-- ---------------------------------------
insert into Permissao
(
Cargo
)
values
('Administrador'),
('Gerente'),
('Atendente'),
('Entregador'),
('Operador'); 
 
-- ---------------------------------------
insert into Funcionario
(
Nome_Func,
CPF_Funcionario,
Endereco_Funcionario,
Complemento_Funcionario,
Numero_Residencia,
CEP_Funcionario,
Estado_Funcionario,
Cidade_Funcionario,
Bairro_Funcionario,
Email_Funcionario,
Telefone_Funcionario,
Celular_Funcionario,
Login_Funcionario,
Senha_Funcionario,
Cod_Permissao
)
values
('Roberto Carlos','128.589.519-87','Rua Roberto Carlos', null,159,'12598-11','SP','São Paulo','Roberto Carlos','roberto@carlos.rob.ca','(11)4529-4196','(11)9-7988-4895','Roberto','123', 1),
('Maria do Carmo','128.589.519-87','Rua dos Funcionários',null,159,'12598-11','SP','São Paulo','Santa Cecília','maria_teste@hotmail.com','(11)4529-4196','(11)9-7988-4895','Maria','123', 4),
('Joana Figueiredo','932.571.495-28','Rua Coronel Justino','Bloco D',1050,'28984-79','SP','São Paulo','Suzano','joana.fig@terra.com.br','(11)7819-4898','(11)9-6187-8959','Admin','123', 4),
('Carlos Silva','475.427.106-85','Rua Juba da Jujuba',null,420,'59579-14','SP','São Paulo','Vila Mariana','carlos_silva@gmail.com','(11)4198-8274','(11)9-9658-9774','Carlos','123', 4),
('Alex Santos','399.305.868-22','Rua Pindamonhangaba',null,666,'023654-14','SP','São Paulo','Vila Tupiniquim','alexsantos@gmail.com','(11)4578-8274','(11)9-9852-9774','Alex','123', 1),
('Toninho Abreu','128.589.519-87','Rua das Dalágaras', null,159,'12598-11','SP','São Paulo','Vila Vira','tony@gmail.com','(11)4529-4196','(11)9-7988-4895','Tony','123', 2)
;

insert into Insumo
(
Nome_Insumo,
ValorDeCompra,
QtdeRecomendavel,
QtdeEmEstoque,
Medida
)
values
('Orégano', 20, 20, 12, 'Kg'),
('Queijo mussarela', 35, 30, 19, 'Kg'),
('Tomate', 15, 25, 20, 'Kg'),
('Calabresa Moída', 15, 30, 29, 'Kg'),
('Parmesão', 17, 20, 18, 'Kg'),
('Ovos', 12, 25, 17, 'Un.'),
('Presunto', 16, 15, 10, 'Kg'),
('Cebola', 9, 50, 12, 'Kg'),
('Catupiry', 16, 50, 23, 'Kg'),
('Pimenta', 8, 30, 1, 'Kg'),
('Lombo', 22, 25, 1, 'Kg'),
('Palmito', 19, 20, 1, 'Kg'),
('Champignon', 20, 15, 1, 'Kg'),
('Provolone', 19, 20, 18, 'Kg'),
('Bacon', 18, 25, 8, 'Kg'),
('Embalagem para Pizza', 31, 50, 70, 'Un.'),
('Massa para pizza', 50, 100, 200, 'Kg'),
('Molho de tomate', 8, 10, 20, 'Kg'),
('Azeitona', 15, 5, 15, 'Kg'),
('frango', 10, 10, 15, 'Kg'),
('Milho', 7, 5, 10, 'Kg'),
('Refrigerante', 2, 50, 70, 'Un.'),
('Cerveja', 2, 50, 90, 'Un.'),
('Vinho', 15, 10, 20, 'Un.'),
('Champagne', 15, 10, 20, 'Un.'),
('Camarão', 25, 2, 5, 'Kg');
 
-- ---------------------------------------
insert into Categoria
(
NomeCategoria
)
values
('Pizza'),
('Pizza Brotinho'),
('Bebidas não Alcóolicas'),
('Porções'),
('Embalagens'),
('Queijos'),
('Vegetais'),
('Massas'),
('Carnes'),
('Embutidos'),
('Frutas'),
('Temperos'),
('Carnes'),
('Peixes'),
('Frutos do Mar'),
('Embalagens'),
('Molhos'),
('Conservas'),
('Aves'),
('Bebidas Alcóolicas');
 
-- ---------------------------------------
insert into insumocategoria
(
codInsumo,
codCategoria
)
values
(1,12),
(2,6),
(3,11),
(4,10),
(5,6),
(6,9),
(7,10),
(8,7),
(9,6),
(10,12),
(11,10),
(12,7),
(13,7),
(14,6),
(15,9),
(16,16),
(17,8),
(18,17),
(19,18),
(20,19),
(21,18),
(22,3),
(23,20),
(24,20),
(25,20),
(26,15);

 
-- ---------------------------------------
insert into Produto
(
Nome_Produto,
Valor_Venda,
Sobe_Site
)
values
('(Campo vazio para utilização do sistema)',0,0),
('Pizza Baiana',20.00,1),
('Pizza Mussarela',18.40,1),
('Pizza Bacon',20.20,1),
('Pizza Americana',24.00,1),
('Pizza Bauru',23.50,1),
('Pizza Calabresa',18.00,1),
('Pizza Catupiry',23.00,1),
('Pizza Três Queijos',24.70,1),
('Pizza Alemã',25.20,1),
('Pizza Havaiana Brotinho',13.70,1),
('Pizza Baiana Brotinho',14.50,0),
('Pizza Palmito Brotinho',15.00,0),
('Pizza Peruana Brotinho',14.00,0),
('Refrigerante',7.00,0),
('Cerveja',9.40,0),
('Vinho',15.50,0),
('Champagne',17.00,0),
('Porção de Camarão',19.00,0),
('Porção de Calabresa',18.00,0),
('Porção de Provolone',17.00,0);
 
-- ---------------------------------------
insert into ProdutoCategoria
(
CodCategoria,
CodProduto
)
values
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(2,10),
(2,11),
(2,12),
(2,13),
(3,14),
(3,15),
(3,16),
(3,17),
(4,18),
(4,19),
(4,20);
 
-- ---------------------------------------
insert into Pedido
(Data,Hora,Valor,Cod_Funcionario,Cod_Cliente, Observacao,Origem,Estado, EnderecoAlt, BairroAlt, NumeroResidencialAlt, NumeroApartamentoAlt ,FormaDePagamento,ValorPago)
values
('05/01/2015','20:15',90.30,1,2,'','Site','A caminho','','','','','Cheque',90.30),
('05/01/2015','20:15',58.40,1,3,'','Site','A caminho','','','','','Dinheiro',58.40),
('05/01/2015','20:15',147.50,1,4,'','Site','A caminho','Alameda Itu','','32','21','Cartão',147.50),

('05/01/2015','20:15',65.60,2,2,'','Site','A caminho','','','','','Cartão',65.60),
('05/01/2015','20:15',65.60,2,3,'','Site','A caminho','Travessa Dom Gaspar','','666','','Cheque',65.60),
('05/01/2015','20:15',56.80,2,4,'','Site','A caminho','','','','','Dinheiro',56.80),

('05/01/2015','20:15',75.00,3,2,'','Site','Na Fila','Avenida Paulista', '','756','35','Cheque',75.00),
('05/01/2015','20:15',65.60,3,3,'','Site','A caminho','','','','','Dinheiro',65.60),
('05/01/2015','20:15',65.60,3,4,'','Site','Em Preparo','','','','','Cartão',65.60),

('05/01/2015','20:15',204.30,4,2,'','Site','Na Fila','','','','','Cartão',204.30),
('05/01/2015','20:15',65.60,4,3,'','Site','Em Preparo','','','','','Cartão',65.60),
('05/01/2015','20:15',65.60,4,4,'','Site','A caminho','','','','','Cartão',65.60),

('05/01/2015','23:56',22.00,2,3,'','Site','Em Preparo','','','','','Cartão',56.80),
('05/01/2015','18:31',65.87,3,4,'','Site','Na Fila','','','','','Cartão',75.00),
('22/02/2015','19:14',65.60,2,2,'','In loco','Cancelado','','','','','Dinheiro', 65.60),
('12/03/2015','22:57',38.89,3,3,'','Telefone','Realizado','Alameda Itu','', '753', '', 'Cartão',65.60),
('05/04/2015','22:22',68.98,1,5,'','Site','Realizado','', '', '', '', 'Cartão',56.80),
('05/04/2015','21:40',78.98,4,3,'Manera na cebola','Site','Cancelado','' ,'' , '','','Cartão',147.50),
('05/04/2015','22:22',65.60,1,5,'','Site','Cancelado','', '', '', '','Cartão',65.60),
('06/04/2015','21:15',65.60,4,5,'','In loco','Cancelado', '', '', '', '','Cartão',65.60),
('07/04/2015','20:22',65.60,3,5,'Sem azeitonas, pelo amor de Deus','Site','Realizado','','','', '','Cartão',65.60),
('20/04/2015','22:57',56.60,2,5,'','In loco','Realizado','','','', '','Cartão',56.80),
('22/05/2015','18:49',70.00,1,4,'','Site','Realizado','Rebouças', '', '32', '','Dinheiro',75.00),
('06/06/2015','00:16',75.00,3,2,'Favor, ao chegar, ligar no meu celular e não pelo interfone nem campainha','Site','Cancelado','','','', '','Cartão',75.00),
('06/04/2015','21:15',75.00,2,5,'','In loco','Cancelado','','','', '','Cartão',75.00);
 
-- ---------------------------------------
insert into Fornecedor
(
CNPJ_CPF,
Razao_Social,
Nome_Fantasia,
Nome_Banco,
Agencia,
Conta_Corrente,
Responsavel,
Celular_Responsavel,
Email_Responsavel,
Telefone_Comercial,
Endereco_Fornecedor,
Numero_Residencia,
CEP_Fornecedor,
Estado_Fornecedor,
Cidade_Fornecedor,
Bairro_Fornecedor,
Complemento
)
values
('222-222-222-22', 'Caixa de Queijo Ltda', 'Queijo in Box', 'Itaú', '0000', '1111-0', 'John Cheese', '91111-1111', 'jc_queijos@jc.com', '(11)2222-3333', 'Rua dos Tupinambás', '456', '01234-000', 'SP', 'São Paulo', 'Jardim Mundial', '6º Andar'),

('333-333-333-33', 'Embalagens São Paulo EPP', 'SP Embalagens', 'Banco do Brasil', '1234', '4321-5', 'Josué Alvarenga', '95555-6666', 'embalagens@sp.com.br', '(11)1111-9999', 'Avenida Cascatinhas', '881', '09876-123', 'SP', 'Suzano', 'Vila Emerson', 'Sobreloja'),

('111-111-111-11', 'Na Lata - Enlatados em geral Ltda', 'Na Lata!', 'Bradesco', '0055', '055678-2', 'Clóvis Ribeiro', '98888-4444', 'enlatados@clovis.com', '(13)3456-7890', 'Avenida da Orla', '200', '02345-987', 'SP', 'Santos', 'Paquetá', 'Zona Portuária'),

('444-444-444-44', 'Hortaliças Hortolândia EPP', 'Viva Verde Hortaliças', 'Santander', '9966', '013568-7', 'Romualdo Nunes', '97777-5501', 'rn@vivaverde.com.br', '(11)2233-5678', 'Rua do Chá', '56', '03456-321', 'SP', 'São Paulo', 'Ceasa', 'Box 100');
 
-- ---------------------------------------
insert into Promocao
(
Nome_Promocao,
Descricao,
PorcentagemDesconto,
Vigencia,
sobe_promocao,
AcessivelATodos
)
values
('Final de semana','Pizzas com 15% de desconto até dia 23 de Maio!',85, '2015-05-23', 1,0),
('Super três queijos','Pizza de três queijos com 25% de desconto!.',75, '2016-01-01', 1,0),
('Olha o refrigerante','Refrigerante agora está mais barato',90, '2016-01-01', 1, 1);
 
-- ---------------------------------------
insert into insumo_fornecedor
(
Cod_Insumo,
Cod_Fornecedor
)
values
(2, 1),
(3, 4),
(1, 4);
 
-- ---------------------------------------
insert into Consumo
(
CodProduto,
CodInsumo,
Quantidade
)
values
(1,4,0.300),
(1,10,0.50),
(1,17,0.400),
(1,18,0.100),
(1,8,0.100),
(1,19,0.050),
(1,16,1),

(2,2,0.400),
(2,19,0.050),
(2,1,0.50),
(2,16,1),
(2,17,0.400),
(2,18,0.100),

(3,2,0.300),
(3,15,0.300),
(3,19,0.050),
(3,8,0.100),
(3,16,1),
(3,3,0.100),
(3,13,0.100),
(3,17,0.400),
(3,18,0.100),

(4,2,0.300),
(4,4,0.300),
(4,19,0.050),
(4,10,0.100),
(4,8,0.100),
(4,16,1),
(4,17,0.400),
(4,18,0.100),

(5,2,0.300),
(5,7,0.300),
(5,8,0.100),
(5,16,1),
(5,17,0.400),
(5,18,0.100),
(5,19,0.050),

(6,4,0.300),
(6,8,0.100),
(6,16,1),
(6,17,0.400),
(6,18,0.100),
(6,19,0.050),

(7,2,0.300),
(7,9,0.200),
(7,16,1),
(7,17,0.400),
(7,18,0.100),
(7,19,0.050),

(8,2,0.300),
(8,9,0.200),
(8,5,0.200),
(8,16,1),
(8,17,0.400),
(8,18,0.100),
(8,19,0.050),

(9,8,0.100),
(9,11,0.300),
(9,2,0.300),
(9,1,0.50),
(9,16,1),
(9,17,0.400),
(9,18,0.100),
(9,19,0.050),

(10,20,0.300),
(10,21,0.200),
(10,12,0.200),
(10,16,1),
(10,17,0.400),
(10,18,0.100),
(10,19,0.050),

(11,4,0.300),
(11,10,0.100),
(11,16,1),
(11,17,0.400),
(11,18,0.100),
(11,19,0.050),

(12,2,0.200),
(12,1,0.50),
(12,12,0.200),
(12,5,0.300),
(12,16,1),
(12,17,0.400),
(12,18,0.100),
(12,19,0.050),

(13,7,0.300),
(13,6,3),
(13,11,0.300),
(13,2,0.300),
(13,1,0.050),
(13,16,1),
(13,17,0.400),
(13,18,0.100),
(13,19,0.050),

(14,22,1),

(15,23,1),

(16,24,1),

(17,25,1),

(18,26,0.400),

(19,4,0.400),

(20,14,0.400);
 
-- ---------------------------------------
insert into ProdutoPromocao
(
Cod_Promocao,
Cod_Produto
)
values
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 9),
(2, 8),
(3, 14);
 
-- ---------------------------------------
insert into CompraFornecedor
(
Valor_Compra,
Data_venda,
Cod_Fornecedor,
Cod_Funcionario
)
values
(450.00, '15/10/2015', 1,1),
(290.00, '20/09/2015', 3,2),
(200.00, '17/09/2015', 2,3),
(350.00, '22/10/2015', 4,3);
 
-- ---------------------------------------
insert into Detalhe_Pedido
(
cod_pedido,
cod_produto2,
cod_produto
)
values
(1,5,1),
(1,0,2),
(1,4,3),
(1,0,14),
(1,0,8),

(2,0,1),
(2,5,1),
(2,0,2),

(3,0,1),
(3,0,2),
(3,5,3),
(3,0,4),
(3,9,5),
(3,0,6),
(3,0,14),
(3,0,14),
(3,0,15),

(4,0,1),
(4,0,2),
(4,6,3),
(4,0,14),

(5,0,1),
(5,0,2),
(5,7,3),
(5,0,14),

(6,0,1),
(6,0,2),
(6,0,2),

(7,0,1),
(7,0,2),
(7,0,3),
(7,0,14),
(7,0,15),

(8,0,1),
(8,0,2),
(8,0,3),
(8,0,14),

(9,0,1),
(9,0,2),
(9,0,3),
(9,0,14),

(10,0,1),
(10,0,2),
(10,0,2),

(10,0,1),
(10,0,2),
(10,0,3),
(10,0,4),
(10,0,5),
(10,0,6),
(10,0,14),
(10,0,14),
(10,0,15),

(11,0,1),
(11,0,2),
(11,0,3),
(11,0,14),

(12,0,1),
(12,0,2),
(12,0,3),
(12,0,14),

(13,0,1),
(13,0,2),
(13,0,2),

(14,0,1),
(14,0,2),
(14,0,3),
(14,0,14),
(14,0,15),

(15,0,1),
(15,0,2),
(15,0,3),
(15,0,14),

(16,0,1),
(16,0,2),
(16,0,3),
(16,0,14),

(17,0,1),
(17,0,2),
(17,0,2),

(18,0,1),
(18,0,2),
(18,0,3),
(18,0,4),
(18,0,5),
(18,0,6),
(18,0,14),
(18,0,14),
(18,0,15),

(19,0,1),
(19,0,2),
(19,0,3),
(19,0,14),

(21,0,1),
(21,0,2),
(21,0,3),
(21,0,14),

(22,0,1),
(22,0,2),
(22,0,2),

(23,0,1),
(23,0,2),
(23,0,3),
(23,0,14),
(23,0,15),

(24,0,1),
(24,0,2),
(24,0,3),
(24,0,14),
(24,0,15);

 
-- ---------------------------------------
insert into TipoDespesa
(
NomeDespesa,
SituacaoDespesa
)
values
('Gás encanado','Ativo'),
('Butijão de gás','Inativo'),
('Água','Ativo'),
('Energia elétrica','Ativo'),
('Telefone','Ativo');
 
-- ---------------------------------------
insert into Despesa
(
ValorDespesa,
DataPagamento,
DataVencimento,
TipoDespesa
)
values
(112.35, '17/02/2015', '17/02/2015', 1),
(87.35, '15/04/2015', '17/04/2015', 4),
(182.35, '14/05/2015', '17/05/2015', 5),
(120.35, '13/06/2015', '17/06/2015', 3);
 
-- ---------------------------------------
insert into Pagamento
(
ValorPagamento,
DataExpedido,
TipoPagamento,
Cod_Funcionario
)
Values
(
2500.00,'2015-01-11', 'Salário', 2
);
 
-- ---------------------------------------
insert into DetalheCompra 
values
(1,1,2,35,6),
(1,1,9,16,15),
(3,2,16,50,4),
(4,4,3,15,10),
(4,4,1,20,10),
(2,3,13,20,10),
(2,3,8,9,10);
 
-- ---------------------------------------
insert into Mensagens (CodRemetente, CodDestinatario, Assunto, Mensagem, DataCriacao, HoraCriacao, Aviso)
values
(5,2,'Pizza doce','Lembrar de inserir Pizza doce no cardápio','2015-06-15','15:12:27',1),
(5,1,'Teleffy','Favor pegar o Teleffy do Talaris','2015-06-15','15:12:27',1),
(5,3,'Integrante','Lembrar de lembrar','2015-06-14','15:12:27',1),
(5,4,'Insumos','Checkar Insumos','2015-06-14','16:12:27',1),
(2,5,'Relatórios','Favor enviar relatório do mês de Abril','2015-06-15','18:12:27',1),
(3,5,'Despesas','Favor cadastrar despesas das novas contas','2015-06-15','15:12:27',1),
(1,5,'Salário','Efetuar o Pagamento do Sr João','2015-06-14','18:12:27',1),
(3,5,'Encontro','Hoje, às 21h?','2015-06-14','15:12:27',1);
 


-- -------------------------------------Procedures Java------------------------------------------------
-- ------------------------------------RELATÓRIO---------------------------------------------
-- -TODO: mudar nome dessa proc pra se adequar à nomenclatura de entrega do Professor Luiz Ricardo
delimiter //

create procedure USP_JAVA_Relatorios
(
	p_DataInicial Date,
	p_DataFinal Date,
	p_BinarioFuncionario Int,
	p_BinarioDespesa Int,
	p_BinarioCompras Int,
	p_BinarioPedidos Int,
	p_BinarioPromocao Int
)	
begin

declare 

	v_TotalDespesa double default 0.00;
	declare v_TotalFuncionario double default 0.00;
	declare v_TotalCompras double default 0.00;
	declare v_TotalPedidos double default 0.00;
	declare v_TotalPromocao double default 0.00;
	declare v_TotalGeral double default 0.00;
	declare v_TotalPrejuizo double default 0.00;
	declare v_TotalReceita double default 0.00;

begin
	
	if p_BinarioFuncionario = 1
	then
			set v_TotalFuncionario = (select SUM  (ValorPagamento) from Pagamento where DataExpedido between p_DataInicial and p_DataFinal);

			if v_TotalFuncionario is null
			then
			set v_TotalFuncionario = 0;
			end if;

	end if;
	

	if p_BinarioDespesa = 1
	then

			set v_TotalDespesa = (select  sum(ValorDespesa) from despesa where DataPagamento between p_DataInicial and p_DataFinal);

			if v_TotalDespesa is null
			then
			set v_TotalDespesa = 0;
			end if;

	end if;

	if p_BinarioCompras = 1
	then

			set v_TotalCompras = (select SUM (Valor_Compra) from CompraFornecedor where Data_Venda between p_DataInicial and p_DataFinal);

			if v_TotalCompras is null
			then
			set v_TotalCompras = 0;
			end if;

	end if;

	if p_BinarioPedidos = 1
	then
			set v_TotalPedidos = (select SUM (ValorPago) from Pedido where estado <>  'Cancelado' and Data between p_DataInicial and p_DataFinal);

			if v_TotalPedidos is null
			then
			set v_TotalPedidos = 0;
			end if;

	end if;

	if p_BinarioPromocao = 1
	then
			set v_TotalPromocao = (select sum (produtos.Valor_Venda) as ValorTotal from Promocao as promocao inner join ProdutoPromocao as produtoPromo on
                        produtoPromo.Cod_Promocao = promocao.Cod_Promocao inner join Produto as produtos on produtos.Cod_Produto = 
                        produtoPromo.Cod_Produto inner join Detalhe_Pedido as Dp on Dp.Cod_Produto = produtos.Cod_Produto inner join Pedido
                        as pedido on pedido.Cod_Pedido = Dp.Cod_Pedido and Data Between p_DataInicial and p_DataFinal);


			if v_TotalPromocao is null
			then
			set v_TotalPromocao = 0;
			end if;
			
	end if;

	set v_TotalPrejuizo = (v_TotalDespesa + v_TotalFuncionario + v_TotalCompras); 
	Set v_TotalReceita = v_TotalPedidos;
	set v_TotalGeral = v_TotalReceita - v_TotalPrejuizo; 
	

		Select 

		v_TotalPromocao as Promocoes,
		v_TotalPedidos as Pedidos,
		v_TotalCompras as Compras,
		v_TotalFuncionario as Funcionario,
		v_TotalDespesa as Despesa,
		
		v_TotalPrejuizo as Prejuizo, 
		v_TotalReceita as Receita, 
		v_TotalGeral as TotalGeral;
		
		
		end;

end;
//

delimiter ;


-- -----------------------------------------------------ProcInserirTipoDespesa------------------------------------------------------------
delimiter //

create procedure JAVA_USP_InserirTipoDespesa (
 p_NomeDespesa varchar (40))
 
 
 BEGIN
 
 declare v_SituacaoDespesa varchar (20);
 
 begin
 
 
 set v_SituacaoDespesa = 'Ativo';
 
 insert into TipoDespesa (NomeDespesa, SituacaoDespesa) values (p_NomeDespesa, v_SituacaoDespesa);
 
 end;

end;
//

delimiter ;


-- -----------------------------------------------------ProcAlterarTipoDespesa------------------------------------------------------------
delimiter //

create procedure JAVA_USP_AlterarTipoDespesa (

p_CodDespesa int,
p_NomeDespesa varchar (30),
p_SituacaoDespesa varchar (20))

begin

update TipoDespesa set NomeDespesa = p_NomeDespesa, SituacaoDespesa = p_SituacaoDespesa where codTipoDespesa = p_CodDespesa;

end;
//

delimiter ;


-- ------------------------------------------------ProcAlterarSenha------------------------------------------------------------------- 
delimiter //

create procedure JAVA_USP_AlterarSenha (
 p_Cod_Funcionario int,
 p_Login_funcionario Varchar (50),
 p_Senha_Funcionario Varchar (20),
 p_Cod_Permissao int)
 begin
 
 Update Funcionario set Login_funcionario = p_Login_funcionario, Senha_Funcionario = p_Senha_Funcionario, Cod_Permissao = p_Cod_Permissao where Cod_Funcionario = p_Cod_Funcionario;
 
 
 end;
 
 
 


//

delimiter ;


-- ------------------------------------------------------ProcLançaValores------------------------------------------------------------------
delimiter //

create procedure JAVA_USP_LancarDespesa
(
p_TipoDespesa int,
p_ValorDespesa double,
p_DataPagamento date,
p_DataVencimento date
)
begin

Insert into Despesa(TipoDespesa, ValorDespesa, DataPagamento, DataVencimento) values (p_TipoDespesa,p_ValorDespesa,p_DataPagamento,p_DataVencimento);

end;
//

delimiter ;



-- -----------------------------------------------------------------------------------------------------------------------------------------
delimiter //

create procedure JAVA_USP_AlteraDespesa
(
p_codDespesa int,
p_ValorDespesa double,
p_DataPagamento date,
p_DataVencimento date
)
begin

Update Despesa set ValorDespesa = p_ValorDespesa, DataPagamento = p_DataPagamento, DataVencimento = p_DataVencimento where codDespesa = p_codDespesa;

end;
//

delimiter ;



-- -------------------------------------------------------PagamentoFuncionario-------------------------------------------------------------
delimiter //

create procedure JAVA_USP_LancamentoFuncionario (
p_ValorPagamento double,
p_DataExpedido date,
p_TipoPagamento varchar (30),
p_CodFuncionario int)
begin
	insert into Pagamento (ValorPagamento, DataExpedido, TipoPagamento, Cod_Funcionario)
	Values (p_ValorPagamento, p_DataExpedido, p_TipoPagamento, p_CodFuncionario);
end;
//

delimiter ;



-- --------------------------------------------------------------------------------------------------------------------------------------------
delimiter //

create procedure JAVA_USP_AlteracaoFuncionario (
p_ValorPagamento double,
p_DataExpedido date,
p_TipoPagamento varchar (30),
p_CodFuncionario int,
p_codDespesa int)
begin
	update Pagamento set ValorPagamento = p_ValorPagamento, DataExpedido = p_DataExpedido, TipoPagamento = p_TipoPagamento, Cod_Funcionario = p_CodFuncionario
	where cod_pagamento = p_codDespesa;
end;
//

delimiter ;


-- -------------------------------------------------------Lembretes-------------------------------------------------------------
delimiter //

create procedure USP_JAVA_INSERELEMBRETE
(

p_codFuncionario int,
p_Assunto varchar (100),
p_Mensagem varchar (500),
p_DataCriacao date,
p_DataAviso date, 
p_Aviso int


)

begin

insert into Lembretes (codFuncionario,Assunto,Mensagem,DataCriacao,DataAviso,Aviso) 
values (p_codFuncionario, p_Assunto, p_Mensagem, p_DataCriacao, p_DataAviso, p_Aviso );

end;
//

delimiter ;


-- -------------------------------------------------------Lembretes-------------------------------------------------------------
delimiter //

create procedure USP_JAVA_ALTERALEMBRETE
(
p_codLembrete int,
p_codFuncionario int,
p_Assunto varchar (100),
p_Mensagem varchar (500),
p_DataAviso date, 
p_Aviso int

)

begin

Update Lembretes set codFuncionario = p_codFuncionario,Assunto = p_Assunto,
Mensagem = p_Mensagem,DataAviso = p_DataAviso, Aviso = p_Aviso where codLembrete = p_codLembrete;


end;

-- -------------------------------------------------------Lembretes-------------------------------------------------------------

//

delimiter ;


-- --------------
delimiter //

create procedure USP_JAVA_EXCLUILEMBRETE
(
p_codLembrete int

)

begin

delete Lembretes where codLembrete = p_codLembrete

end;


//

delimiter ;


-- -------------------------------------------------------Backup-------------------------------------------------------------
delimiter //

create procedure USP_JAVA_BACKUP
(p_Caminho varchar (200))


begin


BACKUP DATABASE Pizzaria TO DISK = p_Caminho
 WITH FORMAT, MEDIANAME = 'GiovanellisBackup', NAME = 'GiovanellisBackup';

end;

//

delimiter ;


-- ------------------------------------------------------Mensagens----------------------------------------------------------
delimiter //

create procedure USP_JAVA_ENVIARMENSAGEM
(
p_codRemetente int,
p_CodDestinatario int,
p_Assunto varchar (100),
p_Mensagem varchar (1000)
)

begin
declare v_Aviso int;
set v_Aviso = 1;
Declare v_DataCriacao date;
set v_DataCriacao = NOW();
Declare v_HoraCriacao time(6);
set v_HoraCriacao =  Date_format(NOW(),114);

begin

insert into Mensagens 
(
CodRemetente, CodDestinatario, Assunto, Mensagem, DataCriacao,HoraCriacao, Aviso
)
values
(
p_codRemetente, p_CodDestinatario, p_Assunto, p_Mensagem, v_DataCriacao,v_HoraCriacao, v_Aviso
);

End;



end;
//

delimiter ;


-- ---------------------------------------------------------------------------------------------------------------------------------
delimiter //

create procedure USP_JAVA_RESPONDERMENSAGEM
(
p_CodMensagem int,
p_Mensagem varchar (1000),
p_Assunto varchar (100),
p_codRemetente int,
p_CodDestinatario int
)

begin
declare v_Aviso int;
set v_Aviso = 1;
Declare v_DataCriacao date;
set v_DataCriacao = NOW();
Declare v_HoraCriacao time(6);
set v_HoraCriacao =  Date_format(NOW(),114);

begin


update Mensagens set CodRemetente = p_codRemetente, CodDestinatario = p_CodDestinatario, Mensagem = p_Mensagem, Assunto = p_Assunto, Aviso =v_Aviso, DataCriacao = v_DataCriacao,  HoraCriacao = v_HoraCriacao
where CodMensagem = p_CodMensagem;

end;


end;
//

delimiter ;


-- ------------------------------------------------------------------------------------------------------------------------------------
delimiter //

create procedure USP_JAVA_ENCAMINHARMENSAGEM
(
p_codRemetente int,
p_CodDestinatario int,
p_Assunto varchar (100),
p_Mensagem varchar (1000)
)

begin
declare v_Aviso int;
set v_Aviso = 1;
Declare v_DataCriacao date;
set v_DataCriacao = NOW();
Declare v_HoraCriacao time(6);
set v_HoraCriacao =  Date_format(NOW(),114);

begin

insert into Mensagens 
(
CodRemetente, CodDestinatario, Assunto, Mensagem, DataCriacao,HoraCriacao, Aviso
)
values
(
p_codRemetente, p_CodDestinatario, p_Assunto, p_Mensagem, v_DataCriacao,v_HoraCriacao, v_Aviso
);

End;


end;
//

delimiter ;



-- ---------------------------------------------------------------------------------------------
Delimiter //

Create procedure USP_JAVA_DELETARMENSAGEM (
p_CodMensagem int)


begin

delete from Mensagens where CodMensagem = p_CodMensagem;

end;
//

delimiter ;



