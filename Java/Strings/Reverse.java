public class Reverse {
    public static void main(String[] args) {

         // First Approach
//        String str = "hello";
//        StringBuilder sb = new StringBuilder();
//        for(int i = str.length() -1 ; i >= 0 ; i--){
//            sb.append(str.charAt(i));
//        }
//        System.out.println(sb);

        // Second Approach

        StringBuilder sb = new StringBuilder("harshit");
        for(int i = 0 ; i < sb.length()/2; i++){
            int front = i;
            int last = sb.length() - 1 - i;
            char temp = sb.charAt(front);
            char temp1 = sb.charAt(last);
            sb.setCharAt(front,temp1);
            sb.setCharAt(last,temp);
        }
        System.out.println(sb);
    }
}
