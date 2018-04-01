package ArvoreNAria;

public class Arvore {
	
	public static No<MinhaChave, String> inserir(MinhaChave chave, String valor, No<MinhaChave, String> pai,
			Lado lado) {
		No<MinhaChave, String> no = null;
		if (pai == null) {
			// Se a raiz == null
		} else {
			switch (lado) {
			case Esquerdo:
				if (pai.filhoEsquerdo == null) {
					no = new No<>();
					no.chave = chave;
					no.valor = valor;
					pai.filhoEsquerdo = no;
					return no;
				} else {
					inserir(chave, valor, pai.filhoEsquerdo, lado);
				}
				break;
			case Meio:
				if (pai.filhoMeio == null) {
					no = new No<>();
					no.chave = chave;
					no.valor = valor;
					pai.filhoMeio = no;
					return no;
				} else {
					inserir(chave, valor, pai.filhoMeio, lado);
				}
				break;
			case Direito: {
				if (pai.filhoDireito == null) {
					no = new No<>();
					no.chave = chave;
					no.valor = valor;
					pai.filhoDireito = no;
					return no;
				} else {
					inserir(chave, valor, pai.filhoDireito, lado);
				}
			}
				break;
			}
		}
		return no;
	}

	public static No<MinhaChave, String> obterFilho(Lado lado, No<MinhaChave, String> pai) {
		if (pai != null) {
			switch (lado) {
			case Direito: {
				return pai.filhoDireito;
			}
			case Esquerdo: {
				return pai.filhoEsquerdo;
			}
			case Meio:
				return pai.filhoMeio;
			}
		}
		return null;
	}

	public static void imprimir(No<MinhaChave, String> raiz) {
		if (raiz != null) {
			System.out.println(raiz.toString());
			if (raiz.filhoEsquerdo != null) {
				imprimir(raiz.filhoEsquerdo);
			}
			if (raiz.filhoMeio != null) {
				imprimir(raiz.filhoMeio);
			}
			if (raiz.filhoDireito != null) {
				imprimir(raiz.filhoDireito);
			}
		}
	}

	public static No<MinhaChave, String> obterDirecao(String valor, Lado lado, No<MinhaChave, String> pai) {

		if (pai != null) {
			if (pai.valor == valor) {
				System.out.println("Você chegou ao seu destino!");
				return pai;
			} else if (pai.filhoDireito == null && pai.filhoEsquerdo == null && pai.filhoMeio == null
					&& pai.valor != valor) {
				System.out.println("Impossível chegar ao destino.");
				return pai;
			} else {
				switch (lado) {
				case Direito: {
					if (pai.filhoDireito != null) {
						System.out
								.println("Você está na " + pai.valor + " e está indo para a " + pai.filhoDireito.valor);
						obterDirecao(valor, lado, pai.filhoDireito);
					}
					break;
				}
				case Esquerdo: {
					if (pai.filhoEsquerdo != null) {
						System.out.println(
								"Você está na " + pai.valor + " e está indo para a " + pai.filhoEsquerdo.valor);
						obterDirecao(valor, lado, pai.filhoEsquerdo);
					}
					break;
				}
				case Meio:
					if (pai.filhoMeio != null) {
						System.out.println("Você está na " + pai.valor + " e está indo para a " + pai.filhoMeio.valor);
						obterDirecao(valor, lado, pai.filhoMeio);
					}
					break;
				}
			}

		}
		return null;
	}
}
