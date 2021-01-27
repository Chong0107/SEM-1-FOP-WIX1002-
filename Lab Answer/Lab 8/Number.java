import java.util.Random;

public class Number {

    private int occurence = 10;
    private int maximum = 100;
    private final int [] randomNumber;

    public Number() {
        randomNumber = new int[occurence];
        generate();
    }

    public Number(int occ){
        occurence = occ;
        randomNumber = new int[occurence];
        generate();
    }

    public Number(int occ,int max){
        occurence = occ;
        maximum = max;
        randomNumber = new int[occurence];
        generate();
    }

    public void generate(){
        Random r = new Random();
        for(int i=0;i<occurence;i++){
            randomNumber[i] = r.nextInt(maximum+1);
        }
    }

    public void showMin(){
        System.out.print("\nMinimum: ");
        int min = randomNumber[0];
        for(int i=0;i<occurence;i++){
            if(min>randomNumber[i])
                min = randomNumber[i];
        }
        System.out.print(min);
    }

    public void showMax(){
        System.out.print("\nMaximum: ");
        int max = randomNumber[0];
        for(int i=0;i<occurence;i++){
            if(max<randomNumber[i])
                max = randomNumber[i];
        }
        System.out.print(max);
    }

    public void showAvg(){
        System.out.print("\nAverage: ");
        int sum = 0;
        for(int i=0;i<occurence;i++){
            sum += randomNumber[i];
        }
        System.out.printf("%.4f",sum/(double)occurence);
    }

    public void showEven(){
        System.out.print("\nEven: ");
        for(int i=0;i<occurence;i++){
            if(randomNumber[i]%2==0)
                System.out.print(randomNumber[i]+" ");
        }
        System.out.println();
    }

    public void showPrime(){
        System.out.print("Prime: ");
        for(int i=0;i<occurence;i++){
            if(isPrime(randomNumber[i]))
                System.out.print(randomNumber[i]+" ");
        }
    }

    private boolean isPrime(int num){
        int c = 0;
        boolean prime = false;
        for (int i=1;i<=num;i++){
            if(num%i==0)
                c++;
        }
        if(c == 2)
            prime = true;
        return prime;
    }

    public void showSquare(){
        System.out.print("\nSquare: ");
        for (int i=0;i<occurence;i++){
            if(isSquare(randomNumber[i]))
                System.out.print(randomNumber[i]+" ");
        }
    }

    private boolean isSquare(int num){
        int n = (int)Math.sqrt(num);
        return Math.pow(n, 2) == num;
    }

    public void  showAll(){
        System.out.print("\nAll numbers: ");
        for (int i=0;i<occurence;i++){
            System.out.print(randomNumber[i]+" ");
        }
    }
}
