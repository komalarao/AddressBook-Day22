package com.bridgelabz.AddressBook;


	import java.util.Scanner;
	public class AddressBookDirectory {

		private static final int NUM_OF_ADDRESS_BOOKS = 5;
	    Scanner scannerObject = new Scanner(System.in);
	    AddressBookDirectory[] addressBookDirectory = new AddressBookDirectory[NUM_OF_ADDRESS_BOOKS];
	    int numOfAddressBooks = 0;

	    public void operationDirectory() {

	        boolean moreChanges = true;
	        do{

	            System.out.println("\nChoose the operation on the Directory you want to perform");
	            System.out.println("1.Add an Address Book\n2.Edit Existing Address Book\n3.Display Address book Directory\n4.Exit Address book System");

	            switch (scannerObject.nextInt()) {
	                case 1:
	                    addAddressBook();
	                    AddressBookDirectory operation = new AddressBookDirectory();
	                    operation.addContact()
	                    break;
	                case 2:
	                    editAddressBook();
	                    AddressBookDirectory operation1 = new AddressBookDirectory();
	                    operation1.editPerson();
	                    break;
	                case 3:
	                    displayDirectoryContents();
	                    AddressBookDirectory operation2 = new AddressBookDirectory();
	                    operation2.displayContents();
	                    break;
	                case 4:
	                    moreChanges = false;
	                    System.out.println("BYE !");
	            }

	        }while(moreChanges);
	    }

	    public void addAddressBook() {

	        System.out.println("You can add only "+(NUM_OF_ADDRESS_BOOKS-numOfAddressBooks)+" books");

	        String addressBookName = "";

	        if(numOfAddressBooks == 0) {
	            System.out.println("Enter the name of the Address Book you want to add");
	            addressBookName = scannerObject.next();
	            AddressBookDirectory newAddressBook = new AddressBookDirectory();
	            AddressBookDirectory.setAddressBookDirectory(addressBookDirectory);
	            addressBookDirectory[numOfAddressBooks] = newAddressBook;
	            numOfAddressBooks++;

	        }

	        else {

	            boolean bookExists = false;
	            for(int index=0; index < numOfAddressBooks ; index++) {

	                System.out.println("Enter the name of the Address Book you want to add");
	                addressBookName = scannerObject.next();
	                AddressBookDirectory addressBook = addressBookDirectory[index];

	                if(addressBookName.equals(addressBook.getAddressBookDirectoryName())) {
	                    bookExists = true;
	                }

	            }
	            if(bookExists) {
	                System.out.println("Address Book with same name already exists");
	                return;
	            }
	            else {
	                AddressBookDirectory newAddressBook = new AddressBookDirectory();
	                newAddressBook.setAddressBookDirectory(addressBookDirectoryName);
	                addressBookDirectory[numOfAddressBooks] = newAddressBook;
	                numOfAddressBooks++;
	            }
	        }

	    }

	    private Object getAddressBookDirectoryName() {
			// TODO Auto-generated method stub
			return null;
		}

		private static void setAddressBookDirectory(AddressBookDirectory[] addressBookDirectory2) {
			// TODO Auto-generated method stub
			
		}

		public void editAddressBook() {
	        System.out.println("Enter the Name of the Address Book which you want to edit:");
	        String addressBookName = scannerObject.next();

	        for(int index = 0; index <numOfAddressBooks; index++) {

	            AddressBookDirectory addressBook = addressBookDirectory[index];

	            if(addressBookName.equals(addressBook.getAddressBookDirectoryName())) {
	                addressBook.operationDirectory();
	            }
	        }
	    }

	    public void displayDirectoryContents() {

	        System.out.println("----- Contents of the Address Book Directory-----");
	        for(int index=0; index < numOfAddressBooks ; index++) {
	            System.out.println(addressBookDirectory[index]);

	        }
	        System.out.println("-----------------------------------------");
	    }

	}

