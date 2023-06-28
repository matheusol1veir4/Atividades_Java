create database atividade_sql;

use atividade_sql;
#drop table pessoas;
create table pessoas (
nome varchar (100),
idade int,
telefone varchar (15),
endereco varchar (150),
email varchar (100) );

insert into pessoas values ("Thaís Amorim Henriquez",25,"(47) 98534-5248","São Judas Tadeu,João Paulo II , SP, São Paulo,",
"thais.henriquez@geradornv.com.br"),
("Ariana Caruso de Sá",33,"(61) 97461-8293","Quadra CRNW 507 Bloco B Lote 1, RN, Rio Grande do Norte",
"ariana.sa@geradornv.com.br"),
("Iago Bragança Dias",15,"(61) 98417-7667","Quadra QS 305 Conjunto 9, BSB, Brasília",
"iago.dias@geradornv.com.br"),
("Samuel Pires Annunziato",78,"(61) 96736-8657","Setor QNH Área Especial , PE, Pernambuco",
"samuel.annunziato@geradornv.com.br"),
("Jonathan Bocafoli Castro",17,"(61) 98153-7888","Quadra QR 517 Conjunto 13, BSB ,Brasília",
"jonathan.castro@geradornv.com.br"),
("Sueli Soares Coelho",45,"(61) 98622-9024","null",
"sueli.coelho@geradornv.com.br"),
("Nicollas Dantas Boelho",36,"(61) 98700-4747","null",
"nicollas.boelho@geradornv.com.br"),
("Samuel Marotti Spilman",9,"null","Quadra Quadra 406 Conjunto G Beuford Roxo, RJ, Rio de Janeiro",
"samuel.spilman@geradornv.com.br"),
("Juliete Felix Quintela",19,"(61) 99738-4571","Quadra Quadra 23 Conjunto 17, PI, Teresina",
"null"),
("Sávio de Arruda Diovani",23,"null","Quadra Quadra 3 Comércio Local 12,ES,Espírito Santo",
"savio.diovani@geradornv.com.br");

select * from pessoas where endereco like "%Brasília%" and idade > 18 ;

insert into pessoas values ("Juliete Felix Quintela",19,"(61) 99578-4571","Quadra Quadra 23 Conjunto 17, PI, Teresina",
null);
select count(*) as Quantidade from pessoas where endereco like "%RJ%";
select * from pessoas where idade > 30;
select count(*) as Quantidade from pessoas where idade < 30; 

select count(*) as quantidade, nome from pessoas where idade > 15 group by nome;

select nome from pessoas where email is null;

set sql_safe_updates = 0;
update pessoas set email = "meuemail@gmail.com" where email is null and nome = "Samuel Marotti Spilman";

select * from pessoas;
select nome from pessoas where nome like "Sávio%";

# mostra os dados em ordem alfabética
select * from pessoas order by nome asc;

create table produto (
nome_do_produto varchar (30),
preço double );

alter table produto add quantidadde int;

desc produto;

alter table produto drop column preço;

alter table produto rename column nome_do_produto to nomes_dos_produtos;

desc produto;

#cancat => utilizado para concatenar
select concat(nome, " tem", idade, " anos") as informacao from pessoas;

delete from pessoas where nome like "Sávio%";

select * from pessoas;