public class VendaPrazo extends Venda {
	private int juros;

	public VendaPrazo(int juros) {
		this.juros = juros;
	}
	
	@Override
	public double getTotal() { 
		return super.getTotal()*(1+juros/100.0);
	}

}
