# BÀI TẬP THỰC HÀNH: BÁO CÁO KIỂM THỬ TỰ ĐỘNG E2E VỚI CYPRESS

> **Chủ đề:** Hiểu và thực hành các kịch bản kiểm thử tự động end-to-end (E2E) phổ biến bằng cách sử dụng Cypress để kiểm tra website mẫu [SauceDemo](https://www.saucedemo.com/).

## Thông tin sinh viên
* **Họ và tên:** Lê Anh Quân
* **Mã sinh viên:** Bit230336
* **Lớp:** SOFT5
* **Ngày hoàn thành:** 13/01/2026

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
  <video src="https://github.com/user-attachments/assets/90a33c2f-6d9e-4b09-b91a-825073c170a3" controls="controls" style="max-width: 100%;">
    Trình duyệt của bạn không hỗ trợ xem video.
  </video>
</p>



## Kết luận

Thông qua bài tập thực hành kiểm thử tự động với Cypress, em đã rút ra được những bài học quan trọng cho công việc kiểm thử phần mềm:

1.  **Tư duy Tự động hóa:** Việc áp dụng Automation Testing giúp giảm thiểu đáng kể các thao tác thủ công lặp đi lặp lại, từ đó tăng độ chính xác và tiết kiệm thời gian cho quá trình kiểm thử hồi quy.
2.  **Kỹ năng Selector:** Việc xác định chính xác các thuộc tính ID, Class hoặc các thuộc tính đặc thù của phần tử web là yếu tố then chốt để đảm bảo mã kiểm thử (script) vận hành ổn định và dễ bảo trì.
3.  **Quy trình chuẩn hóa:** Kiểm thử End-to-End (E2E) cung cấp cái nhìn toàn diện về hệ thống từ phía người dùng cuối, giúp phát hiện sớm các lỗi đứt gãy giữa các bước trong một luồng nghiệp vụ phức tạp.