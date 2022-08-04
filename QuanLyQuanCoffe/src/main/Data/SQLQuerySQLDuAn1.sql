CREATE DATABASE Nhom3a3;
GO
USE Nhom3a3;
GO
DROP TABLE IF EXISTS NhanVien;
CREATE TABLE NhanVien(
id INT PRIMARY KEY IDENTITY,
UserName NVARCHAR(100) DEFAULT NULL,
MatKhau NVARCHAR(100) DEFAULT NULL,
Ten_NV NVARCHAR(100) DEFAULT NULL,
NgaySinh Date DEFAULT NULL,
SDT NVARCHAR(100) UNIQUE NULL DEFAULT NULL,
Email NVARCHAR(100) DEFAULT NULL,
ChucVu BIT DEFAULT NULL,
TT BIT DEFAULT NULL
);
go
DROP TABLE IF EXISTS SanPham;
CREATE TABLE SanPham(
id INT PRIMARY KEY IDENTITY,
Ten NVARCHAR(100) DEFAULT NULL,
GiaBan DECIMAL(20,0) DEFAULT NULL,
MoTa NVARCHAR(100) DEFAULT NULL,
TT BIT DEFAULT NULL
);
go
DROP TABLE IF EXISTS KhachHang;
CREATE TABLE KhachHang(
id INT PRIMARY KEY IDENTITY,
TenKH NVARCHAR(100) DEFAULT NULL,
SDT NVARCHAR(100) DEFAULT NULL,
TT BIT DEFAULT NULL
);
go
DROP TABLE IF EXISTS HoaDon;
CREATE TABLE HoaDon(
id INT PRIMARY KEY IDENTITY,
IdKhachHang INT FOREIGN KEY REFERENCES khachhang(Id),
TinhTrangHD  BIT DEFAULT NULL,
NgayTT DATE DEFAULT NULL,
TTGiamGia DECIMAL(20,0) DEFAULT NULL
);

go
DROP TABLE IF EXISTS HoaDonCT;
CREATE TABLE HoaDonCT(
Id INT PRIMARY KEY IDENTITY,
IdHD INT NOT NULL,
IdSP INT NOT NULL ,
SoLuong INT DEFAULT NULL,
giaLM INT DEFAULT NULL,
CONSTRAINT FK1 FOREIGN KEY(IdHD)REFERENCES hoadon(id),
CONSTRAINT FK2 FOREIGN KEY(IdSP) REFERENCES sanpham(id)
);
go
INSERT INTO NhanVien (UserName,MatKhau,Ten_NV,NgaySinh,SDT,Email,ChucVu,TT)
VALUES  (N'D123',N'Ng',N'Huy','1989-11-03','0582805832','quyetnhph10607@fpt.edu.vn',1,1),
		(N'D2222','Dao2222','Huy','1989-11-05','0327492081','huydqph11816@fpt.edu.vn',0,1),
		('Anh3333','Anh3333','Nam','1998-11-06','0116031909','dungnhph19607@fpt.edu.vn',0 ,1),
		(N'V4444','Linh4444','Chi','1992-11-07','0189031909','chivlph19007@fpt.edu.vn',0 ,1),
		('dao','Duy','Anh','1965-11-08','0786031909','anhddph18607@fpt.edu.vn',0 ,1),
		(N'D22221','D22221','Huy','1989-11-06','0927492081','huydqph11816@fpt.edu.vn',0 ,1),
		('Anh33331','Anh333311','Nam','1998-11-06','0916031909','dungnhph19607@fpt.edu.vn',0 ,1),
		(N'V44441','Linh44441','Chi','1992-11-07','0989031909','chivlph19007@fpt.edu.vn',0 ,1),
		(N'dao','Duy','Anh','1965-11-08','0986031909','anhddph18607@fpt.edu.vn',0 ,1),
		(N'L1111',N'V1111',N'Quyết','2000-11-23','09956031909','quyetlv19607@fpt.edu.vn',0 ,1),
		(N'dao','Duy','Anh','1965-11-08','0986031901','anhddph18607@fpt.edu.vn',0,1)

go
INSERT INTO SanPham (Ten,GiaBan,MoTa,TT)
VALUES  (N'CaFe Đen',32000,'Hang Nhap Khau',1),
		(N'Cà phê Robusta',50000,'Hang Nhap Khau',1),
		(N'Cafe Đen Đá',18000,'Hang Nhap Khau',1),
		(N'Cà phê Arabica',110000,'Hang Nhap Khau',1),
		(N' Cà phê Culi',200000,'Hang Nhap Khau',1),
		('CaFe Arabica',60000,'Hang Nhap Khau',1),
		(N'Cà phê Moka',150000,'Hang Nhap Khau',1),
		(N'Cà phê Latte',70000,'Hang Nhap Khau',1)
