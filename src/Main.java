import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        char kyTu = 'a';
        int count = 0;
        try {
            System.out.println("Moi ban nhap 1 ky tu:");
            kyTu = (char) System.in.read();
            System.out.println("Ky tu vua nhap:" + kyTu);
        } catch (Exception e) {
            System.out.println("Nhap loi!");
        }

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
