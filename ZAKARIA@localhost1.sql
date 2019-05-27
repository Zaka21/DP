------- Vraag 1
alter table medewerkers2
add geslacht char(1);

alter table medewerkers2
add constraint M_geslacht_CNK check ( geslacht = 'm' or geslacht = 'v');


------- Vraag 2

CREATE SEQUENCE afdelingsNR  START WITH 40  INCREMENT BY 10  MINVALUE 10  MAXVALUE 100;

SELECT afdelingsNR.NEXTVAL from dual;
SELECT afdelingsNR.currval from dual;
INSERT INTO afdelingen VALUES (afdelingsNR.NEXTVAL , 'NOG KLEINERE OFFICE' ,'ALKMAAR', 7698);


------- Vraag 3     

create table ADRESSEN(
pstcd       VARCHAR2(6) check(pstcd LIKE '[0-9]{4}[A-Z]{2}')
, huisnmr       NUMBER
, ingdtm        DATE constraint A_INGDTM_NN
                                not null
, einddtm       DATE
, tel           NUMBER(10,0) UNIQUE 
, med_nmr       NUMBER constraint A_MNR_NN
                                  not null
, constraint "DATE_CHECK" check (einddatum > ingangsdatum)
, constraint "PR_KEY" primary key ("pstcd", "huisnmr", "ingdtm")
, constraint A_MIWNR_NN foreign key (MED_NMR)
REFERENCES MEDEWERKERS ("MNR")
);


------- Vraag 4

--constraint M_VERK_CHK check(decode(functie, 'VERKOPER', 0,1) + nv12(comm , 1,0 = 1);

constraint M_VERK_CHK check(case(functie)
 WHEN 'VERKOPER' then '0,1'
 [ELSE "1.0 = 1"]