package vehicles;

public class Vehicles {
	//vars
	public static final int LIMIT_Vel = 120; //limit velocitat
	private int Vel_actual = 0; //velocitat actual
	public static int Cilindrada =1800; 
	public static int Portes =5; 
	public static int marxes=5;
	private int marxaActual = 0;
	
	//constructor inicialitza vel_actual a 0
	public Vehicles() {
		super();
		setVel_actual(0);
		
	}
	
	//getters i setters
	
	public int getVel_actual() {
		return Vel_actual;
	}
	
	public void setVel_actual(int vel_actual) {
		Vel_actual = vel_actual;
	}
	
	public int getMarxaActual() {
		return marxaActual;
	}

	public void setMarxaActual(int marxaActual) {
		this.marxaActual = marxaActual;
	}
	
	//metode Accelerar Si la velocitat actual es inferior al limit, incrementa en deu i retorna. Si supera limit, 
	//retorna actual sense modificar
	


	public int Accelerar(int Vel_Actual){
		
			if (getVel_actual() < LIMIT_Vel) {
				
				
				setVel_actual(getVel_actual()+10);
				
					return getVel_actual();
				}
			else	
				return getVel_actual();
	}
	
	public int DeCcelerar(int Vel_Actual){
		
		if (getVel_actual() < LIMIT_Vel) {
			
			
			setVel_actual(getVel_actual()-10);
			
				return getVel_actual();
			}
		else	
			return getVel_actual();
}
	
	public int pujaMarxa (int marxaActual){
		
			if(getMarxaActual() == marxes || getMarxaActual()==0){
				
				return getMarxaActual();
			}
			
			else {
				
				setMarxaActual(getMarxaActual()+1);
				return getMarxaActual();
			}
			
	}
	
	public int baixaMarxa (int marxaActual){
		
		if(getMarxaActual() == marxes || getMarxaActual()==0){
			
			return getMarxaActual();
		}
		
		else {
			
			setMarxaActual(getMarxaActual()-1);
			return getMarxaActual();
			
		}
		

	}
	
	
}
