<<<<<<< HEAD
CREATE TABLE IF NOT EXISTS users (
    id bigint auto_increment,
    name varchar(255),
    bio varchar(255),
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)

=======
CREATE TABLE IF NOT EXISTS users (
    id bigint auto_increment,
    name varchar(255),
    bio varchar(255),
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime,
    primary key (id)

>>>>>>> 18444a73f89392adca82e39a950e49b14fbd5a4b
);