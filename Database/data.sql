-- cities 

INSERT INTO cities (city_name) VALUES
('Thành phố Hồ Chí Minh'),
('Hà Nội');
-- HCM CGV
INSERT INTO theatres (city_id, theatre_name) VALUES
(1, 'CGV Sư Vạn Hạnh'),
(1, 'CGV Vincom Landmark 81'),
(1, 'CGV Vivo City');
-- HN CGV
INSERT INTO theatres (theatre_name, city_id) VALUES
('CGV Aeon Hà Đông', 2),
('CGV Vincom Center Bà Triệu', 2),
('CGV Vincom Royal City', 2),
('CGV Vincom Times City', 2);

-- movie format
INSERT INTO formats (format_type) VALUES 
('2D'), 
('3D'),
('4DX3D'),
('IMAX3D'),
('ULTRA 4DX-SCX2D');
-- special screen
INSERT INTO special_screens (sscreen_name) VALUES
('SWEET BOX'),
('4DX'),
('IMAX'),
('GOLD CLASS'),
('L''AMOUR'),
('STARIUM'),
('PREMIUM CINEMA'),
('SCREENX'),
('ULTRA 4DX');
 -- movies

INSERT INTO movies 
(title, description, rated, duration_in_mins, poster_url, trailer_url, release_date, genre, director, cast, languages, movie_status) 
VALUES
('GODZILLA X KONG: THE NEW EMPIRE', 
'Kong and Godzilla - two legendary great creatures, two sworn enemies will embark on a common mission of survival to protect humanity, and the battle that binds them to humanity forever will begin.',
'K - FILMS THAT ARE POPULAR TO VIEWERS UNDER THE AGE OF 13 AND ACCOMPANIED BY A GUARDIAN',
115,
'https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/p/o/poster_payoff_godzilla_va_kong_3_1_.jpg',
'https://www.youtube.com/watch?v=qqrpMRDuPfc&ab_channel=WarnerBros.Pictures',
'2024-03-29',
'Action, Adventure',
'Adam Wingard',
'Rebecca Hall; Brian Tyree Henry; Dan Stevens; Kaylee Hottle; Alex Ferns; Fala Chen,...',
'English - Vietnamese Subtitles, Korean', 'SHOWING'),
('LUCA''S SUMMER',
'"Luca''s Summer" tells the story of young Luca''s journey on the island of Portorosso in the Mediterranean Sea in beautiful Italy. Here he made new little friends and enjoyed the sunny summer, gelato and the famous spaghetti. However, one thing is not very good, Luca is a WATER MONSTER and the people of this island do not like this at all.',
'P - THE FILM IS ALLOWED TO BE POPULAR TO VIEWERS OF ALL AGES.',
99,
'https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/r/s/rsz_luca_poster.jpg',
'https://www.youtube.com/watch?v=mYfJxlgR2jw&ab_channel=Pixar',
'2024-04-18',
'comedy, animation, adventure',
'Enrico Casarosa',
'Jacob Tremblay, Jack Dylan Grazer, Emma Berman, Saverio Raimondo, Maya Rudolph, Marco Barricelli, Jim Gaffigan, Sandy Martin',
'English with Vietnamese subtitles, dubbed', 
'SHOWING'),
('PLANET OF THE APES: THE NEW KINGDOM',
'Director Wes Ball brings a new breath to this prestigious movie series. Set many generations after the death of the Monkey King Caesar, this planet is where apes dominate, while humanity gradually retreats into darkness. ',
144 ,
'T13 - MOVIES THAT ARE POPULAR TO VIEWERS AGED 13 AND OVER (13+)',
'https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/f/z/fzone_007c_g_vie-vn_4x5_.jpg',
'https://www.youtube.com/watch?v=Kdr5oedn7q8',
'2024-05-10',
'Action, Adventure',
'Wes Ball',
'Owen Teague, Freya Allan, Kevin Durand, Peter Macon, and William H. Macy',
'English - Vietnamese Subtitles', 
'PAST');
-- movie format
INSERT INTO movie_format (movie_id, format_id) VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(2,1);
-- screens
INSERT INTO screens (theatre_id, format_id, sscreen_id, screen_name) VALUES
(7, 1, null, 'Cinema 1'),
(7, 1, 7, 'Cinema 2'),
(6, 1, null, 'Cinema 1'),
(5, 3, 2, 'Cinema 1'),
(5, 1, null, 'Cinema 2'),
(4, 4, 3, 'Cinema 1'),
(4, 1, null, 'Cinema 2'),
(3, 1, null, 'Cinema 1'),
(3, 4, 3, 'Cinema 2'),
(2, 1, null, 'Cinema 1'),
(2, 4, 3, 'Cinema 2'),
(1, 1, null, 'Cinema 1'),
(1, 5, 9, 'Cinema 2');

