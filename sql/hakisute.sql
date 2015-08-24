SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS entry_tag_relation;
DROP TABLE IF EXISTS entry;
DROP TABLE IF EXISTS tag;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE entry
(
	entry_id int NOT NULL AUTO_INCREMENT,
	entry_body char,
	insert_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	update_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	delete_flg boolean DEFAULT 0 NOT NULL,
	user_id int unsigned NOT NULL,
	PRIMARY KEY (entry_id)
);


CREATE TABLE entry_tag_relation
(
	entry_id int NOT NULL,
	tag_id int NOT NULL,
	delete_flg boolean DEFAULT 0 NOT NULL
);


CREATE TABLE tag
(
	tag_id int NOT NULL AUTO_INCREMENT,
	tag_name char,
	insert_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	update_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	delete_flg boolean DEFAULT 0 NOT NULL,
	PRIMARY KEY (tag_id)
);


CREATE TABLE user
(
	user_id int unsigned NOT NULL AUTO_INCREMENT,
	user_name char,
	password char,
	insert_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	update_date datetime DEFAULT '0000-01-01 00:00:00' NOT NULL,
	delete_flg boolean DEFAULT 0 NOT NULL,
	PRIMARY KEY (user_id)
);



/* Create Foreign Keys */

ALTER TABLE entry_tag_relation
	ADD FOREIGN KEY (entry_id)
	REFERENCES entry (entry_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE entry_tag_relation
	ADD FOREIGN KEY (tag_id)
	REFERENCES tag (tag_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE entry
	ADD FOREIGN KEY (user_id)
	REFERENCES user (user_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;
