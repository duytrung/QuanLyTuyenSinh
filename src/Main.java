import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

public class Main {
    // Bài tập Quản Lý Tuyển Sinh
    // Trung Nguyen
    public static float DiemChuan(Scanner sc) {
        // Cần biết điểm chuẩn của tuyển sinh
        // Vì chưa biết điểm chuẩn
        float DiemChuanTuyenSinh = 0.0f;
        System.out.println("Xin hỏi điểm chuẩn của tuyển sinh? ");
        DiemChuanTuyenSinh = Float.parseFloat(String.valueOf(sc.nextFloat()));
        return DiemChuanTuyenSinh;
    }

    public static float Diem3MonThi(){
        //Nhắc người dùng nhập vào điểm thi ba môn.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn thi thứ nhất: ");
        float Mon1 = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập điểm môn thi thứ nhì: ");
        float Mon2 = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập điểm môn thi thứ ba: ");
        float Mon3 = Float.parseFloat(sc.nextLine());

        return (Mon1 + Mon2 + Mon3);

    }

    public static float DiemUuTienKhuVuc(){
        float _DiemUuTienKhuVuc = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin cho biết bạn ở khu vực ưu tiên nào");
        System.out.println("Vui lòng chọn một trong ba tùy chọn: A, B, hoặc C");
        System.out.println("Nhập X nếu không thuộc khu vực ưu tiên");
        String TuyChon = sc.nextLine();

        if (TuyChon.equals("A")) {
            _DiemUuTienKhuVuc = 2.0f;
        } else if (TuyChon.equals("B")) {
            _DiemUuTienKhuVuc = 1.0f;
        } else if (TuyChon.equals("C")) {
            _DiemUuTienKhuVuc = 0.5f;
        } else if (TuyChon.equals("X")) {
            _DiemUuTienKhuVuc = 0.0f;
        }
        return _DiemUuTienKhuVuc;

    }

    public static float DiemUuTienDoiTuong(){
        float _DiemUuTienDoiTuong = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin cho biết bạn thuộc đối tượng ưu tiên nào?");
        System.out.println("Vui lòng chọn một trong ba: 1, 2 hoặc 3");
        int TuyChon = Integer.parseInt(String.valueOf(sc));

        switch (TuyChon) {
            case 1: _DiemUuTienDoiTuong = 2.5f;
            break;
            case 2: _DiemUuTienDoiTuong = 1.5f;
            break;
            case 3: _DiemUuTienDoiTuong = 1.0f;
            break;
            case 0: _DiemUuTienDoiTuong = 0.0f;
            break;
        }

        return _DiemUuTienDoiTuong;

    }
    public static float DiemUuTien(){
        // Điểm ưu tiên gồm điểm ưu tiên theo đối tượng và ưu tiên theo khu vực
         return DiemUuTienDoiTuong() + DiemUuTienKhuVuc();

    }

    public static float DiemTongKet(){
        // Điểm tổng kết là điểm 3 môn thi và điểm ưu tiên
        return Diem3MonThi() + DiemUuTien();
    }

    public static void main(String[] args) {
        DiemChuan();
        Diem3MonThi();
        DiemUuTien();
        DiemTongKet();

        if (DiemTongKet()>= DiemChuan()){
            System.out.println("Chúc Mừng! bạn đã trúng tuyển");
        } else {
            System.out.println("Xin chia buồn cùng bạn");
        }

    }
}