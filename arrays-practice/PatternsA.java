public class PatternsA {

    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        */
    
    /*  for(int i=1;i<=4;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    */

    int rows=5;
    for(int i=1;i<=rows;i++){
        for(int j=0;j<i;j++){
            System.out.print(i);
        }
        System.out.println();
    }

    /*
    1 1 1 1 1
    2 2 2 2
    3 3 3
    4 4
    5
    */

    int rowsCount=5;
    for(int i=1;i<=rowsCount;i++){
        for(int j=i;j<=rowsCount;j++){
            System.out.print(i);
        }
        System.out.println();
    }

    /*
    1 1 1 1 1
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
    */

    int totalRows = 5;
    for(int i=1;i<=totalRows;){
        for(int j=1;j<=totalRows;){
            System.out.print(i);
            j++;
        }
        i++;
        System.out.println();
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */

    int totalRowsCount = 5;
    for(int i=1;i<=totalRowsCount;i++){
        for(int j=1;j<=i;){
            //System.out.println("value of j is : " + j);
            System.out.print(j);
            j++;
           // i++;
        }
        //System.out.println("\n value of i is :"+ i);
        //System.out.print(i);
        //i++;
        System.out.println();
    }

        System.out.println();
        /*
        *
        **
        ***
        ****
        */

    for(int i=5;i>=1;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }


    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    System.out.println();

    int n = 9;
    for(int row=1;row<=n;row++){
        if(row<=5) {
                for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }  else if(row>5){
                System.out.print("row is :  "   + row + " ");
                for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
            }
            
    }
    
    System.out.println();
    
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            if(row<=5) {
            //System.out.println("inside if");
                System.out.print("*");
            }
            
        //System.out.println();
            else if(row>5){
                col = (n-row)+1;
                //System.out.println("col value is "+ col);
                System.out.print("*");
                //System.out.print("row and n are : "+ row + " "+ n);
                //for(int col=row;col<=n;col++){
                //System.out.println();
            }
        }
        System.out.println();
    }
    }
}
    


