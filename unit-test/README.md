# Bài tập Tuần 2: Bài tập thực hành kiểm thử với JUnit
## Chủ đề: Phân tích dữ liệu điểm số học sinh

Dự án thực hành môn **Kiểm thử phần mềm**, tập trung vào kỹ thuật kiểm thử đơn vị (Unit Testing) sử dụng **JUnit 5** và **Java** để đảm bảo tính đúng đắn của logic xử lý điểm số.

---

## 👨‍💻 Thông tin sinh viên
* **Họ và tên:** Lê Anh Quân
* **Mã sinh viên:** BIT230336
* **Lớp:** SOFT5
* **Ngày hoàn thành:** 07/01/2026

---

## 📝 Mô tả bài toán
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

---

## 📂 Cấu trúc dự án
Dự án được tổ chức tách biệt giữa mã nguồn và mã kiểm thử:

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java       # Package: src (Logic chính)
├── test/
│   └── StudentAnalyzerTest.java   # Package: test (Test Case)
└── README.md                      # Báo cáo bài tập