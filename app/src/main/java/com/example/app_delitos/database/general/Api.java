package com.example.app_delitos.database.general;

public class Api {

    private final static String ENDPOINT = "https://8a41-190-2-125-52.ngrok-free.app"; // completar con la IPv4 de la computadora desde la consola con ipconfig

    private final static String BASE_URL = ENDPOINT + "/api";

    public final static String login = BASE_URL + "/auth/login";
    public final static String delitos = BASE_URL + "/delitos";
    public final static String delito = BASE_URL + "/delito";
}
