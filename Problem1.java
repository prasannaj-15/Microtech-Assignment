import java.util.*;

class  Problem1 {

    public static void upArrow(int row,int tail){

        for(int i=0;i<row;i++){
            for(int j=row-1;j>=0;j--){
                if(i>=j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
             for(int j=1;j<row;j++){
                if(i>=j)
                System.out.print("* ");
                
            }
            System.out.println();
        }

        for(int i=0;i<tail;i++){
            for(int j=0;j<row;j++){
                if(j==row-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

        

    }


    public static void downArraow(int row, int tail){

        for(int i=0;i<tail;i++){
            for(int j=0;j<row;j++){
                if(j==row-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

           for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
             for(int j=i+1;j<row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void leftArrow(int row,int tail){

        for(int i=0;i<row;i++){
            for(int j=row-1;j>=0;j--){
                if(i>=j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            if(i==row-1){
                for(int j=0;j<tail;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

         for(int i=1;i<row;i++){
            for(int j=0;j<row;j++){
                if(j>=i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }


    public static void rightArrow(int row,int tail){

       for(int i=0;i<row;i++){
            for(int j=0;j<tail;j++){
                if(i==row-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }  
            }

            for(int j=0;j<row;j++){
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

       for(int i=0;i<row;i++){
            for(int j=0;j<tail;j++){
                    System.out.print("  ");
                
            }
            for(int j=row-2;j>=0;j--){
                if(j>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");    
            }
            System.out.println();
       }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Direction : ");
        String direction = sc.next();
        //convert direction in lower case beacuse we allow Up / UP / up 
        direction = direction.toLowerCase();       

        System.out.println("How many * you want in a row :");
        int n = sc.nextInt();
               
        int row;
        if(n%2==0){
         row = n/2;
        }
        else{
            row = (n/2)+1;
        }
        int tail = n/2;

        //checking for provided row number generate an arrow or not
        if(row <= 2){
            System.out.println("Please provide row number greater than 2 for generating an arrow..");
            return;
        }
        
        
        if(direction.equals("up")){
            upArrow(row,tail);
        }
        else if(direction.equals("down")){     
            downArraow(row, tail);    
        }
        else if(direction.equals("left")){
            leftArrow(row,tail);
        }
        else if(direction.equals("right")){
            rightArrow(row, tail);
        }
        else{
            System.out.println("Please provide correct direction...");
        }
        

        
    }
}