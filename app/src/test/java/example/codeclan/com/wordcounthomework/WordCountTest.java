package example.codeclan.com.wordcounthomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class WordCountTest {

    WordCount wordCount;
    WordCount wordCount2;

    @Before
    public void before(){
        wordCount = new WordCount("Will this work");
        wordCount2 = new WordCount("Not sure about this stuff");
        }


   @Test
    public void canGetWordCount(){
       int count = wordCount2.getWordCount();
       assertEquals(5, count);
   }


}

