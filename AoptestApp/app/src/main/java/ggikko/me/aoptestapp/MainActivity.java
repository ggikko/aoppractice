package ggikko.me.aoptestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressWarnings("depreacated") /** Warnings are not only suppressed for the annotated element but also for all program elements contained in that element. */
    @Deprecated /** Compilers produce a warning if a deprecated program element is used. */
    public void deprecatedAnotation(){
    }

    /** Compilers produce an error if a method annotated with @Override does not actually override a method in a superclass.*/
    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }


}
