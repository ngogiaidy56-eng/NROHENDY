# NROHENDY — Blueprint cấu trúc máy chủ game

> **Lưu ý:** Đây là bộ khung kiến trúc và cấu hình mẫu, chưa phải bản sao mã nguồn NROHENDY đang chạy. Chưa có mã nguồn Java gốc, `hendy.sql`, `build.xml` và tài nguyên thực tế trong dữ liệu đầu vào. Hãy ghép các thư mục bổ sung vào dự án hiện tại; không ghi đè các lớp Java cũ.

## Mục tiêu
- Giữ cấu trúc Java/Ant và package `com.girlkun`.
- Tách lớp mạng, phiên người chơi, thế giới, nghiệp vụ game, DAO và tài nguyên.
- Bổ sung hướng dẫn database migrations, kiểm thử, cấu hình, vận hành và CI.
- Không commit mật khẩu, API key, dữ liệu người chơi, log production hay database dump.

## Bắt đầu
1. Sao lưu mã nguồn và database hiện tại.
2. Giữ nguyên `src/com/girlkun` đang có; thêm từng package sau khi xác minh cách đặt tên/class của dự án cũ.
3. Đối chiếu `hendy.sql` với schema đang chạy trước khi thiết kế migration. Không chạy SQL chưa review lên database production.
4. Sao chép `data/config/server.properties.example` thành `server.properties` và `database.json.example` thành `database.json`; chỉ chỉnh giá trị cục bộ.
5. Kiểm tra phiên bản Java, classpath thư viện, `build.xml` và `manifest.mf` trước khi build JAR.
6. Chạy test trên môi trường development/staging trước khi mở máy chủ công khai.

## Nguyên tắc kiến trúc
- **Server authoritative:** client không tự quyết tiền, vật phẩm, sát thương, tốc độ, vị trí hợp lệ hoặc quyền quản trị.
- **Network:** giới hạn packet size, validate input, timeout, rate limit và dọn session lỗi; không log mật khẩu/token.
- **Database:** prepared statements, transaction cho giao dịch tài sản, quyền DB tối thiểu và backup/restore đã diễn tập.
- **Lifecycle:** shutdown có kiểm soát, lưu trạng thái cần thiết, đóng socket và connection pool.
- **Admin:** quyền RBAC, xác thực, audit log và hạn chế truy cập mạng.
- **Tài nguyên:** kiểm tra dữ liệu map/mob/item khi khởi động; giữ version và checksum khi cần.

## Build và chạy
Bộ khung này chưa có logic gameplay hoặc protocol server thực tế nên chưa thể build/chạy độc lập. Hãy dùng `build.xml`, `run.bat` và thư viện gốc của dự án sau khi tích hợp. Workflow CI trong `.github/workflows/java-ci.yml` là điểm khởi đầu và phải chỉnh JDK/Ant targets theo dự án thật.

## Cấu trúc
- `src/com/girlkun/network`: transport, codec, protocol, session và bảo vệ input.
- `src/com/girlkun/services`: nghiệp vụ tài khoản, world, movement, combat, inventory, quest, trade và event.
- `database/`: vị trí migration/seed/tài liệu; không đặt backup hoặc dữ liệu production trong Git.
- `data/config/`: mẫu cấu hình không chứa thông tin xác thực thật.
- `ops/`, `scripts/`: mẫu vận hành và kiểm tra cấu hình.
- `docs/`, `test/`: tài liệu triển khai và bố cục kiểm thử.

**Trạng thái hiện tại:** blueprint scaffold; chưa xác minh build, kết nối MySQL, tương thích client hoặc gameplay. Mã nguồn Java gốc cần được tích hợp riêng.