
public class Hero {

	private String name;
	private int life;
	private int maxLife;
	private int stamina;
	private int maxStamina;

	private String getName() {

		return name;
	}
	private void setName(String name) {

		this.name = name;
	}
	private int getLife() {

		return life;
	}
	private void setLife(int life) {

		this.life = life;
	}
	private int getMaxLife() {

		return maxLife;
	}
	private void setMaxLife(int maxLife) {

		this.maxLife = maxLife;
	}
	private int getStamina() {

		return stamina;
	}
	private void setStamina(int stamina) {

		this.stamina = stamina;
	}
	public int getMaxStamina() {

		return maxStamina;
	}
	public void setMaxStamina(int maxStamina) {

		this.maxStamina = maxStamina;
	}
}
