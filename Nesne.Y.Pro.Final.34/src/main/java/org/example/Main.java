package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);//dizinin dışına çıkıyor
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata yakalandı: " +e.getMessage());

            e.printStackTrace();//hata detaylarını konsola yazdır

            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element: stackTrace){
                System.out.println("Metod: " +element.getMethodName());
                System.out.println("Sınıf: " +element.getClassName());
                System.out.println("Satır: " +element.getLineNumber());
            }
        }

    }
}