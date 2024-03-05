import java.util.Scanner;

public class stugradecal{
    public static void main(String args[]){
    	int marks[] = new int[5];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
           }
           System.out.println("Total marks="+total);
        scanner.close();
        avg = total/5;
        System.out.println("Average percentage ="+avg + "%");
        System.out.print("The student Grade = ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<70)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
