package Java101;

public class challenge {
    public static void main(String[] args) {
//        int a = 4;
//        System.out.println((a >> 1) + (a << 2));
//        System.out.println("a>>1"+ (a >> 1));
//        System.out.println("a<<2"+(a<<2));
//
//        int x = 0;
//        int y = -2;
//        System.out.println(Math.min(x,y));
//
//        String str = "hello world";
//        String[] words = str.split("\\s");
//        String capitalizedWord = "";
//        for(String word : words){
//            String first = word.substring(0,1);
//            String afterFirst = word.substring(1);
//            capitalizedWord += first.toUpperCase() + afterFirst+" " ;
//        }
//        System.out.println(capitalizedWord);


        String message = "hello world";
        char[] charArray = message.toCharArray(); // her karakteri bir char array'de tut.
        boolean foundSpace = true; // bosluk var mi yok mu true olmasinin sebebi ilk kelimenin ilk harfini buyultmek

        for(int i = 0; i < charArray.length; i++){
            if(Character.isLetter(charArray[i])){ // eger i'daki eleman bir harf ise
                if(foundSpace){ // suanda true (ilk kelime)
                    charArray[i] = Character.toUpperCase(charArray[i]); // harfi buyut
                    foundSpace = false; // false'a esitle cunku bir sonraki Character.isLetter(charArray[i]) control edildiginde bosluk olursa sonraki harfi buyutecegiz.
                }
            }
            else {
                foundSpace = true; // yani karakter degilse bosluk demektir bunu true'ya dondur ki bir sonrakinde harfi buyultelim
            }
        }
        message = String.valueOf(charArray);
        System.out.println(message);
    }
}
