import java.util.Scanner;

public class Input {
    public static String[] read() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length > 3) {
            throw new Exception("������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
        }else if (parts.length<=1){
            throw new Exception("������ �� �������� �������������� ���������");
        }
        return parts;
    }
}