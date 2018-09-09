create index IX_FACAA853 on FOO_Equ (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_757F6515 on FOO_Equ (name[$COLUMN_LENGTH:75$]);
create index IX_C16C464A on FOO_Equ (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2505D74C on FOO_Equ (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_64B14278 on dupa_Equ (groupId);
create index IX_F49004B1 on dupa_Equ (name[$COLUMN_LENGTH:75$]);
create index IX_E15E5BE6 on dupa_Equ (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D678A3E8 on dupa_Equ (uuid_[$COLUMN_LENGTH:75$], groupId);