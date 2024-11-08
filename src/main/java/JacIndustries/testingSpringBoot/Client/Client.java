package JacIndustries.testingSpringBoot.Client;


public class Client {
    private String name;
    private int document_number;
//    private int id;
    public Client(String name, int document_number){
        this.name = name;
        this.document_number = document_number;
        //TODO: connection with data base to assign the id.
        //this.id =
    }
    public Client(Client client){
        this.name = client.name;
        this.document_number = client.document_number;
        //TODO: connection with data base to assign the id.
        //this.id =
    }
    public String getName(){
        return this.name;
    }
    public int getDocument_number(){
        return this.document_number;
    }
    //TODO: authentication for setters and implement exceptions.
    public boolean setName(String new_name){
        this.name = new_name;
        return true;
    }
    public boolean setDocument_number(int new_document){
        this.document_number = new_document;
        return true;
    }
    //TODO: add image (profile photo)
}
