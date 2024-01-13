public class Saldo {
    public static void main(String[] args) {
        Conta c = new Conta(25);
        System.out.print("O saldo da conta é: " + c.saldo);

        Reajuste r = new Reajuste();
        double reajuste = r.calcularReajuste(c.saldo);
        System.out.println("O reajuste da conta será: " + reajuste);

        c.saldo += reajuste;
        System.out.println("O novo saldo da conta após o reajuste é: " + c.saldo);
    }
}