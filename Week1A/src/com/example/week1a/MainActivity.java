package com.example.week1a;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);
        /**
        * CRUD Operations
        * */
       
     
    
       // Inserting Contacts
      //  When debugging we’ll just use Debug (d) to log the progress. 
       Log.d("Insert: ", "Inserting process..");
       db.addContact(new Contact("Romar", "123456789"));
       db.addContact(new Contact("Samar", "987654321"));
       db.addContact(new Contact("Tommy", "2222222222"));
       db.addContact(new Contact("Katleen", "3333333333"));

       // Reading all contacts
       Log.d("Reading: ", "Reading all contacts..");
       List<Contact> contacts = db.getAllContacts();      

       for (Contact cn : contacts) {
           String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
               // Writing Contacts to log
       Log.d("Name: ", log);
   }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
