package Esercizio3;

import java.time.LocalDateTime;
import java.util.Random;

public class Cliente {

    private int codCliente;
    private String name;
    private String surname;
    private String email;
    private LocalDateTime subDate;

    public Cliente(String name, String surname) {
        Random random = new Random();
        this.codCliente = random.nextInt(1, 100);
        this.name = name;
        this.surname = surname;
        this.email = "";
        this.subDate = LocalDateTime.now();
    }

    public int getCodCliente() {
        return codCliente;
    }

    public LocalDateTime getSubDate() {
        return subDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
