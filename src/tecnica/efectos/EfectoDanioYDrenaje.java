package tecnica.efectos;

import combatientes.Combatiente;
import tecnica.Efecto;
import tecnica.TipoTecnica;

public class EfectoDanioYDrenaje implements Efecto{
	private int danioBase;
	private int drenaje;
	
	@Override
	public void aplicar(Combatiente lanzador, Combatiente objetivo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TipoTecnica getTipo() {
		return TipoTecnica.OFENSIVA;
	}
}
