abstract class Storage {

    // Field declaration

    String storageType;

    // Constructor

    Storage(String storageType) {
        this.storageType = storageType;
    }

    // Abstract method

    abstract void saveData(String data);

    // Concrete method

    void showStorageType() {
        System.out.println("STORAGE TYPE : " + storageType);
    }

}
