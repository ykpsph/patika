public class AsalSayilar {
    public static void main(String[] args){
        int n = 100;
//        for(int i = 1; i <= n; i++){
//            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
//                System.out.println(i);
//            }
//        }

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}