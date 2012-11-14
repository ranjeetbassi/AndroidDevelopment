package com.example.projectmgnt;
/* Name: Ranjeet Bassi
 * Due Date: October 3, 2012
 */
import java.util.Date;



import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText projectName;
	private EditText projectDesc;
	private DatePicker projectStart;
	private DatePicker projectEnd;
	private Button projectCreate;
	private Button projectCancel;
	DatabaseConnector databaseConnector;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        projectName = (EditText) findViewById(R.id.editText1);
        projectDesc = (EditText) findViewById(R.id.editText2);
        projectStart= (DatePicker) findViewById(R.id.datePicker1);
        projectEnd = (DatePicker) findViewById(R.id.datePicker2);
        projectCreate =(Button) findViewById(R.id.button1);
        projectCancel =(Button) findViewById( R.id.button2);
        projectCreate.setOnClickListener(CreateProjectClick);
        
    }
    OnClickListener CreateProjectClick = new OnClickListener() 
    {
       public void onClick(View v) 
       {
    	   if(projectName.getText().toString().equals("") || projectDesc.getText().toString().equals(""))
           {
           	AlertDialog.Builder builder = 
                       new AlertDialog.Builder(MainActivity.this);
              
                    // set dialog title & message, and provide Button to dismiss
                    builder.setTitle(R.string.Error_Project_field); 
                    builder.setMessage(R.string.errorfield_description);
                    builder.setPositiveButton(R.string.errorbutton, null); 
                    builder.show();
           }
    	   else
    	   {
    		   InsertData();
    		   
    	   }
       } // end method onClick
    }; // end OnClickListener saveContactButtonClicked
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    private void InsertData()
    {
    	  databaseConnector = new DatabaseConnector(MainActivity.this);
		   
		   databaseConnector.insertContact(
		            projectName.getText().toString(),
		            projectDesc.getText().toString(), 
		            projectStart.toString(), 
		            projectEnd.toString());
		   
		   AlertDialog.Builder builder = 
                   new AlertDialog.Builder(MainActivity.this);
          
                // set dialog title & message, and provide Button to dismiss
                builder.setTitle(R.string.Confirmationtitle); 
                builder.setMessage(R.string.confirmationbody);
                builder.setPositiveButton(R.string.errorbutton, null); 
                builder.show();
    }
}
