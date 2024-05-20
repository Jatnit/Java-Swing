CREATE DATABASE QLSanPham;

USE QLSanPham;

CREATE TABLE DanhMuc(
	MaDM varchar(10) primary key,
	TenDM nvarchar(50),
);

CREATE TABLE SanPham(
	MaSP varchar(10) primary key,
	TenSP nvarchar(50),
	Soluong int,
	DonGia float,
	MaDM varchar(10),
	foreign key (MaDM) references DanhMuc(MaDM)
);
