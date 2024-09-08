interface Retrievable {

    // Abstract method in the interface

    String retrieveData();

    // Default method in the interface

    default void showRetrieveMessage() {
        System.out.println("RETRIEVING DATA...");
    }

}
