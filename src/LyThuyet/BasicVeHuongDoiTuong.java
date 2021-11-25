package LyThuyet;

public class BasicVeHuongDoiTuong {
	public static int stt; //Thuộc tính
	public static int soThuTu(int stt) { //Phuong thức
		return stt;
	}
	public static void main(String[] args) {
		soThuTu(stt);
	}
}

/** Đối tượng
 * Thuộc tính: tt, đặc điểm của các đối tượng
 * Phuong thức: thao tác, hành động đối tượng có thể thực hiện
 */
/**Lớp
 * Lớp chứa đối tượng cụ thể
 * VD: class -> Xe máy, object -> xe ex, xe honda, se sh,... 
 */
/**Các đặc tính cơ bản của OOP
 * --Tính đóng gói: Các thuộc tính và phương thức của đối tượng cần cho việc giải quyết bài toán đã được chọn ra sẽ
 * được đóng gói vào một kiểu dữ liệu gọi là class. Nhằm che dấu thông tin khỏi các đối tượng bên ngoài, thuộc tính 
 * nào thì phương thức nấy. Tức là code bên ngoài không trực tiếp nhìn thấy và thay đổi trạng thái của đối tượng đó.
 * --Tính kế thừa: VD: class Điện thoại là lớp cha, đt Android và Iphone là các lớp con
 * --Tính đa hình: Hiểu một cách đơn giản hơn: Đa hình là khái niệm mà hai hoặc nhiều lớp có những phương thức giống 
 * nhau nhưng có thể thực thi theo những cách thức khác nhau.
 * --Tính trừu tượng: 
 */
 
/**Phạm vi truy cập
 * public: truy cập mọi nơi trong project 
 * protected: truy cập được từ trong lớp khai báo, lớp con của lớp khai báo và các lớp cùng gói với lớp khai báo.
 * default: truy cập được từ trong lớp khai báo và các lớp cùng gói với lớp khai báo.
 * private: chỉ có thể truy cập bên trong lớp.
 */
/** Static
*tham chiếu thuộc tính chung của tất cả đối tượng (mà không là duy nhất cho mỗi đối tượng)
*Biến static lấy bộ nhớ chỉ một lần trong Class Area tại thời gian tải lớp đó.
*/
/**Phương thức static
 * Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
 * Phương thức static không thể sử dụng biến non-static hoặc gọi trực tiếp phương thức non-static.
 * Từ khóa this và super không thể được sử dụng trong ngữ cảnh static
 */
