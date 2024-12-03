public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n= Integer.parseInt(args[0]);
        boolean [] prime= new boolean [n+1];
        for(int i=0;i<prime.length;i++)
        {
                prime[i]=true;
        }
        for(int i=0;i<2;i++)
        {
                prime[i]=false;;
        }
        for(int i=2;i<prime.length;i++)
        {
            for(int j=2;j<prime.length;j++)
            {
                if(j>i)
                    break;
                if((i%j)==0 && i!=j)
                {
                    prime[i]=false;
                }
            }
        }
        int count=0;
        System.out.println("Prime numbers up to "+n+":");
        for(int z=0;z<prime.length;z++)
        {
            if(prime[z]==true)
            {
                count++;
                System.out.println(z);
            }
        }
        int percent=(100*count)/n;
        System.out.println("There are "+count+" primes between 2 and "+n+" ("+percent+"% are primes)");

    }
}