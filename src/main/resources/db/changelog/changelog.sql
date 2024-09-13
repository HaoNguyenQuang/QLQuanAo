ALTER TABLE category
ADD COLUMN createby varchar(40),
ADD COLUMN updateby varchar(40);

ALTER TABLE supplier
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE role
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE color
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE permission
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE product
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE product_detail
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE roles_permission
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE size
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE "user"
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);

ALTER TABLE voucher
    ADD COLUMN createby varchar(40),
    ADD COLUMN updateby varchar(40);