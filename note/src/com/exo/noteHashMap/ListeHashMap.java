package com.exo.noteHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class ListeHashMap {

private HashMap<Etudiant, Note> listeNote = new HashMap<Etudiant, Note>();

void ajoutHash(Etudiant e,Note n){
	listeNote.put(e, n);
}
void affiche(){
	for (Entry<Etudiant, Note> element :listeNote.entrySet()) {
		element.getKey();
		element.getValue();
	}
}
@Override
public String toString() {
	return "ListeHashMap [listeNote=" + listeNote + "]";
}
	
}
