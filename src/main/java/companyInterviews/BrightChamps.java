package companyInterviews;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class BrightChamps extends Thread {
    @Override
    public void run() {
        System.out.println("running");
    }

    //    [1,2,3,4,5]
    static int[] getSumOfOtherValues(int[] a){
        int n=a.length;
        int[] leftSumArr=new int[n];
        int[] rightSumArr=new int[n];
        leftSumArr[0]=a[0];
        rightSumArr[n-1]=a[n-1];
        for(int i=1,j=n-2;i<n;i++,j--){
            leftSumArr[i]=leftSumArr[i-1]+a[i];
            rightSumArr[j]=rightSumArr[j+1]+a[j];
        }
        a[0]=rightSumArr[1];
        a[n-1]=leftSumArr[n-2];
        for(int i=1;i<n-1;i++){
            a[i]=leftSumArr[i-1]+rightSumArr[i+1];
        }
        return a;
    }

    public static void before(){
        Set set=new TreeSet<>();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it=set.iterator();
        while (it.hasNext())
            System.out.println(it.next()+" ");

    }

    public static void main(String[] args) {
        /*
        1, Member---Person---Account
        2, Librarian---Person---Account
        3, Admin---Person---Account


        Person(id, pass, status, name, address, number, personType)

        Book
        BookItem
        Library

        Search
         */

    }




}


abstract class Account{
    String id;
    String pass;
    boolean status;
}
abstract class Person extends Account{
    String name;
    String Address;
    String number;
}

class Member1 extends Person{
    LibraryCard libraryCard;
    Double score;
    Double fineDue;
}
class Librarian extends Person{

}

class LibraryCard{
    String cardNumber;
    String barCodeNumber;
    LocalDateTime creationDate;
    LocalDateTime expiryDate;
}
