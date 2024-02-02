class arr{
    public static void main(String args[]){
        //printing all element of a matrix
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[0].length;col++){
        //         System.out.print(arr[row][col]+ " ");
        //     }
        //     System.out.println();
        // }

         //int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[0].length;col++){
        //         if (row==0 ||  row==arr.length-1){
        //             System.out.println(arr[row][col] + " ");

        //         }
        //     }
        //     System.out.println();
        // }


        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[0].length; col++){
        //     if(row == 0 || row == arr.length - 1 || col == 0 || col == arr[0].length - 1){
        //     System.out.print(arr[row][col] + " ");
        //     }                                                                //1 2 3
                                                                                //4   6
        //     else{                                                            //7 8 9
        //     System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        //     }


        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[0].length; col++){   //1
        //     if(row==col || row==arr.length-1 || col==0){    //4 5
        //     System.out.print(arr[row][col] + " ");          //7 8 9
        //     }
        //     else{
        //     System.out.print(" ");
        //     }
        //     }
        //     System.out.println();
        //     }

    //     for(int row = 0; row < arr.length; row++){
    //     int sum=0;
    //     for(int col = 0; col < arr[0].length; col++){   //sum of rows
                
    //             sum=sum+arr[row][col];
    
    //         }
    //         System.out.println(sum);

    // }


    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int row = 0; row < arr.length; row++){
            int min =arr[row][0];
            for(int col = 0; col < arr[0].length; col++){   
            if (arr[row][col]<min ) {   
                min=arr[row][col] ;
                System.out.println(min);
                    
            }
           
            }
            System.out.println();
            }



}
}