
public class Rellotge {
	private int h;
	private int min;
	private int seg;
	public Rellotge(int h, int min, int seg) {
		this.h = h;
		this.min = min;
		this.seg = seg;

	}
	public Rellotge() {
		h = 0;
		min = 0;
		seg = 0;
	}
	
	public void setH(int h) {
		if(h < 0 || h > 23) {
			this.h = 0;
		}else {
			this.h = h;
		}
	}
	
	public void setMin(int min) {
		if(min < 0 || min > 59) {
			this.min = 0;
		}else {
			this.min = min;
		}
	}
	
	public void setSeg(int seg) {
		if(seg < 0 || seg > 59) {
			this.seg = 0;
		}else {
			this.seg = h;
		}
	}
	
	public int getH() {
		return h;
	}
	public int getMin() {
		return min;
	}
	public int getSeg() {
		return seg;
	}
	
	public String toString() {
		
		String seg1="",min1="", h1="";
		if (seg < 10) {
			seg1 = "0" + seg;
		}else {
			seg1 = Integer.toString(seg);
		}
		if (min < 10) {
			min1 = "0" + min;
		}else {
			min1 = Integer.toString(min);
		}
		if (h < 10) {
			h1 = "0" + h;
		}else {
			h1 = Integer.toString(h);
		}
		
		
		return (h1+":"+min1+":"+seg1);
	}
	
	public boolean modificarHora(int hora, int minuts, int segons) {
		if(hora < 0 || hora > 23) {
			return false;
		}
		if(minuts < 0 || minuts > 59) {
			return false;
		}
		if(segons < 0 || segons > 59) {
			return false;
		}
		h = hora;
		min = minuts;
		seg = segons;
		return true;
	}
	
	public void sumarSegon() {
		seg++;
		if(seg == 60) {
			min++;
			seg = 0;
		}
		if(min == 60) {
			h++;
			min=0;
		}
	}
	
	public void sumarSegons(int segons) {
		int minutos,segundos,horas,minutost;
		minutos = segons /60;
		segundos = segons%60;
		horas = minutos /60;
		minutost = minutos%60;
		
		seg += segundos;
		min +=minutost;
		h += horas;
		if(seg >= 60) {
			min++;
			seg-=60;
		}
		if(min >= 60) {
			h++;
			min-=60;
		}
		
	}

}
