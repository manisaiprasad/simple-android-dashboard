package com.dashboard.br

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.view.View;

import kotlinx.android.synthetic.main.activity_main.*
import android.content.ActivityNotFoundException






class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bankCard.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
        ideaCard.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
        addCard.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
        linkCard.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
        interior.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
        tile.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("8179879100")))
            startActivity(intent)
        }
    }


}
