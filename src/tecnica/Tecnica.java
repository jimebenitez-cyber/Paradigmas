package tecnica;

import java.util.Objects;

import combatientes.Combatiente;

public class Tecnica implements Efecto{
	private String nombre;
	private int costoEnergia;
	private Efecto efecto;
	
	public Tecnica(String nombre, int costoEnergia, Efecto efecto) {
		this.nombre = nombre;
		this.costoEnergia = costoEnergia;
		this.efecto = efecto;
	}
	
	@Override
	public void aplicar(Combatiente lanzador, Combatiente objetivo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TipoTecnica getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCostoEnergia() {
		return costoEnergia;
	}
	public Efecto getEfecto() {
		return efecto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costoEnergia, efecto, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnica other = (Tecnica) obj;
		return costoEnergia == other.costoEnergia && Objects.equals(efecto, other.efecto)
				&& Objects.equals(nombre, other.nombre);
	}

	
	
}
