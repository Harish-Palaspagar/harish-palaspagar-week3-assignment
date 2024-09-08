public class MainClass {

    // Main method
    
    public static void main(String[] args) {

        // Creating a FileStorage object

        Storage fileStorage = new FileStorage();
        fileStorage.showStorageType();

        // Calling saveData method from abstract class Storage

        fileStorage.saveData("HELLO WORLD !");

        // Calling retrieveData method from Retrievable interface

        Retrievable retrievable = (Retrievable) fileStorage;
        retrievable.showRetrieveMessage();
        String retrievedData = retrievable.retrieveData();
        System.out.println("RETRIEVED DATA : " + retrievedData);

    }
}
