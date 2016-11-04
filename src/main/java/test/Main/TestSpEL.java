package test.Main;

import SpEL.LearnSpEL;
import org.junit.Test;

/**
 * Created by 2 on 2016/11/1.
 */
public class TestSpEL {
    @Test
    public void testOutputSpEL(){
        LearnSpEL.outputSpEL("{1:'a',2:'b',3:'c',4:'d'}");
        LearnSpEL.outputSpEL("1==2");
    }
    @Test
    public void testStandardContext(){
        LearnSpEL.standardContext();
    }
}
