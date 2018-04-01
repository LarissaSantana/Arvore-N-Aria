package ArvoreNAria;

public class No<Chave extends Comparable<Chave>, Valor> {
	Chave chave;
	Valor valor;

	No<Chave, Valor> pai, filhoEsquerdo, filhoMeio, filhoDireito;

	@Override
	public String toString() {
		return "chave: " + chave + " valor: " + valor;
	}
}