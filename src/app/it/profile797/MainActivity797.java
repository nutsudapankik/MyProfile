package app.it.profile797;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity797 extends Activity implements OnClickListener{
	private TextView t1 ,t2 ,t3,t4,t5,t6;
private Button a,b;
private string d1,d2,d3,d4,d5,d6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ControlDB controldb = new ControlDB (this);
        controldb.getWritableDatabase();
        setContentView(R.layout.layout797);
        kookkik ();
    }
	private void kookkik() {
		// TODO Auto-generated method stub
		t6 =(TextView) findViewById(R.id.e3);
		t1 = (TextView) findViewById(R.id.age);
		t2 = (TextView) findViewById(R.id.birthday);
		t3 = (TextView) findViewById(R.id.height);
		t4 = (TextView) findViewById(R.id.weight);
		t5 = (TextView) findViewById(R.id.email);
	
		a = (Button) findViewById(R.id.e2);
		b = (Button) findViewById(R.id.e1);
		
		a.setOnClickListener(this);
		b.setOnClickListener(this);
		
		String d1 = getIntent().getStringExtra("s1");
		String d2 = getIntent().getStringExtra("s2");
		String d3 = getIntent().getStringExtra("s3");
		String d4 = getIntent().getStringExtra("s4");
		String d5 = getIntent().getStringExtra("s5");
		String d6 = getIntent().getStringExtra("s6");
		
		
		if (t1 != null){
		t6.setText("Nutsudapan kaenvichit");
		t1.setText("20");
		t2.setText("02/03/37");
		t3.setText("160cm");
		t4.setText("50kg");
		t5.setText("kookkik_maxky_it@hotmail.com");
		}
		if(d1!=null ){
		t6.setText(d1);
		t1.setText(d2);
		t2.setText(d3);
		t3.setText(d4);
		t4.setText(d5);
		t5.setText(d6);
		}
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.e2:
			Intent s = new Intent(MainActivity797.this,KIK.class);
			startActivity(s);
			break;
		case R.id.e1:
			Intent p = new Intent(MainActivity797.this,Edit.class);
			startActivity(p);
			break;

		default:
			break;
		}
		
	}
}
