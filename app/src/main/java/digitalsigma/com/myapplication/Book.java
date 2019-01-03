package digitalsigma.com.myapplication;

import android.util.Log;

public class Book implements Basebook {

    @Override
    public void read() {
        Log.e("TAGGGGG", "read: from book" );
    }
}
