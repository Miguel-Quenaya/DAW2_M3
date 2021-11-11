
public class Data {
	private int dia;
	private int mes;
	private int any;
	public Data(int dia_in, int mes_in,int any_in) {
		int maxDias = maximoDias(mes_in, any_in);
		
		
		if(dia_in <= 0 || dia_in > maxDias || mes_in <= 0 || mes_in >12 || any_in <=0) {
			this.dia = 1;
			this.mes = 1;
			this.any = 2021;
		}else {
			this.dia = dia_in;
			this.mes = mes_in;
			this.any = any_in;
		}
		
	
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAny() {
		return any;
	}
	public void setAny(int any) {
		this.any = any;
	}
	
public String toString() {
		
		String dia1="",mes1="", any1="";
		if (dia < 10) {
			dia1 = "0" + dia;
		}else {
			dia1 = Integer.toString(dia);
		}
		if (mes < 10) {
			mes1 = "0" + mes;
		}else {
			mes1 = Integer.toString(mes);
		}
		if (any < 10) {
			any1 = "000" + any;
		}else if(any<100) {
			any1 = "00" + any;
		}else if(any<1000) {
			any1 = "0" + any;
		}
		else {
			any1 = Integer.toString(any);
		}
		
		
		return (dia1+"/"+mes1+"/"+any1);
	}

	public void endema() {
		int maxdias = maximoDias(mes,any);
		
		dia++;
		if(dia>maxdias) {
			dia = 1;
			mes++;
		}
		if(mes > 12) {
			mes = 1;
			any++;
		}
	}
	
	public boolean dataEsCorrecta() {
		int maxdias = maximoDias(mes,any);
		if(dia <= 0 || dia > maxdias || mes <= 0 || mes >12 || any <=0) {
			return false;
		}
		return true;
	}
	
	public int maximoDias(int mes_in, int any_in) {
		int maxDias=0;
		if(mes_in == 2){
			
			if((any_in % 4) == 0){
				maxDias = 28;
			}else{
				maxDias = 29;
			}
			} else if(mes_in == 1 || mes_in== 3 || mes_in== 5 || mes_in== 7 || mes_in == 8 || mes_in == 10 || mes_in== 12){
				maxDias = 31;
			} else{
				maxDias = 30;
			}
		
		return maxDias;
	}
	
}
