package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivitySnackbarBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySnackbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.showing.setOnClickListener {
            Snackbar.make(it, "Clique no primeiro botão", Snackbar.LENGTH_SHORT) //Parâmetros: view (próprio botão), o texto, período de exibição (curto)
                .show()
        }

        binding.action.setOnClickListener {
            Snackbar.make(it, "Segundo botão foi clicado!!!", Snackbar.LENGTH_LONG)
                .setAction("Go") {
                    Log.e("TAG", "onCreate: clicou na ação")
                }
                .show()
        }
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, SnackbarActivity::class.java)
    }
}
