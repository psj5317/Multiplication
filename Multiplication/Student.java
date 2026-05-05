package Multiplication;
import java.util.Scanner;

/**
 * 학생객체를 생성하는 클래스,
 * 학생객체의 속성은 이름과 학번이며 동작은 구구단답변이다.
 *
 * @author (2023320010박성준, 2023320012강성하, 2023320006정준영, 2023320029정지후)
 * @version (2026.05.05)
 */
public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String answerCalculate() {
        Scanner scan = new Scanner(System.in);
        int number;
        
        // 프롬포트 출력
        System.out.println("물어볼 단 수를 입력하세요.");
        
        // 단수 입력
        number = scan.nextInt();
        System.out.println(number + "단을 답해주세요.");

        Calculator cal = new Calculator();
        cal.operand = number;

        // Calculator의 메소드를 호출하여 결과 반환
        return cal.calculate();
    }
}
