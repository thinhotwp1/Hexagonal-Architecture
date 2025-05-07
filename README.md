Hexagonal Architecture:

🔹1. Kiến trúc tổng thể Hexagonal (Ports & Adapters)

![image](https://github.com/user-attachments/assets/b001fee0-e873-418f-8738-f5b216b9c5d9)

🔹2. Cấu trúc thư mục dự án

![image](https://github.com/user-attachments/assets/e54aba3a-8a7b-47c2-b4a0-90cda8ff2581)

🔹3. Mã nguồn mẫu: https://github.com/thinhotwp1/Hexagonal-Architecture

🔹4. Ưu điểm của Hexagonal Architecture

![image](https://github.com/user-attachments/assets/56e21c42-5da1-4a65-964e-d263461cd2ca)

🔹5. Một số dự án thực tế sử dụng Hexagonal Architecture

![image](https://github.com/user-attachments/assets/b48cf568-5753-40c1-b7ad-359827be3863)


🔹6. Khi nào nên dùng Hexagonal?

- Hệ thống có logic nghiệp vụ phức tạp


- Có nhu cầu tách domain độc lập khỏi công nghệ (REST, Kafka, DB...)


- Cần test domain logic nhiều cấp độ


- Hệ thống sẽ tích hợp nhiều loại adapter hoặc sẽ chuyển đổi adapter trong tương lai


- Đang dùng microservices hoặc muốn hỗ trợ DDD rõ ràng

🔹7. Khi mở rộng adapter mà không sửa tới logic, ở đây thêm adapter kafka ngoài việc xử lý web (RESTFUL)

![image](https://github.com/user-attachments/assets/98d25e62-f425-4846-b209-3bf8925293f7)

