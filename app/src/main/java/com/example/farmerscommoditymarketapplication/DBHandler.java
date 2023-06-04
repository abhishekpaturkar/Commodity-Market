package com.example.farmerscommoditymarketapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    // creating a constant variables for our database.
    // below variable is for our database name.
    private static final String DB_NAME = "userdb";

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "registered_users";

    // below variable is for our id column
    private static final String ID_COL = "id";

    // below variable is for our user's name column
    private static final String NAME_COL = "name";

    // below variable is for our user's email id column
    private static final String EMAIL_COL = "email";

    // below variable is for our user's contact no. column
    private static final String CONTACT_COL = "contact";

    // below variable is for our user's username column
    private static final String USERNAME_COL = "username";

    // below variable is for our user's password column
    private static final String PASSWORD_COL = "password";

    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating an sqlite query and we are
        // setting our column names along with their data types.

        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + EMAIL_COL + " VARCHAR,"
                + CONTACT_COL + " VARCHAR(10),"
                + USERNAME_COL + " VARCHAR,"
                + PASSWORD_COL + " VARCHAR)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
    }

    // this method is use to add new course to our sqlite database
    public void addNewUser(String usersName, String emailId, String contactNo, String username, String password) {

        // on below line we are creating a variable for our sqlite database and
        // calling writable method as we are writing data in our database
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a variable for content values
        ContentValues values = new ContentValues();

        // on below line we are passing all values along with its key and value pair
        values.put(NAME_COL, usersName);
        values.put(EMAIL_COL, emailId);
        values.put(CONTACT_COL, contactNo);
        values.put(USERNAME_COL, username);
        values.put(PASSWORD_COL, password);

        // after adding all values we are passing content values to our table
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our database after adding database
        db.close();
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}