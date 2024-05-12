-- users Table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    email VARCHAR(50),
    password_ VARCHAR(255), -- Increased length for hashed passwords
    date_of_birth DATE,
    mobile_phone VARCHAR(15),
    address VARCHAR(50), -- Increased length for address
    CONSTRAINT pk_user_id PRIMARY KEY (user_id)
);
-- cities Table
CREATE TABLE cities (
    city_id INT AUTO_INCREMENT,
    city_name VARCHAR(50), -- Increased length for city names
    CONSTRAINT pk_city_id PRIMARY KEY (city_id)
);

-- user_city Table
CREATE TABLE user_city (
    user_id INT,
    city_id INT,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (city_id) REFERENCES cities (city_id),
    CONSTRAINT pk_user_city PRIMARY KEY (user_id, city_id)
);

-- theatres Table
CREATE TABLE theatres (
    theatre_id INT AUTO_INCREMENT,
    city_id INT,
    theatre_name VARCHAR(100),
    address VARCHAR(20),
    FOREIGN KEY (city_id) REFERENCES cities (city_id),
    CONSTRAINT pk_theatre_id PRIMARY KEY (theatre_id)
);

-- formats Table
CREATE TABLE formats (
    format_id INT AUTO_INCREMENT,
    format_type VARCHAR(20), -- Increased length for format types
    CONSTRAINT pk_format_id PRIMARY KEY (format_id)
);
-- movies Table
CREATE TABLE movies (
    movie_id INT AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT, -- Renamed from descriptions
    rated VARCHAR(255),
    duration_in_mins SMALLINT,
    poster_url VARCHAR(255),
    trailer_url VARCHAR(255),
    release_date DATE,
    genre VARCHAR(255),
    director VARCHAR(255),
    cast VARCHAR(255),
    languages varchar(255),
    CONSTRAINT pk_movie_id PRIMARY KEY (movie_id)
);

-- movie_format Table
CREATE TABLE movie_format (
    format_id INT,
    movie_id INT,
    FOREIGN KEY (format_id) REFERENCES formats (format_id),
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id),
    CONSTRAINT pk_movie_format PRIMARY KEY (format_id, movie_id)
);
-- special screen
CREATE TABLE special_screens (
	sscreen_id INT AUTO_INCREMENT,
    sscreen_name varchar(50),
    CONSTRAINT pk_sscreen_id PRIMARY KEY (sscreen_id)
);

-- screens Table
CREATE TABLE screens (
    screen_id INT AUTO_INCREMENT,
    theatre_id INT,
    format_id INT,
    sscreen_id INT,
    screen_name VARCHAR(20),
    FOREIGN KEY (theatre_id) REFERENCES theatres (theatre_id),
    FOREIGN KEY (format_id) REFERENCES formats (format_id),
    FOREIGN KEY (sscreen_id) REFERENCES special_screens (sscreen_id),
    CONSTRAINT pk_screen_id PRIMARY KEY (screen_id)
);

-- seats Table
CREATE TABLE seats (
    seat_id INT AUTO_INCREMENT,
    screen_id INT,
    row_num CHAR(1),
    seat_num SMALLINT,
    seat_type VARCHAR(20),
    seat_status VARCHAR(20),
    FOREIGN KEY (screen_id) REFERENCES screens (screen_id),
    CONSTRAINT pk_seat_id PRIMARY KEY (seat_id)
);

-- shows Table
CREATE TABLE shows (
    show_id INT AUTO_INCREMENT,
    movie_id INT,
    screen_id INT,
    start_time TIME,
    show_date DATE,
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id),
    FOREIGN KEY (screen_id) REFERENCES screens (screen_id),
    CONSTRAINT pk_show_id PRIMARY KEY (show_id)
);

-- fares Table
CREATE TABLE fares (
    seat_id INT,
    show_id INT,
    price DOUBLE,
    FOREIGN KEY (seat_id) REFERENCES seats (seat_id),
    FOREIGN KEY (show_id) REFERENCES shows (show_id),
    CONSTRAINT pk_fare_id PRIMARY KEY (seat_id, show_id)
);

-- reservations Table
CREATE TABLE reservations (
    reservation_id INT AUTO_INCREMENT,
    user_id INT,
    show_id INT,
    reservation_code VARCHAR(20),
    createdOn DATE, -- Renamed from createOn
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (show_id) REFERENCES shows (show_id),
    CONSTRAINT pk_reservation_id PRIMARY KEY (reservation_id)
);
-- reservation_seats Table
CREATE TABLE reservation_seats (
    reservation_id INT,
    seat_id INT,
    FOREIGN KEY (reservation_id) REFERENCES reservations (reservation_id),
    FOREIGN KEY (seat_id) REFERENCES seats (seat_id),
    CONSTRAINT pk_reservation_seat PRIMARY KEY (reservation_id, seat_id)
);

-- reviews Table
CREATE TABLE reviews (
    movie_id INT,
    user_id INT,
    rating SMALLINT,
    comments VARCHAR(200),
    FOREIGN KEY (movie_id) REFERENCES movies (movie_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    CONSTRAINT pk_review PRIMARY KEY (movie_id, user_id) -- Corrected constraint name
);
