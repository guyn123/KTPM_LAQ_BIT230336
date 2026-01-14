# KIỂM THỬ PHẦN MỀM

## Thông tin sinh viên
* **Họ và tên:** Lê Anh Quân
* **Mã sinh viên:** BIT230336
* **Lớp:** SOFT5
---
## BÀI TẬP TUẦN 1: BÁO CÁO THỰC HÀNH UI/UX TESTING

> **Chủ đề:** Rèn luyện kỹ năng quan sát chi tiết giao diện (Pixel Perfect) thông qua [CantUnsee.space](https://cantunsee.space/).
> 
## Mô tả bài tập
Trong kiểm thử phần mềm, việc phát hiện lỗi giao diện (UI) là cực kỳ quan trọng. Bài tập này sử dụng công cụ **CantUnsee** để kiểm tra khả năng phân biệt sự khác nhau giữa hai thiết kế về các yếu tố:
* Typography (Font chữ, độ đậm nhạt).
* Color & Contrast (Màu sắc và độ tương phản).
* Spacing & Alignment (Khoảng cách, padding, margin và căn chỉnh).
* Border & Radius (Viền và độ bo góc).
  
## Kết quả đạt được
* **Cấp độ hoàn thành:** Hard (Đã hoàn thành xuất sắc các mức Easy, Medium và Hard)
* **Số điểm đạt được:** 7030
## Ảnh chụp màn hình (Screenshots)
<img width="1857" height="1016" alt="image" src="https://github.com/user-attachments/assets/291562e8-d388-4f81-ba73-bb27ce05b9f8" />

## Kết luận
Sau khi hoàn thành bài tập, em đã rút ra được những kinh nghiệm cho công việc kiểm thử UI:
1.  **Sự nhất quán (Consistency):** Các thành phần giao diện phải đồng bộ về font chữ và khoảng cách.
2.  **Chi tiết nhỏ tạo nên sự khác biệt:** Một lỗi nhỏ về căn lề (alignment) cũng có thể làm giảm trải nghiệm người dùng.
3.  **Tư duy Pixel-perfect:** Rèn luyện mắt nhìn để phát hiện các lỗi lệch pixel mà người dùng thường khó nhận ra.

---
# Bài tập Tuần 2: Bài tập thực hành kiểm thử với JUnit
## Chủ đề: Phân tích dữ liệu điểm số học sinh

Dự án thực hành môn **Kiểm thử phần mềm**, tập trung vào kỹ thuật kiểm thử đơn vị (Unit Testing) sử dụng **JUnit 5** và **Java** để đảm bảo tính đúng đắn của logic xử lý điểm số.

## Mô tả bài toán
Viết và kiểm thử lớp `StudentAnalyzer` (nằm trong package `src`) với các yêu cầu chức năng sau:

### 1. Hàm `countExcellentStudents`
* **Chức năng:** Đếm số lượng học sinh đạt loại Giỏi.
* **Quy tắc nghiệp vụ:**
    * Học sinh Giỏi có điểm số `>= 8.0`.
    * **Validate:** Bỏ qua các điểm số không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10).
    * Trả về `0` nếu danh sách rỗng.

### 2. Hàm `calculateValidAverage`
* **Chức năng:** Tính điểm trung bình của danh sách.
* **Quy tắc nghiệp vụ:**
    * Chỉ tính toán trên các điểm số hợp lệ (`0 <= score <= 10`).
    * Trả về `0.0` nếu danh sách rỗng hoặc không có điểm nào hợp lệ để tránh lỗi chia cho 0.
##  Yêu cầu môi trường (Prerequisites)
Để chạy được dự án này, máy tính cần cài đặt:
* **Java:** JDK 17+.
* **Editor:** Visual Studio Code.
* **Thư viện:** `junit-platform-console-standalone-1.10.0.jar` (Đã tải sẵn trong thư mục gốc).

## Cấu trúc dự án
Dự án được tổ chức tách biệt giữa mã nguồn và mã kiểm thử:

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java                      # Package: src (Logic chính)
├── test/
│   └── StudentAnalyzerTest.java                  # Package: test (Test Case)
├── junit-platform-console-standalone-1.10.0.jar  # Thư viện chạy test
└── README.md                                     # Báo cáo bài tập
