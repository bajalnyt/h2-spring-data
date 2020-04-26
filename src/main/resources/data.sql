drop table if exists test_table;
drop sequence if exists test_table_seq;

create table TEST_TABLE (
  ID NUMBER NOT NULL PRIMARY KEY,
  PRIORITY FLOAT NOT NULL,
  CREATE_DATE DATE,
  CREATED_BY VARCHAR2(255) NOT NULL
);
create sequence test_table_seq start with 1 increment by 1 nomaxvalue;

insert into test_table (ID, priority, create_date, created_by) values
                        (test_table_seq.nextval, 1, sysdate, 'Bajal');
insert into test_table (ID, priority, create_date, created_by) values
                        (test_table_seq.nextval, 2, sysdate, 'Bajal2');
insert into test_table (ID, priority, create_date, created_by) values
                        (test_table_seq.nextval, 3, sysdate, 'Bajal3');
insert into test_table (ID, priority, create_date, created_by) values
                        (test_table_seq.nextval, 4, sysdate, 'Bajal4');