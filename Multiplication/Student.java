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

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String answerCalculate() {
        Scanner scan = new Scanner(System.in);

        // 프롬포트 출력
        System.out.println("물어볼 단 수를 입력하세요.");
        // 단수 입력
        int number = scan.nextInt();
        System.out.println(number + "단을 답해주세요.");

        Calculator cal = new Calculator();
        cal.operand = number;

        // Calculator의 메소드를 호출하여 결과 반환
        return cal.answerCalculate();
    }
}
