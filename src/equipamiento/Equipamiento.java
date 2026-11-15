package equipamiento;

public class Equipamiento {
	private final String nombre;
	private Categoria categoria;
	private double bonusDanio;
	private double reduccionDanio;
	private int bonusVidaMax;
	private int bonusEnergiaMax;
	
	public Equipamiento(String nombre,Categoria categoria, int bonusDanio, int reduccionDanio, int bonusVida, int bonusEnergia) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.bonusDanio = bonusDanio;
		this.reduccionDanio = reduccionDanio;
		this.bonusVidaMax = bonusVida;
		this.bonusEnergiaMax = bonusEnergia;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public double getBonusDanio() {
		return bonusDanio;
	}

	public double getReduccionDanio() {
		return reduccionDanio;
	}

	public int getBonusVidaMax() {
		return bonusVidaMax;
	}

	public int getBonusEnergiaMax() {
		return bonusEnergiaMax;
	}
	
	
	
}
