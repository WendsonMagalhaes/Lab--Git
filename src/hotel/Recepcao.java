package hotel;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;

	public Recepcao(){
		
		estadias = new ArrayList <>();
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		
		Estadia estadia = new estadia (nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}
	
	public void checkOut(String nome){
		
		for (Estadia estadia:estadias){
			if (estadia.getNome().equals(nome)){
				estadias.remove(estadia);
			}
		}
	}
	
	public int getNumDeHospedes(){
		
		return estadias.size();
	}
	
	public double getLucroTotal(){
		double soma = 0;
		for (Estadia estadia: estadias){
			soma += estadia.getValor();
		}
		return soma;
	}
	@Override
	public String toString(){
		String toString = System.lineSeparator + "Estadias:" + System.lineSeparator();
		for (Estadia estadia: estadias){
			toString += estadia.toString() + System.lineSeparator;
		}
		return toString;
	}
	
	
}
