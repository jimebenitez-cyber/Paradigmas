package combatientes;

import java.util.List;
import java.util.Map;

import tecnica.Tecnica;

public abstract class Combatiente {
	private final int id;
	private String nombre;
	private int vidaMaxima;
	private int energiaMaxima;
	private int vidaActual;
	private int energiaActual;
	private double reduccionPorTecnicas;
	private List<Tecnica> tecnicas;
	private Map<Tecnica, Integer> usosTecnica;
	private static int MAX_EQUPAMIENTOS = 3;
	private static int USOS_POR_TECNICA = 5;
	
	protected Combatiente(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public int getEnergiaMaxima() {
		return energiaMaxima;
	}
	
	public abstract int calcularDanioProvocado(int base);
	
	public void recibirDaño(int danio) {
	}
	
	public void curar(int cantidad) {
		
	}
	
	
}
