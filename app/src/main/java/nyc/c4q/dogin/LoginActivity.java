package nyc.c4q.dogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private static final String SHARED_PREFS_KEY = "sharedPrefsKey";
    private EditText userNameInput;
    private EditText passwordInput;
    private boolean validUser;
    private Button buttonSubmit;
    private SharedPreferences login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userNameInput = findViewById(R.id.edit_text_username);
        passwordInput = findViewById(R.id.edit_text_password);
        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);

        buttonSubmit = findViewById(R.id.button_submit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = login.edit();
                String checkUser = "charlie";
                String checkPassword = "abc123";

                if (userNameInput != null && passwordInput != null) {
                    validUser = true;
                    editor.putString("username", userNameInput.getText().toString());
                    editor.putString("password", passwordInput.getText().toString());
                    editor.putBoolean("validUser", validUser);
                    editor.commit();
                } else {
                    editor.putBoolean("isChecked", true);
                    editor.commit();
                }
                if (userNameInput.getText().toString().contains(checkUser) && passwordInput.getText().toString().contains(checkPassword)) {
                   String uniqueUser = userNameInput.getText().toString();
                   String uniquePassword = passwordInput.getText().toString();
                   if(uniquePassword.contains(uniqueUser)){
                       passwordInput.setError("Password cannot contain username");
                       passwordInput.requestFocus();
                   } else {
                        Intent intent = new Intent(LoginActivity.this, BreedsActivity.class);
                        intent.putExtra("currentUser", userNameInput.getText().toString());

                        startActivity(intent);
                   }


                } else {
                    userNameInput.setError("Please Enter a Valid Username");
                    passwordInput.setError("Please Enter a Valid Password");
                    userNameInput.requestFocus();
                    passwordInput.requestFocus();
                }
            }
        });

        if (login.getBoolean("validUser", false)) {
            userNameInput.setText(login.getString("username", null));
            passwordInput.setText(login.getString("password", null));
            //validUser.setChecked(login.getBoolean("isChecked", false));
        }
    }
//    public boolean isPrefencesSaved(SharedPreferences login){
//        if(login == null){
//
//        } else {
//            Intent intent = new Intent(LoginActivity.this, BreedsActivity.class);
//            intent.putExtra("currentUser", userNameInput.getText().toString());
//        }
//        return false;
//    }
}
