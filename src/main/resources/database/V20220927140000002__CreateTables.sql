create table if not exists cliente(

    id serial primary key,
    nome varchar(255),
    cpf varchar(11)
);

create table if not exists locacao(

    id serial primary key,
    num_nota int,
    id_cliente int,
    data TIMESTAMP
);

create table if not exists item(

    id serial primary key,
    descricao varchar,
    valor numeric(18,2)
);


create table if not exists locacao_item(

   id serial primary key,
   iditem int,
   quantidade int,
   valor numeric(18,2)
);

create table if not exists usuario(

   id serial primary key,
   nome varchar(255),
   email varchar(80),
   senha varchar(50)
);

alter table locacao_item add constraint fk_locacao_item__item foreign key (id_item) references item(id);
alter table locacao add constraint fk_locacao__cliente foreign key (id_cliente) references cliente(id);