INSERT INTO seats (screen_id, row_num, seat_num, seat_type, seat_status)
VALUES
(1, 'A', 1, 'Standard', 'Free'),
(1, 'A', 2, 'Standard', 'Free'),
(1, 'A', 3, 'Standard', 'Free'),
(1, 'A', 4, 'Standard', 'Free'),
(1, 'B', 1, 'VIP', 'Free'),
(1, 'B', 2, 'VIP', 'Free'),
(1, 'B', 3, 'VIP', 'Free'),
(1, 'B', 4, 'VIP', 'Free'),
(1, 'C', 1, 'Couple', 'Free'),
(1, 'C', 2, 'Couple', 'Free'),
(1, 'C', 3, 'Couple', 'Free'),
(1, 'C', 4, 'Couple', 'Free'),
(2, 'A', 1, 'Premium', 'Free'),
(2, 'A', 2, 'Premium', 'Free'),
(2, 'A', 3, 'Premium', 'Free'),
(2, 'A', 4, 'Premium', 'Free'),
(2, 'B', 1, 'Premium', 'Free'),
(2, 'B', 2, 'Premium', 'Free'),
(2, 'B', 3, 'Premium', 'Free'),
(2, 'B', 4, 'Premium', 'Free'),
(3, 'A', 1, 'Standard', 'Free'),
(3, 'A', 2, 'Standard', 'Free'),
(3, 'A', 3, 'Standard', 'Free'),
(3, 'A', 4, 'Standard', 'Free'),
(3, 'B', 1, 'VIP', 'Free'),
(3, 'B', 2, 'VIP', 'Free'),
(3, 'B', 3, 'VIP', 'Free'),
(3, 'B', 4, 'VIP', 'Free'),
(3, 'C', 1, 'Couple', 'Free'),
(3, 'C', 2, 'Couple', 'Free'),
(3, 'C', 3, 'Couple', 'Free'),
(3, 'C', 4, 'Couple', 'Free'),
(4, 'A', 1, '4DX', 'Free'),
(4, 'A', 2, '4DX', 'Free'),
(4, 'A', 3, '4DX', 'Free'),
(4, 'A', 4, '4DX', 'Free'),
(4, 'B', 1, '4DX', 'Free'),
(4, 'B', 2, '4DX', 'Free'),
(4, 'B', 3, '4DX', 'Free'),
(4, 'B', 4, '4DX', 'Free'),
(5, 'A', 1, 'Standard', 'Free'),
(5, 'A', 2, 'Standard', 'Free'),
(5, 'A', 3, 'Standard', 'Free'),
(5, 'A', 4, 'Standard', 'Free'),
(5, 'B', 1, 'VIP', 'Free'),
(5, 'B', 2, 'VIP', 'Free'),
(5, 'B', 3, 'VIP', 'Free'),
(5, 'B', 4, 'VIP', 'Free'),
(5, 'C', 1, 'Couple', 'Free'),
(5, 'C', 2, 'Couple', 'Free'),
(5, 'C', 3, 'Couple', 'Free'),
(5, 'C', 4, 'Couple', 'Free'),
(6, 'A', 1, 'VIP', 'Free'),
(6, 'A', 2, 'VIP', 'Free'),
(6, 'A', 3, 'VIP', 'Free'),
(6, 'A', 4, 'VIP', 'Free'),
(6, 'B', 1, 'VIP', 'Free'),
(6, 'B', 2, 'VIP', 'Free'),
(6, 'B', 3, 'VIP', 'Free'),
(6, 'B', 4, 'VIP', 'Free'),
(7, 'A', 1, 'Standard', 'Free'),
(7, 'A', 2, 'Standard', 'Free'),
(7, 'A', 3, 'Standard', 'Free'),
(7, 'A', 4, 'Standard', 'Free'),
(7, 'B', 1, 'Vip', 'Free'),
(7, 'B', 2, 'Vip', 'Free'),
(7, 'B', 3, 'Vip', 'Free'),
(7, 'B', 4, 'Vip', 'Free'),
(7, 'C', 1, 'Couple', 'Free'),
(7, 'C', 2, 'Couple', 'Free'),
(7, 'C', 3, 'Couple', 'Free'),
(7, 'C', 4, 'Couple', 'Free'),
(8, 'A', 1, 'Standard', 'Free'),
(8, 'A', 2, 'Standard', 'Free'),
(8, 'A', 3, 'Standard', 'Free'),
(8, 'A', 4, 'Standard', 'Free'),
(8, 'B', 1, 'Vip', 'Free'),
(8, 'B', 2, 'Vip', 'Free'),
(8, 'B', 3, 'Vip', 'Free'),
(8, 'B', 4, 'Vip', 'Free'),
(8, 'C', 1, 'Couple', 'Free'),
(8, 'C', 2, 'Couple', 'Free'),
(8, 'C', 3, 'Couple', 'Free'),
(8, 'C', 4, 'Couple', 'Free'),
(9, 'A', 1, 'Vip', 'Free'),
(9, 'A', 2, 'Vip', 'Free'),
(9, 'A', 3, 'Vip', 'Free'),
(9, 'A', 4, 'Vip', 'Free'),
(9, 'B', 1, 'Vip', 'Free'),
(9, 'B', 2, 'Vip', 'Free'),
(9, 'B', 3, 'Vip', 'Free'),
(9, 'B', 4, 'Vip', 'Free'),
(10, 'A', 1, 'Standard', 'Free'),
(10, 'A', 2, 'Standard', 'Free'),
(10, 'A', 3, 'Standard', 'Free'),
(10, 'A', 4, 'Standard', 'Free'),
(10, 'B', 1, 'Vip', 'Free'),
(10, 'B', 2, 'Vip', 'Free'),
(10, 'B', 3, 'Vip', 'Free'),
(10, 'B', 4, 'Vip', 'Free'),
(10, 'C', 1, 'Couple', 'Free'),
(10, 'C', 2, 'Couple', 'Free'),
(10, 'C', 3, 'Couple', 'Free'),
(10, 'C', 4, 'Couple', 'Free'),
(11, 'A', 1, 'Vip', 'Free'),
(11, 'A', 2, 'Vip', 'Free'),
(11, 'A', 3, 'Vip', 'Free'),
(11, 'A', 4, 'Vip', 'Free'),
(11, 'B', 1, 'Vip', 'Free'),
(11, 'B', 2, 'Vip', 'Free'),
(11, 'B', 3, 'Vip', 'Free'),
(11, 'B', 4, 'Vip', 'Free'),
(12, 'A', 1, 'Standard', 'Free'),
(12, 'A', 2, 'Standard', 'Free'),
(12, 'A', 3, 'Standard', 'Free'),
(12, 'A', 4, 'Standard', 'Free'),
(12, 'B', 1, 'Vip', 'Free'),
(12, 'B', 2, 'Vip', 'Free'),
(12, 'B', 3, 'Vip', 'Free'),
(12, 'B', 4, 'Vip', 'Free'),
(12, 'C', 1, 'Couple', 'Free'),
(12, 'C', 2, 'Couple', 'Free'),
(12, 'C', 3, 'Couple', 'Free'),
(12, 'C', 4, 'Couple', 'Free'),
(13, 'A', 1, 'Ultra 4DX', 'Free'),
(13, 'A', 2, 'Ultra 4DX', 'Free'),
(13, 'A', 3, 'Ultra 4DX', 'Free'),
(13, 'A', 4, 'Ultra 4DX', 'Free'),
(13, 'B', 1, 'Ultra 4DX', 'Free'),
(13, 'B', 2, 'Ultra 4DX', 'Free'),
(13, 'B', 3, 'Ultra 4DX', 'Free'),
(13, 'B', 4, 'Ultra 4DX', 'Free');

