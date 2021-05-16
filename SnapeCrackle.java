public class SnapeCrackle {

    public static void main(String args[])
    {
        int count=1;
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%7==0)
            {
                System.out.println(i+ " snap crackle");
            }

            else if(i % 3  ==0)
            {
                System.out.println(i+" snap");

            }
            else if (i % 7==0)
            {
                System.out.println(i+" crackle");

            }

            else  {
                System.out.println(i);

            }


        }
    }
}
