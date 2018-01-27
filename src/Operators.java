public class Operators {

  public static void main(String[] args){
    double decimalNum1 = 5.0;
    double decimalNum2 = 2.0;

    double addNum = decimalNum1 + decimalNum2;
    boolean flagAdd = (decimalNum1 + decimalNum2 == addNum);
    System.out.println("5 + 2 = " + addNum);
    System.out.println("The result is " + flagAdd + "\n");

    double subtractNum = decimalNum1 - decimalNum2;
    boolean flagSubtract = (decimalNum1 - decimalNum2 == subtractNum);
    System.out.println("5 - 2 = " + subtractNum);
    System.out.println("The result is " + flagSubtract + "\n");

    double divideNum = decimalNum1 / decimalNum2;
    boolean flagDivide = (decimalNum1 / decimalNum2 == divideNum);
    System.out.println("5.0 / 2.0 = " + divideNum);
    System.out.println("The result is " + flagDivide + "\n");

    double remainNum = decimalNum1 % decimalNum2;
    boolean flagRemain = (decimalNum1 % decimalNum2 == remainNum);
    System.out.println("The remainder of 5.0 / 2.0 = " + remainNum);
    System.out.println("The result is " + flagRemain + "\n");

    double incrementNum = decimalNum1 += 2;
    boolean flagInc = (decimalNum1 == incrementNum);
    System.out.println("5 incremented by two is: " + incrementNum);
    System.out.println("The result is " + flagInc + "\n");

    boolean compareNum = decimalNum1 == decimalNum2;
    System.out.println("T/F: " + decimalNum1 + " = " + decimalNum2 + " " + compareNum);

  }
}