-- shows
INSERT INTO shows (movie_id, screen_id, start_time, show_date)
VALUES
-- For screen_id 1 and 2
(1, 1, '09:35', '2024-04-22'), (1, 2, '10:45', '2024-04-22'),
(1, 1, '12:05', '2024-04-22'), (1, 2, '13:15', '2024-04-22'),
(1, 1, '14:35', '2024-04-22'), (1, 2, '15:40', '2024-04-22'),
(1, 1, '17:00', '2024-04-22'), (1, 2, '18:10', '2024-04-22'),
(1, 1, '19:30', '2024-04-22'), (1, 2, '20:15', '2024-04-22'),
(1, 1, '20:40', '2024-04-22'),

-- For screen_id 4 and 5
(1, 4, '09:35', '2024-04-22'), (1, 5, '10:45', '2024-04-22'),
(1, 4, '12:05', '2024-04-22'), (1, 5, '13:15', '2024-04-22'),
(1, 4, '14:35', '2024-04-22'), (1, 5, '15:40', '2024-04-22'),
(1, 4, '17:00', '2024-04-22'), (1, 5, '18:10', '2024-04-22'),
(1, 4, '19:30', '2024-04-22'), (1, 5, '20:15', '2024-04-22'),
(1, 4, '20:40', '2024-04-22'),

