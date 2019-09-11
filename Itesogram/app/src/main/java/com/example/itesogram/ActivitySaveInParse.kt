package com.example.itesogram

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.parse.ParseObject
import com.parse.ParseQuery

class ActivitySaveInParse : AppCompatActivity(){

    private lateinit var mText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_in_parse)

        mText = findViewById(R.id.texValue)
        mText.setOnClickListener{
            ParseQuery<ParseObject>(
                "TestConnection")
                .whereEqualTo("objectId","3JfGRfaMsu")
                .getFirstInBackground{
                    obj, e ->
                    if(e==null)
                        mText.text = obj["hiddenValue"] as String
                    else
                        error{e}
                }
        }
    }
}