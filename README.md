# HỌC PHẦN: KIỂM THỬ PHẦN MỀM

## Thông tin sinh viên
* **Họ và tên:** Lê Anh Quân
* **Mã sinh viên:** BIT230336
* **Lớp:** SOFT5
* **SĐT:** 0868807213
* **Email:** bit230336@st.cmcu.edu.vn
---
# BÀI TẬP CHƯƠNG 1: BÁO CÁO THỰC HÀNH UI/UX TESTING

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
> **Chủ đề:**  Phân tích dữ liệu điểm số học sinh. Dự án áp dụng **kiểm thử đơn vị (Unit Testing)** với **JUnit 5** và **Java** nhằm kiểm tra logic xử lý điểm số học sinh. Bộ kiểm thử được thiết kế dựa trên các kỹ thuật **EP (Equivalence Partitioning)**, **BAV (Boundary Value Analysis)** và **DT (Decision Table Testing)**, đồng thời thực hiện **đo độ bao phủ mã nguồn (Test Coverage)** để đánh giá mức độ đầy đủ của các ca kiểm thử.

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
    
##  Kỹ thuật kiểm thử áp dụng  
 Dự án áp dụng các kỹ thuật thiết kế ca kiểm thử (Test Case) chuẩn mực:
* **Phân vùng tương đương (EP):** Chia các miền điểm (Hợp lệ, Không hợp lệ thấp, Không hợp lệ cao).
* **Phân tích giá trị biên (BVA):** Kiểm tra chính xác tại các điểm 0.0, 7.9, 8.0, 10.0 và các giá trị sát biên.
* **Bảng quyết định (DT):** Kết hợp các điều kiện về tính hợp lệ và ngưỡng điểm giỏi để đảm bảo không bỏ sót logic.

##  Yêu cầu môi trường (Prerequisites)
Để chạy được dự án này, máy tính cần cài đặt:
* **Java:** JDK 17+.
* **Editor:** Visual Studio Code.
* **Thư viện:** `junit-platform-console-standalone-1.10.0.jar` (Đã tải sẵn trong thư mục gốc).
* **Apache Maven:** Phiên bản 3.9.12 trở lên để quản lý build và test.
* **VS Code Extensions :** 
    * Extension Pack for Java (Hỗ trợ Maven & JUnit).
    * Coverage Gutters (Hiển thị màu sắc độ bao phủ code).
  

## Cấu trúc dự án
Dự án được tổ chức tách biệt giữa mã nguồn và mã kiểm thử:

```text
unit-test/
├── src/
│    ├── main/java/src/
│    │              └── StudentAnalyzer.java      # Mã nguồn logic chính
│    └── test/java/test/
│                   └── StudentAnalyzerTest.java  # Các kịch bản kiểm thử JUnit 5
├── junit-platform-console-standalone-1.10.0.jar  # Thư viện chạy test
├── pom.xml                                       # Cấu hình Maven, JUnit 5 và JaCoCo
└── README.md                                     # Báo cáo bài tập
```
## Kết quả đo độ bao phủ (Code Coverage)

Dựa trên báo cáo thực tế từ plugin **JaCoCo**, bộ kiểm thử đã đạt được các chỉ số bao phủ tuyệt đối, đảm bảo tính tin cậy cao cho mã nguồn:

| Chỉ số Coverage | Tỷ lệ đạt được | Trạng thái |
| :--- | :--- | :--- |
| **Instructions (Statement)** | **100%** | Hoàn thành |
| **Branches** | **100%** | Hoàn thành |
| **Methods** | **100%** | Hoàn thành |
| **Lines** | **100%** | Hoàn thành |


**Phân tích kết quả:**
* **Instructions & Lines:** Đạt 100% chứng minh mọi dòng lệnh trong `StudentAnalyzer` đã được thực thi ít nhất một lần.
* **Branches:** Đạt 100% khẳng định mọi nhánh rẽ (Đúng/Sai) của các câu lệnh điều kiện đã được kiểm soát hoàn toàn.
* **Methods:** Đảm bảo tất cả các hàm chức năng đều đã được gọi và kiểm thử thành công.
**Hình ảnh kết quả**
<img width="1919" height="383" alt="Image" src="https://github.com/user-attachments/assets/2c1a3b11-ed30-4f0e-b7e6-ef3d0596d742" />

## Hướng dẫn thực thi

Để tái lập quy trình kiểm thử và kiểm tra độ bao phủ, vui lòng thực hiện theo các bước sau:

1.  **Mở Terminal:** Khởi động Terminal tích hợp trong VS Code và đảm bảo bạn đang đứng tại thư mục gốc của dự án (`unit-test`).
2.  **Di chuyển vào thư mục dự án (nếu cần):**
    ```bash
    cd unit-test
    ```
3.  **Chạy lệnh kiểm thử:** Sử dụng Maven để dọn dẹp các tệp cũ, biên dịch mã nguồn và thực hiện toàn bộ các bài kiểm thử JUnit 5:
    ```bash
    mvn clean test
    ```
