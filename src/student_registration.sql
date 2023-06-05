-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2023 at 04:38 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_registration`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration_table`
--

CREATE TABLE `registration_table` (
  `stu_id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `address` varchar(70) NOT NULL,
  `city` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL,
  `zip` varchar(30) NOT NULL,
  `country` varchar(40) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `comment` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration_table`
--

INSERT INTO `registration_table` (`stu_id`, `name`, `dob`, `address`, `city`, `province`, `zip`, `country`, `phone`, `email`, `password`, `course`, `comment`) VALUES
(101, 'tajinder', '12-may-1993', '23 tillbrook court', 'Scarborough', 'on', 'M1B1N5', 'Canada', '647-878-0752', 'tajinder@gmail.com', '1234Taj', 'CSAT', 'i enjoy this course'),
(102, 'Mann', '12-08-1898', 'Poonian', 'Jalandhar', 'Punjab', '144702', 'India', '07087226555', 'man@gmail.com', '1234', 'csat', '1234'),
(103, 'Sukhman', '4-05-1995', 'Poonian', 'Jalandhar', 'Punjab', '144702', 'India', '07087226555', 'sukhman@gmail.com', '1234', 'csat', 'it is a good course'),
(104, 'Manjinder Kaur', '01-01-1986', 'Poonian', 'Jalandhar', 'Punjab', '144702', 'India', '7087226555', 'manjinder@gmail.com', '1234Man', 'computer basic', 'hey i do it'),
(105, 'satwinder', '13-02-1994', '23 Tillbrook Court', 'scarbrough', 'on', '144702', 'Canada', '6478780752', 'das@gmail.com', '1234', 'csat', 'hi'),
(106, '', '', '', '', '', '', '', '', '', '', '', ''),
(345, '', '', '', '', '', '', '', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration_table`
--
ALTER TABLE `registration_table`
  ADD PRIMARY KEY (`stu_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
