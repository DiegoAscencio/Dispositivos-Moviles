package diego.ascencio.applifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var mTextView: TextView

    companion object{
        const val TAG = "MainActivity"
        const val USER_NAME = "USER_NAME"
        const val USER_EMAIL = "USER_EMAIL"
        const val SESSION_TOKEN = "SESSION_TOKEN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG,"onCreate")
        setContentView(R.layout.activity_main)
        mTextView = findViewById(R.id.activity_main_sessionToken)
        mTextView.text = "Aqui va un parrafo"
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG,"onResume")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(USER_EMAIL,"is698355@iteso.mx")
        outState.putString(USER_NAME,"Diego Ascencio")
        outState.putString(SESSION_TOKEN,mTextView.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        mTextView.text = savedInstanceState.getString(SESSION_TOKEN  ) ?: ""
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"onDestroys")
    }


}
