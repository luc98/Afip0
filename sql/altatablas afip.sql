use afip;

create table Usuario (
	clavefiscal int primary key
    
);

create table Impuestos(
	idimpuesto int AUTO_INCREMENT Primary key,
    tipoimpuesto varchar(20),
    fecha date
);

create table usuarioximpuestos(
	clavefiscal int,
    idimpuesto int,
    foreign key(clavefiscal) references usuario(clavefiscal),
    foreign key(idimpuesto) references impuestos(idimpuesto)
);