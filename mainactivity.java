import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

 Button button1,button2,button3;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 
 button1 = (Button)findViewById(R.id.button1);
 button2 = (Button)findViewById(R.id.button2);
 button3 = (Button)findViewById(R.id.button3);
 
 button1.setOnClickListener(new View.OnClickListener() {
 
 @Override
 public void onClick(View v) {
 // TODO Auto-generated method stub
 
 //Hiding sample button.
 button3.setVisibility(View.GONE);
 
 }
 });
 
 button2.setOnClickListener(new View.OnClickListener() {
 
 @Override
 public void onClick(View v) {
 // TODO Auto-generated method stub
 
 //Showing sample button.
 button3.setVisibility(View.VISIBLE);
 
 }
 });
 }
}