package com.example.farmerscommoditymarketapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText EdtUsersName, EdtEmailId, EdtContactNo, EdtCreateUsername, EdtSetPassword;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // initializing all our variables.
        EdtUsersName = findViewById(R.id.idEdtUsersName);
        EdtEmailId = findViewById(R.id.idEdtEmailId);
        EdtContactNo = findViewById(R.id.idEdtContactNo);
        EdtCreateUsername = findViewById(R.id.idEdtCreateUsername);
        EdtSetPassword = findViewById(R.id.idEdtSetPassword);
        Button btnRegister = findViewById(R.id.idBtnRegister);

        // creating a new dbhandler class and passing our context to it.
        dbHandler = new DBHandler(Register.this);

        // below line is to add on click listener for our add course button.
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // below line is to get data from all edit text fields.
                String usersName = EdtUsersName.getText().toString();
                String emailId = EdtEmailId.getText().toString();
                String contactNo = EdtContactNo.getText().toString();
                String username = EdtCreateUsername.getText().toString();
                String password = EdtSetPassword.getText().toString();

                // validating if the text fields are empty or not.
                if (usersName.isEmpty() && emailId.isEmpty() && contactNo.isEmpty() && username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Register.this, "Please enter data in all the fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewUser(usersName, emailId, contactNo, username, password);

                // after adding the data we are displaying a toast message.
                Toast.makeText(Register.this, "User has been added successfully", Toast.LENGTH_SHORT).show();
                EdtUsersName.setText("");
                EdtEmailId.setText("");
                EdtContactNo.setText("");
                EdtCreateUsername.setText("");
                EdtSetPassword.setText("");
            }
        });
    }
}
