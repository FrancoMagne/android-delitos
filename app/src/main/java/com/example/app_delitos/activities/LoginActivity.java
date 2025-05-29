package com.example.app_delitos.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.app_delitos.database.general.Api;
import com.example.app_delitos.database.general.Key;
import com.example.app_delitos.database.general.Response;
import com.example.app_delitos.database.web_services.WebRequest;
import com.example.app_delitos.databinding.ActivityLoginBinding;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;

public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding binding;
    private WebRequest request;
    private final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.emailUser.setText("admin@example.com");
        binding.passwordUser.setText("password");

        // Login
        inciarSesion();
    }

    private void inciarSesion() {
        binding.loginButton.setOnClickListener(v -> {
            hideKeyboard(v);

            if (hasConnection()) {
                showProgressDialog("Ingresando", "Espere por favor...");

                String email = binding.emailUser.getText().toString();
                String password = binding.passwordUser.getText().toString();

                // Validacion de campos
                if (email.trim().isEmpty() || password.trim().isEmpty()) {
                    showSnackBarDefault("Los campos email y contraseña son requeridos.");
                    return;
                }

                // POST al endpoint del Login
                request = new WebRequest(getApplicationContext(), new WebRequest.ResponseListener() {
                    @Override
                    public void onSuccess(JSONObject json) throws JSONException {
                        Log.i(TAG, "WebRequest::onSuccess -> " + json.toString());

                        try {
                            JSONObject data = new JSONObject(json.get(Response.DATA).toString());

                            getPrefs().saveLUserId(data.getString(Response.USER_ID));
                            getPrefs().saveLUserName(data.getString(Response.USER_NAME));
                            getPrefs().saveLUserEmail(data.getString(Response.USER_EMAIL));
                            getPrefs().saveLUserToken(data.getString(Response.USER_TOKEN));
                            getPrefs().saveLUserTokenType(data.getString(Response.USER_TOKEN_TYPE));
                            getPrefs().saveLUserTokenExpiration(data.getString(Response.USER_TOKEN_EXPIRATION));

                            hideProgressDialog();
                            goActivity(MainActivity.class, true);
                        } catch (JSONException e) {
                            Toast.makeText(LoginActivity.this, "Error desconocido, vuelve a intentarlo por favor", Toast.LENGTH_SHORT).show();

                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, String message) {
                        Log.i(TAG, "WebRequest::onFailure: onFailure -> " + statusCode);
                        Log.i(TAG, "WebRequest::onFailure: message -> " + message);


                    }
                });

                // Envio de parametros
                JSONObject jsonParams = new JSONObject();
                try {
                    jsonParams.put("email", email);
                    jsonParams.put("password", password);

                    StringEntity entity = new StringEntity(jsonParams.toString(), Key.CHARSET_UTF_8);

                    request.connect(Api.login, Key.METHOD_POST, entity, Key.APPLICATION_JSON);
                } catch (JSONException | IllegalStateException e) {
                    Toast.makeText(this, "Error desconocido, vuelve a intentarlo por favor", Toast.LENGTH_SHORT).show();

                    e.printStackTrace();
                }
            }
        });
    }
}