create database normalizacao;
use normalizacao;
/*
para uma tabela estar na primeira forma normal, 
é necessario que não existam grupos de valores repetidos, 
seus valores devem ser atomicos (unicos) e a  tabela deve possuir um 
identificador que identifique o dado como único
*/
create table pessoa (
	id integer primary key auto_increment,
    
	nome varchar (30),
    sobrenome varchar (50),
    idade int,
	sexo varchar (15),
    email varchar (100),
    cpf varchar (14) not null unique,
	cidade varchar (50),
    bairro varchar (50),
    cep varchar (10),
    complemento varchar (100),
    logradouro varchar (100),
    estado varchar (50),
    uf char(2),
    numero varchar (10),
    telefone varchar (16),
    ddd char (3),
    celular varchar (16),
    fixo varchar (16),
    comercial varchar (16)
);

insert into pessoa values ( null, "Matheus", "Costa", 25, "Masculino", "fake@gmail.com", "123.456.789-10", "Ceilondres", "P Norte", "72236-800", "Não possui", "não possui", "Distrito Federal", 
"DF", "13", "98570-4698", "061", "98570-4699", "2035-7058", "3377-5254");

select * from pessoa;

/*
Para estar na segunda forma normal os atributos devem depender da chave 
primaria em sua totalidade não apenas parte dela

*/

create table pessoa2 (
	idPessoa integer primary key auto_increment,
    nome varchar (50),
    sobrenome varchar (50),
    cpf varchar (14) not null unique,
    sexo varchar (10),
    id_endereco integer,
    constraint fk_id_endereco_endereco
    foreign key (id_endereco) references endereco(idEndereco)
);

create table endereco (
	idEndereco integer primary key auto_increment,
	cep varchar (13),
    bairro varchar (100),
    cidade varchar (100),
    uf char (2)  );

insert into pessoa2 values (null, "Matheus", "Oliveira", "123.456.789-10", "M",1), 
(null, "Lucas", "Mota", "123.456.789-11","M",2),
(null, "Laura", "Caveira", "123.456.897-12", "F",3),
(null, "Manu", "Oliveira", "123.456.789-13", "F",1);

insert into endereco values (null, "73000-000", "não sei", "brasília", "df"),
(null, "73000-111", "QD 302", "Samambaia", "df"),
(null, "73000-222", "Ceilândia Sul", "Ceilândia", "df");


select * from pessoa2;
select * from endereco;

select * from endereco inner join
pessoa2 on endereco.idEndereco = pessoa2.id_endereco;

drop table pessoa2;
drop table endereco;

create table telefone (
#chave primaria
idtelefone integer primary key auto_increment,
ddd  varchar(5),
numero varchar(10),
id_pessoa integer,
#boa prática
constraint fk_id_pessoa_pessoa
#chave estrageira (id_pessoa) irá fazer referencia do idPessoa da tabela pessoa2
foreign key (id_pessoa) references pessoa2(idPessoa)
);

insert into telefone values (null, "061", "97134-9511", 1),
(null, "021", "97134-8899", 1),
(null, "062", "98753-9511", 2),
(null, "063", "97134-8965", 4);

select * from telefone;
