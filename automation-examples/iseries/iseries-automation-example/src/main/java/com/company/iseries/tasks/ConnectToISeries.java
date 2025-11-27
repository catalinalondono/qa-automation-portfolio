package com.company.iseries.tasks;



import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;

public class ConnectToISeries implements Task {

    public static ConnectToISeries withCredentials() {
        return new ConnectToISeries();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Connection logic here
    }
}

