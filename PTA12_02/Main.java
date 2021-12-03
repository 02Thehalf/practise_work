package PTA12_02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        sc.nextLine();
        PersonOverride[] persons1=new PersonOverride[n1];
        for(int i=0;i<n1;i++){
            persons1[i]=new PersonOverride();
            System.out.println(persons1[i].toString());
        }
        int n2=sc.nextInt();
        ArrayList<PersonOverride> persons2=new ArrayList<PersonOverride>();
        for(int i=0;i<n2;i++){
            PersonOverride a=new PersonOverride(sc.next(),sc.nextInt(),sc.nextBoolean());
            if(!persons2.contains(a)){
                persons2.add(a);
                System.out.println(a.toString());
            }
        }
        System.out.println(persons2.size());
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }

}
