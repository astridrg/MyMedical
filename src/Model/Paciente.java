package Model;

public class Paciente extends User {
	private String birthday;
	private double weight;
	private double height;


	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getWeight() {
		return this.weight + "Kg.";
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return this.height + "Mts.";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Paciente(String name, String email) {
		super(name, email);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Edad " + birthday + "\n  Peso " + getWeight() + "\n  Altura " + getHeight() ;
	}
}