go
INSERT INTO KhachHang (TenKH,SDT,TT)
		VALUES (N'People','0123456789',1),
				(N'Hoàng Quốc Việt','0766031931',1),
				(N'Hoàng Văn Thái','0816035922',1),
				(N'Nguyễn Tiến Đạt','0716038911',1),
				(N'Nguyễn Thành Long','0616639799',1),
				(N'Nguyễn Tùng Dương','0616639922',1),
				(N'Hoàng Quốc Việt','0766031936',1),
				(N'Hoàng Văn Thái','0816035925',1),
				(N'Nguyễn Tuấn Đạt','0716038929',1),
				(N'Nguyễn Thành Dương','0616639781',1),
				(N'Nguyễn Tùng Long','0616639911',1),
				(N'Trần Thành Long','0942256009',1)
go

INSERT INTO HoaDon(IdKhachHang,TinhTrangHD,NgayTT,TTGiamGia)
VALUES (1,1,'2022-07-02',30000),
		(2,1,'2022-07-22',30000),
        (3,1,'2022-07-22',30000),
        (4,1,'2022-07-28',30000),
        (5,1,'2022-07-04',30000),
		(6,1,'2022-07-28',30000),
        (7,1,'2022-07-07',30000),
        (8,1,'2022-07-28',30000),
        (9,1,'2022-07-28',30000),
        (10,1,'2022-07-18',30000),
        (1,1,'2022-07-20',30000),
        (2,1,'2022-07-13',30000),
        (3,1,'2022-07-13',30000),
        (4,1,'2022-07-14',30000),
        (5,1,'2022-07-03',30000),
        (6,1,'2022-07-27',30000),
        (7,1,'2022-07-28',30000),
		(8,1,'2022-07-13',30000),
		(9,1,'2022-07-07',30000),
		(10,1,'2022-07-07',30000),
		(1,1,'2022-07-10',30000),
		(2,1,'2022-07-12',30000),
		(3,1,'2022-07-12',30000),
		(3,1,'2022-07-13',30000),
		(4,1,'2022-07-15',30000),
		(3,1,'2022-07-18',30000),
		(5,1,'2022-07-19',30000),
		(9,1,'2022-07-20',30000),
		(3,1,'2022-07-21',30000),
		(2,1,'2022-07-22',30000)
go		
	 INSERT INTO HoaDonCT (IdHD,IdSP,SoLuong,giaLM)
	 VALUES (1,1,3,32000),
	 (1,2,3,50000),
	 (1,3,3,18000),
	 (2,1,3,32000),
	 (2,2,3,50000),
	 (2,3,3,18000),
	 (3,1,3,32000),
	 (3,2,3,50000),
	 (3,3,3,18000),
	 (4,1,3,32000),
	 (4,2,3,50000),
	 (4,3,3,18000),
	 (5,1,3,32000),
	 (5,2,3,50000),
	 (5,3,3,18000),
	 (6,1,3,32000),
	 (6,2,3,50000),
	 (6,3,3,18000),
	 (7,1,3,32000),
	 (7,2,3,50000),
	 (7,3,3,18000),
	 (8,1,3,32000),
	 (8,2,3,50000),
	 (8,3,3,18000),
	 (9,1,3,32000),
	 (9,2,3,50000),
	 (9,3,3,18000),
	 (10,1,3,32000),
	 (10,2,3,50000),
	 (10,3,3,18000),
	 (11,1,3,32000),
	 (11,2,3,50000),
	 (11,3,3,18000),
	 (12,1,3,32000),
	 (12,2,3,50000),
	 (12,3,3,18000),
	 (13,1,3,32000),
	 (13,2,3,50000),
	 (13,3,3,18000),
	 (14,1,3,32000),
	 (14,2,3,50000),
	 (14,3,3,18000),
	 (15,1,3,32000),
	 (15,2,3,50000),
	 (15,3,3,18000),
	 (16,1,3,32000),
	 (16,2,3,50000),
	 (16,3,3,18000),
	 (17,1,3,32000),
	 (17,2,3,50000),
	 (17,3,3,18000),
	 (18,1,3,32000),
	 (18,2,3,50000),
	 (18,3,3,18000),
	 (19,1,3,32000),
	 (19,2,3,50000),
	 (19,3,3,18000),
	 (20,1,3,32000),
	 (20,2,3,50000),
	 (20,3,3,18000),
	 (21,1,3,32000),
	 (21,2,3,50000),
	 (21,3,3,18000),
	 (22,1,3,32000),
	 (22,2,3,50000),
	 (22,3,3,18000),
	 (23,1,3,32000),
	 (23,2,3,50000),
	 (23,3,3,18000),
	 (24,1,3,32000),
	 (24,2,3,50000),
	 (24,3,3,18000),
	 (25,1,3,32000),
	 (25,2,3,50000),
	 (25,3,3,18000),
	 (26,1,3,32000),
	 (26,2,3,50000),
	 (26,3,3,18000),
	 (27,1,3,32000),
	 (27,2,3,50000),
	 (27,3,3,18000),
	 (28,1,3,32000),
	 (28,2,3,50000),
	 (28,3,3,18000),
	 (29,1,3,32000),
	 (29,2,3,50000),
	 (29,3,3,18000),
	 (30,1,3,32000),
	 (30,2,3,50000),
	 (30,3,3,18000)
go

Select * from HoaDonCT
Select * from HoaDon
Select * from SanPham
Select * from NhanVien
Select * from KhachHang
