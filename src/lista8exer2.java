
public class colecoelista {
    public static void main(String[] args) {
        List<String> extratos = Arrays.asList("Saldo1", "Saldo2", "Saldo3");

      Collections.sort(extratos);
        for (String extrato : extratos) {
            System.out.println(extrato);

        }

    }
}
