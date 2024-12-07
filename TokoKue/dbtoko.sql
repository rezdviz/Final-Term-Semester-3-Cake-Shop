-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2022 at 02:27 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtoko`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbcustomer`
--

CREATE TABLE `tbcustomer` (
  `Kode` varchar(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `TanggalP` varchar(30) NOT NULL,
  `PilihanPaket` varchar(10) NOT NULL,
  `Alamat` varchar(55) NOT NULL,
  `No.Telepon` varchar(20) NOT NULL,
  `TotalPembayaran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbcustomer`
--

INSERT INTO `tbcustomer` (`Kode`, `Nama`, `TanggalP`, `PilihanPaket`, `Alamat`, `No.Telepon`, `TotalPembayaran`) VALUES
('k-01', 'gegege', '27 desember 2021', 'Paket 3', 'qweqwe', '01341341', '45000'),
('k-02', 'qweqwe', '31/12/2012', 'Paket 2', 'erqweqweq', '1231231', '95000'),
('k-03', 'Phangestin Jen', '29/12/2021', 'Paket 4', 'Jl.Semanan Raya', '0812649844', '120000');

-- --------------------------------------------------------

--
-- Table structure for table `tbkaryawan`
--

CREATE TABLE `tbkaryawan` (
  `KodeKaryawan` varchar(8) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `handphone` varchar(30) NOT NULL,
  `JenisKelamin` varchar(20) NOT NULL,
  `Alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbkaryawan`
--

INSERT INTO `tbkaryawan` (`KodeKaryawan`, `Nama`, `handphone`, `JenisKelamin`, `Alamat`) VALUES
('123', 'jen1', '3123124', 'Laki-Laki', 'rarara'),
('1234', 'jen3', '11111', 'Perempuan', '4314432');

-- --------------------------------------------------------

--
-- Table structure for table `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tbsignup`
--

CREATE TABLE `tbsignup` (
  `username` varchar(15) NOT NULL,
  `password` varchar(30) NOT NULL,
  `repassword` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbsignup`
--

INSERT INTO `tbsignup` (`username`, `password`, `repassword`) VALUES
('asd', '123', '123'),
('asdf', '123', '123'),
('menu', '123', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
