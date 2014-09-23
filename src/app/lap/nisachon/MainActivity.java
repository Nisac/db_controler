package app.lap.nisachon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private Button btn1, btn2;
	private TextView txta, txtb, txtc, txtd, txte, txtf, txtg, txth;
	private String show1, show2, show3, show4, show5, show6, show7, show8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	
	//dbcontroler_122 bdDbcontroler_122 = new dbcontroler_122(this);
	//bdDbcontroler_122.getWritableDatabase();
	
	
	
	
	}

	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btnedit);
		btn2 = (Button) findViewById(R.id.btnImg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		txta = (TextView) findViewById(R.id.txt14);
		txtb = (TextView) findViewById(R.id.txt16);
		txtc = (TextView) findViewById(R.id.txt18);
		txtd = (TextView) findViewById(R.id.txt20);
		txte = (TextView) findViewById(R.id.txt22);
		txtf = (TextView) findViewById(R.id.txt24);
		txtg = (TextView) findViewById(R.id.txt26);
		txth = (TextView) findViewById(R.id.txt28);
		
		txta.setText("20");
		txtb.setText("156");
		txtc.setText("Business Computer");
		txtd.setText("19/02/2537");
		txte.setText("Surin");
		txtf.setText("0930531594");
		txtg.setText("Nisachon Kaewhom");
		txth.setText("Nisachon954@gmail.com");
		
		show1 = getIntent().getStringExtra("txta");
		show2 = getIntent().getStringExtra("txtb");
		show3 = getIntent().getStringExtra("txtc");
		show4 = getIntent().getStringExtra("txtd");
		show5 = getIntent().getStringExtra("txte");
		show6 = getIntent().getStringExtra("txtf");
		show7 = getIntent().getStringExtra("txtg");
		show8 = getIntent().getStringExtra("txth");

		
		txta.setText(show1);
		txtb.setText(show2);
		txtc.setText(show3);
		txtd.setText(show4);
		txte.setText(show5);
		txtf.setText(show6);
		txtg.setText(show7);
		txth.setText(show8);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnedit:
			Intent i = new Intent(getApplicationContext(), chon_edit.class);
			startActivity(i);
			break;
		case R.id.btnImg:
			Intent j = new Intent(getApplicationContext(), ImageActivity.class);
			startActivity(j);
			break;
		default:
			break;
		}
	}
}