4.  **Xem báo cáo kết quả:** Sau khi lệnh chạy thành công và hiển thị thông báo **BUILD SUCCESS**, báo cáo độ bao phủ mã nguồn sẽ được tự động khởi tạo tại đường dẫn sau:
    * **Đường dẫn tệp:** `target/site/jacoco/index.html`
    * **Cách xem:** Chuột phải vào tệp `index.html` chọn **Open with Live Server** hoặc mở trực tiếp bằng trình duyệt web để xem chi tiết các chỉ số Statement Coverage và Branch Coverage.
    
## Kết luận

Thông qua việc thực hiện bài tập thực hành kiểm thử đơn vị (Unit Testing) cho dự án `unit-test`, em đã rút ra được những bài học và kinh nghiệm quan trọng:

1.  **Hiệu quả của các kỹ thuật thiết kế Test Case:** Việc áp dụng phối hợp **Phân vùng tương đương (EP)** và **Phân tích giá trị biên (BVA)** là yếu tố then chốt để xác định các bộ dữ liệu kiểm thử tối ưu. Đặc biệt, việc tập trung vào các giá trị biên (như 0.0, 7.9, 8.0, 10.0) giúp phát hiện chính xác các lỗi logic tiềm ẩn tại các ngưỡng quyết định.

2.  **Giá trị của chỉ số Độ bao phủ (Coverage):** Việc đạt được tỷ lệ **100% ở cả Instructions và Branches** không chỉ là một con số, mà là minh chứng cho việc mọi dòng code và mọi kịch bản rẽ nhánh logic đều đã được kiểm tra. Điều này mang lại sự tự tin cao về độ ổn định và tính chính xác của hàm `countExcellentStudents` và `calculateValidAverage`.

3.  **Sức mạnh của công cụ tự động hóa:** Sử dụng **Maven** kết hợp với **JaCoCo** giúp quy trình từ biên dịch, chạy test đến xuất báo cáo trở nên chuyên nghiệp và nhất quán. Công cụ **Coverage Gutters** trên VS Code đóng vai trò quan trọng trong việc hỗ trợ lập trình viên quan sát trực quan các phần code chưa được phủ (màu đỏ) để bổ sung test case kịp thời.

4.  **Tư duy lập trình an toàn:** Qua bài tập, em nhận thấy việc xử lý các trường hợp ngoại lệ (dữ liệu `null`, danh sách rỗng, hoặc điểm số ngoài khoảng 0-10) là cực kỳ quan trọng để đảm bảo phần mềm không bị crash và luôn trả về kết quả chính xác trong mọi tình huống thực tế.
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
---

# BÀI TẬP CHƯƠNG 4: KIỂM THỬ HIỆU NĂNG VỚI JMETER

> **Chủ đề:** Thực hành kiểm thử hiệu năng (Performance Testing) website bằng **Apache JMeter**, thông qua việc mô phỏng tải người dùng với nhiều kịch bản khác nhau và phân tích các chỉ số hiệu năng thu được.

## 1. Mục tiêu bài tập

- Sử dụng **Apache JMeter** để thực hiện kiểm thử hiệu năng website.
- Thiết kế **03 kịch bản kiểm thử (Thread Group)** với mức tải và hành vi khác nhau.
- Thu thập và phân tích các chỉ số:
  - **Response Time**
  - **Throughput**
  - **Error Rate**
- Trình bày kết quả kiểm thử dưới dạng báo cáo **Markdown**.

## 2. Website được lựa chọn kiểm thử

- **Website:** https://www.wikipedia.org
- **Lý do lựa chọn:**
  - Website phổ biến, ổn định, nhiều người truy cập.
  - Có nhiều trang con phù hợp mô phỏng hành vi người dùng thật.
  - Phù hợp cho kiểm thử học thuật với tải vừa phải.

## 3. Công cụ và môi trường

- **Công cụ:** Apache JMeter 5.6.3
- **Giao thức:** HTTPS
- **Listener sử dụng:** Summary Report, View Results Tree

## 4. Cấu hình chung trong JMeter

- **HTTP Request Defaults**
  - Protocol: `https`
  - Server Name or IP: `www.wikipedia.org`
- **HTTP Header Manager**
  - User-Agent: `Mozilla/5.0`

## 5. Các kịch bản kiểm thử

### 5.1. Kịch bản 1 – Cơ bản (Load nhẹ)

**Mục tiêu:**  
Đánh giá hiệu năng website khi số lượng người dùng thấp.

**Cấu hình Thread Group 1:**

| Tham số | Giá trị |
|------|------|
| Number of Threads | 10 |
| Ramp-up Period | 1 giây |
| Loop Count | 5 |

**Hành vi:**

- Gửi HTTP GET đến trang chủ:
  - Path: `/`

#### Kết quả đo được
https://github.com/user-attachments/assets/d6e2580c-ff4f-4e2a-b5ca-ccf6ef579eaa
| Request | Samples | Avg (ms) | Max (ms) | Throughput | Error Rate |
|------|------|------|------|------|------|
| GET_TrangChu | 50 | 301 | 934 | 19.33 req/sec | 0% |
| **TOTAL** | **50** | **301** | **934** | **19.33 req/sec** | **0%** |


