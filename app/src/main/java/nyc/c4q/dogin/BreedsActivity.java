package nyc.c4q.dogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


/**
 * Created by c4q on 2/25/18.
 */

public class BreedsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView userGreeting;
    private CardView terrierCardView, spanielCardView, retrieverCardView, poodleCardView;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);
        userGreeting = findViewById(R.id.user_greeting_text);
        Intent intent = getIntent();
        String user = intent.getStringExtra("currentUser");
        userGreeting.setText("What kind of dog would you like to see, " + user+ " ?");
        terrierCardView = findViewById(R.id.terrier_cv);






    }
}
