public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n= Integer.parseInt(args[0]);
        Boolean [] prime= new Boolean [n+1];
        for(int i=0;i<prime.length;i++)
        {
            if(i<1)
            {
                prime[i]=false;
            }
            if(i>1)
            {
                prime[i]=true;
            }
        }
        

    }
}