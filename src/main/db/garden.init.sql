CREATE SCHEMA garden authorization sa;

CREATE TABLE garden.plants( ID INT PRIMARY KEY, NAME VARCHAR (255) DEFAULT ' ' );

INSERT INTO garden.plants VALUES (1, 'Asparagus');

INSERT INTO garden.plants VALUES (2, 'Basil');

INSERT INTO garden.plants VALUES (3, 'Beans');

INSERT INTO garden.plants VALUES (4, 'Beets');

INSERT INTO garden.plants VALUES (5, 'Broccoli');

INSERT INTO garden.plants VALUES (6, 'Brussel Sprouts');

INSERT INTO garden.plants VALUES (7, 'Cabage');

INSERT INTO garden.plants VALUES (8, 'Cauliflower');

INSERT INTO garden.plants VALUES (9, 'Carrots');

INSERT INTO garden.plants VALUES (10, 'Cucumbers');

INSERT INTO garden.plants VALUES (11, 'Eggplant');

INSERT INTO garden.plants VALUES (12, 'Garlic/Shalots');

INSERT INTO garden.plants VALUES (13, 'Kale/Collard Greens/Chard');

INSERT INTO garden.plants VALUES (14, 'Kohlrabi');

INSERT INTO garden.plants VALUES (15, 'Leeks');

INSERT INTO garden.plants VALUES (16, 'Lettuce');

INSERT INTO garden.plants VALUES (17, 'Malabar Spinach');

INSERT INTO garden.plants VALUES (18, 'Melons');

INSERT INTO garden.plants VALUES (19, 'Mustard');

INSERT INTO garden.plants VALUES (20, 'Okra');

INSERT INTO garden.plants VALUES (21, 'Onions');

INSERT INTO garden.plants VALUES (22, 'Parsley');

INSERT INTO garden.plants VALUES (23, 'Peas');

INSERT INTO garden.plants VALUES (24, 'Pepper');

INSERT INTO garden.plants VALUES (25, 'Potatoes');

INSERT INTO garden.plants VALUES (26, 'Radish');

INSERT INTO garden.plants VALUES (27, 'Spinach');

INSERT INTO garden.plants VALUES (28, 'Strawberry Plants');

INSERT INTO garden.plants VALUES (29, 'Summer Squash');

INSERT INTO garden.plants VALUES (30, 'Sweet Corn');

INSERT INTO garden.plants VALUES (31, 'Sweet Potato');

INSERT INTO garden.plants VALUES (32, 'Tatsoi/Bok Choy');

INSERT INTO garden.plants VALUES (33, 'Ground Cherry');

INSERT INTO garden.plants VALUES (34, 'Tomatoes');

INSERT INTO garden.plants VALUES (35, 'Turnip');

INSERT INTO garden.plants VALUES (36, 'Winter Squash/Pumpkin');



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