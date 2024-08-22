public class MultiplicationTable {
    public static void main(String[] args)
    {
        MultiplicationRunner fivetable = new MultiplicationRunner();
        fivetable.print(5,8,14);
        System.out.println();
        fivetable.print();
        System.out.println();
        fivetable.print(3);
    }
}
