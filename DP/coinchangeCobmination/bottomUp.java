
//bottom -up

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=  new Scanner(System.in);

        int n = sc.nextInt();

        int [] coins  = new int[n];

        for(int i=0 ; i<n ; i++){
            coins[i] = sc.nextInt();
        }

        int amt = sc.nextInt();

        
        int [] dp = new int[amt+1];
        dp[0] = 1;

         for(int i=0 ; i<=coins.length-1 ; i++){
            
            int coin = coins[i];

            for(int j= coin ; j<=amt ; j++){

                
                    dp[j] = dp[j] + dp[j-coin];
                
            }
        }

        System.out.println(dp[amt]);

    }
}



        
