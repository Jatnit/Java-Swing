create database QLKhachHang;

use QLKhachhang;

create table NhomKhachHang(
	MaNhom nvarchar(9) not null primary key,
	TenNhom nvarchar(50)
);

create table KhachHang(
	MaKH nvarchar(9) not null primary key,
	TenKH nvarchar(50),
	NamSinh int,
	MaNhom nvarchar(9),
	Foreign Key (MaNhom) references NhomKhachHang(MaNhom)
);