package com.example.jorda.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.jorda.myapplication", appContext.getPackageName());
    }

    public static class DebugActivity extends Activity {
        protected static final String TAG = "livro";

        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            Log.i(TAG, getClassName() + ".onCreate() chamado: " +
                    icicle);
        }
        protected void onStart() {
            super.onStart();
            Log.i(TAG, getClassName() + ".onStart() chamado.");
        }
        protected void onRestart() {
            super.onRestart();
            Log.i(TAG, getClassName() + ".onRestart() chamado.");
        }
        protected void onResume() {
            super.onResume();
            Log.i(TAG, getClassName() + ".onResume() chamado.");
        }
        protected void onPause() {
            super.onPause();
            Log.i(TAG, getClassName() + ".onPause() chamado.");
        }
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.i(TAG, getClassName() + ".onSaveInstanceState() chamado.");
        }
        protected void onStop() {
            super.onStop();
            Log.i(TAG, getClassName() + ".onStop() chamado.");
        }
        protected void onDestroy() {
            super.onDestroy();
            Log.i(TAG, getClassName() + ".onDestroy() chamado.");
        }
        private String getClassName() {
            // Retorna o nome da classe sem o pacote
            String s = getClass().getName();
            return s.substring(s.lastIndexOf("."));
        }
    }
}
