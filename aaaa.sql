create database aaaa;
use aaaa;

create table aaaa.Aluno(
rm int not null,
nome varchar (60) not null,
email varchar (60) not null,
telefone varchar (22) not null,
endereco varchar (60) not null,
curso varchar (25) not null,
primary key (rm));

create table aaaa.Professor(
cod int not null,
nome varchar(50) not null,
email varchar (60) not null,
primary key (cod));

create table aaaa.Disciplina(
nome_materia varchar(60) not null,
nome_professor Varchar (50) not null,
Numero_sala int not null,
primary key(Numero_sala));
