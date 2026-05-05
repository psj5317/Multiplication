package Multiplication;
import java.util.Scanner;

/**
 * 구구단을 답할 학생과 단수를 정해주면 해당 학생이 구구단을 답변하는 프로그램
 *
 * @author (2023320029정지후, 2023320012강성하, 2023320010박성준, 2023320006정준영)
 * @version (2026.05.05)
 */
public class MyApp
{   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 학생 개체 생성
        Student Jenna = new Student("Jenna","R005");
        Student James = new Student("James","R010");
        Student John = new Student("John","R009");
        Student Maria = new Student("Maria","R029");
        
        System.out.println("학생 이름을 입력해 주세요");
        String name = scan.next();
        
        if(name.equals("Jenna")) {
            System.out.println("Jenna : " + Jenna.answerCalculate());
        } else if (name.equals("James")) {
            System.out.println("James : " + James.answerCalculate());
        } else if (name.equals("John")) {
            System.out.println("John : " + John.answerCalculate());
        } else if (name.equals("Maria")) {
            System.out.println("Maria : " + Maria.answerCalculate());
        } else {
            System.out.println("학생 이름을 확인해 주세요.");
        }
        
    }
}