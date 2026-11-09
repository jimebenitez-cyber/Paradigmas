package tecnica.efectos;

import combatientes.Combatiente;
import tecnica.Efecto;
import tecnica.TipoTecnica;

public class EfectoCuracion  implements Efecto{
	private int cantidad;

	@Override
	public void aplicar(Combatiente lanzador, Combatiente objetivo) {
	}

	@Override
	public TipoTecnica getTipo() {
		return TipoTecnica.RECUPERACION;
	}
	
	
}
