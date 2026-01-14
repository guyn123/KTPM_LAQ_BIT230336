# HỌC PHẦN: KIỂM THỬ PHẦN MỀM

## Thông tin sinh viên
* **Họ và tên:** Lê Anh Quân
* **Mã sinh viên:** BIT230336
* **Lớp:** SOFT5
---
## BÀI TẬP CHƯƠNG 1: BÁO CÁO THỰC HÀNH UI/UX TESTING

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

# BÀI TẬP CHƯƠNG 2: BÀI TẬP THỰC HÀNH KIỂM THỬ VỚI JUNIT
> **Chủ đề:**  Phân tích dữ liệu điểm số học sinh. Dự án thực hành môn **Kiểm thử phần mềm**, tập trung vào kỹ thuật kiểm thử đơn vị (Unit Testing) sử dụng **JUnit 5** và **Java** để đảm bảo tính đúng đắn của logic xử lý điểm số.

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
```
---
# BÀI TẬP CHƯƠNG 3: BÁO CÁO KIỂM THỬ TỰ ĐỘNG E2E VỚI CYPRESS

> **Chủ đề:** Hiểu và thực hành các kịch bản kiểm thử tự động end-to-end (E2E) phổ biến bằng cách sử dụng Cypress để kiểm tra website mẫu [SauceDemo](https://www.saucedemo.com/).


## Mô tả bài tập
Trong kiểm thử phần mềm, kiểm thử tự động (Automation Testing) đóng vai trò quan trọng trong việc đảm bảo tính ổn định của các luồng nghiệp vụ. Bài tập này sử dụng **Cypress** để thực hiện các kịch bản kiểm thử toàn trình (End-to-End) trên trang web SauceDemo bao gồm:
* **Authentication:** Xác thực đăng nhập thành công và xử lý thông báo lỗi.
* **Product Management:** Kiểm tra chức năng thêm/xóa sản phẩm và bộ lọc sắp xếp giá.
* **Checkout Flow:** Kiểm tra quy trình điền thông tin và thanh toán đơn hàng.

## Hướng dẫn cài đặt và Thiết lập môi trường
Để thực hiện bài tập, em đã tiến hành cài đặt môi trường theo các bước sau:

1. **Tạo thư mục dự án và khởi tạo npm:**
   ```bash
   mkdir cypress-exercise
   cd cypress-exercise
   npm init -y
2. **Cài đặt thư viện Cypress:**
   ```bash
   npm install cypress --save-dev
3. **Khởi động và tạo cấu trúc thư mục mặc định:**
   ```bash
   npx cypress open

## Cấu trúc dự án
Dự án được tổ chức theo tiêu chuẩn của Cypress để đảm bảo tính dễ đọc và bảo trì mã nguồn

```text
cypress-exercise/
├── cypress/
│   ├── e2e/                     # Chứa các tệp kịch bản kiểm thử (.cy.js)
│   │   ├── login_spec.cy.js     # Kiểm thử chức năng Đăng nhập thành công/thất bại
│   │   └── cart_spec.cy.js      # Kiểm thử Giỏ hàng, Bộ lọc và Thanh toán
│   ├── fixtures/                # Lưu trữ dữ liệu mẫu (mock data)
│   └── support/                 # Các cấu hình bổ trợ và lệnh tùy chỉnh
├── node_modules/                # Các thư viện phụ thuộc của Node.js
├── cypress.config.js            # Tệp cấu hình môi trường Cypress
└── package.json                 # Quản lý phiên bản dự án và câu lệnh thực thi
```
## Kết quả đạt được (06 Kịch bản kiểm thử)

Hệ thống đã hoàn thành và vượt qua tất cả các bài kiểm thử sau:

* **Kịch bản 1 (Đăng nhập thành công):** Sử dụng tài khoản `standard_user` để đăng nhập thành công và chuyển hướng đến trang `/inventory.html`.
* **Kịch bản 2 (Đăng nhập thất bại):** Hệ thống hiển thị thông báo lỗi "Username and password do not match" khi người dùng nhập sai thông tin tài khoản hoặc mật khẩu.
* **Kịch bản 3 (Thêm giỏ hàng):** Thực hiện thêm một sản phẩm vào giỏ hàng và xác minh số lượng hiển thị trên biểu tượng giỏ hàng (Badge) là 1.
* **Kịch bản 4 (Bộ lọc giá):** Kiểm tra chức năng sắp xếp sản phẩm theo tiêu chí "Price (low to high)" hoạt động chính xác theo logic giá tăng dần.
* **Kịch bản 5 (Xóa sản phẩm - Nâng cao):** Thực hiện nhấn nút "Remove" sau khi đã thêm sản phẩm và xác minh số lượng trong giỏ hàng trở về 0 hoặc biểu tượng Badge không còn hiển thị.
* **Kịch bản 6 (Thanh toán - Nâng cao):** Thực hiện quy trình thanh toán bằng cách điền thông tin (First Name: John, Last Name: Doe, Zip Code: 12345) và xác minh chuyển hướng thành công đến trang xác nhận thanh toán (`/checkout-step-two.html`).


## Video minh họa kết quả (Demo)

<p align="center">
  <video src="https://github.com/user-attachments/assets/169696d5-126e-442d-8c49-2226863c69db" controls="controls" style="max-width: 100%;">
    Trình duyệt của bạn không hỗ trợ xem video.
  </video>
</p>


## Kết luận

Thông qua bài tập thực hành kiểm thử tự động với Cypress, em đã rút ra được những bài học quan trọng cho công việc kiểm thử phần mềm:

1.  **Tư duy Tự động hóa:** Việc áp dụng Automation Testing giúp giảm thiểu đáng kể các thao tác thủ công lặp đi lặp lại, từ đó tăng độ chính xác và tiết kiệm thời gian cho quá trình kiểm thử hồi quy.
2.  **Kỹ năng Selector:** Việc xác định chính xác các thuộc tính ID, Class hoặc các thuộc tính đặc thù của phần tử web là yếu tố then chốt để đảm bảo mã kiểm thử (script) vận hành ổn định và dễ bảo trì.
3.  **Quy trình chuẩn hóa:** Kiểm thử End-to-End (E2E) cung cấp cái nhìn toàn diện về hệ thống từ phía người dùng cuối, giúp phát hiện sớm các lỗi đứt gãy giữa các bước trong một luồng nghiệp vụ phức tạp.
