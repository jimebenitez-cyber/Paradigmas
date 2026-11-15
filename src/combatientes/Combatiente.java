package combatientes;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import equipamiento.Categoria;
import equipamiento.Equipamiento;
import tecnica.Tecnica;
import excepciones.*;

public abstract class Combatiente {
	private final int id;
	private String nombre;
	private int vidaMaxima;
	private int energiaMaxima;
	private int vidaActual;
	private int energiaActual;
	private double reduccionPorTecnicas;
	private Map<Categoria,Equipamiento> equipamientos;
	private List<Tecnica> tecnicas;
	private Map<Tecnica, Integer> usosTecnica;
	private static final int MAX_EQUPAMIENTOS = 3;
	private static final int USOS_POR_TECNICA = 5;
	
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
	
	public double calcularDanioProvocado(int base) {
		return base*this.factorDanioProvocado();
	}
	
	public void recibirDaño(int danio) {
		this.vidaActual -= danio*this.factorDanioRecibido();
	}
	
	public int costoDeTecnica(Tecnica t) {
		return t.getCostoEnergia();
	}
	
	protected abstract double factorDanioProvocado();
	
	protected abstract double factorDanioRecibido();
	
	protected abstract double factorCostoEnergia();
	
	public void equipar(Equipamiento e) {
		if(equipamientos.size()<= Combatiente.MAX_EQUPAMIENTOS) {
			equipamientos.put(e.getCategoria(), e);
			
		}
		else
			throw new EquipamientoInvalidoExcepcion("El combatiente ya posee 3 equipamientos");
	};
	
	public Equipamiento quitar(Categoria c) {
		return null;
		
	};
	
	public Collection<Equipamiento> getEquipamientos(){
		return null;
		
	};
	
	public void aprender(Tecnica t) {
		this.tecnicas.add(t);
	};
	
	public List<Tecnica> getTecnicas(){
		return this.tecnicas;
	}
	
	public boolean puedeEjecutar(Tecnica t) {
		if(USOS_POR_TECNICA - this.usosTecnica.get(t) > 0)
			return true;
		else return false;
	}
	
	public void ejecutar(Tecnica t) {
		
	}
	
	public int usosRestantes(Tecnica t) {
		return Combatiente.USOS_POR_TECNICA - this.usosTecnica.get(t);
	}
	
	public void curar(int cantidad) {
		
	}
	
	public void gastarEnergia(int cantidad) {
		this.energiaActual -= cantidad*this.factorCostoEnergia();
	}
	
	public void perderEnergia(int cantidad) {
		
	}
	
	public void recuperarEnergia(int cantidad) {
		
	}
	
	public void activarDefensa(double porcentaje) {
		
	}
	
	public boolean tieneDefensaActiva() {
		return false;
	}
	
	public void restaurar() {
		this.vidaActual = this.vidaMaxima;
	}
	
	public boolean estaEnPie() {
		if(this.vidaActual > 0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Combatiente other = (Combatiente) obj;
		return id == other.id;
	}
	
	
	
}
