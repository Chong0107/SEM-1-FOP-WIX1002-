public class L10Q1 {
    public static void main(String[] args) {
        Permanent p1 = new Permanent("Ahmad","B");
        Contract p2 = new Contract("Lew",400.25);
        Temporary p3 = new Temporary("Muthu",400);
//        System.out.println(p1.toString()+"\n");
//        System.out.println(p2.toString()+"\n");
//        System.out.println(p3.toString()+"\n");
        print(p1);
        print(p2);
        print(p3);
    }
    public static void print(ESS a){
        System.out.println(a.toString()+"\n");
    }
}
