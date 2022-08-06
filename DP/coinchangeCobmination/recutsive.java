public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=  new Scanner(System.in);

        int n = sc.nextInt();

        int [] coins  = new int[n];

        for(int i=0 ; i<n ; i++){
            coins[i] = sc.nextInt();
        }

        int amt = sc.nextInt();

        int ans  = coinchangeCombination(coins , amt  ,0 );

        System.out.println(ans);

    }


    public static int coinchangeCombination(int [] coins , int target , int idx  ) {
        
        if( idx==coins.length){

            if(target==0){

            return 1;
            }

            return 0;
        }

        int coin = coins[idx];
      
      int ans=0;

        for(int number=1; number*coin <= target ; number++){
            ans+= coinchangeCombination(coins , target-(number*coin) , idx +1 );
        }

        ans += coinchangeCombination(coins , target , idx+1);

        return ans;
    }

}    