import java.util.*;

class Main2 {
    public static void expand(String str, int low, int high, List<String> set)
    {
        while (low >= 0 && high < str.length()
                && str.charAt(low) == str.charAt(high))
        {
            set.add(str.substring(low, high + 1));
            low--;
            high++;
        }
    }

    public static int findPalindromicSubstrings(int n,String str,List arr)
    {
        int count = 0;
        if (str == null) {
            return 0;
        }
        List<String> set = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
        {
            expand(str, i, i, set);
            expand(str, i, i + 1, set);
        }

        for(int i = 0 ; i <set.size();i++){
            if(arr.contains(set.get(i).length())){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < m ; i++)
        list.add(Integer.parseInt(sc.next()));

        System.out.println(findPalindromicSubstrings(n,s,list));
    }


}