-- For screen_id 6 and 7
(1, 6, '09:35', '2024-04-22'), (1, 7, '10:45', '2024-04-22'),
(1, 6, '12:05', '2024-04-22'), (1, 7, '13:15', '2024-04-22'),
(1, 6, '14:35', '2024-04-22'), (1, 7, '15:40', '2024-04-22'),
(1, 6, '17:00', '2024-04-22'), (1, 7, '18:10', '2024-04-22'),
(1, 6, '19:30', '2024-04-22'), (1, 7, '20:15', '2024-04-22'),
(1, 6, '20:40', '2024-04-22'),

-- For screen_id 8 and 9
(1, 8, '09:35', '2024-04-22'), (1, 9, '10:45', '2024-04-22'),
(1, 8, '12:05', '2024-04-22'), (1, 9, '13:15', '2024-04-22'),
(1, 8, '14:35', '2024-04-22'), (1, 9, '15:40', '2024-04-22'),
(1, 8, '17:00', '2024-04-22'), (1, 9, '18:10', '2024-04-22'),
(1, 8, '19:30', '2024-04-22'), (1, 9, '20:15', '2024-04-22'),
(1, 8, '20:40', '2024-04-22'),

-- For screen_id 10 and 11
(1, 10, '09:35', '2024-04-22'), (1, 11, '10:45', '2024-04-22'),
(1, 10, '12:05', '2024-04-22'), (1, 11, '13:15', '2024-04-22'),
(1, 10, '14:35', '2024-04-22'), (1, 11, '15:40', '2024-04-22'),
(1, 10, '17:00', '2024-04-22'), (1, 11, '18:10', '2024-04-22'),
(1, 10, '19:30', '2024-04-22'), (1, 11, '20:15', '2024-04-22'),
(1, 10, '20:40', '2024-04-22'),

-- For screen_id 11 and 12
(1, 11, '09:35', '2024-04-22'), (1, 12, '10:45', '2024-04-22'),
(1, 11, '12:05', '2024-04-22'), (1, 12, '13:15', '2024-04-22'),
(1, 11, '14:35', '2024-04-22'), (1, 12, '15:40', '2024-04-22'),
(1, 11, '17:00', '2024-04-22'), (1, 12, '18:10', '2024-04-22'),
(1, 11, '19:30', '2024-04-22'), (1, 12, '20:15', '2024-04-22'),
(1, 11, '20:40', '2024-04-22'),

-- For screen_id 3
(1, 3, '09:35', '2024-04-22'), (1, 3, '10:45', '2024-04-22'),
(1, 3, '12:05', '2024-04-22'), (1, 3, '13:15', '2024-04-22'),
(1, 3, '14:35', '2024-04-22'), (1, 3, '15:40', '2024-04-22'),
(1, 3, '17:00', '2024-04-22'), (1, 3, '18:10', '2024-04-22'),
(1, 3, '19:30', '2024-04-22'), (1, 3, '20:15', '2024-04-22'),
(1, 3, '20:40', '2024-04-22'),
-- For screen_id 1 and 2
(1, 1, '09:35', '2024-04-23'), (1, 2, '10:45', '2024-04-23'),
(1, 1, '12:05', '2024-04-23'), (1, 2, '13:15', '2024-04-23'),
(1, 1, '14:35', '2024-04-23'), (1, 2, '15:40', '2024-04-23'),
(1, 1, '17:00', '2024-04-23'), (1, 2, '18:10', '2024-04-23'),
(1, 1, '19:30', '2024-04-23'), (1, 2, '20:15', '2024-04-23'),
(1, 1, '20:40', '2024-04-23'),

-- For screen_id 4 and 5
(1, 4, '09:35', '2024-04-23'), (1, 5, '10:45', '2024-04-23'),
(1, 4, '12:05', '2024-04-23'), (1, 5, '13:15', '2024-04-23'),
(1, 4, '14:35', '2024-04-23'), (1, 5, '15:40', '2024-04-23'),
(1, 4, '17:00', '2024-04-23'), (1, 5, '18:10', '2024-04-23'),
(1, 4, '19:30', '2024-04-23'), (1, 5, '20:15', '2024-04-23'),
(1, 4, '20:40', '2024-04-23'),

-- For screen_id 6 and 7
(1, 6, '09:35', '2024-04-23'), (1, 7, '10:45', '2024-04-23'),
(1, 6, '12:05', '2024-04-23'), (1, 7, '13:15', '2024-04-23'),
(1, 6, '14:35', '2024-04-23'), (1, 7, '15:40', '2024-04-23'),
(1, 6, '17:00', '2024-04-23'), (1, 7, '18:10', '2024-04-23'),
(1, 6, '19:30', '2024-04-23'), (1, 7, '20:15', '2024-04-23'),
(1, 6, '20:40', '2024-04-23'),

