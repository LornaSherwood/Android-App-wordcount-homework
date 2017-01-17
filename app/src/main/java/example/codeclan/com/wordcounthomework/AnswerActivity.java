package example.codeclan.com.wordcounthomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class AnswerActivity extends AppCompatActivity {

    TextView mAnswerText;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.wordcount_answer);

            mAnswerText = (TextView)findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String result = extras.getString("answer");
        mAnswerText.setText(result);

        }


}
