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