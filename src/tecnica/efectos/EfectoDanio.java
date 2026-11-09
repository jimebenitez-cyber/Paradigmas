package tecnica.efectos;

import combatientes.Combatiente;
import tecnica.Efecto;
import tecnica.TipoTecnica;

public class EfectoDanio implements Efecto {
	private int danioBase;

	@Override
	public void aplicar(Combatiente lanzador, Combatiente objetivo) {
		objetivo.recibirDaño(lanzador.calcularDanioProvocado(danioBase));
	}

	@Override
	public TipoTecnica getTipo() {
		return TipoTecnica.OFENSIVA;
	}
	
	
}
