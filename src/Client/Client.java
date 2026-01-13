package Client;

import Account.Account;
import Person.Person;

import java.util.ArrayList;

public class Client extends Person {
    private int idClient;
    private String numeroClient;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(String nom, String prenom, int age,String email,int idClient,String numeroClient){
        super(nom, prenom, age, email);
        this.idClient = idClient;
        this.numeroClient = numeroClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }
}
