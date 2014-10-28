package com.exo.noteHashMap;

public class Note {
private String matiere;
private float note;
public Note(String matiere, float note) {
	super();
	this.matiere = matiere;
	this.note = note;
}
@Override
public String toString() {
	return "Note [matiere=" + matiere + ", note=" + note + "]";
}

}
