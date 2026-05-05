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
        Student jenna = new Student("jenna");
        String result = jenna.answerCalculate();
        
        System.out.print("단을 답해주세요~");
        System.out.println(result);
    }
}