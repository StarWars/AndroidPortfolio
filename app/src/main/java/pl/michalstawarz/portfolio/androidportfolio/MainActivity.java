package pl.michalstawarz.portfolio.androidportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

        StringBuilder toastNotification = new StringBuilder("This button will launch my ");
        int duration = Toast.LENGTH_SHORT;

        if (view.getId() == R.id.btn_spotify) {
            toastNotification.append("spotify app!");
        }
        else if (view.getId() == R.id.btn_build_bigger) {
            toastNotification.append("build it bigger app!");
        }
        else if (view.getId() == R.id.btn_capstone) {
            toastNotification.append("own app!");
        }
        else if (view.getId() == R.id.btn_library) {
            toastNotification.append("library app!");
        }
        else if (view.getId() == R.id.btn_reader) {
            toastNotification.append("xyz reader app");
        }
        else if (view.getId()== R.id.btn_scores) {
            toastNotification.append("scores app");
        }

        Toast toast = Toast.makeText(context, toastNotification, duration);
        toast.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
