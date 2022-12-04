-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 04 Ara 2022, 10:05:53
-- Sunucu sürümü: 10.4.25-MariaDB
-- PHP Sürümü: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `unimeetv5`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `comments`
--

CREATE TABLE `comments` (
  `commentid` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `post_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `comments`
--

INSERT INTO `comments` (`commentid`, `content`, `post_id`, `user_id`) VALUES
(1, 'İlk yorum', 1, 1),
(2, 'ikinci yorum', 1, 3),
(3, 'üçüncü yorum', 2, 4),
(4, 'dENEME YYOURUJJMU', 1, 1),
(5, 'firstanmesiz', 1, 1),
(6, 'swagger yorumu', 1, 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `departments`
--

CREATE TABLE `departments` (
  `deptid` int(11) NOT NULL,
  `dept_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `departments`
--

INSERT INTO `departments` (`deptid`, `dept_name`) VALUES
(1, 'Bilgisayar Mühendisliği'),
(2, 'Makine Mühendisliği'),
(3, 'Elektrik Elektronik Mühendisliği'),
(4, 'İşletme'),
(5, 'İktisat'),
(6, 'Mimarlık');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `likes`
--

CREATE TABLE `likes` (
  `likeid` int(11) NOT NULL,
  `post_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `likes`
--

INSERT INTO `likes` (`likeid`, `post_id`, `user_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 1, 3),
(4, 2, 3),
(5, 12, 1),
(6, 12, 5);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `posts`
--

CREATE TABLE `posts` (
  `post_id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_fk_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `posts`
--

INSERT INTO `posts` (`post_id`, `content`, `user_fk_id`) VALUES
(1, 'First Post', 1),
(2, 'Second Post', 3),
(3, 'Third Post', 3),
(12, 'Ekleme Post', 1),
(13, 'EklemeV2 Post', 1),
(14, 'Eklemev5 Post', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tb_university`
--

CREATE TABLE `tb_university` (
  `uniid` int(11) NOT NULL,
  `uni_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `tb_university`
--

INSERT INTO `tb_university` (`uniid`, `uni_name`) VALUES
(1, 'ESKİŞEHİR TEKNİK ÜNİVERSİTESİ'),
(2, 'ANADOLU ÜNİVERSİTESİ'),
(3, 'OSMANGAZİ ÜNİVERSİTESİ');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tb_users`
--

CREATE TABLE `tb_users` (
  `id_user` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `user_bio` varchar(255) DEFAULT NULL,
  `tx_user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `uni_deptid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `tb_users`
--

INSERT INTO `tb_users` (`id_user`, `email`, `first_name`, `gender`, `last_name`, `phone_number`, `user_bio`, `tx_user_name`, `user_password`, `uni_deptid`) VALUES
(1, 'ismail@eskisehir.edu.tr', 'İsmail', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', 'adminadmin', 1),
(3, 'kemal@eskisehir.edu.tr', 'Kemal Yağız', 'Erkek', 'Özcan', '2147483647', 'Hello this is Kadir bio', 'kyozcan', 'admin2321', 2),
(4, 'radwan@anadolu.edu.tr', 'Radwan Rachid', 'Erkek', 'Houssein', '2147483647', 'Hello this is Radwan bio', 'radwanrh', 'radwan123admin', 3),
(5, 'emre@osmangazi.edu.tr', 'Emre Can', 'Erkek', 'Çakır', '2147483647', 'Hello this Emres my bio', 'ecancakir', 'adminemreadmin', 4),
(6, 'ayten@anadolu.edu.tr', 'Ayten', 'Kız', 'Ertaş', '2147483647', 'Hello this Aytens my bio', 'aertaş', 'ayten123admin', 5),
(7, 'radwan@anadolu.edu.tr', 'Ahmneyan Rachid', 'Erkek', 'Houssein', '2147483647', 'Hello this is Radwan bio', 'ahmet', NULL, 2),
(8, 'test@anadolu.edu.tr', 'test', 'Erkek', 'Houssein', '2147483647', 'Hello this is Radwan bio', 'ahmet', NULL, NULL),
(9, 'test@anadolu.edu.tr', 'testv1', 'Erkek', 'Houssein', '2147483647', 'Hello this is Radwan bio', 'ahmet', NULL, NULL),
(18, 'ismail@eskisehir.edu.tr', 'İsmailmisin', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', 'adminadmin', 1),
(19, 'ismail@eskisehir.edu.tr', 'Denedi', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1),
(20, 'ismail@eskisehir.edu.tr', 'Deneme2', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1),
(21, 'ismail@eskisehir.edu.tr', 'TESTV34', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1),
(22, 'ismail@eskisehir.edu.tr', 'Deneme2', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1),
(23, 'ismail@eskisehir.edu.tr', 'TESTV35', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1),
(24, 'ismail@eskisehir.edu.tr', 'Denemeeeeeee', 'Erkek', 'Bölükbaşı', '2147483647', 'Hello this is my bio', 'ismailblkbsi', NULL, 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `unidept`
--

CREATE TABLE `unidept` (
  `uni_dept_id` int(11) NOT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `uni_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `unidept`
--

INSERT INTO `unidept` (`uni_dept_id`, `dept_id`, `uni_id`) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 1),
(4, 2, 3),
(5, 4, 2),
(6, 5, 2);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`commentid`),
  ADD KEY `FKh4c7lvsc298whoyd4w9ta25cr` (`post_id`),
  ADD KEY `FKt1tmd4hte7yy3ynqdhgv6lbgs` (`user_id`);

--
-- Tablo için indeksler `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`deptid`);

--
-- Tablo için indeksler `likes`
--
ALTER TABLE `likes`
  ADD PRIMARY KEY (`likeid`),
  ADD KEY `FKry8tnr4x2vwemv2bb0h5hyl0x` (`post_id`),
  ADD KEY `FKhjbppymxprwr59h43emckqtya` (`user_id`);

--
-- Tablo için indeksler `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`post_id`),
  ADD KEY `FK23b5ukn1j3l5hk4ik0o5byac4` (`user_fk_id`);

--
-- Tablo için indeksler `tb_university`
--
ALTER TABLE `tb_university`
  ADD PRIMARY KEY (`uniid`);

--
-- Tablo için indeksler `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `FKkp6coqsdjcoisydtsaxh3cntq` (`uni_deptid`);

--
-- Tablo için indeksler `unidept`
--
ALTER TABLE `unidept`
  ADD PRIMARY KEY (`uni_dept_id`),
  ADD KEY `FK5jwad0vcx0gna79yi9xg3h1cp` (`dept_id`),
  ADD KEY `FKdj3wn8ta75og1x7lhfkc9m4kv` (`uni_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `comments`
--
ALTER TABLE `comments`
  MODIFY `commentid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `departments`
--
ALTER TABLE `departments`
  MODIFY `deptid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `likes`
--
ALTER TABLE `likes`
  MODIFY `likeid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `posts`
--
ALTER TABLE `posts`
  MODIFY `post_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Tablo için AUTO_INCREMENT değeri `tb_university`
--
ALTER TABLE `tb_university`
  MODIFY `uniid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Tablo için AUTO_INCREMENT değeri `unidept`
--
ALTER TABLE `unidept`
  MODIFY `uni_dept_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `FKh4c7lvsc298whoyd4w9ta25cr` FOREIGN KEY (`post_id`) REFERENCES `posts` (`post_id`),
  ADD CONSTRAINT `FKt1tmd4hte7yy3ynqdhgv6lbgs` FOREIGN KEY (`user_id`) REFERENCES `tb_users` (`id_user`);

--
-- Tablo kısıtlamaları `likes`
--
ALTER TABLE `likes`
  ADD CONSTRAINT `FKhjbppymxprwr59h43emckqtya` FOREIGN KEY (`user_id`) REFERENCES `tb_users` (`id_user`),
  ADD CONSTRAINT `FKry8tnr4x2vwemv2bb0h5hyl0x` FOREIGN KEY (`post_id`) REFERENCES `posts` (`post_id`);

--
-- Tablo kısıtlamaları `posts`
--
ALTER TABLE `posts`
  ADD CONSTRAINT `FK23b5ukn1j3l5hk4ik0o5byac4` FOREIGN KEY (`user_fk_id`) REFERENCES `tb_users` (`id_user`);

--
-- Tablo kısıtlamaları `tb_users`
--
ALTER TABLE `tb_users`
  ADD CONSTRAINT `FKkp6coqsdjcoisydtsaxh3cntq` FOREIGN KEY (`uni_deptid`) REFERENCES `unidept` (`uni_dept_id`);

--
-- Tablo kısıtlamaları `unidept`
--
ALTER TABLE `unidept`
  ADD CONSTRAINT `FK5jwad0vcx0gna79yi9xg3h1cp` FOREIGN KEY (`dept_id`) REFERENCES `departments` (`deptid`),
  ADD CONSTRAINT `FKdj3wn8ta75og1x7lhfkc9m4kv` FOREIGN KEY (`uni_id`) REFERENCES `tb_university` (`uniid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
