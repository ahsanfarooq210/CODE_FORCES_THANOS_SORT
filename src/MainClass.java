
import java.util.*;

public class MainClass
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int  solution(int arr[])
    {

        boolean flag=true;

        while (flag)
        {
            for (int i = 0; i < arr.length - 1; i++)
            {
                flag = false;
                if (arr[i] > arr[i + 1])
                {
                    arr = sizeTrim(arr);
                    flag = true;
                    break;
                }

            }
            if(arr.length==1)
            {
                return arr.length;
            }
        }

        return arr.length;
    }

    public static int[] sizeTrim(int arr[])
    {
        if(arr.length==1)
        {
            return arr;
        }
        else
        {
            return Arrays.copyOfRange(arr,0,(int)arr.length/2);
        }

    }



}
