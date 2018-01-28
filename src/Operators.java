public class Operators {

  public static void main(String[] args){
    //define variable to use with the operators
    double decimalNum1 = 5.0;
    double decimalNum2 = 2.0;

    //addition operator
    double addNum = decimalNum1 + decimalNum2;
    boolean flagAdd = (decimalNum1 + decimalNum2 == addNum);
    System.out.println("5 + 2 = " + addNum);
    System.out.println("The result is " + flagAdd + "\n");

    //subtraction operator
    double subtractNum = decimalNum1 - decimalNum2;
    boolean flagSubtract = (decimalNum1 - decimalNum2 == subtractNum);
    System.out.println("5 - 2 = " + subtractNum);
    System.out.println("The result is " + flagSubtract + "\n");

    //division operator
    double divideNum = decimalNum1 / decimalNum2;
    boolean flagDivide = (decimalNum1 / decimalNum2 == divideNum);
    System.out.println("5.0 / 2.0 = " + divideNum);
    System.out.println("The result is " + flagDivide + "\n");

    //modulus operator
    double remainNum = decimalNum1 % decimalNum2;
    boolean flagRemain = (decimalNum1 % decimalNum2 == remainNum);
    System.out.println("The remainder of 5.0 / 2.0 = " + remainNum);
    System.out.println("The result is " + flagRemain + "\n");

    //increment operator
    double incrementNum = decimalNum1 += 2;
    boolean flagInc = (decimalNum1 == incrementNum);
    System.out.println("5 incremented by two is: " + incrementNum);
    System.out.println("The result is " + flagInc + "\n");

    //using a boolean operator to compare the values of each variable 
    boolean compareNum = decimalNum1 == decimalNum2;
    System.out.println("T/F: " + decimalNum1 + " = " + decimalNum2 + " " + compareNum);

  }
}
