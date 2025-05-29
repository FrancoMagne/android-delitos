package com.example.app_delitos.database.general;

public class Response {

    final static String STATUS = "status";
    public final static String MESSAGE = "message";
    public final static String DATA = "data";

    public final static String USER_ID = "user_id";
    public final static String USER_NAME = "user_name";
    public final static String USER_EMAIL = "user_email";
    public final static String USER_TOKEN = "token";
    public final static String USER_TOKEN_TYPE = "token_type";
    public final static String USER_TOKEN_EXPIRATION = "token_expiration";


    // FORCED MESSAGE ERROR
    public final static String MESSAGE_ERROR = "Ocurrió un error";

    // RESPONSE Success 2XX
    public final static int OK = 200;
    public final static int CREATED = 201;
    public final static int NOT_CONTENT = 204;

    // RESPONSE Error 4XX
    public final static int BAD_REQUEST = 400;
    public final static int UNAUTHORIZED = 401;
    public final static int FORBIDDEN = 403;
    public final static int NOT_FOUND = 404;
    public final static int METHOD_NOT_ALLOWED = 405;
    public final static int UNPROCESSABLE_ENTITY = 422;
    public final static int TOKEN_EXPIRED_OR_INVALID = 498;

    // RESPONSE Error 5XX
    public final static int INTERNAL_SERVER_ERROR = 500;
    public final static int SERVICE_UNAVAILABLE = 503;

}
