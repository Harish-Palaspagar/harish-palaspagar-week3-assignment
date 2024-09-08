class FileStorage extends Storage implements Retrievable {

    // Field declaration

    String data;

    // Constructor

    FileStorage() {
        super("FILE STORAGE");
    }

    // Implementing the abstract method from Storage

    @Override
    void saveData(String data) {
        this.data = data;
        System.out.println("DATA SAVED : " + data);
    }

    // Implementing the abstract method from Retrievable

    @Override
    public String retrieveData() {
        return data;
    }

}
