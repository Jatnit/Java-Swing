Create database QLCuaHangCD;

use QLCuaHangCD;

create table CDDVDCollection(
	Ma varchar(10) primary key,
	TieuDe nvarchar(50),
	LoaiDia varchar(10) check(LoaiDia='CD' Or LoaiDia ='DVD'),
	HinhAnh varchar(50),
	NamXuatBan int check(NamXuatBan >1500 and NamXuatBan <2024)
);