-- For screen_id 8 and 9
(1, 8, '09:35', '2024-04-23'), (1, 9, '10:45', '2024-04-23'),
(1, 8, '12:05', '2024-04-23'), (1, 9, '13:15', '2024-04-23'),
(1, 8, '14:35', '2024-04-23'), (1, 9, '15:40', '2024-04-23'),
(1, 8, '17:00', '2024-04-23'), (1, 9, '18:10', '2024-04-23'),
(1, 8, '19:30', '2024-04-23'), (1, 9, '20:15', '2024-04-23'),
(1, 8, '20:40', '2024-04-23'),

-- For screen_id 10 and 11
(1, 10, '09:35', '2024-04-23'), (1, 11, '10:45', '2024-04-23'),
(1, 10, '12:05', '2024-04-23'), (1, 11, '13:15', '2024-04-23'),
(1, 10, '14:35', '2024-04-23'), (1, 11, '15:40', '2024-04-23'),
(1, 10, '17:00', '2024-04-23'), (1, 11, '18:10', '2024-04-23'),
(1, 10, '19:30', '2024-04-23'), (1, 11, '20:15', '2024-04-23'),
(1, 10, '20:40', '2024-04-23'),

-- For screen_id 11 and 12
(1, 11, '09:35', '2024-04-23'), (1, 12, '10:45', '2024-04-23'),
(1, 11, '12:05', '2024-04-23'), (1, 12, '13:15', '2024-04-23'),
(1, 11, '14:35', '2024-04-23'), (1, 12, '15:40', '2024-04-23'),
(1, 11, '17:00', '2024-04-23'), (1, 12, '18:10', '2024-04-23'),
(1, 11, '19:30', '2024-04-23'), (1, 12, '20:15', '2024-04-23'),
(1, 11, '20:40', '2024-04-23'),

-- For screen_id 3
(1, 3, '09:35', '2024-04-23'), (1, 3, '10:45', '2024-04-23'),
(1, 3, '12:05', '2024-04-23'), (1, 3, '13:15', '2024-04-23'),
(1, 3, '14:35', '2024-04-23'), (1, 3, '15:40', '2024-04-23'),
(1, 3, '17:00', '2024-04-23'), (1, 3, '18:10', '2024-04-23'),
(1, 3, '19:30', '2024-04-23'), (1, 3, '20:15', '2024-04-23'),
(1, 3, '20:40', '2024-04-23'),

-- For screen_id 1 and 2
(1, 1, '09:35', '2024-04-24'), (1, 2, '10:45', '2024-04-24'),
(1, 1, '12:05', '2024-04-24'), (1, 2, '13:15', '2024-04-24'),
(1, 1, '14:35', '2024-04-24'), (1, 2, '15:40', '2024-04-24'),
(1, 1, '17:00', '2024-04-24'), (1, 2, '18:10', '2024-04-24'),
(1, 1, '19:30', '2024-04-24'), (1, 2, '20:15', '2024-04-24'),
(1, 1, '20:40', '2024-04-24'),

-- For screen_id 4 and 5
(1, 4, '09:35', '2024-04-24'), (1, 5, '10:45', '2024-04-24'),
(1, 4, '12:05', '2024-04-24'), (1, 5, '13:15', '2024-04-24'),
(1, 4, '14:35', '2024-04-24'), (1, 5, '15:40', '2024-04-24'),
(1, 4, '17:00', '2024-04-24'), (1, 5, '18:10', '2024-04-24'),
(1, 4, '19:30', '2024-04-24'), (1, 5, '20:15', '2024-04-24'),
(1, 4, '20:40', '2024-04-24'),

-- For screen_id 6 and 7
(1, 6, '09:35', '2024-04-24'), (1, 7, '10:45', '2024-04-24'),
(1, 6, '12:05', '2024-04-24'), (1, 7, '13:15', '2024-04-24'),
(1, 6, '14:35', '2024-04-24'), (1, 7, '15:40', '2024-04-24'),
(1, 6, '17:00', '2024-04-24'), (1, 7, '18:10', '2024-04-24'),
(1, 6, '19:30', '2024-04-24'), (1, 7, '20:15', '2024-04-24'),
(1, 6, '20:40', '2024-04-24'),

-- For screen_id 8 and 9
(1, 8, '09:35', '2024-04-24'), (1, 9, '10:45', '2024-04-24'),
(1, 8, '12:05', '2024-04-24'), (1, 9, '13:15', '2024-04-24'),
(1, 8, '14:35', '2024-04-24'), (1, 9, '15:40', '2024-04-24'),
(1, 8, '17:00', '2024-04-24'), (1, 9, '18:10', '2024-04-24'),
(1, 8, '19:30', '2024-04-24'), (1, 9, '20:15', '2024-04-24'),
(1, 8, '20:40', '2024-04-24'),

