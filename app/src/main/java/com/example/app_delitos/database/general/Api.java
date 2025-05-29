package com.example.app_delitos.database.general;

public class Api {

    private final static String ENDPOINT = ""; // completar con la IPv4 de la computadora desde la consola con ipconfig

    private final static String BASE_URL = ENDPOINT + "/api";

    private final static String login = BASE_URL + "auth/login";
    private final static String delitos = BASE_URL + "/delitos";
    private final static String delito = BASE_URL + "/delito";
}
