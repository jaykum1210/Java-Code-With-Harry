class Breakcontinue{
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            System.out.println(i);
            if(i==3){
                System.out.println("break");
                break;
            }
        }

        for(int i = 0;i<10 ; i++){
            System.out.println(i);
            if(i==3){
                System.out.println("continue");
                continue;
            }
        }
    }
}