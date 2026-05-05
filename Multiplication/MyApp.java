package Multiplication;
import java.util.Scanner;

/**
 * 구구단을 답할 학생과 단수를 정해주면 해당 학생이 구구단을 답변하는 프로그램
 *
 * @author (2023320010박성준, 2023320012강성하, 2023320006정준영, 2023320029정지후)
 * @version (2026.05.05)
 */
public class MyApp
{   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //물어볼 학생 변수
        String name;
        boolean finish = true;
        
        // 학생 개체 생성
        Student Jenna = new Student("Jenna","R005");
        Student James = new Student("James","R010");
        Student John = new Student("John","R009");
        Student Maria = new Student("Maria","R029");

        while(finish){
            System.out.println("학생 이름을 입력해 주세요");
            name = scan.next();
            switch (name){
                    case("Jenna"):
                    System.out.println("Jenna : " + Jenna.answerCalculate());
                    finish = false;
                    break;
                    
                    case("James"):
                    System.out.println("James : " + James.answerCalculate());
                    finish = false;
                    break;
                    
                    case("John"):
                    System.out.println("John : " + John.answerCalculate());
                    finish = false;
                    break;
                    
                    case("Maria"):
                    System.out.println("Maria : " + Maria.answerCalculate());
                    finish = false;
                    break;
                    
                    default:
                        System.out.println("없는 학생입니다.");
            } 
        }
    }
}
