package com.bridgelabz.AddressBook;


	import java.util.ArrayList;
	import java.util.Iterator;
	public class AdressBook {
	ArrayList<CreateContact> contactList = new ArrayList<CreateContact>();
		
		public void addContact(CreateContact person) {
	        contactList.add(person);
	    }
	    public void displayContents() {

	        Iterator<CreateContact> iterator = contactList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

