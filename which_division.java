import java.util.Scanner;
 class which_division{
 
     
 
    public static void main(String[] args){
        
    
    Scanner input= new Scanner(System.in);
    Integer number;
    System.out.println("Enter number:");

    number =input.nextInt();
    for (int i=0; i<number;i++){
        int m=input.nextInt();
        if (m>2000){
        System.out.println(1);
        }
        else if(m>=1600 && m<2000){
            System.out.println(2);
        }
        else{
            System.out.println(3);
            
        }

    }
    


    }
    
}