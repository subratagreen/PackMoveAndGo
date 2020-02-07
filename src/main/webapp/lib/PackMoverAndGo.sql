--------------------------------------------------------
--  File created - Tuesday-April-09-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence BOOKING_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."BOOKING_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence BRANCH_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."BRANCH_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence BUSINESS_PARTNER_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."BUSINESS_PARTNER_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence CUSTOMER_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."CUSTOMER_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 10000000039 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence ENQUIRY_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."ENQUIRY_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence LOGIN_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PACKMOVEANDGO"."LOGIN_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table BOOKING
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."BOOKING" 
   (	"BOOKING_ID" NUMBER(10,0), 
	"BRANCH_ID" NUMBER(10,0), 
	"CUST_ID" NUMBER(10,0), 
	"BOOKING_DATE" DATE, 
	"SRC_BRANCH" VARCHAR2(20 BYTE), 
	"DEST_BRANCH" VARCHAR2(20 BYTE), 
	"RATE" NUMBER(10,0), 
	"PACK_LOAD_UNLOAD" VARCHAR2(128 BYTE), 
	"DEST_AGENT_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table BRANCH
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."BRANCH" 
   (	"BRANCH_ID" NUMBER(10,0), 
	"BRANCH_NAME" VARCHAR2(256 BYTE), 
	"BRANCH_ADDRESS" VARCHAR2(256 BYTE), 
	"BRANCH_PH" VARCHAR2(20 BYTE), 
	"BRANCH_EMAIL" VARCHAR2(128 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table BUSINESS_PARTNER
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."BUSINESS_PARTNER" 
   (	"AGENT_ID" NUMBER(10,0), 
	"AGENT_NAME" VARCHAR2(256 BYTE), 
	"BRANCH_ID" NUMBER(10,0), 
	"AGENT_ADD" VARCHAR2(256 BYTE), 
	"AGENT_PH" VARCHAR2(20 BYTE), 
	"FACILITY" VARCHAR2(256 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CUSTOMER
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."CUSTOMER" 
   (	"CUST_ID" NUMBER(10,0), 
	"CUST_NAME" VARCHAR2(256 BYTE), 
	"CUST_ADDRESS" VARCHAR2(256 BYTE), 
	"CUST_PH" VARCHAR2(20 BYTE), 
	"CUST_TYPE" VARCHAR2(20 BYTE), 
	"CUST_CREDIT_LIMIT" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ENQUIRY
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."ENQUIRY" 
   (	"ENQ_ID" NUMBER(10,0), 
	"BRANCH_ID" NUMBER(10,0), 
	"SERVICE_ID" NUMBER(10,0), 
	"PERSON_NAME" VARCHAR2(256 BYTE), 
	"PERSON_ADDRESS" VARCHAR2(256 BYTE), 
	"PERSON_PH" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ITEM
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."ITEM" 
   (	"ITEM_ID" NUMBER(10,0), 
	"ITEM_NAME" VARCHAR2(256 BYTE), 
	"ITEM_TYPE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table LOGIN
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."LOGIN" 
   (	"CUST_ID" NUMBER(10,0), 
	"PASSWORD" VARCHAR2(256 BYTE), 
	"CUST_TYPE" VARCHAR2(64 BYTE), 
	"LOGIN_SERIAL_NO" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MATERIAL_USED
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."MATERIAL_USED" 
   (	"BRANCH_ID" NUMBER(10,0), 
	"MAT_ID" NUMBER(10,0), 
	"QTY" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ORDERS
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."ORDERS" 
   (	"ORDER_ID" NUMBER(10,0), 
	"CUST_ID" NUMBER(10,0), 
	"BRANCH_ID" NUMBER(10,0), 
	"ITEM_ID" NUMBER(10,0), 
	"QTY" NUMBER(10,0), 
	"APPROX_EXPEND" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PACKING_MATERIALS
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."PACKING_MATERIALS" 
   (	"PACK_MAT_ID" NUMBER(10,0), 
	"PACK_MAT_DESC" VARCHAR2(256 BYTE), 
	"COST_PER_UNIT" NUMBER(10,0), 
	"MAT_ID" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RATES
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."RATES" 
   (	"ITEM_ID" NUMBER(10,0), 
	"CHARGE_PER_KM" NUMBER(10,0), 
	"SERVICE_TYPE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SERVICES
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."SERVICES" 
   (	"SERVICE_ID" NUMBER(10,0), 
	"SERVICE_NAME" VARCHAR2(256 BYTE), 
	"SERVICE_TYPE" VARCHAR2(20 BYTE), 
	"CHARGE_PER_KM" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SHIPMENT
--------------------------------------------------------

  CREATE TABLE "PACKMOVEANDGO"."SHIPMENT" 
   (	"BRANCH_ID" NUMBER(10,0), 
	"ITEM_ID" NUMBER(10,0), 
	"QTY" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into PACKMOVEANDGO.BOOKING
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.BRANCH
SET DEFINE OFF;
Insert into PACKMOVEANDGO.BRANCH (BRANCH_ID,BRANCH_NAME,BRANCH_ADDRESS,BRANCH_PH,BRANCH_EMAIL) values (2,'Bhopal','MP Bhawan Bhopal','09754259990','saurav.mitm@gmail.com');
Insert into PACKMOVEANDGO.BRANCH (BRANCH_ID,BRANCH_NAME,BRANCH_ADDRESS,BRANCH_PH,BRANCH_EMAIL) values (3,'Gwalior','City Center Gwalior','09826259990','sachin.mitm@gmail.com');
Insert into PACKMOVEANDGO.BRANCH (BRANCH_ID,BRANCH_NAME,BRANCH_ADDRESS,BRANCH_PH,BRANCH_EMAIL) values (4,'Pune','Hindwali Road Pune','9826334856','pune@gmail.com');
Insert into PACKMOVEANDGO.BRANCH (BRANCH_ID,BRANCH_NAME,BRANCH_ADDRESS,BRANCH_PH,BRANCH_EMAIL) values (1,'Indore','Word no 06 In front of nagar palika','09827859990','saurav.mitm@gmail.com');
REM INSERTING into PACKMOVEANDGO.BUSINESS_PARTNER
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.CUSTOMER
SET DEFINE OFF;
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065426,'SAURAV','Word no 06 In front of nagar palika, gandhi road mehgaon','09827859990','SYSTEM_USER',4);
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065428,'SAURAV','Word no 06 In front of nagar palika, gandhi road mehgaon','09827859990','ADMINISTRATOR',4);
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065427,'Somil Jain','Flat no. 02, Behind JK Plaza, Gast ka tajiya','9575475834','ADMINISTRATOR',4);
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065424,'SAURAV','Word no 06 In front of nagar palika, gandhi road mehgaon','09827859990','SYSTEM_USER',4);
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065425,'SAURAV','Word no 06 In front of nagar palika, gandhi road mehgaon','09827859990','ADMINISTRATOR',4);
Insert into PACKMOVEANDGO.CUSTOMER (CUST_ID,CUST_NAME,CUST_ADDRESS,CUST_PH,CUST_TYPE,CUST_CREDIT_LIMIT) values (1410065421,'SAURAV','Word no 06 In front of nagar palika, gandhi road mehgaon','09827859990','ADMINISTRATOR',4);
REM INSERTING into PACKMOVEANDGO.ENQUIRY
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.ITEM
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.LOGIN
SET DEFINE OFF;
Insert into PACKMOVEANDGO.LOGIN (CUST_ID,PASSWORD,CUST_TYPE,LOGIN_SERIAL_NO) values (1410065426,'9lk','SYSTEM_USER',2);
Insert into PACKMOVEANDGO.LOGIN (CUST_ID,PASSWORD,CUST_TYPE,LOGIN_SERIAL_NO) values (1410065428,'Qkx','ADMINISTRATOR',4);
Insert into PACKMOVEANDGO.LOGIN (CUST_ID,PASSWORD,CUST_TYPE,LOGIN_SERIAL_NO) values (1410065425,'jain','ADMINISTRATOR',1);
Insert into PACKMOVEANDGO.LOGIN (CUST_ID,PASSWORD,CUST_TYPE,LOGIN_SERIAL_NO) values (1410065427,'sy4','ADMINISTRATOR',3);
REM INSERTING into PACKMOVEANDGO.MATERIAL_USED
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.ORDERS
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.PACKING_MATERIALS
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.RATES
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.SERVICES
SET DEFINE OFF;
REM INSERTING into PACKMOVEANDGO.SHIPMENT
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index BRANCH_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."BRANCH_PK" ON "PACKMOVEANDGO"."BRANCH" ("BRANCH_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index RATES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."RATES_PK" ON "PACKMOVEANDGO"."RATES" ("CHARGE_PER_KM") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index MATERIAL_USED_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."MATERIAL_USED_PK" ON "PACKMOVEANDGO"."MATERIAL_USED" ("MAT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index BOOKING_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."BOOKING_PK" ON "PACKMOVEANDGO"."BOOKING" ("BOOKING_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SERVICES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."SERVICES_PK" ON "PACKMOVEANDGO"."SERVICES" ("SERVICE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SHIPMENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."SHIPMENT_PK" ON "PACKMOVEANDGO"."SHIPMENT" ("ITEM_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index CUSTOMER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."CUSTOMER_PK" ON "PACKMOVEANDGO"."CUSTOMER" ("CUST_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ORDERS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."ORDERS_PK" ON "PACKMOVEANDGO"."ORDERS" ("ORDER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ENQUIRY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."ENQUIRY_PK" ON "PACKMOVEANDGO"."ENQUIRY" ("ENQ_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PACKING_MATERIALS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."PACKING_MATERIALS_PK" ON "PACKMOVEANDGO"."PACKING_MATERIALS" ("PACK_MAT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index BUSINESS_PARTNER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."BUSINESS_PARTNER_PK" ON "PACKMOVEANDGO"."BUSINESS_PARTNER" ("AGENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index LOGIN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PACKMOVEANDGO"."LOGIN_PK" ON "PACKMOVEANDGO"."LOGIN" ("LOGIN_SERIAL_NO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table SHIPMENT
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."SHIPMENT" ADD CONSTRAINT "SHIPMENT_PK" PRIMARY KEY ("ITEM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."SHIPMENT" MODIFY ("ITEM_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BUSINESS_PARTNER
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."BUSINESS_PARTNER" ADD CONSTRAINT "BUSINESS_PARTNER_PK" PRIMARY KEY ("AGENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."BUSINESS_PARTNER" MODIFY ("AGENT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SERVICES
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."SERVICES" ADD CONSTRAINT "SERVICES_PK" PRIMARY KEY ("SERVICE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."SERVICES" MODIFY ("SERVICE_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."BOOKING" ADD CONSTRAINT "BOOKING_PK" PRIMARY KEY ("BOOKING_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."BOOKING" MODIFY ("BOOKING_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ENQUIRY
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."ENQUIRY" ADD CONSTRAINT "ENQUIRY_PK" PRIMARY KEY ("ENQ_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."ENQUIRY" MODIFY ("ENQ_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."CUSTOMER" ADD CONSTRAINT "CUSTOMER_PK" PRIMARY KEY ("CUST_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."CUSTOMER" MODIFY ("CUST_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table RATES
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."RATES" ADD CONSTRAINT "RATES_PK" PRIMARY KEY ("CHARGE_PER_KM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."RATES" MODIFY ("CHARGE_PER_KM" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."ORDERS" ADD CONSTRAINT "ORDERS_PK" PRIMARY KEY ("ORDER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."ORDERS" MODIFY ("ORDER_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."LOGIN" ADD CONSTRAINT "LOGIN_PK" PRIMARY KEY ("LOGIN_SERIAL_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."LOGIN" MODIFY ("LOGIN_SERIAL_NO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BRANCH
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."BRANCH" ADD CONSTRAINT "BRANCH_PK" PRIMARY KEY ("BRANCH_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."BRANCH" MODIFY ("BRANCH_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PACKING_MATERIALS
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."PACKING_MATERIALS" MODIFY ("PACK_MAT_ID" NOT NULL ENABLE);
  ALTER TABLE "PACKMOVEANDGO"."PACKING_MATERIALS" ADD CONSTRAINT "PACKING_MATERIALS_PK" PRIMARY KEY ("PACK_MAT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table MATERIAL_USED
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."MATERIAL_USED" ADD CONSTRAINT "MATERIAL_USED_PK" PRIMARY KEY ("MAT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."MATERIAL_USED" MODIFY ("MAT_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table BOOKING
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."BOOKING" ADD CONSTRAINT "BOOKING_FK1" FOREIGN KEY ("CUST_ID")
	  REFERENCES "PACKMOVEANDGO"."CUSTOMER" ("CUST_ID") ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."BOOKING" ADD CONSTRAINT "BOOKING_FK2" FOREIGN KEY ("BRANCH_ID")
	  REFERENCES "PACKMOVEANDGO"."BRANCH" ("BRANCH_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table BUSINESS_PARTNER
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."BUSINESS_PARTNER" ADD CONSTRAINT "BUSINESS_PARTNER_FK1" FOREIGN KEY ("BRANCH_ID")
	  REFERENCES "PACKMOVEANDGO"."BRANCH" ("BRANCH_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ENQUIRY
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."ENQUIRY" ADD CONSTRAINT "ENQUIRY_FK1" FOREIGN KEY ("SERVICE_ID")
	  REFERENCES "PACKMOVEANDGO"."SERVICES" ("SERVICE_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table LOGIN
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."LOGIN" ADD CONSTRAINT "LOGIN_FK1" FOREIGN KEY ("CUST_ID")
	  REFERENCES "PACKMOVEANDGO"."CUSTOMER" ("CUST_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ORDERS
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."ORDERS" ADD CONSTRAINT "ORDERS_FK1" FOREIGN KEY ("ITEM_ID")
	  REFERENCES "PACKMOVEANDGO"."SHIPMENT" ("ITEM_ID") ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."ORDERS" ADD CONSTRAINT "ORDERS_FK2" FOREIGN KEY ("CUST_ID")
	  REFERENCES "PACKMOVEANDGO"."CUSTOMER" ("CUST_ID") ENABLE;
  ALTER TABLE "PACKMOVEANDGO"."ORDERS" ADD CONSTRAINT "ORDERS_FK3" FOREIGN KEY ("BRANCH_ID")
	  REFERENCES "PACKMOVEANDGO"."BRANCH" ("BRANCH_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PACKING_MATERIALS
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."PACKING_MATERIALS" ADD CONSTRAINT "PACKING_MATERIALS_FK1" FOREIGN KEY ("MAT_ID")
	  REFERENCES "PACKMOVEANDGO"."MATERIAL_USED" ("MAT_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SERVICES
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."SERVICES" ADD CONSTRAINT "SERVICES_FK1" FOREIGN KEY ("CHARGE_PER_KM")
	  REFERENCES "PACKMOVEANDGO"."RATES" ("CHARGE_PER_KM") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SHIPMENT
--------------------------------------------------------

  ALTER TABLE "PACKMOVEANDGO"."SHIPMENT" ADD CONSTRAINT "SHIPMENT_FK1" FOREIGN KEY ("BRANCH_ID")
	  REFERENCES "PACKMOVEANDGO"."BRANCH" ("BRANCH_ID") ENABLE;
--------------------------------------------------------
--  DDL for Function CUSTOM_AUTH
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "PACKMOVEANDGO"."CUSTOM_AUTH" (p_username in VARCHAR2, p_password in VARCHAR2)
return BOOLEAN
is
  l_password varchar2(4000);
  l_stored_password varchar2(4000);
  l_expires_on date;
  l_count number;
begin
-- First, check to see if the user is in the user table
select count(*) into l_count from demo_users where user_name = p_username;
if l_count > 0 then
  -- First, we fetch the stored hashed password & expire date
  select password, expires_on into l_stored_password, l_expires_on
   from demo_users where user_name = p_username;

  -- Next, we check to see if the user's account is expired
  -- If it is, return FALSE
  if l_expires_on > sysdate or l_expires_on is null then

    -- If the account is not expired, we have to apply the custom hash
    -- function to the password
    l_password := custom_hash(p_username, p_password);

    -- Finally, we compare them to see if they are the same and return
    -- either TRUE or FALSE
    if l_password = l_stored_password then
      return true;
    else
      return false;
    end if;
  else
    return false;
  end if;
else
  -- The username provided is not in the DEMO_USERS table
  return false;
end if;
end;

/
--------------------------------------------------------
--  DDL for Function CUSTOM_HASH
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "PACKMOVEANDGO"."CUSTOM_HASH" (p_username in varchar2, p_password in varchar2)
return varchar2
is
  l_password varchar2(4000);
  l_salt varchar2(4000) := '2WZOIX4MNFTWB66EYRJ81IB7B7NH01';
begin

-- This function should be wrapped, as the hash algorhythm is exposed here.
-- You can change the value of l_salt or the method of which to call the
-- DBMS_OBFUSCATOIN toolkit, but you much reset all of your passwords
-- if you choose to do this.

l_password := utl_raw.cast_to_raw(dbms_obfuscation_toolkit.md5
  (input_string => p_password || substr(l_salt,10,13) || p_username ||
    substr(l_salt, 4,10)));
return l_password;
end;

/