**Nhận xét:**  
Website phản hồi nhanh và ổn định trong điều kiện tải nhẹ. Thời gian phản hồi trung bình thấp (301 ms), throughput đạt gần 20 request/giây và không ghi nhận lỗi nào.

### 5.2. Kịch bản 2 – Tải nặng (Load Test)

**Mục tiêu:**  
Đánh giá khả năng chịu tải của website khi số lượng người dùng tăng cao.

**Cấu hình Thread Group 2:**

| Tham số | Giá trị |
|------|------|
| Number of Threads | 50 |
| Ramp-up Period | 30 giây |
| Loop Count | 1 |

**Hành vi:**

1. GET trang chủ (`/`)
2. GET trang bài viết Java (`/wiki/Java`)

#### Kết quả đo được
https://github.com/user-attachments/assets/ed4b68b9-d249-4bcf-992b-79c6fe64057c
| Request | Samples | Avg (ms) | Max (ms) | Throughput | Error Rate |
|------|------|------|------|------|------|
| GET_TrangChu | 50 | 522 | 1625 | 1.7 req/sec | 0% |
| GET_BaiViet_Java | 50 | 181 | 1179 | 1.7 req/sec | 0% |
| **TOTAL** | **100** | **352** | **1625** | **3.3 req/sec** | **0%** |

**Nhận xét:**  
Khi số lượng người dùng tăng cao, website vẫn hoạt động ổn định và không xảy ra lỗi. Thời gian phản hồi trung bình vẫn ở mức chấp nhận được (352 ms), tuy throughput giảm so với kịch bản tải nhẹ do số lượng request đồng thời lớn hơn.

### 5.3. Kịch bản 3 – Tùy chỉnh theo thời gian

**Mục tiêu:**  
Đánh giá độ ổn định của website khi hoạt động liên tục trong một khoảng thời gian dài.

**Cấu hình Thread Group 3:**

| Tham số | Giá trị |
|------|------|
| Number of Threads | 20 |
| Duration | 60 giây |

**Hành vi:**

1. GET bài viết Python  
   `/wiki/Python_(ngôn_ngữ_lập_trình)`
2. GET bài viết C++  
   `/wiki/C%2B%2B`

#### Kết quả đo được
https://github.com/user-attachments/assets/2769dce3-4f66-4a8d-a01c-f83132422441
| Request | Samples | Avg (ms) | Max (ms) | Throughput | Error Rate |
|------|------|------|------|------|------|
| GET_Python | 451 | 1709 | 7858 | 7.38 req/sec | 0% |
| GET_Cplusplus | 444 | 962 | 3772 | 7.37 req/sec | 0% |
| **TOTAL** | **895** | **1339** | **7858** | **14.65 req/sec** | **0%** |

**Nhận xét:**  
Trong quá trình chạy liên tục, thời gian phản hồi tăng lên đáng kể do kích thước nội dung trang lớn và số lượng request nhiều. Tuy nhiên, hệ thống vẫn duy trì được throughput ổn định và không ghi nhận lỗi, cho thấy website có độ ổn định tốt.

## 6. So sánh tổng hợp 3 kịch bản

| Kịch bản | Users | Avg Response Time | Throughput | Error |
|------|------|------|------|------|
| Kịch bản 1 – Load nhẹ | 10 | 301 ms | 19.33 req/sec | 0% |
| Kịch bản 2 – Tải nặng | 50 | 352 ms | 3.30 req/sec | 0% |
| Kịch bản 3 – Theo thời gian | 20 | 1339 ms | 14.65 req/sec | 0% |

## 7. Cấu trúc thư mục nộp bài

```text
jmeter/
├── scripts/
│   └── Thread Group 1.jmx
│   └── Thread Group 2.jmx
│   └── Thread Group 3.jmx
├── results/
│   ├── ket_qua_kich_ban_1.csv
│   ├── ket_qua_kich_ban_2.csv
│   └── ket_qua_kich_ban_3.csv
└── README.md
```
## 8. Kết luận 

Bài tập đã thực hiện kiểm thử hiệu năng website bằng **Apache JMeter** thông qua 03 kịch bản với mức tải khác nhau.

Kết quả cho thấy:
- Ở tải nhẹ, website phản hồi nhanh và ổn định với thời gian đáp ứng thấp và throughput cao.
- Khi tăng tải, hệ thống vẫn xử lý tốt nhiều yêu cầu đồng thời mà không phát sinh lỗi.
- Khi chạy liên tục trong thời gian dài, thời gian phản hồi tăng do nội dung trang lớn, tuy nhiên website vẫn duy trì được tính ổn định với **error rate = 0%**.

Qua bài thực hành, sinh viên đã nắm được cách xây dựng kịch bản kiểm thử hiệu năng, thu thập và phân tích các chỉ số **Response Time**, **Throughput** và **Error Rate**, đáp ứng đầy đủ mục tiêu về **kiểm thử hiệu năng phần mềm**.

