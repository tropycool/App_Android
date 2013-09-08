package com.DavidAdellE.timeexchange;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class LoginActivity extends Activity {
	Button btnLinkToRegister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// definimos la vista por defecto en login.xml
		setContentView(R.layout.login);
		
		//Importamos los assets de los botones y cuadro de texto
		btnLinkToRegister = (Button) findViewById(R.id.btnLinkToRegister);
		
		TextView recovery_passScreen = (TextView) findViewById(R.id.link_to_recovery_password);
        // Esperamos evento en el texto de enlace para recuperar contraseña
		recovery_passScreen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
                // Cambio a la vista de Registro
                Intent i = new Intent(getApplicationContext(), RecoveryActivity.class);
                startActivity(i);
			}
		});
		// Enlace a la vista de Registro
		btnLinkToRegister.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
				startActivity(i);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
