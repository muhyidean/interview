
INSERT INTO item (id,name,price) VALUES (1,'chocolate', 50);
INSERT INTO item (id,name,price) VALUES (2,'fireworks', 100);
INSERT INTO item (id,name,price) VALUES (3,'decoration', 50);


INSERT INTO shopping_list (id) VALUES (1);
INSERT INTO shopping_list (id) VALUES (2);
INSERT INTO shopping_list (id) VALUES (3);
INSERT INTO shopping_list (id) VALUES (4);

INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (1,'2022-01-01T17:09:42.411','test event 1','2022-01-08T17:09:42.411',1);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (2,'2022-02-01T17:09:42.411','test event 2','2022-02-08T17:09:42.411',2);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (3,'2022-03-01T17:09:42.411','test event 3','2022-03-08T17:09:42.411',3);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (4,'2022-04-01T17:09:42.411','test event 4','2022-04-08T17:09:42.411',4);


INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (1,1);
INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (1,2);
INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (2,1);
INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (3,2);

INSERT INTO users (id,email,fullname) VALUES (1,'dean@gc.com','Dean');
INSERT INTO users (id,email,fullname) VALUES (2,'john@gc.com','John');


INSERT INTO event_user (done,user_id,event_id) VALUES (true,1,1);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,1,2);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,1,3);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,2,4);

INSERT INTO transaction (id,user_id) VALUES (1,1);
INSERT INTO transaction (id,user_id) VALUES (2,1);
INSERT INTO transaction (id,user_id) VALUES (3,1);
INSERT INTO transaction (id,user_id) VALUES (4,2);

INSERT INTO item_tx (bought, transaction_id, item_id ) VALUES (true, 1,1);
INSERT INTO item_tx (bought, transaction_id, item_id ) VALUES (true, 2,2);
INSERT INTO item_tx (bought, transaction_id, item_id ) VALUES (true, 3,3);
INSERT INTO item_tx (bought, transaction_id, item_id ) VALUES (true, 4,2);