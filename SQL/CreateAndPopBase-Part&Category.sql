drop database if exists myGarage;
create database myGarage;

use myGarage;

create table Part(
part_id INT(6) AUTO_INCREMENT PRIMARY KEY,
category_id INT(6) not null,
type varchar(50) not null,
typeDetail varchar(120),
application varchar(50) not null,
applicationDetail varchar(120),
`condition` varchar(50) not null,
quantity int(6) not null,
notes varchar(120)
);

create table Category(
category_id int auto_increment primary key,
categoryName varchar(50) not null
);

insert into Category Values (1, "drive-train");
insert into Category Values (2, "exhaust");

alter table Part
add foreign key (category_id)
references Category(category_id);

insert into Part Values (1, (Select category_id from Category where categoryName = "drive-train"), "engine", 
"289ci", "ford", "5 bolt bellhousing, pre 1965", "GOOD", 1, 
"~60lbs oil pressure at start, good compression, 2bbl holey Carburetor"
);
insert into Part Values (2, (Select category_id from Category where categoryName = "exhaust"),  "exhaust manifold", 
"header", "ford", "Aftermarket, from a mustang", "GOOD", 2, 
"Have full collectors and all"
);

insert into Part Values (3, (Select category_id from Category where categoryName = "exhaust"), "exhaust manifold", "zummy", 
"ford", "Homemade, out the side", "fair", 2, 
"Spread is pretty narrow, from engine to tail"
);





