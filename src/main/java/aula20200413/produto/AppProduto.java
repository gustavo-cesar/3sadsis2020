package aula20200413.produto;

import java.util.Calendar;

public class AppProduto {

	public static void main(String[] args) {
		Produto passatempo = new Produto();

		passatempo.setDescricao("Passsatempo biscoito recheado 180g");
		passatempo.setCodigo("12304561");
		passatempo.setQuantidadeEmUnidade(12);
		passatempo.setLote("5409932");
		passatempo.setAnoFrabricacao(Calendar.getInstance());

		passatempo.setValor(3.50);
		System.out.println(passatempo);
		// System.out.println(passatempo.getDescontoAvista(4.50));
		System.out.println(passatempo.getDescontoAvista(1.50));

		Produto caixaDeBombom = new Produto("Caixa de bombom 250g", 7.50, Calendar.getInstance());
		System.out.println(caixaDeBombom.getAnoFrabricacao());
		caixaDeBombom.setQuantidadeEmUnidade(8);
		System.out.println(caixaDeBombom.getQuantidadeEmUnidade());
	}

}
