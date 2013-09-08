package com.DavidAdellE.timeexchange;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecoveryActivity extends Activity {
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Definimos la vista por defecto en recovery_pass.xml
        setContentView(R.layout.recovery_pass);
        
        //TODO acción del botón enviar
	}
}
