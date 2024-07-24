package Esercizio3;

import java.util.Date;
import java.util.Random;

public class Cliente {

    private int codCliente;
    private String name;
    private String surname;
    private String email;
    private Date subDate;


    public Cliente(String name, String surname, String email) {
        Random random = new Random();
        this.codCliente = random.nextInt(1, 100);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.subDate = new Date();
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente=" + codCliente +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", subDate=" + subDate +
                '}';
    }
}
