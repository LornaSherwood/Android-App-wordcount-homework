package example.codeclan.com.wordcounthomework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 17/01/2017.
 */

public class WordCount {

    private String sentence;

    public WordCount(String sentence){
        this.sentence = sentence;
    }


    public int getWordCount() {
        String[] items = sentence.split(" ");
        return items.length;
    }














}
