package Multiplication;
import java.util.Scanner;

/**
 * Student 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Student {
    private String name;
    private int studentId;
    
    public Student(String name,int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String answerCalculate() {
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();

        Calculator cal = new Calculator();
        cal.operand = dan;

        String result = "";
        for (int i = 1; i < 10; i++) {
            result += cal.operand + "x" + i + "=" + cal.calculate() * i;  // ✅ * i
            if (i < 9) {
                result += "  ";
            }
        }
        return result;
    }
}