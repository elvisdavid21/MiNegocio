/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     3/9/2023 9:18:21                             */
/*==============================================================*/


drop index CLIENTE_PK;

drop table CLIENTE;

drop index TIPODIRECCION_DIRECCION_FK;

drop index CLIENTE_DIRECCION_FK;

drop index DIRECCION_PK;

drop table DIRECCION;

drop index TIPODIRECCION_PK;

drop table TIPODIRECCION;

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE (
   ID_CLIENTE           INT4                 not null,
   IDENTIFICATION_TYPE  VARCHAR(3)           not null,
   IDENTIFICATION_NUMBER VARCHAR(13)          not null,
   NAMES                VARCHAR(50)          not null,
   EMAIL                VARCHAR(60)          not null,
   CELL_PHONE           VARCHAR(10)          not null,
   constraint PK_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: CLIENTE_PK                                            */
/*==============================================================*/
create unique index CLIENTE_PK on CLIENTE (
ID_CLIENTE
);

/*==============================================================*/
/* Table: DIRECCION                                             */
/*==============================================================*/
create table DIRECCION (
   ID_DIRECCION         INT4                 not null,
   ID_CLIENTE           INT4                 not null,
   IDTIPODIRECCION      INT4                 not null,
   DIRECCION            VARCHAR(100)         not null,
   PROVINCIA            VARCHAR(50)          not null,
   CIUDAD               VARCHAR(50)          not null,
   constraint PK_DIRECCION primary key (ID_DIRECCION)
);

/*==============================================================*/
/* Index: DIRECCION_PK                                          */
/*==============================================================*/
create unique index DIRECCION_PK on DIRECCION (
ID_DIRECCION
);

/*==============================================================*/
/* Index: CLIENTE_DIRECCION_FK                                  */
/*==============================================================*/
create  index CLIENTE_DIRECCION_FK on DIRECCION (
ID_CLIENTE
);

/*==============================================================*/
/* Index: TIPODIRECCION_DIRECCION_FK                            */
/*==============================================================*/
create  index TIPODIRECCION_DIRECCION_FK on DIRECCION (
IDTIPODIRECCION
);

/*==============================================================*/
/* Table: TIPODIRECCION                                         */
/*==============================================================*/
create table TIPODIRECCION (
   IDTIPODIRECCION      INT4                 not null,
   TIPO                 VARCHAR(20)          not null,
   constraint PK_TIPODIRECCION primary key (IDTIPODIRECCION)
);

/*==============================================================*/
/* Index: TIPODIRECCION_PK                                      */
/*==============================================================*/
create unique index TIPODIRECCION_PK on TIPODIRECCION (
IDTIPODIRECCION
);

alter table DIRECCION
   add constraint FK_DIRECCIO_CLIENTE_D_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on delete restrict on update restrict;

alter table DIRECCION
   add constraint FK_DIRECCIO_TIPODIREC_TIPODIRE foreign key (IDTIPODIRECCION)
      references TIPODIRECCION (IDTIPODIRECCION)
      on delete restrict on update restrict;

