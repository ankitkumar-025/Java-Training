public class Pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((j==4&&i<=4)||(i+j==8&&j<=4)||(i==j&&j>=4)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }s
            }
            System.out.println();
        }
    }
}

    

