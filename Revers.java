public class Revers {
    public static void main(String[]arg)
    {
        String str="basalingappa";
        String rv="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rv=rv+str.charAt(i);
        }
        System.out.println(rv);
    }
}
