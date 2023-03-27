package app.barcode_checker.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.barcode_checker.first.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {
            val intent = Intent(this,TwoActivity::class.java)
            startActivity(intent)
        }
    }
}