
 
@Dennis-Eduardo 

  
public class Loja {
	public static void main(String args[]) {

		Venda vendaNormal = new Venda();
		VendaVista vendaVista = new VendaVista(10);
		VendaPrazo vendaPrazo = new VendaPrazo(10);


		Produto produto1 = new Produto(10.0, "Feijão");
		Produto produto2 = new Produto(6.0, "Arroz");
		Produto produto3 = new Produto(5.5, "Macarrão");
		Produto produto4 = new Produto(3.0, "Farinha");
		Produto produto5 = new Produto(2.5, "Sal");

		vendaNormal.adicioneProduto(produto1);
		vendaNormal.adicioneProduto(produto2);
		vendaNormal.adicioneProduto(produto3);
		vendaNormal.adicioneProduto(produto4);
		vendaNormal.adicioneProduto(produto5);

		System.out.println(vendaNormal);

		vendaVista.adicioneProduto(produto1);
		vendaVista.adicioneProduto(produto2);
		vendaVista.adicioneProduto(produto3);
		vendaVista.adicioneProduto(produto4);
		vendaVista.adicioneProduto(produto5);

		System.out.println(vendaVista);

		vendaPrazo.adicioneProduto(produto1);
		vendaPrazo.adicioneProduto(produto2);
		vendaPrazo.adicioneProduto(produto3);
		vendaPrazo.adicioneProduto(produto4);
		vendaPrazo.adicioneProduto(produto5);

		System.out.println(vendaPrazo);

    // Array
		System.out.println("------------------------");

		Venda[] vendaNormalArray = {vendaPrazo, vendaVista};

    for (int i = 0; i < vendaNormalArray.length; i++) {
      System.out.println(vendaNormalArray[i].getTotal());
    }

	}

}
