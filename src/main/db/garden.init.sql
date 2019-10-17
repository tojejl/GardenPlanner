CREATE SCHEMA garden authorization sa;

create table garden.plants (ID INT PRIMARY KEY AUTO_INCREMENT,
plantname VARCHAR(255) DEFAULT '',
startseedlingsindoor VARCHAR(255) DEFAULT '',
sowseedsdirectly VARCHAR(255) DEFAULT '',
transplantindoorseedlings VARCHAR(255) DEFAULT '',
growingperiod VARCHAR(255) DEFAULT '',
harvestperiod VARCHAR(255) DEFAULT '',
plantnotes VARCHAR(MAX) DEFAULT ' ',
keyword VARCHAR(255) DEFAULT ' ');


INSERT INTO garden.plants values (1, 'Basil', 'Early March', 'Early May', 'Late April', 'May through Mid June', 'Mid-June through Mid October', 'Sample plant notes', 'herb');
INSERT INTO garden.plants VALUES (2, 'Beets (Spring)', 'N/A', 'Mid March',	'N/A', 	'Mid-March through April',	'May through June or October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (3, 'Beets (Fall)', 'N/A', 'August', 'N/A',  'August through September', 'October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (4, 'Broccoli (Spring)',	'Mid January',	'Mid-March',	'Early March',	'Early March through late May',	'June through Mid-July', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (5, 'Broccoli (Fall)', 'Not Available', 'Mid-June', 'Early August',	'August',	'September through Mid-November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (6, 'Brussel Sprouts (Spring)',	'Mid January',	'Mid-March',	'Mid-March',	'Mid-March through May'	, 'Mid-August through Mid-November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (7, 'Cabbage(Spring)',	'Mid-January',	'Mid-March',	'Mid-March',	'Mid-March through May',	'June through Mid-July', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (8, 'Cabbage (Fall)',	'Mid May',	'Mid-July',	'N/A',	'Mid-July through September',	'October', 'Sample plant notes', );
INSERT INTO garden.plants VALUES (9, 'Cauliflower (Spring)', 	'Early February',	'N/A',	'Mid-March',	'Mid-March through Mid-May',	'Late May', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (10, 'Cauliflower (Fall)',	'Late June',	'N/A',	'Early August',	 'August through September',	'Early October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (11, 'Carrots (Spring)',	'N/A',	'Mid-March',	'N/A',	'Mid-March through Mid May',	 'Mid May through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (12, 'Carrots (Fall)',	'N/A',	'Mid-July',	'N/A',	'Mid July through Mid September',	'Mid September through Mid November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (13, 'Cucumber', 'Not Available', 'Early May', 'Not Available', 'May through Mid July', 'Mid-July through September', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (14, 'Eggplant',	'Mid-February',	'Mid-May',	'Mid-May',	'Mid-May through Mid-August',	'Mid-August through Early October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (15, 'Garlic/Shallots',	'N/A',	'Early October',	'N/A',	'October through Mid-June',	'Mid-June through Mid-July', 'Sample plant notes', 'herb');
INSERT INTO garden.plants values (16, 'Kale/Collard Greens/Chard (Spring)', 	'Early February',	'Mid-March',	'Early March', 	'Mid-March through Mid-May',	'Mid-May through July', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (17, 'Kale/Collard Greens/Chard (Fall)', 	'N/A',	'Early August', 	'N/A',	'August through September',	'Late September through Mid-November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (18, 'Kohlrabi (Spring)',	'Early February',	'Mid-March',	'Mid-March',	'Mid-March through April', 	'May through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants values (19, 'Kohlrabi (Fall)',	'Early June',	'Early August',	'Early August',	 'August through Late September',	'Late September through Mid-November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (20, 'Leeks', 'Early January', 'N/A', 'Early March',  'Mid-March through June', 'Early to Mid July', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (21, 'Lettuce (Spring)', 'Late February', 'Mid March', 'Early March', 'Mid-March through Mid April', 'Mid-April through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (22, 'Lettuce (Fall)', 'Mid-July', 'Early August', 'Early August', 'August through Mid-September', 'Mid-September through Late October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (23, 'Malabar Spinach', 'N/A', 'Early May', 'N/A', 'May through Late July', 'Late July through Mid-October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (24, 'Melons', 'Mid April(After the Last Spring Frost)', 'Early May', 'Late April',	'May Through Early August',	'Early August through Late September', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (25,'Mustard (Spring)', 'Early February', 'Mid March', 'Mid March', 'Mid March through Mid April',	'Mid April through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (26, 'Mustard (Fall)',	'N/A', 'Mid-August',	'N/A', 'Mid-August through Mid-September', 'Mid-September through Early November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (27, 'Okra',	'N/A', 'Mid-May', 'N/A', 'Mid-May through Mid-July', 'Mid-July through Early October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (28, 'Onions', 'Early January', 'N/A',	'Early March', 	'Mid-March through Early July', 'Early to Mid July', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (29, 'Parsley', 'Early February',	'Mid-March', 'Early March', 'Mid-March through Late May', 'Late May through Mid-October', 'Sample plant notes', 'herb');
INSERT INTO garden.plants VALUES (30, 'Peas (Spring)', 'N/A',	'Early March', 'N/A', 'Early March through Mid-May', 'Late May through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (31, 'Peas (Fall)', 'N/A', 'Early August', 'N/A', 'August', 'Early September through Mid-October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (32, 'Pepper', 'Early March	', 'Late May', 'Early May', 'Late May through Mid-July', 'Late July through Mid-October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (33, 'Potatoes', 'N/A',	'Mid-March', 'N/A', 'Mid-March through June', 'July through Mid-September', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (34, 'Radish (Spring)',  'N/A', 'Late March', 'N/A', 'Late March through Late April', 'Late April through Mid June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (35, 'Radish (Fall)', 'N/A', 'Early August', 'N/A',	'August',	'Early September through Early November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (36, 'Spinach (Spring)', 'N/A', 'Mid March',	 'N/A', 'Mid-March through April',  'Early May through Mid June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (37, 'Spinach (Fall)', 'N/A',	'Early August',	'N/A', 'August through late September',	'Late September through Mid-November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (38, 'Summer Squash', 'Mid April (After the last frost)', 'Late April', 'Late April', 'May through Mid July',	'Mid-July through Late September', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (39, 'Sweet Corn', 'N/A', 'Mid April (After the last frost)', 'Mid April', 'Mid April through June', 'July through Late September', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (40, 'Sweet Potato', 'N/A', 'Mid May', 'N/A', 'Mid May through Mid September', 'October through Early November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (41, 'Tatsoi/Bok Choy (Spring)',	'Mid February', 'Mid March', 'Early March', 'Mid March through Mid April', 'Mid April through June', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (42, 'Tatsoi/Bok Choy (Fall)', 'Early July', 'Early August',	'Early August', 'August through Mid September',	'Mid September through Early November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (43, 'Ground Cherry', 'Mid March', 'Mid May', 'Early May', 'Mid May through Mid August', 'Late August through Mid October', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (44, 'Tomatoes', 'Late March', 'Late May', 'Early May', 'Late May through Early August', 'August through Mid October ', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (45, 'Turnip (Spring)', 'N/A', 'Mid March', 'N/A', 'Mid March through Mid May', 'Mid May through June ', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (46, 'Turnip (Fall)', 'N/A', 'Early July', 'N/A', 'Mid July through Late September', 'Late September through Mid November', 'Sample plant notes', 'vegetable');
INSERT INTO garden.plants VALUES (47, 'Winter Squash', 'N/A', 'Early May', 'N/A', 'May through August', 'September through Early October', 'Sample plant notes', 'vegetable');

SELECT * FROM garden.plants;


CREATE TABLE garden.user(
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(255) DEFAULT '',
firstname VARCHAR(255) DEFAULT '',
lastname VARCHAR(255) DEFAULT '',
email VARCHAR(255) DEFAULT '',
password VARCHAR(255) DEFAULT '');

INSERT INTO garden.user(USERNAME, FIRSTNAME, LASTNAME, EMAIL, PASSWORD) VALUES ('jenny', 'Jennifer', 'Toje', 'tojejl13@gmail.com', 'lockjaw');
INSERT INTO garden.user(USERNAME, FIRSTNAME, LASTNAME, EMAIL, PASSWORD) VALUES
('Snips', 'Ahsoka', 'Tano', 'atano@email.com','skyguy');

SELECT * FROM garden.user;