package ArvoreNAria;

public class Main {

	public static void main(String[] args) {
		No<MinhaChave, String> raiz = new No<>();
		Arvore arvore = new Arvore();
		raiz.chave = new MinhaChave();
		raiz.valor = "RAIZ - Cidade A";

		raiz = arvore.inserir(new MinhaChave(), "Cidade B", raiz, Lado.Esquerdo);
		No<MinhaChave, String> cidadeC = arvore.inserir(new MinhaChave(), "Cidade C", raiz, Lado.Direito);
		No<MinhaChave, String> cidadeD = arvore.inserir(new MinhaChave(), "Cidade D", cidadeC, Lado.Direito);
		No<MinhaChave, String> cidadeE = arvore.inserir(new MinhaChave(), "Cidade E", cidadeD, Lado.Esquerdo);
		No<MinhaChave, String> cidadeF = arvore.inserir(new MinhaChave(), "Cidade F", cidadeE, Lado.Esquerdo);
		No<MinhaChave, String> cidadeG = arvore.inserir(new MinhaChave(), "Cidade G", cidadeF, Lado.Esquerdo);
		No<MinhaChave, String> cidadeH = arvore.inserir(new MinhaChave(), "Cidade H", cidadeF, Lado.Meio);

		arvore.imprimir(raiz);
		System.out.println();
		arvore.obterDirecao("Cidade G", Lado.Esquerdo, cidadeF);
		//teste

	}

}
