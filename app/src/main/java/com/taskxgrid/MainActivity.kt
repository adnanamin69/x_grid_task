package com.taskxgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.res.ResourcesCompat
import com.taskxgrid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var isNight: Boolean = false
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.text = "Adnan Amin"
        binding.email.text = "adnanamin69.aa@gmail.com"


        binding.help.apply {
            text.text = "Help"
            icon.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_baseline_live_help_24,
                    theme
                )
            )
        }
        binding.privacy.apply {
            text.text = "Privacy"
            icon.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_baseline_privacy_tip_24,
                    theme
                )
            )

        }
        binding.history.apply {
            text.text = "History"
            icon.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_baseline_settings_24,
                    theme
                )
            )

        }
        binding.setting.apply {
            text.text = "Settings"
            icon.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_baseline_history_24,
                    theme
                )
            )

        }
        binding.invite.apply {
            text.text = "Invite friend"
            icon.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.ic_baseline_share_24,
                    theme
                )
            )

        }

        binding.theme.setOnClickListener {
            //Toast.makeText(this, "working", Toast.LENGTH_SHORT).show()
            if (isNight) {
                isNight = false
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                isNight = true
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }
    }
}