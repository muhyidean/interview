
INSERT INTO item (id,name,price) VALUES (1,'iphone', 1200);
INSERT INTO item (id,name,price) VALUES (2,'ipad', 1100);
INSERT INTO item (id,name,price) VALUES (3,'apple tv', 200);


INSERT INTO shopping_list (id) VALUES (1);
INSERT INTO shopping_list (id) VALUES (2);
INSERT INTO shopping_list (id) VALUES (3);
INSERT INTO shopping_list (id) VALUES (4);

INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (1,'2017-01-13T17:09:42.411','test event 1','2017-01-13T17:09:42.411',1);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (2,'2017-01-13T17:09:42.411','test event 2','2017-01-13T17:09:42.411',2);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (3,'2017-01-13T17:09:42.411','test event 3','2017-01-13T17:09:42.411',3);
INSERT INTO event (id,end_date,name,start_date,shopping_list_id) VALUES (4,'2017-01-13T17:09:42.411','test event 4','2017-01-13T17:09:42.411',4);


INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (1,1);
INSERT INTO shopping_list_items (items_id, shopping_list_id) VALUES (2,1);

INSERT INTO users (id,email,fullname) VALUES (1,'aaa@aaa.com','aaa');
INSERT INTO users (id,email,fullname) VALUES (2,'bbb@b.com','bbb');


INSERT INTO event_user (done,user_id,event_id) VALUES (true,1,1);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,1,2);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,1,3);
INSERT INTO event_user (done,user_id,event_id) VALUES (false,2,4);

