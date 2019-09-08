package diego.ascencio.Time

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    private lateinit var mEditTextName: EditText
    private lateinit var mEditTextPhone: EditText
    private lateinit var  mSaveBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mEditTextName = findViewById(R.id.activity_main_name_at)
        mEditTextPhone = findViewById(R.id.activity_main_phone_at)
        mSaveBtn = findViewById(R.id.activity_mane_save_btn)

        mSaveBtn.setOnClickListener {
            validation()
        }
    }

    private fun validation(){
        if(mEditTextName.text.toString()==""){
            Toast.makeText(this,getString(R.string.activity_main_error_noname),Toast.LENGTH_LONG)
            return
        }
        if(mEditTextPhone.text.toString()==""){
            Toast.makeText(this,getString(R.string.activity_main_error_nophone),Toast.LENGTH_LONG)
            return
        }

        val Form = Toast.makeText(mEditTextName.text.toString(R.string.activity_main_name_hint),)
    }
}
