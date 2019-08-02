insert into book (bookId, title) values
(1, 'A Brief History of Thyme'),
(2, 'Beery Short Stories'),
(4, 'I''m Trying to Think but Nothing Happens'),
(5, 'You knucklehead!'),
(7, 'A Universe of Authors');

insert into author (authorId, firstName, lastName) values
(1, 'Larry', 'Fine'),
(2, 'Moe', 'Howard'),
(3, 'Curly', 'Howard'),
(5, 'Hop', 'Flavor'),
(6, 'Malt', 'Flavor'),
(9, 'Herb', 'Spicer');

insert into bookAuthor (bookId, authorId) values
(1, 9),
(2, 5), (2, 6),
(4, 1), (4, 2), (4, 3),
(5, 1), (5, 2), (5, 3),
(7, 1), (7, 2), (7, 3), (7, 5), (7, 6), (7, 9);