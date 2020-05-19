CREATE TABLE TBL_PRODUCT (
	PNO NUMBER NULL,
	TITLE VARCHAR2(200) NOT NULL,
	CONTENT VARCHAR2(2000) NOT NULL,
	WRITER VARCHAR2(100) NOT NULL,
	REGD8 DATE DEFAULT sysdate NULL,
	MODD8 DATE DEFAULT sysdae,
	READCOUNT NUMBER DEFAULT 0,
	IMGFILE VARCHAR2(100)
);
CREATE SEQUENCE SEQ_PRODUCT INCREMENT BY 1 MINVALUE 0 NOCYCLE NOCACHE NOORDER ;



----------------- notice ------------------------

CREATE TABLE SPRINGDB.TBL_NOTICE (
	NNO NUMBER NOT NULL,
	TITLE VARCHAR2(100) NOT NULL,
	WRITER VARCHAR2(100) NOT NULL,
	REGD8 DATE,
	MODD8 DATE,
	READCOUNT NUMBER DEFAULT 0,
	CONSTRAINT TBL_NOTICE_PK PRIMARY KEY (NNO)
)
TABLESPACE USERS;
------- columns adding!! 
ALTER TABLE SPRINGDB.TBL_NOTICE ADD IMGFILE VARCHAR2(100);
ALTER TABLE SPRINGDB.TBL_NOTICE ADD CONTENT VARCHAR2(200);

CREATE SEQUENCE SPRINGDB.SEQ_NOTICE INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999999999999999 NOCYCLE NOCACHE NOORDER ;


