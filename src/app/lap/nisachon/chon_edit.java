package app.lap.nisachon;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chon_edit extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText etxta, etxtb, etxtc, etxtd, etxte, etxtf, etxtg, etxth;
	private String txta, txtb, txtc, txtd, txte, txtf, txtg, txth;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.edit_nisa);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}
	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.btnsave1);
		btnsubmit.setOnClickListener(this);
		etxta = (EditText) findViewById(R.id.etxta);
		etxtb = (EditText) findViewById(R.id.etxtb);
		etxtc = (EditText) findViewById(R.id.etxtc);
		etxtd = (EditText) findViewById(R.id.etxtd);
		etxte = (EditText) findViewById(R.id.etxte);
		etxtf = (EditText) findViewById(R.id.etxtf);
		etxtg = (EditText) findViewById(R.id.etxtg);
		etxth = (EditText) findViewById(R.id.etxth);
	}

	@Override
	public void onClick(View v) {
		
		save();
		
		
		
		
		
		
		
		
		switch (v.getId()) {
		case R.id.btnsave1:
			txta = (etxta.getText().toString());
			txtb = (etxtb.getText().toString());
			txtc = (etxtc.getText().toString());
			txtd = (etxtd.getText().toString());
			txte = (etxte.getText().toString());
			txtf = (etxtf.getText().toString());
			txtg = (etxtg.getText().toString());
			txth = (etxth.getText().toString());
			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("txta", txta);
			R.putExtra("txtb", txtb);
			R.putExtra("txtc", txtc);
			R.putExtra("txtd", txtd);
			R.putExtra("txte", txte);
			R.putExtra("txtf", txtf);
			R.putExtra("txtg", txtg);
			R.putExtra("txth", txth);
			startActivity(R);
			break;
		default:
			break;
		}
	}
	
	
	public boolean save(){
		final AlertDialog.Builder ab = new AlertDialog.Builder(this);
		AlertDialog vv = ab.create();
		dbcontroler_122 dbclass = new dbcontroler_122(this);
		long savedata = dbclass.insertData(etxta.getText().toString(),
				etxtb.getText().toString(),etxtc.getText().toString()
				,etxtd.getText().toString(),etxte.getText().toString()
				,etxtf.getText().toString(),etxtg.getText().toString());
				
		if (savedata <= 0) {
			vv.setMessage("Error !!!!");
			vv.show();
			return false;
		}		
				
		Toast.makeText(getApplicationContext(), "Add Data Successfully",Toast.LENGTH_SHORT).show();
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
