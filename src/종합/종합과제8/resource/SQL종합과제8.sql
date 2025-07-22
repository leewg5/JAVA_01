drop database if exists board_1;
create database board_1;
use board_1;

create table board_1(
cno int auto_increment,
cphone varchar(40) not null,
cpop varchar(40) not null,
constraint primary key(cno)
);

#샘플
INSERT INTO board_1 (cphone, cpop) VALUES ("010-2020-4444", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1234-5678", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-9876-5432", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1111-2222", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-3333-4444", 5);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-5555-6666", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-7777-8888", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-9999-0000", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1212-3434", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-5656-7878", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-2323-4545", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-8989-6767", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-4343-6565", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1010-2020", 5);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-3030-4040", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-5050-6060", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-7070-8080", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-9090-1010", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1122-3344", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-5566-7788", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-9900-1122", 5);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-2233-4455", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-6677-8899", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-4455-6677", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-7788-9900", 1);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-3344-5566", 5);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-1212-5656", 3);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-3434-7878", 4);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-5656-9090", 2);
INSERT INTO board_1 (cphone, cpop) VALUES ("010-7878-1212", 1);