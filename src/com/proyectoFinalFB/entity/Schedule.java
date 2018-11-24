package com.proyectoFinalFB.entity;

package com.proyectofinal.entity;


import java.util.ArrayList;



public class Schedule {

	ArrayList<Contact> aContact = new ArrayList<Contact>();

	public int getquantityContact() {
		return aContact.size();
	}

	public String addContact(Contact pContact) {
		String resultado = "";
		aContact.add(pContact);
		resultado = "Se ha registrado un nuevo contacto en la lista....";
		return resultado;
	}

	public String getContact() {
		String contactList = "*** LISTA DE CONTACTOS ***\n\nMarca ---- Código ---- Precio De Venta---- Existencia\n";
		contactList += "---------------------------------------------------\n";
		for (int i = 0; i < aContact.size(); i++) {
			contactList = contactList + aContact.get(i).getId() + aContact.get(i).getName()
					+ aContact.get(i).getPhone() + "\n";
		}

		return contactList;
	}
	
	public String modifyContact(Contact contact) {
		
		return;
	}
	
	
}
