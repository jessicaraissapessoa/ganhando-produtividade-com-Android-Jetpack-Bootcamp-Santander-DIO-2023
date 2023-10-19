package br.com.messoretech

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) } //Variável global para o binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        insertListeners()

    }

    private fun insertListeners() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this)) //Botão starta nova activity com método createIntent
        }

        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
        }

        binding.cvBottomSheets.setOnClickListener {
            ModalBottomSheet.start(supportFragmentManager)
        }

        binding.cvTopAppBar.setOnClickListener {
            startActivity(TopAppBarActivity.createIntent(this))
        }

        binding.cvBottomAppBar.setOnClickListener {
            startActivity(BottomAppBarActivity.createIntent(this))
        }

        binding.cvSnackBar.setOnClickListener {
            startActivity(SnackbarActivity.createIntent(this))
        }

        binding.cvBottomNavigation.setOnClickListener {
            startActivity(BottomNavigationActivity.createIntent(this))
        }

    }
}
