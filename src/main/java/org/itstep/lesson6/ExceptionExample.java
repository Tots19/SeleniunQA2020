package org.itstep.lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {
//    Scanner scanner = new Scanner(System.in);
// int res = 0;
//         System.out.println("Enter a =");
//         String temp = scanner.next();
//          Integer.parseInt(temp);
//          int a = Integer.parseInt(temp);
//         byte a = scanner.nextByte();
//        int a = scanner.nextInt();
//         System.out.println("Enter b =");
//         byte b = scanner.nextByte();
//        int b = scanner.nextInt();
//          System.out.println("Enter operation =");
//          String op =scanner.next();
//         switch (op.charAt(0)){
//           case  '+':
        //    res = a+b;
        //      break;
        //    case  '-':
        //       res = a-b;
        //       break;
        //   case  '*':
        //    res = a*b;
        //       break;
        //    case  '/':
        //        if (b!=0)
        //        res = a/b;
        //        System.out.println("На 0 делить нельзя");
        //        break;
        //}
        //System.out.println(res);

//        Scanner scanner = new Scanner(System.in);
        //       int res = 0;
        //       int a = 0;
        //       byte b = 0;
        //      System.out.println("Enter a =");
        //      try {
        //          a = scanner.nextInt();
        //      }catch (InputMismatchException exception){
        //        System.out.println("Программа выбросила такое исключение =");
        //exception.printStackTrace();
        //     }
        //    System.out.println("Enter b =");
        //    try {
        //       b = scanner.nextByte();
        //   }catch (InputMismatchException exception){
        //      System.out.println("Программа выбросила такое исключение =");
        //  }

        //   System.out.println("Enter operation =");
        //  String op =scanner.next();
        //  switch (op.charAt(0)){
        //      case  '+':
        //          res = a+b;
        //         break;
        //     case  '-':
        //       res = a-b;
        //        break;
        //   case  '*':
        //      res = a*b;
        //      break;
        //   case  '/':
        //      if (b!=0)
        //           res = a/b;
        //       System.out.println("На 0 делить нельзя");
        //      break;
        // }
        // System.out.println(res);


        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a = 0;
        byte b = 0;
        try {
            System.out.println("Enter a =");
            a = scanner.nextInt();
            System.out.println("Enter b =");
            b = scanner.nextByte();
            System.out.println("Enter operation =");
            String op = scanner.next();
            switch (op.charAt(0)) {
                case '+':res = a + b; break;
                case '-':res = a - b; break;
                case '*': res = a * b; break;
                case '/': res = a / b; break;
            }
        }catch (InputMismatchException e){
            System.out.println("Ошибка ввода");
        }catch (ArithmeticException e){
            System.out.println("Арифметическая ошибка");
        }
        System.out.println("программа отработала результат = " + res);

//        try {
//            Thread.sleep(5000);
//       } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//       }

        Thread.sleep(5000);

    }
}
