import java.util.Scanner;

public class task2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of subjects:");
        int subject = sc.nextInt();
        int total = 0;
        for(int i=1;i<=subject;i++){
            System.out.println("Enter Marks obtained in Subject "+i+":" );
            int marks= sc.nextInt();
            total+=marks;

        }
        double avg=(double)total/subject;
        char Grade;
        if(avg>=90){
            Grade='O';
        }
        else if(avg>=80){
            Grade='A';
        }
        else if(avg>=70){
            Grade='B';
        }
        else if(avg>=60){
            Grade='C';
        }
        else if(avg>=50){
            Grade='D';
        }
        else if(avg>=40){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Total Marks Scored :"+total);
        System.out.println("Average Percentage :"+avg+"%");
        System.out.println("Grade :"+Grade);



    }
}