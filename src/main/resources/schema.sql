create table if not exists book (
    bookId integer primary key,
    title varchar(100)
);

create table if not exists author (
    authorId integer primary key,
    firstName varchar(100),
    lastName varchar(100)
);

create table if not exists bookAuthor (
    bookId integer,
    authorId integer,
    primary key (bookId, authorId)
);