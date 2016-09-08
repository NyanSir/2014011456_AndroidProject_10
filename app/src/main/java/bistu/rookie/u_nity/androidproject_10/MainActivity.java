package bistu.rookie.u_nity.androidproject_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView strContent = (TextView) findViewById(R.id.StringContent);
        final TextView numContent = (TextView) findViewById(R.id.NumberContent);
        final String str = strContent.getText().toString();
        final Integer num =  Integer.valueOf(numContent.getText().toString());
        Button anotherAct = (Button) findViewById(R.id.StartAnotherActivity);
        anotherAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                intent.putExtra("intro", "Come from Main Activity: ");
                intent.putExtra("string", str);
                intent.putExtra("number", num);
                startActivity(intent);
            }
        });
    }

}
