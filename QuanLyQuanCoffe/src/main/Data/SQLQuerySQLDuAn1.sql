CREATE DATABASE Nhom3a1;
GO
USE Nhom3a1;
GO
DROP TABLE IF EXISTS NhanVien;
CREATE TABLE NhanVien(
Id_NV INT PRIMARY KEY IDENTITY,
UserName NVARCHAR(100) DEFAULT NULL,
MatKhau NVARCHAR(100) DEFAULT NULL,
Ten_NV NVARCHAR(100) DEFAULT NULL,
NgaySin Date DEFAULT NULL,
SoDienThoai NVARCHAR(100) UNIQUE NULL DEFAULT NULL,
Email NVARCHAR(100) DEFAULT NULL,
ChucVu NVARCHAR(100) DEFAULT NULL
);
go
DROP TABLE IF EXISTS sanpham;
CREATE TABLE sanpham(
Id_SP INT PRIMARY KEY IDENTITY,
TenSP  NVARCHAR(100) DEFAULT NULL,
GiaBanSP DECIMAL(20,0) DEFAULT NULL,
MoTaSP NVARCHAR(100) DEFAULT NULL,
SoLuongSP INT DEFAULT NULL,
Anh NVARCHAR(100) DEFAULT NULL,
);
go
DROP TABLE IF EXISTS khachhang;
CREATE TABLE khachhang(
IdKhachHang INT PRIMARY KEY IDENTITY,
TenKH NVARCHAR(100) DEFAULT NULL,
SoDienThoai NVARCHAR(100) UNIQUE DEFAULT NULL,
);
go
CREATE TABLE hoadon(
IdHoaDon INT PRIMARY KEY IDENTITY,
IdKhachHang INT FOREIGN KEY REFERENCES khachhang(IdKhachHang),
TinhTrangHoaDon  BIT DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
TongTien_Giam_Gia DECIMAL(20,0) DEFAULT NULL,
TongTien_Thanh_Toan DECIMAL(20,0) DEFAULT NULL,
);

go
CREATE TABLE hoadonchitiet(
IdHoaDon INT NOT NULL,
Id_SP INT NOT NULL ,
SoLuongSP INT DEFAULT NULL,
PRIMARY KEY(IdHoaDon,Id_SP),
CONSTRAINT FK1 FOREIGN KEY(IdHoaDon)REFERENCES hoadon(IdHoaDon),
CONSTRAINT FK2 FOREIGN KEY(Id_SP) REFERENCES sanpham(Id_SP)
);
go
INSERT INTO NhanVien (UserName,MatKhau,Ten_NV,NgaySin,SoDienThoai,Email,ChucVu)
VALUES  (N'D123',N'Ng',N'Huy','1989-11-03','0582805832','quyetnhph10607@fpt.edu.vn','QuanLy'),
		(N'D2222','Dao2222','Huy','1989-11-05','0327492081','huydqph11816@fpt.edu.vn','NhamVienBanHang'),
		('Anh3333','Anh3333','Nam','1998-11-06','0116031909','dungnhph19607@fpt.edu.vn','Thu Ngan'),
		(N'V4444','Linh4444','Chi','1992-11-07','0189031909','chivlph19007@fpt.edu.vn','Nhan VienBanHang'),
		('dao','Duy','Anh','1965-11-08','0786031909','anhddph18607@fpt.edu.vn','Nhan Vien Ban Hang'),
		(N'D22221','D22221','Huy','1989-11-06','0927492081','huydqph11816@fpt.edu.vn','Nhan Vien Bung Bee'),
		('Anh33331','Anh333311','Nam','1998-11-06','0916031909','dungnhph19607@fpt.edu.vn','Nhan Vien Don Dep'),
		(N'V44441','Linh44441','Chi','1992-11-07','0989031909','chivlph19007@fpt.edu.vn','Nhan Vien Ban Hang'),
		(N'dao','Duy','Anh','1965-11-08','0986031909','anhddph18607@fpt.edu.vn','Nhan Vien Ban Hang'),
		(N'L1111',N'V1111',N'Quyết','2000-11-23','09956031909','quyetlv19607@fpt.edu.vn','Nhan Vien Ban Hang'),
		(N'dao','Duy','Anh','1965-11-08','0986031901','anhddph18607@fpt.edu.vn','Nhan Vien Ban Hang')

