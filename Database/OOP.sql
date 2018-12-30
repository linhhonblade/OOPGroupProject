-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: OOP
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Dict`
--

DROP TABLE IF EXISTS `Dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Dict` (
  `word` text COLLATE utf8mb4_unicode_ci,
  `def` text COLLATE utf8mb4_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dict`
--

LOCK TABLES `Dict` WRITE;
/*!40000 ALTER TABLE `Dict` DISABLE KEYS */;
INSERT INTO `Dict` VALUES ('﻿abstraction','tính trừu tượng- khả năng làm giảm sự phức tạp của đối tượng thông qua việc tập trung vào các điểm trọng yếu, thể hiện qua việc một đối tượng ban đầu có thể có một số đặc điểm chung cho nhiều đối tượng khác như là sự mở rộng của nó nhưng bản thân đối tượng ban đầu này có thể không có các biện pháp thi hành.\r'),('class','lớp - là một kiểu dữ liệu đặc biệt bao gồm các thuộc tính (properties) và các phương thức (methods) được định nghĩa từ trước.\r'),('encapsulation','đóng gói - là thuật ngữ dùng để chỉ một trong hai khái niệm khác nhau nhưng có liên quan với nhau, đôi khi còn chỉ sự kết hợp của hai khái niệm này. Khái niệm thứ nhất'),('inheritance','tính kế thừa - cho phép một đối tượng có thể có sẵn các đặc tính mà đối tượng khác đã có thông qua kế thừa, cho phép các đối tượng chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.\r'),('object','Đối tượng. Một đối tượng có hai bộ phận chính'),('OOP','Object - Oriented Programming - lập trình định hướng đối tượng - là kĩ thuật lập trình hỗ trợ công nghệ đối tượng.\r'),('package','Gói -  là một vùng không gian được dùng để tổ chức một nhóm các lớp và các giao diện có liên quan với nhau.\r'),('polymorphism','Tính đa hình - thể hiện thông qua việc gửi các thông điệp (message). Việc gửi các thông điệp này có thể so sánh như việc gọi các hàm bên trong của một đối tượng. Các phương thức dùng trả lời cho một thông điệp sẽ tùy theo đối tượng mà thông điệp đó được gửi tới sẽ có phản ứng khác nhau.\r'),('private','Riêng tư - các biến hay phương thức có tính chất này chỉ có thể được sử dụng bên trong của lớp mà chúng được định nghĩa.\r'),('public','Công cộng - tính chất để gán cho phương thức, các biến, các lớp cho phép các đối tượng, câu lệnh bên ngoài có thể sử dụng.\r'),('primitive type','Kiểu dữ liệu nguyên thủy vd'),('subclass','Lớp con - là một lớp thông thường nhưng có thêm tính chất kế thừa một phần hay toàn bộ các đặc tính của một lớp khác.\r'),('destructor','Hàm hủy - dùng để làm sạch bộ nhớ đã dùng để lưu đối tượng và hủy bỏ tên của một đối tượng.\r'),('null','Trạng thái chưa được phân giá trị.\r'),('argument','Đối số - là giá trị biến thực được truyền vào khi gọi hàm.\r'),('parameter','Tham số - là tên biến được khai báo trong phần định nghĩa hàm.\r'),('overload','Nạp chồng - chỉ việc khai báo các phương thức (hàm) có cùng tên nhưng khác nhau về kiểu của các đối số (arguments), kiểu trả về của phương thức và cả số lượng đối số của phương thức.\r'),('override','Ghi đè - chỉ phương thức đã xuất hiện ở lớp cha và xuất hiện tiếp ở lớp con.\r'),('case','Trường hợp được tuyển chọn theo switch (chỉ được dùng khi đi kèm switch).\r'),('catch','Được sử dụng để bắt ngoại lệ, được sử dụng cùng với try để xử lý các ngoại lệ xảy ra trong chương trình.\r'),('static','Định nghĩa biến, phương thức của một lớp có thể được truy cập trực tiếp từ lớp mà không thông qua khởi tạo đôi tượng của lớp.  \r');
/*!40000 ALTER TABLE `Dict` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-19  6:53:35
