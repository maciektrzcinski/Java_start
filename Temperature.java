
public class Temperature {
	private double celsjusz,fahrenheit,kelvin,rankine,reaumur,romer,delisle,newton;
	
	public Temperature(){
			
	}
	public void setCelsjusz(double celsjusz){
		this.celsjusz = celsjusz;
	}
	public void setFahrenheit(double fahrenheit){
		this.fahrenheit = fahrenheit;
	}
	public void setKelvin(double kelvin){
		this.kelvin = kelvin;
	}
	public void setRankine(double rankine){
		this.rankine = rankine;
	}
	public void setReaumur(double reaumur){
		this.reaumur = reaumur;
	}
	public void setRomer(double romer){
		this.romer = romer;
	}
	public void setDelisle(double delisle){
		this.delisle = delisle;
	}
	public void setNewton(double newton){
		this.newton = newton;
	}
	
	public double celsjuszFromFahrenheit(double a){
		return (a - 32)/(1.8);
	}
	public double celsjuszFromKelvin(double a){
		return a - 273.15;
	}
	public double celsjuszFromRankine(double a){
		return (a / 1.8) - 273.15;
	}
	public double celsjuszFromReaumur(double a){
		return 1.25 * a;
	}
	public double celsjuszFromRomer(double a){
		return (a - 7.5) * 40/21;
	}
	public double celsjuszFromDelisle(double a){
		return 100 - a * 2/3;
	}
	public double celsjuszFromNewtona(double a){
		return a * 100/33;
	}
	
	public double fahrenheitFromCelsjusz(double a){
		return (a * 1.8) + 32;
	}
	public double kelvinFromCelsjusz(double a){
		return a + 273.15;
	}
	public double rankineFromCelsjusz(double a){
		return (a + 273.15) * 1.8;
	}
	public double reaumurFromCelsjusz(double a){
		return (a * 4)/5;
	}
	public double romerFromCelsjusz(double a){
		return a * 21/40+7.5;
	}
	public double delisleFromCelsjusz(double a){
		return (100 - a) * 3/2;
	}
	public double newtonFromCelsjusz(double a){
		return a * 33/100;
	}	

}