go
INSERT INTO sanpham (TenSP,GiaBanSP,MoTaSP,SoLuongSP)
VALUES  (N'CaFe Đen',32000,'Hang Nhap Khau',40),
		(N'Cà phê Robusta',50000,'Hang Nhap Khau',70),
		(N'Cafe Đen Đá',18000,'Hang Nhap Khau',50),
		(N'Cà phê Arabica',110000,'Hang Nhap Khau',100),
		(N' Cà phê Culi',200000,'Hang Nhap Khau',80),
		('CaFe Arabica',60000,'Hang Nhap Khau',80),
		(N'Cà phê Moka',150000,'Hang Nhap Khau',60),
		(N'Cà phê Latte',70000,'Hang Nhap Khau',50)
go
INSERT INTO khachhang (TenKH,SoDienThoai)
		VALUES (N'People','0123456789'),
				(N'Hoàng Quốc Việt','0766031931'),
				(N'Hoàng Văn Thái','0816035922'),
				(N'Nguyễn Tiến Đạt','0716038911'),
				(N'Nguyễn Thành Long','0616639799'),
				(N'Nguyễn Tùng Dương','0616639922'),
				(N'Hoàng Quốc Việt','0766031936'),
				(N'Hoàng Văn Thái','0816035925'),
				(N'Nguyễn Tuấn Đạt','0716038929'),
				(N'Nguyễn Thành Dương','0616639781'),
				(N'Nguyễn Tùng Long','0616639911'),
				(N'Trần Thành Long','0942256009')
go
INSERT INTO hoadon(IdKhachHang,TinhTrangHoaDon,NgayThanhToan,TongTien_Giam_Gia,TongTien_Thanh_Toan)
VALUES (1,1,'2022-01-02',100000,1000000),
		(2,1,'2022-01-22',20000,200000),
        (3,1,'2022-01-22',30000,300000),
        (4,1,'2022-04-28',1000,10000),
        (5,1,'2022-04-04',5000,500000),
		(6,1,'2022-04-28',6000,60000),
        (7,1,'2022-06-07',7000,70000),
        (8,1,'2022-04-28',8000,70000),
        (9,1,'2022-07-28',9000,20000),
        (10,1,'2022-08-18',10000,600000),
        (1,1,'2022-09-20',1000,60000),
        (2,1,'2022-11-13',2000,20000),
        (3,1,'2022-11-13',300,7000),
        (4,1,'2022-12-14',400,11000),
        (5,1,'2022-01-03',50000,120000),
        (6,1,'2022-02-27',60000,130000),
        (7,1,'2022-03-28',70000,150000),
		(8,1,'2022-03-13',8000,16000),
		(9,1,'2022-03-07',90000,200000),
		(10,1,'2022-03-07',100000,230000),
		(1,1,'2022-03-10',100000,2400000),
		(2,1,'2022-03-12',2000,30000),
		(3,1,'2022-03-12',3000,12000),
		(3,1,'2022-03-13',4000,29000),
		(4,1,'2022-03-15',5000,19000),
		(3,1,'2022-03-18',6000,90000),
		(5,1,'2022-03-19',7000,80000),
		(9,1,'2022-03-20',80000,110000),
		(3,1,'2022-03-21',9000,100000),
		(2,1,'2022-03-22',1000,11000),
		(3,1,'2022-03-23',10000,120000)
go		
	 INSERT INTO hoadonchitiet (IdHoaDon,Id_SP,SoLuongSP)
	 VALUES (4,2,30),
		(5,1,4),
        (6,3,7),
        (7,4,9),
        (8,7,10),
        (9,8,1),
        (9,2,9),
        (10,6,19),
        (11,4,11),
        (13,3,12),
        (11,6,13),
        (12,7,14),
        (14,8,15),
        (15,3,3),
		(16,1,2),
		(17,2,3),
		(18,3,5),
		(19,4,2),
		(20,5,3),
		(21,6,4),
		(22,7,5),
		(23,8,6),
		(24,1,8),
		(25,3,2),
		(26,5,9),
		(27,7,6),
		(28,8,28),
		(29,2,29),
		(30,1,3)
go

Select * from hoadonchitiet
Select * from hoadon
Select * from sanpham
Select * from NhanVien
Select * from khachhang