-- For screen_id 10 and 11
(1, 10, '09:35', '2024-04-24'), (1, 11, '10:45', '2024-04-24'),
(1, 10, '12:05', '2024-04-24'), (1, 11, '13:15', '2024-04-24'),
(1, 10, '14:35', '2024-04-24'), (1, 11, '15:40', '2024-04-24'),
(1, 10, '17:00', '2024-04-24'), (1, 11, '18:10', '2024-04-24'),
(1, 10, '19:30', '2024-04-24'), (1, 11, '20:15', '2024-04-24'),
(1, 10, '20:40', '2024-04-24'),

-- For screen_id 11 and 12
(1, 11, '09:35', '2024-04-24'), (1, 12, '10:45', '2024-04-24'),
(1, 11, '12:05', '2024-04-24'), (1, 12, '13:15', '2024-04-24'),
(1, 11, '14:35', '2024-04-24'), (1, 12, '15:40', '2024-04-24'),
(1, 11, '17:00', '2024-04-24'), (1, 12, '18:10', '2024-04-24'),
(1, 11, '19:30', '2024-04-24'), (1, 12, '20:15', '2024-04-24'),
(1, 11, '20:40', '2024-04-24'),

-- For screen_id 3
(1, 3, '09:35', '2024-04-24'), (1, 3, '10:45', '2024-04-24'),
(1, 3, '12:05', '2024-04-24'), (1, 3, '13:15', '2024-04-24'),
(1, 3, '14:35', '2024-04-24'), (1, 3, '15:40', '2024-04-24'),
(1, 3, '17:00', '2024-04-24'), (1, 3, '18:10', '2024-04-24'),
(1, 3, '19:30', '2024-04-24'), (1, 3, '20:15', '2024-04-24'),
(1, 3, '20:40', '2024-04-24'),

-- For screen_id 1 and 2
(1, 1, '09:35', '2024-04-25'), (1, 2, '10:45', '2024-04-25'),
(1, 1, '12:05', '2024-04-25'), (1, 2, '13:15', '2024-04-25'),
(1, 1, '14:35', '2024-04-25'), (1, 2, '15:40', '2024-04-25'),
(1, 1, '17:00', '2024-04-25'), (1, 2, '18:10', '2024-04-25'),
(1, 1, '19:30', '2024-04-25'), (1, 2, '20:15', '2024-04-25'),
(1, 1, '20:40', '2024-04-25'),

-- For screen_id 4 and 5
(1, 4, '09:35', '2024-04-25'), (1, 5, '10:45', '2024-04-25'),
(1, 4, '12:05', '2024-04-25'), (1, 5, '13:15', '2024-04-25'),
(1, 4, '14:35', '2024-04-25'), (1, 5, '15:40', '2024-04-25'),
(1, 4, '17:00', '2024-04-25'), (1, 5, '18:10', '2024-04-25'),
(1, 4, '19:30', '2024-04-25'), (1, 5, '20:15', '2024-04-25'),
(1, 4, '20:40', '2024-04-25'),

-- For screen_id 6 and 7
(1, 6, '09:35', '2024-04-25'), (1, 7, '10:45', '2024-04-25'),
(1, 6, '12:05', '2024-04-25'), (1, 7, '13:15', '2024-04-25'),
(1, 6, '14:35', '2024-04-25'), (1, 7, '15:40', '2024-04-25'),
(1, 6, '17:00', '2024-04-25'), (1, 7, '18:10', '2024-04-25'),
(1, 6, '19:30', '2024-04-25'), (1, 7, '20:15', '2024-04-25'),
(1, 6, '20:40', '2024-04-25'),

-- For screen_id 8 and 9
(1, 8, '09:35', '2024-04-25'), (1, 9, '10:45', '2024-04-25'),
(1, 8, '12:05', '2024-04-25'), (1, 9, '13:15', '2024-04-25'),
(1, 8, '14:35', '2024-04-25'), (1, 9, '15:40', '2024-04-25'),
(1, 8, '17:00', '2024-04-25'), (1, 9, '18:10', '2024-04-25'),
(1, 8, '19:30', '2024-04-25'), (1, 9, '20:15', '2024-04-25'),
(1, 8, '20:40', '2024-04-25'),

