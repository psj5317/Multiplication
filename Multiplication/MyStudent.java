package Multiplication;
import java.util.Scanner;

/**
 * MyStudent 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyStudent
{   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 학생 개체 생성
        Student Jenna = new Student("Jenna",1);
        Student James = new Student("James",2);
        Student John = new Student("John",3);
        Student Maria = new Student("Maria",4);
        
        System.out.println("학생 이름을 입력해 주세요");
        String name = scan.next();
        
        if(name.equals("Jenna")) {
            System.out.println(Jenna.answerCalculate());
        } else if (name.equals("James")) {
            System.out.println(James.answerCalculate());
        } else if (name.equals("John")) {
            System.out.println(John.answerCalculate());
        } else if (name.equals("Maria")) {
            System.out.println(Maria.answerCalculate());
        } else {
            System.out.println("학생 이름을 확인해 주세요.");
        }
        
    }
}