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
        Student Jenna = new Student("Jenna",1);
        Student James = new Student("James",2);
        Student Sara = new Student("Sara",1);
        Student Tom = new Student("Tom",1);
        
        
        
        System.out.println("Jenna에게 질문하세요:");
        System.out.println(Jenna.answerCalculate());
        
        System.out.println("Sara에게 질문하세요:");
        System.out.println(Sara.answerCalculate());
        
        System.out.println("Tom에게 질문하세요:");
        System.out.println(Tom.answerCalculate());
        
        System.out.println("James에게 질문하세요:");
        System.out.println(James.answerCalculate());
    }
}