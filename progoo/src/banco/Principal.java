package banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.setSaldo(1000.0f);
		System.out.println("Saldo: "+conta.getSaldo());
	}

}