-- For screen_id 10 and 11
(1, 10, '09:35', '2024-04-25'), (1, 11, '10:45', '2024-04-25'),
(1, 10, '12:05', '2024-04-25'), (1, 11, '13:15', '2024-04-25'),
(1, 10, '14:35', '2024-04-25'), (1, 11, '15:40', '2024-04-25'),
(1, 10, '17:00', '2024-04-25'), (1, 11, '18:10', '2024-04-25'),
(1, 10, '19:30', '2024-04-25'), (1, 11, '20:15', '2024-04-25'),
(1, 10, '20:40', '2024-04-25'),

-- For screen_id 11 and 12
(1, 11, '09:35', '2024-04-25'), (1, 12, '10:45', '2024-04-25'),
(1, 11, '12:05', '2024-04-25'), (1, 12, '13:15', '2024-04-25'),
(1, 11, '14:35', '2024-04-25'), (1, 12, '15:40', '2024-04-25'),
(1, 11, '17:00', '2024-04-25'), (1, 12, '18:10', '2024-04-25'),
(1, 11, '19:30', '2024-04-25'), (1, 12, '20:15', '2024-04-25'),
(1, 11, '20:40', '2024-04-25'),

-- For screen_id 3
(1, 3, '09:35', '2024-04-25'), (1, 3, '10:45', '2024-04-25'),
(1, 3, '12:05', '2024-04-25'), (1, 3, '13:15', '2024-04-25'),
(1, 3, '14:35', '2024-04-25'), (1, 3, '15:40', '2024-04-25'),
(1, 3, '17:00', '2024-04-25'), (1, 3, '18:10', '2024-04-25'),
(1, 3, '19:30', '2024-04-25'), (1, 3, '20:15', '2024-04-25'),
(1, 3, '20:40', '2024-04-25');

INSERT INTO shows (movie_id, screen_id, start_time, show_date)
VALUES
-- For screen_id 1 and 2
(2, 1, '09:35', '2024-04-22'), (2, 2, '10:45', '2024-04-22'),
(2, 1, '12:05', '2024-04-22'), (2, 2, '13:15', '2024-04-22'),
(2, 1, '14:35', '2024-04-22'), (2, 2, '15:40', '2024-04-22'),
(2, 1, '17:00', '2024-04-22'), (2, 2, '18:10', '2024-04-22'),
(2, 1, '19:30', '2024-04-22'), (2, 2, '20:15', '2024-04-22'),
(2, 1, '20:40', '2024-04-22'),

-- For screen_id 4 and 5
(2, 4, '09:35', '2024-04-22'), (2, 5, '10:45', '2024-04-22'),
(2, 4, '12:05', '2024-04-22'), (2, 5, '13:15', '2024-04-22'),
(2, 4, '14:35', '2024-04-22'), (2, 5, '15:40', '2024-04-22'),
(2, 4, '17:00', '2024-04-22'), (2, 5, '18:10', '2024-04-22'),
(2, 4, '19:30', '2024-04-22'), (2, 5, '20:15', '2024-04-22'),
(2, 4, '20:40', '2024-04-22'),

-- For screen_id 6 and 7
(2, 6, '09:35', '2024-04-22'), (2, 7, '10:45', '2024-04-22'),
(2, 6, '12:05', '2024-04-22'), (2, 7, '13:15', '2024-04-22'),
(2, 6, '14:35', '2024-04-22'), (2, 7, '15:40', '2024-04-22'),
(2, 6, '17:00', '2024-04-22'), (2, 7, '18:10', '2024-04-22'),
(2, 6, '19:30', '2024-04-22'), (2, 7, '20:15', '2024-04-22'),
(2, 6, '20:40', '2024-04-22'),

-- For screen_id 8 and 9
(2, 8, '09:35', '2024-04-22'), (2, 9, '10:45', '2024-04-22'),
(2, 8, '12:05', '2024-04-22'), (2, 9, '13:15', '2024-04-22'),
(2, 8, '14:35', '2024-04-22'), (2, 9, '15:40', '2024-04-22'),
(2, 8, '17:00', '2024-04-22'), (2, 9, '18:10', '2024-04-22'),
(2, 8, '19:30', '2024-04-22'), (2, 9, '20:15', '2024-04-22'),
(2, 8, '20:40', '2024-04-22'),

-- For screen_id 10 and 11
(2, 10, '09:35', '2024-04-22'), (2, 11, '10:45', '2024-04-22'),
(2, 10, '12:05', '2024-04-22'), (2, 11, '13:15', '2024-04-22'),
(2, 10, '14:35', '2024-04-22'), (2, 11, '15:40', '2024-04-22'),
(2, 10, '17:00', '2024-04-22'), (2, 11, '18:10', '2024-04-22'),
(2, 10, '19:30', '2024-04-22'), (2, 11, '20:15', '2024-04-22'),
(2, 10, '20:40', '2024-04-22'),

