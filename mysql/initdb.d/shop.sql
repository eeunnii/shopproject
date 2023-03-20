use shopper;

DROP TABLE IF EXISTS BUYING_INFO;
DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS COMPANY;
DROP TABLE IF EXISTS CUSTOMER;


CREATE TABLE CUSTOMER (
	CUSTOMER_NO	   INT          NOT NULL AUTO_INCREMENT,
	CUSTOMER_NAME  VARCHAR(45)  NOT NULL,
	CUSTOMER_TEL   VARCHAR(15)  NOT NULL,
    CONSTRAINT PK_COUSTOMER_NO PRIMARY KEY(CUSTOMER_NO)
);

CREATE TABLE COMPANY (
	COMPANY_NO	    INT	        NOT NULL AUTO_INCREMENT,
	COMPANY_NAME	VARCHAR(50)	NOT NULL,
	COMPANY_LEADER	VARCHAR(50)	NOT NULL,
	COMPANY_TEL	    VARCHAR(15) NOT NULL,
    CONSTRAINT PK_COMPANY_NO PRIMARY KEY(COMPANY_NO)
);

CREATE TABLE PRODUCT (
	PRODUCT_NO	   INT          NOT NULL AUTO_INCREMENT,
	PRODUCT_NAME   VARCHAR(100) NOT NULL,
	PRODUCT_PRICE  INT NOT NULL,
	PRODUCT_DATE   DATE         NOT NULL,
	COMPANY_NO     INT          NOT NULL,
    COMPANY_NAME   VARCHAR(50)  NOT NULL,
    CONSTRAINT PK_PRODUCT_NO PRIMARY KEY(PRODUCT_NO),
    CONSTRAINT FK_COMPANY_NO FOREIGN KEY(COMPANY_NO) REFERENCES COMPANY(COMPANY_NO) ON DELETE CASCADE
);

CREATE TABLE BUYING_INFO (
	BUYING_NO	INT	NOT NULL AUTO_INCREMENT,
    BUYING_DATE DATE NOT NULL,
	CUSTOMER_NO	INT	NOT NULL,
	PRODUCT_NO	INT	NOT NULL,
    CONSTRAINT PK_BUYING_NO PRIMARY KEY(BUYING_NO),
    CONSTRAINT FK_CUSTOMER_NO FOREIGN KEY(CUSTOMER_NO) REFERENCES CUSTOMER(CUSTOMER_NO) ON DELETE CASCADE,
    CONSTRAINT FK_PRODUCT_NO FOREIGN KEY(PRODUCT_NO) REFERENCES PRODUCT(PRODUCT_NO) ON DELETE CASCADE
);



-- 고객 기초 데이터
INSERT INTO CUSTOMER
    (CUSTOMER_NAME, CUSTOMER_TEL)
VALUES
    ("황소윤", "01022223333");

INSERT INTO CUSTOMER
    (CUSTOMER_NAME, CUSTOMER_TEL)
VALUES
    ("김지연", "01085857878");

INSERT INTO CUSTOMER
    (CUSTOMER_NAME, CUSTOMER_TEL)
VALUES
    ("김연아", "01023629696");
    
INSERT INTO CUSTOMER
    (CUSTOMER_NAME, CUSTOMER_TEL)
VALUES
    ("홍길동", "01052529898");




-- 회사 기초 데이터
INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("GGRN", "김선생", "0252524545");
    
INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("GG컴퍼니", "문동은", "0241414747");
    
INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("송가베딩", "문동은", "12345678912");    
    
INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("데일리한국", "김영권", "03152486964");

INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("아주경제", "소지섭", "03196854545");

INSERT INTO COMPANY
    (COMPANY_NAME,COMPANY_LEADER,COMPANY_TEL)
VALUES
    ("두베이글", "김서울", "03298567474");
    
    
    
-- 상품 기초데이터
INSERT INTO PRODUCT
    (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_DATE, COMPANY_NO, COMPANY_NAME)
VALUES
    ("양말", 2000, DATE_FORMAT('20220120', '%Y%m%d'), 1, "GGRN");
    
INSERT INTO PRODUCT
    (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_DATE, COMPANY_NO, COMPANY_NAME)
VALUES
    ("발가락양말", 1500, DATE_FORMAT('20230112', '%Y%m%d'), 1, "GGRN");
    
INSERT INTO PRODUCT
    (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_DATE, COMPANY_NO, COMPANY_NAME)
VALUES
    ("차렵이불", 45000, DATE_FORMAT('20190512', '%Y%m%d'), 3, "송가베딩");
 
 INSERT INTO PRODUCT
    (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_DATE, COMPANY_NO, COMPANY_NAME)
VALUES
    ("솜이불", 30000, DATE_FORMAT('20180706', '%Y%m%d'), 3, "송가베딩");
    
    
-- 구매 정보
INSERT INTO BUYING_INFO
    (BUYING_DATE, CUSTOMER_NO, PRODUCT_NO)
VALUES
    (DATE_FORMAT('20230203', '%Y%m%d'),4,3);
    