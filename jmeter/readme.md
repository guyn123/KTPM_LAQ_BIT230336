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
- **Hệ điều hành:** Windows 10
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

