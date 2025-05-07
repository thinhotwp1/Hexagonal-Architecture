<h1>Hexagonal Architecture:</h1>

<h2>🔹1. Kiến trúc tổng thể Hexagonal (Ports & Adapters)</h2>

![image](https://github.com/user-attachments/assets/b001fee0-e873-418f-8738-f5b216b9c5d9)

<h2>🔹2. Cấu trúc thư mục dự án</h2>

![image](https://github.com/user-attachments/assets/e54aba3a-8a7b-47c2-b4a0-90cda8ff2581)

<h2>🔹3. Mã nguồn mẫu</h2> 

https://github.com/thinhotwp1/Hexagonal-Architecture

<h2>🔹4. Ưu điểm của Hexagonal Architecture</h2>

![image](https://github.com/user-attachments/assets/56e21c42-5da1-4a65-964e-d263461cd2ca)

<h2>🔹5. Một số dự án thực tế sử dụng Hexagonal Architecture</h2>

![image](https://github.com/user-attachments/assets/b48cf568-5753-40c1-b7ad-359827be3863)


<h2>🔹6. Khi nào nên dùng Hexagonal?</h2>

- Hệ thống có logic nghiệp vụ phức tạp


- Có nhu cầu tách domain độc lập khỏi công nghệ (REST, Kafka, DB...)


- Cần test domain logic nhiều cấp độ


- Hệ thống sẽ tích hợp nhiều loại adapter hoặc sẽ chuyển đổi adapter trong tương lai


- Đang dùng microservices hoặc muốn hỗ trợ DDD rõ ràng

<h2>🔹7. Thêm adapter</h2>

Mở rộng adapter mà không cần sửa tới logic domain, ở đây thêm adapter kafka ngoài việc xử lý web, chỉ cần thêm kafka cho adapter và xử lý kỹ thuật của kafka (không thay đổi logic nghiệp vụ)

![image](https://github.com/user-attachments/assets/98d25e62-f425-4846-b209-3bf8925293f7)

