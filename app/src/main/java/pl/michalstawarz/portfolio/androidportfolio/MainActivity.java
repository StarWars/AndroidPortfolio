package pl.michalstawarz.portfolio.androidportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /* Buttons touches */
    public void sendMessage(View view) {
        Context context = getApplicationContext();

        StringBuilder toastNotification = new StringBuilder(getString(R.string.app_button_will_launch));
        int duration = Toast.LENGTH_SHORT;

        if (view.getId() == R.id.btn_spotify) {
            toastNotification.append(getString(R.string.app_spotify));
        }
        else if (view.getId() == R.id.btn_build_bigger) {
            toastNotification.append(getString(R.string.app_bib));
        }
        else if (view.getId() == R.id.btn_capstone) {
            toastNotification.append(getString(R.string.app_own));
        }
        else if (view.getId() == R.id.btn_library) {
            toastNotification.append(getString(R.string.app_library));
        }
        else if (view.getId() == R.id.btn_reader) {
            toastNotification.append(getString(R.string.app_xyz));
        }
        else if (view.getId()== R.id.btn_scores) {
            toastNotification.append(getString(R.string.app_scores));
        }

        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(context, toastNotification, duration);
        toast.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
