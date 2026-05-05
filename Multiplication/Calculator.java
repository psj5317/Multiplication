package Multiplication;
/**
 * 구구단 계산을 하는 클래스
 * 
 * @author (2023320029정지후, 2023320012강성하, 2023320010박성준, 2023320006정준영)
 * @version (2026.05.05)
 */
public class Calculator {
    public int operand;

    /**
     * Calculator 클래스의 객체 생성자
     */
    public Calculator() {
    }

    // 구구단 계산 및 결과 문자열 생성
    public String calculate() {
        String result = "";
        for (int i = 1; i < 10; i++) {
            // 구구단 계산
            result += operand + "x" + i + "=" + (operand * i);
            if (i < 9) {
                result += "  ";
            }
        }
        return result;
    }
}


