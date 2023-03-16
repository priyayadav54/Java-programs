import java.util.*;
public class Main {
    public static void main(String args[]){
        float Bill;
        System.out.println("Enter the Total Units here: ");
        Scanner sc = new Scanner(System.in);
        float Units = sc.nextFloat();
        if(Units<100) {
            Bill = Units * 1;
            System.out.println("Your Generated bill is here : " + Bill);
        }
        else if(Units>100 || Units<150){
            Bill = Units * 5;
            System.out.println("Your Generated bill is here : " + Bill);
        }
        else if (Units>200 || Units<300){
            Bill = Units * 10;
            System.out.println("Your Generated bill is here : " + Bill);
        }
    }
    }