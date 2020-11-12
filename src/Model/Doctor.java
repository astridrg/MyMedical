package Model;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

	private String speciality;
	ArrayList<CitasDisponibles> citasDisponibles = new ArrayList<>();

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public void setCitasDisponibes(String date, String time) {
		citasDisponibles.add(new CitasDisponibles(date, time));

	}
	
	public Doctor(String name, String email) {
		super(name, email);
	}

	
	@Override
	public String toString() { 
		return " Especialidad " + speciality + "\n citas Disponibles" + citasDisponibles.toString();
	}
	
	public  class CitasDisponibles {
		private int id;
		private String date;
		private String time;

		public CitasDisponibles(String date, String time) {
			this.date = date;
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		@Override
		public String toString() {
			return "Citas Disponibles \n Date " + date + "\n Hora " + time;
		}


	
}
