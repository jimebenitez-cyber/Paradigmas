package tecnica;

import combatientes.*;

public interface Efecto {
	void aplicar(Combatiente lanzador,Combatiente objetivo);
	
	TipoTecnica getTipo();
}
