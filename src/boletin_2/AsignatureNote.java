package boletin_2;

public class AsignatureNote {
	String asignature_name;
	float quarter1_note;
	float quarter2_note;
	float quarter3_note;

	public float mediaNote() {
		float media = (quarter1_note + quarter2_note + quarter3_note) / 3;
		return media;
	}

	int passQuarter() {
		int counter = 0;
		if (quarter1_note >= 5) {
			counter++;
		}
		if (quarter2_note >= 5) {
			counter++;
		}
		if (quarter3_note >= 5) {
			counter++;
		} 
		return counter;
	}

	@Override
	public String toString() {
		return "AsignatureNote [asignature_name=" + asignature_name + ", quarter1_note=" + quarter1_note
				+ ", quarter2_note=" + quarter2_note + ", quarter3_note=" + quarter3_note + "]";
	}

	public AsignatureNote(String asignature_name, float quarter1_note, float quarter2_note, float quarter3_note) {
		super();
		this.asignature_name = asignature_name;
		this.quarter1_note = quarter1_note;
		this.quarter2_note = quarter2_note;
		this.quarter3_note = quarter3_note;
	}
	
}