import java.util.Date;

public class Venda {

	private Date data;
	private Produto[] produtos;

	public Venda() {
		this.data = new Date();
		this.produtos = new Produto[1];
	}

	public void adicioneProduto(Produto p) {
		int i;

		Produto[] aux =  new Produto[produtos.length+1];

		if (produtos[0] == null) {
			produtos[0] = p;
		} else {
			for (i = 0; i < produtos.length; i++) {
				aux[i] = produtos[i];
			}
			aux[aux.length-1] = p;
			produtos = aux;
		}

	}

	public double getTotal() {
		double total = 0.0;
		for (int i=0; i < produtos.length ;i++) {
			total += produtos[i].getPreco();
		}
		return total;
	}

	@Override
	public String toString() {
		String str = "";
		str = str +  "Data da venda: " + this.data + "\n\n";
		for (int i = 0; i < produtos.length; i++) {
			str = str + produtos[i] + "\n";
		}
		str = str + "\nTotal da venda: " + this.getTotal();
		return str;
	}
}