-- For screen_id 11 and 12
(2, 11, '09:35', '2024-04-22'), (2, 12, '10:45', '2024-04-22'),
(2, 11, '12:05', '2024-04-22'), (2, 12, '13:15', '2024-04-22'),
(2, 11, '14:35', '2024-04-22'), (2, 12, '15:40', '2024-04-22'),
(2, 11, '17:00', '2024-04-22'), (2, 12, '18:10', '2024-04-22'),
(2, 11, '19:30', '2024-04-22'), (2, 12, '20:15', '2024-04-22'),
(2, 11, '20:40', '2024-04-22'),

-- For screen_id 3
(2, 3, '09:35', '2024-04-22'), (2, 3, '10:45', '2024-04-22'),
(2, 3, '12:05', '2024-04-22'), (2, 3, '13:15', '2024-04-22'),
(2, 3, '14:35', '2024-04-22'), (2, 3, '15:40', '2024-04-22'),
(2, 3, '17:00', '2024-04-22'), (2, 3, '18:10', '2024-04-22'),
(2, 3, '19:30', '2024-04-22'), (2, 3, '20:15', '2024-04-22'),
(2, 3, '20:40', '2024-04-22');

INSERT INTO shows (movie_id, screen_id, start_time, show_date)
SELECT 2, screen_id, start_time, show_date 
FROM shows;

-- select * from seats
-- select * from special_screens
-- select s.*, se.seat_type from screens s , seats se where s.screen_id = se.screen_id

INSERT INTO fares (seat_id, show_id, price)
SELECT se.seat_id, sh.show_id, 
    CASE
        WHEN se.seat_type = 'Standard' AND sc.sscreen_id IS NULL THEN 80000
        WHEN se.seat_type = 'VIP' AND sc.sscreen_id IS NULL THEN 100000
        WHEN se.seat_type = 'Couple' AND sc.sscreen_id IS NULL THEN 115000
        WHEN se.seat_type = 'VIP' AND sc.sscreen_id = 3 THEN 130000
        WHEN se.seat_type = 'Premium' AND sc.sscreen_id = 7 THEN 150000
        WHEN se.seat_type = '4DX' AND sc.sscreen_id = 2 THEN 160000
        WHEN se.seat_type = 'Ultra 4DX' AND sc.sscreen_id = 9 THEN 200000
        ELSE NULL
    END AS price
FROM seats se
JOIN shows sh ON sh.screen_id = se.screen_id
JOIN movies m ON m.movie_id = sh.movie_id
JOIN screens sc ON sc.screen_id = se.screen_id
LEFT JOIN special_screens s ON sc.sscreen_id = s.sscreen_id
WHERE m.movie_id = 1;

INSERT INTO fares (seat_id, show_id, price)
SELECT se.seat_id, sh.show_id, 
    CASE
        WHEN se.seat_type = 'Standard' AND sc.sscreen_id IS NULL THEN 70000
        WHEN se.seat_type = 'VIP' AND sc.sscreen_id IS NULL THEN 95000
        WHEN se.seat_type = 'Couple' AND sc.sscreen_id IS NULL THEN 110000
        WHEN se.seat_type = 'VIP' AND sc.sscreen_id = 3 THEN 120000
        WHEN se.seat_type = 'Premium' AND sc.sscreen_id = 7 THEN 140000
        WHEN se.seat_type = '4DX' AND sc.sscreen_id = 2 THEN 150000
        WHEN se.seat_type = 'Ultra 4DX' AND sc.sscreen_id = 9 THEN 180000
        ELSE NULL
    END AS price
FROM seats se
JOIN shows sh ON sh.screen_id = se.screen_id
JOIN movies m ON m.movie_id = sh.movie_id
JOIN screens sc ON sc.screen_id = se.screen_id
LEFT JOIN special_screens s ON sc.sscreen_id = s.sscreen_id
WHERE m.movie_id = 2;

select 
	c.city_name,
	t.theatre_name theatre, 
    sc.screen_name screen, 
    s.sscreen_name special, 
    m.title, 
    -- concat(se.row_num, se.seat_num) seat, 
    -- se.seat_type, se.seat_status, 
    -- f.price,
     sh.start_time,
    sh.show_date
from shows sh 
join screens sc on sh.screen_id = sc.screen_id
join movies m on sh.movie_id = m.movie_id
-- join seats se on sc.screen_id = se.screen_id
left join special_screens s on s.sscreen_id = sc.sscreen_id
join theatres t on t.theatre_id = sc.theatre_id
join cities c on t.city_id = c.city_id
-- join fares f on f.show_id = sh.show_id and f.seat_id = se.seat_id
where sh.show_date = '2024-04-22' and m.movie_id = 1


