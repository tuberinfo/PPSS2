# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table todo (
  id                            bigint not null,
  description                   varchar(255),
  progress                      integer,
  date                          timestamp,
  constraint pk_todo primary key (id)
);
create sequence todo_seq;


# --- !Downs

drop table if exists todo;
drop sequence if exists todo_seq;

