package example.codeclan.com.wordcounthomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class WordCountActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question_text);
        countButton = (Button)findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button) {
        String question = questionEditText.getText().toString();
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d("WordCount:", "The words given are '" + question + "'");

        WordCount words = new WordCount("Will this work for me");
        int result = words.getWordCount();
        answerText.setText(result);

        Intent intent = new Intent(WordCountActivity.this, AnswerActivity.class);
        intent.putExtra("answer", result);
        startActivity(intent);
    }



}
