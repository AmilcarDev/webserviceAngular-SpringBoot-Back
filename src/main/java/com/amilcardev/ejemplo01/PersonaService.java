package com.amilcardev.ejemplo01;

import java.util.List;

public interface PersonaService {
	
	
	// objeto de tipo List
    List<Persona>listar(); //listar todas las personas
    // objeto de tipo persona
    Persona listarId(int id); //listar una persona
    Persona add(Persona p);//agregar una persona
    Persona edit(Persona p);//editar una persona
    Persona delete(int id);//eliminar una persona

}
