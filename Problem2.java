import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want to print ? ");
        System.out.println("row number should be less than 26");
        int n = sc.nextInt();

        if(n > 26){
            System.out.println("Enter row number less than 26");
        }

        // Alphabet start from A
        char ch = 'A';

         for(int i=0;i<n;i++){
            //adding 1 into char A because next half will always start from B
            ch = 'A'+1;
            
            //First loop create half triangle - reverse alphatets
            for(int j=n-1;j>=0;j--){
                if(i>=j){
                    //Adding j value into char A because it always print reverse order
                    System.out.print((char)('A'+j)+" ");         
                }
                else{
                    System.out.print("  ");
                }
            }
            
            //Second loop create next half triangle
            for(int j=0;j<i;j++){          
                    System.out.print(ch +" ");
                    ch++;    
            }
            System.out.println();
        }
    }
}
