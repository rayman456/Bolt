package com.example.bolt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class BoltLogin extends Activity
{
   private EditText  username=null;
   private EditText  password=null;
   
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
	   //when app is opened
      super.onCreate(savedInstanceState);
      setContentView(R.layout.boltlogin);
      username = (EditText)findViewById(R.id.boltuser);
      password = (EditText)findViewById(R.id.boltpassword);
   }

   
   public void login(View view)
   {
	  //when user clicks login
	   Intent intent = new Intent(this, RunMode.class);
	   if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
		   startActivity(intent);
   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu)
   {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
}