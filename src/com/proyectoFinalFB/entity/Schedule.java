package com.proyectoFinalFB.entity;

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
					+ aContact.get(i).getPhone() + aContact.get(i).getAddress() + aContact.get(i).getBirthdate() 
					+ aContact.get(i).getEmail() + aContact.get(i).getProfession() + aContact.get(i).getBasicSalary() +aContact.get(i).getWorkdays() + "\n";
		}

		return contactList;
	}
}
