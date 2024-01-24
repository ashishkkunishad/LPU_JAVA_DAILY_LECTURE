 class loops {
    public static void main(String args[]){
        // for(int i=0;i<5;i++){
        //     System.err.print("Outer"+ i);

        //     for(int j=0;j<5;j++){
        //         System.err.print(" Inner"+ j);
               
        //     }
        //     System.err.println("\n");
        // }


            //printing right angle star
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.err.print("*");
        //     }
        //     System.err.println("\n");
        // }


        //printing 

        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("\n");
            

        // }

        for(int i=1;i<=5;i++){
            for( int j=0;j<5-i+1;j++){
                System.out.print("*");
            }
            System.out.println("\n");
           
        }


    }
    
}
