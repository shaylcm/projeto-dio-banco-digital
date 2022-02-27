package desafioDio;

public  abstract class Conta  implements Iconta


{
	
	
	 protected  static final  int AGENCIAPADRAO = 1;
	 private static int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numero;
	protected double saldo=0;
	protected double guardar=0;
	
	
	
	
		
		public Conta()
		{
			this.agencia=Conta.AGENCIAPADRAO;
			this.numero = SEQUENCIAL++;
			
			
		}
		
	
	
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	public double getguardar() {
		return guardar;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo= saldo - valor;
		
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo= saldo + valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) 
	{
		// TODO Auto-generated method stub
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	
	
	/*função implementada por shayene , com inspiração da nubank que possui a funcionalidade de guardar o dinheiro ate determinado periodo*/
	@Override
	public void guardarr(double valor)
	{
	   
		saldo=saldo-valor;
		
		guardar = guardar+valor;
		
		
	}
	
	protected void printinfo() 
	{
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo disponivel para uso : %.2f", this.saldo));
		System.out.println(String.format("Dinheiro guardado e indisponivel para uso: %.2f", this.guardar));
		
	}
	
	
	
	
	
	
	
}
