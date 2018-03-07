Use master

set nocount on
declare @databasename varchar(100)
declare @query varchar(max)
set @query = ''

set @databasename = 'CaixaSantos'
if db_id(@databasename) < 4
begin
print 'system database connection cannot be killeed'
return
end
-----------------------------------
select @query=coalesce(@query,',' )+'kill '+convert(varchar, spid)+ '; '
from master..sysprocesses where dbid=db_id(@databasename)

if len(@query) > 0
begin
print @query
exec(@query)
end


if Exists (select * from sys.databases where name = 'CaixaSantos')
Drop database CaixaSantos

go

Create database CaixaSantos

go

use CaixaSantos

go


create table Conta
(
codConta int identity (1,1) primary key,
NomeConta Varchar (50),
Situacao int
)

create table SetorAlex
(
CodSetor int identity (1,1) primary key,
NomeSetor Varchar (50),
Situacao int,
Area Varchar (2),
CodConta int foreign key references Conta (codConta)
);

create table SetorPassarinha
(
CodSetor int identity (1,1) primary key,
NomeSetor Varchar (50),
Situacao int,
Area Varchar (2),
CodConta int foreign key references Conta (codConta)
);


create table SetorCasa
(
CodSetor int identity (1,1) primary key,
NomeSetor Varchar (50),
Situacao int,
Area Varchar (2),
CodConta int foreign key references Conta (codConta)
)

go


Insert into conta (NomeConta, Situacao) values ('Passarinha', 1), ('Gatão', 1), ('Casa', 1)

go

---------------------------------------Procedures------------------------------------

create procedure USP_InsereSetorAlex
(
@NomeSetor varchar(50),
@Area varchar(2),
@CodConta int
)
as

declare @Situacao int

begin
set @Situacao = 1
insert into SetorAlex (NomeSetor, Situacao, Area, codConta) values (@NomeSetor, @Situacao, @Area, @codConta)

end

go

create procedure USP_InsereSetorPassarinha
(
@NomeSetor varchar(50),
@Area varchar(2),
@codConta int
)

as
declare @Situacao int


begin
set @Situacao = 1
insert into SetorPassarinha (NomeSetor, Situacao, Area, codConta) values (@NomeSetor, @Situacao, @Area, @codConta)

end

go

create procedure USP_InsereSetorCasa
(
@NomeSetor varchar(50),
@Area varchar(2),
@codConta int
)

as
declare @Situacao int


begin
set @Situacao = 1
insert into SetorCasa (NomeSetor, Situacao, Area, codConta) values (@NomeSetor, @Situacao, @Area, @codConta)

end


go




