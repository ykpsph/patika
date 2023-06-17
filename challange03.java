public class challange03 {
    public static void main(String[] args) {
        String str = "yako pako";
        char[] arr = str.toCharArray();
        boolean isSpace = true;

        for(int i = 0; i < arr.length; i++){
            if(Character.isLetter(arr[i])){
                if(isSpace){
                    arr[i] = Character.toUpperCase(arr[i]);
                    isSpace= false;
                }
            } else {
                isSpace = true;
            }
        }
        str = String.valueOf(arr);
        System.out.println(str);
    }
}
